package xxrexraptorxx.advancedtools.items;

import net.minecraft.world.item.BowItem;
import xxrexraptorxx.advancedtools.registry.ModItems;

public class CustomBowItem extends BowItem {

    public CustomBowItem(Properties properties) {
        super(properties);
    }


    @Override
    public int getDefaultProjectileRange() {
        if (this == ModItems.IRON_BOW.get()) return 20;
        if (this == ModItems.GOLD_BOW.get()) return 25;
        if (this == ModItems.DIAMOND_BOW.get()) return 30;
        if (this == ModItems.NETHERITE_BOW.get()) return 35;
        return super.getDefaultProjectileRange();
    }

}
