package xxrexraptorxx.advancedsticks.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.common.SimpleTier;
import xxrexraptorxx.advancedsticks.utils.Config;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

import java.util.List;

public class CustomSwordItem extends SwordItem {


    public CustomSwordItem(SimpleTier tier, Properties properties) {
        super(tier, properties);
    }


    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> list, TooltipFlag flag) {
        if (Config.SHOW_STICK_TYPE.get()) {
            list.add(Component.literal("> " + ToolUtils.getStickFromName(stack.getItem())).withStyle(ChatFormatting.DARK_GRAY));
        }
    }

}
