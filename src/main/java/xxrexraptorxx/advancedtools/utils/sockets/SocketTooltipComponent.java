package xxrexraptorxx.advancedtools.utils.sockets;

import net.minecraft.world.inventory.tooltip.TooltipComponent;

import java.util.List;

public record SocketTooltipComponent(int maxSockets, List<String> sockets) implements TooltipComponent {
}
