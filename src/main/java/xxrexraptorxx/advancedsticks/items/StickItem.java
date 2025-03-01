package xxrexraptorxx.advancedsticks.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedsticks.registry.ModItems;

public class StickItem extends Item {

    public StickItem(Properties properties) {
        super(properties);
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return this == ModItems.ENCHANTED_STICK.get();
    }

}
