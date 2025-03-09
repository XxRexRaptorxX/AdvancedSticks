package xxrexraptorxx.advancedsticks.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

public class CustomHoeItem extends HoeItem {

    public CustomHoeItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }


    @Override
    public Component getName(ItemStack stack) {
        return ToolUtils.getVanillaToolTranslationKey(this);
    }
}
