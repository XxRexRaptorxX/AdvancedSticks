package xxrexraptorxx.advancedtools.utils.sockets;

import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public record SocketTooltipComponent(int maxSockets, List<ItemStack> sockets) implements TooltipComponent {
}
