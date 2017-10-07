package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.util.ItemAdvancedAxe;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemEndrodStoneAxe extends ItemAdvancedAxe {

	public ItemEndrodStoneAxe(ToolMaterial material) {
		super(material, -3.2F);
		this.setCreativeTab(AdvancedSticks.mainTab);
		
	}

	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.BLUE + "> Endrod");
	}
	
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
		
		if(AdvancedSticks.activateDefaultEnchantments){
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(Enchantments.KNOCKBACK, 1);;
			super.onUpdate(stack, world, entity, i, bool);
		}	}
	}
	
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	} 
}
