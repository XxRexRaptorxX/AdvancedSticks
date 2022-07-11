package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.main.References;

@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {


    /** Update-Checker **/
    private static boolean hasShownUp = false;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (Config.UPDATE_CHECKER.get()) {
            if (!hasShownUp && Minecraft.getInstance().screen == null) {
                if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.OUTDATED ||
                        VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.BETA_OUTDATED ) {

                    Minecraft.getInstance().player.displayClientMessage(Component.literal(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"), false);
                    Minecraft.getInstance().player.displayClientMessage(Component.literal(ChatFormatting.GRAY + References.URL), false);

                    hasShownUp = true;

                } else if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.FAILED) {
                    AdvancedSticks.LOGGER.error(References.NAME + "'s version checker failed!");
                    hasShownUp = true;

                }
            }
        }
    }


    /** Item Enchanter **/
    @SubscribeEvent
    public static void onCrafting(PlayerEvent.ItemCraftedEvent event) {
        Item item = event.getCrafting().getItem();
        ItemStack stack = event.getCrafting();

        if (ForgeRegistries.ITEMS.getKey(item).toString().contains("advancedsticks:blazerod")) {
            stack.enchant(Enchantments.FIRE_ASPECT, 1);
        }
        if (ForgeRegistries.ITEMS.getKey(item).toString().contains("advancedsticks:endrod")) {
            stack.enchant(Enchantments.KNOCKBACK, 3);
        }
        if (ForgeRegistries.ITEMS.getKey(item).toString().contains("advancedsticks:enchanted")) {
            stack.enchant(Enchantments.MENDING, 1);
        }
    }


}
