package xxrexraptorxx.advancedtools.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

public class CustomAxeItem extends AxeItem {

    public CustomAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }


    @Override
    public Component getName(ItemStack stack) {
        return ToolUtils.getVanillaToolTranslationKey(this);
    }
}
