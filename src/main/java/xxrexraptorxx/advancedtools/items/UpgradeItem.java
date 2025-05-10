package xxrexraptorxx.advancedtools.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class UpgradeItem extends Item {

    public UpgradeItem(Properties properties) {
        super(properties.rarity(Rarity.UNCOMMON));
    }

}
