package xxrexraptorxx.advancedtools.world;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.DamageResistant;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModComponents;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.SocketUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.sockets.ISocketTool;
import xxrexraptorxx.magmacore.content.ItemHelper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@EventBusSubscriber(modid = References.MODID)
public class ModEvents {

    /**
     * Makes some materials fire & lava resistant
     */
    @SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent event) {
        for (String handle : ModItems.HANDLE_MATERIALS) {
            // RODS
            if (ToolUtils.isFireResistant(handle)) {
                // if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Generate components of " + handle);

                event.modify(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, "stick_" + handle)),
                        builder -> builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE)));
            }

            // TOOLS
            for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                if (ToolUtils.isFireResistant(handle) || ToolUtils.isFireResistant(head)) {
                    for (String tool : ModItems.TOOL_TYPES) {
                        if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {
                            // if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Generate components of " + tool + " with " + head + " head and " + handle + " handle");

                            event.modify(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, handle + FormattingUtils.AT_INFIX + head + "_" + tool)),
                                    builder -> builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE)));
                        }
                    }
                }
            }
        }

        // socket component
        for (Item item : event.getAllItems().toList()) {
            if (item instanceof ISocketTool socketTool) {

                int sockets = socketTool.getSocketCount(new ItemStack(item));

                // Liste mit "minecraft:air;1" pro Socket
                List<String> emptySockets = IntStream.range(0, sockets).mapToObj(i -> SocketUtils.EMPTY_STACK).toList();

                // Patch setzen
                event.modify(item, builder -> { builder.set(ModComponents.SOCKETS.get(), emptySockets); });
            }
        }
    }

}
