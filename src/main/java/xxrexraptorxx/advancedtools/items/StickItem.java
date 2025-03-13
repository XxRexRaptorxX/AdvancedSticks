package xxrexraptorxx.advancedtools.items;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedtools.main.References;

public class StickItem extends Item {

    public StickItem(Properties properties) {
        super(properties);
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return this == BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_enchanted"));
    }

}
