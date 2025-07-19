package xxrexraptorxx.advancedtools.world;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.magmacore.utils.FormattingHelper;

import java.util.Objects;

@EventBusSubscriber(modid = References.MODID)
public class Events {

    /**
     * Adds tooltips to tools with stick variant.
     **/
    @SubscribeEvent
    public static void addingToolTips(ItemTooltipEvent event) {
        Item item = event.getItemStack().getItem();
        String namespace = BuiltInRegistries.ITEM.getKey(item).getNamespace();
        String name = BuiltInRegistries.ITEM.getKey(item).getPath();

            if (!ToolUtils.excludedMods(namespace) && item.components().has(DataComponents.TOOL) && ToolUtils.isToolType(name)) {

                if (namespace.equals(References.MODID)) {
                    if (Screen.hasShiftDown() && Config.getShowMaterialStats()) {
                        event.getToolTip().add(2, ToolUtils.getToolStatDescription(Objects.requireNonNull(ToolUtils.getPartsFromTool(name))[0], Objects.requireNonNull(ToolUtils.getPartsFromTool(name))[1]));

                    } else {
                        if (Config.getShowStickType()) {
                            event.getToolTip().add(1, FormattingHelper.setModLangComponent("message", References.MODID, "handle", ChatFormatting.GRAY));
                            event.getToolTip().add(2, Component.literal(" " + ToolUtils.getStickFromName(item)).withStyle(ChatFormatting.DARK_GRAY));
                        }
                    }
                    event.getToolTip().add(3, Component.empty());

                } else if (namespace.equals(ResourceLocation.DEFAULT_NAMESPACE)) {
                    if (Screen.hasShiftDown() && Config.getShowMaterialStats()) {
                        event.getToolTip().add(2, ToolUtils.getToolStatDescription("wood", ToolUtils.getBaseMaterialFromVanillaItem(name)));

                    } else {
                        if (Config.getShowStickType()) {
                            event.getToolTip().add(1, FormattingHelper.setModLangComponent("message", References.MODID, "handle", ChatFormatting.GRAY));
                            event.getToolTip().add(2, Component.literal(" ").append(FormattingHelper.setModLangComponent("item", References.MODID, "stick_wood", ChatFormatting.DARK_GRAY)));
                        }
                    }

                } else if (namespace.equals("bedrockminer")) {
                    if (Config.getShowStickType()) {
                        event.getToolTip().add(1, FormattingHelper.setModLangComponent("message", References.MODID, "handle", ChatFormatting.GRAY));
                        event.getToolTip().add(2, Component.literal(" ").append(FormattingHelper.setModLangComponent("item", References.MODID, "stick_diamond", ChatFormatting.DARK_GRAY)));
                    }

                } else {
                    if (Config.getShowStickType()) {
                        event.getToolTip().add(1, FormattingHelper.setModLangComponent("message", References.MODID, "handle", ChatFormatting.GRAY));
                        event.getToolTip().add(2, Component.literal(" ").append(FormattingHelper.setModLangComponent("item", References.MODID, "stick_wood", ChatFormatting.DARK_GRAY)));
                    }
                }
            }
    }

/*              TODO Sockets!
    @SubscribeEvent
    public static void onGatherComponents(RenderTooltipEvent.GatherComponents event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();
        boolean shiftDown = Screen.hasShiftDown();

        //test if item has sockets
        if (SocketUtils.hasSockets(stack)) {
            List<String> sockets = stack.get(ModComponents.SOCKETS.get());
            boolean allEmpty = sockets.stream().allMatch(s -> s.startsWith(SocketUtils.EMPTY_SLOT));
            boolean shouldDisplay = Config.getHideUpgradeSlots() ? shiftDown : (!allEmpty || !shiftDown);

            //set line number
            if (shouldDisplay) {
                int maxSockets = ISocketTool.getSocketCount(item);
                int lineIndex = shiftDown ? 4 : 5;

                event.getTooltipElements().add(lineIndex, Either.right(new SocketTooltipComponent(maxSockets, sockets)));
            }
        }
    }


    //@SubscribeEvent
    //public static void onInventoryTick(PlayerTickEvent.Pre event) {
    //    for (ItemStack stack : event.getEntity().getInventory()) {
    //        SocketUtils.applySocketEffects(stack);
    //    }
    //}


    @SubscribeEvent
    public static void onItemStackedOnOther(ItemStackedOnOtherEvent event) {
        Player player = event.getPlayer();
        ItemStack upgrade = event.getCarriedItem();
        ItemStack tool = event.getStackedOnItem();

        // Abbrechen, wenn nicht tool mit sockets und upgrade item
        if (!(tool.getItem() instanceof ISocketTool) || !(upgrade.getItem() instanceof UpgradeItem)) {
            return;
        }

        if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Try to place " + upgrade.getItem().getName() + " into a " + tool.getItem().getName());

        boolean changed = SocketUtils.insertOrStackUpgrade(tool, upgrade);
        if (changed) {
            upgrade.shrink(1);
        }

        // Verhindere Standardverhalten (z.B. Stack-Zusammenfügen)
        event.setCanceled(true);

        // Aktualisiere das Container-Menü für Multiplayer
        if (player.containerMenu != null) {
            player.containerMenu.broadcastChanges();
        }
    }
*/

}
