package xxrexraptorxx.advancedsticks.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeTier;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

import javax.annotation.Nullable;
import java.util.List;

public class CustomPickaxeItem extends PickaxeItem {


    public CustomPickaxeItem(ForgeTier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }


    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flag) {
        list.add(new TextComponent("> " + ToolUtils.getStickFromName(stack.getItem())).withStyle(ChatFormatting.DARK_GRAY));
    }
}
