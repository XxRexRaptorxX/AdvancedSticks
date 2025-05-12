package xxrexraptorxx.advancedtools.utils.sockets;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import org.joml.Matrix4f;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.SocketUtils;

import java.util.List;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientTooltipFactories {

    @SubscribeEvent
    public static void registerFactories(RegisterClientTooltipComponentFactoriesEvent event) {
        event.register(SocketTooltipComponent.class, data -> new ClientTooltipComponent() {

            private final int maxSlots = data.maxSockets();
            private final List<String> socketIds = ((SocketTooltipComponent) data).sockets();
            private static final int FRAME_COLOR = 0xFF555555;
            private static final int SLOT_COLOR = 0x55333333;

            @Override
            public int getWidth(Font font) {
                return maxSlots * 18 + 2;
            }


            @Override
            public int getHeight(Font font) {
                return font.lineHeight + 2 + 18;
            }


            @Override
            public boolean showTooltipWithItemInHand() {
                return true;
            }


            @Override
            public void renderText(Font font, int x, int y, Matrix4f matrix, MultiBufferSource.BufferSource buffers) {
                if (!Screen.hasShiftDown()) {
                    Component title = Component.translatable(FormattingUtils.setLangTag("message", "sockets")).withStyle(ChatFormatting.GRAY);

                    font.drawInBatch(title, x, y, -1, true, matrix, buffers, Font.DisplayMode.NORMAL, 0, 15728880);
                }
            }


            @Override
            public void renderImage(Font font, int x, int y, int width, int height, GuiGraphics graphics) {
                // y-offset for title
                int slotY = y + font.lineHeight + 2;

                //draw slots
                for (int i = 0; i < maxSlots; i++) {
                    int slotX = x + 4 + i * 18;

                    //inner part
                    graphics.fill(slotX, slotY, slotX + 16, slotY + 16, SLOT_COLOR);
                    //frames
                    graphics.fill(slotX + 1, slotY,     slotX + 15, slotY + 1, FRAME_COLOR);
                    graphics.fill(slotX + 1, slotY + 15, slotX + 15, slotY + 16, FRAME_COLOR);
                    graphics.fill(slotX,     slotY + 1,  slotX + 1,  slotY + 15, FRAME_COLOR);
                    graphics.fill(slotX + 15,slotY + 1,  slotX + 16, slotY + 15, FRAME_COLOR);

                    //draw items
                    if (i < socketIds.size()) {
                        String id = socketIds.get(i);
                        if (!id.equals(SocketUtils.EMPTY_SLOT)) {
                            ResourceLocation loc = ResourceLocation.tryParse(id);
                            if (loc != null) {
                                Item item = BuiltInRegistries.ITEM.getValue(loc);
                                if (item != null) {
                                    ItemStack stack = new ItemStack(item);
                                    graphics.renderItem(stack, slotX, slotY);
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}