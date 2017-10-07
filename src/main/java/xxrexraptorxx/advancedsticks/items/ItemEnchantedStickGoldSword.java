package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemEnchantedStickGoldSword extends ItemSword {

	public ItemEnchantedStickGoldSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(AdvancedSticks.mainTab);
		
	}

	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.BLUE + "> Enchanted Stick");
	}
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    
    
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.GOLD_INGOT;
	} 
    
}
