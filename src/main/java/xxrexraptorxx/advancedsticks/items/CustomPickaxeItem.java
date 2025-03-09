package xxrexraptorxx.advancedsticks.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

public class CustomPickaxeItem extends PickaxeItem {

    public CustomPickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }


    @Override
    public Component getName(ItemStack stack) {
        return ToolUtils.getVanillaToolTranslationKey(this);
    }
}
