package xxrexraptorxx.advancedsticks.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedsticks.registry.ModItems;

public class ItemBasic extends Item {

    public ItemBasic() {
        super(new Properties());
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        if(this == ModItems.ENCHANTED_STICK.get()) {
            return true;
        } else {
            return false;
        }
    }

}
