package xxrexraptorxx.advancedtools.utils.sockets;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import org.joml.Matrix4f;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;

import java.util.List;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientTooltipFactories {

    @SubscribeEvent
    public static void registerFactories(RegisterClientTooltipComponentFactoriesEvent event) {
        event.register(SocketTooltipComponent.class, data -> new ClientTooltipComponent() {
            private final List<ItemStack> sockets = ((SocketTooltipComponent) data).sockets();

            @Override
            public int getWidth(Font font) {
                return sockets.size() * 18 + 2;
            }

            @Override
            public int getHeight(Font font) {
                return 18;
            }

            @Override
            public boolean showTooltipWithItemInHand() {
                return true;
            }


            @Override
            public void renderText(Font font, int x, int y, Matrix4f pose, MultiBufferSource.BufferSource buffers) {
                font.drawInBatch(Component.translatable(FormattingUtils.setLangTag("message", "sockets")).withStyle(ChatFormatting.GRAY),
                        x, y + 2, -1, true, pose, buffers, Font.DisplayMode.NORMAL, 0, 15728880);
            }


            @Override
            public void renderImage(Font font, int x, int y, int width, int height, GuiGraphics graphics) {
                for (int i = 0; i < sockets.size(); i++) {
                    ItemStack stack = sockets.get(i);

                    if (!stack.isEmpty()) {
                        graphics.renderItem(stack, x + 1 + i * 18, y);
                    }
                }
            }
        });
    }
}
