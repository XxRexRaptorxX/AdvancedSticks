package xxrexraptorxx.advancedtools.utils;

import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedtools.registry.ModComponents;

import java.util.Objects;

public class SocketUtils {

    public static ModComponents.SocketData getSocketData(ItemStack stack) {
        if (!stack.has(ModComponents.SOCKET_COMPONENT.get())) {
            return ModComponents.SocketData.EMPTY;
        }
        return stack.get(ModComponents.SOCKET_COMPONENT.get());
    }


    public static boolean hasEmptySockets(ItemStack stack) {
        return Objects.requireNonNull(stack.get(ModComponents.SOCKET_COMPONENT.get())).sockets().isEmpty();
    }


    public static boolean hasSockets(ItemStack stack) {
        return stack.has(ModComponents.SOCKET_COMPONENT.get());
    }
}
