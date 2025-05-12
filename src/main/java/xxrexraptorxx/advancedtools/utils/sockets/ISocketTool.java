package xxrexraptorxx.advancedtools.utils.sockets;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.enums.Materials;

import java.util.Objects;

public interface ISocketTool {

    static int getSocketCount(Item item) {
        String name = BuiltInRegistries.ITEM.getKey(item).getPath();
        Materials handleMaterial = Materials.fromName(Objects.requireNonNull(ToolUtils.getPartsFromTool(name))[0]).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + name));
        Materials headMaterial = Materials.fromName(Objects.requireNonNull(ToolUtils.getPartsFromTool(name))[1]).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + name));

        return handleMaterial.getUpgradeSlots() + headMaterial.getUpgradeSlots();
    }
}
