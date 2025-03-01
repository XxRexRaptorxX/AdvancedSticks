package xxrexraptorxx.advancedsticks.items;

import net.minecraft.world.item.BowItem;
import xxrexraptorxx.advancedsticks.registry.ModItems;

public class CustomBowItem extends BowItem {

    public CustomBowItem(Properties properties) {
        super(properties);
    }


    @Override
    public int getDefaultProjectileRange() {
        if (this == ModItems.IRON_BOW.get()) return 17;
        if (this == ModItems.GOLD_BOW.get()) return 19;
        if (this == ModItems.DIAMOND_BOW.get()) return 21;
        if (this == ModItems.NETHERITE_BOW.get()) return 23;
        return super.getDefaultProjectileRange();
    }
}
