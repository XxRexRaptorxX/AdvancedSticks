package xxrexraptorxx.advancedtools.world;

import com.mojang.authlib.GameProfile;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.VersionChecker;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.RenderTooltipEvent;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.items.CustomAxeItem;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {

    /**
     *  Makes some materials fire & lava resistant
     */
    @SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent event) {
        for (String handle : ModItems.HANDLE_MATERIALS) {
            //rods
            if (ToolUtils.isFireResistant(handle)) {
                //AdvancedTools.LOGGER.info("Generate components of " + handle);

                event.modify(BuiltInRegistries.ITEM.getValue(ItemModelGen.getStickLoc(handle)), builder ->
                        builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE)));
            }

            //tools
            for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                if (ToolUtils.isFireResistant(handle) || ToolUtils.isFireResistant(head)) {
                    for (String tool : ModItems.TOOL_TYPES) {
                        if(!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {
                            //AdvancedTools.LOGGER.info("Generate components of " + tool + " with " + head + " head and " + handle + " handle");

                            event.modify(BuiltInRegistries.ITEM.getValue(ModItems.getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_" + tool)), builder ->
                                    builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE)));
                        }
                    }
                }
            }
        }
    }

}
