package xxrexraptorxx.advancedtools.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

public class CustomSwordItem extends SwordItem {

    public CustomSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(material.applySwordProperties(properties, attackDamage, attackSpeed));
    }


    @Override
    public Component getName(ItemStack stack) {
        return ToolUtils.getVanillaToolTranslationKey(this);
    }
}
