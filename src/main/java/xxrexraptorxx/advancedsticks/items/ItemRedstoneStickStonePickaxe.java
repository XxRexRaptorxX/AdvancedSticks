package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemRedstoneStickStonePickaxe extends ItemPickaxe {

	public ItemRedstoneStickStonePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(AdvancedSticks.mainTab);
	}
	
	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.BLUE + "> Redstone Stick");
	}
	
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
		
		if(AdvancedSticks.activateDefaultEnchantments){
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(Enchantments.MENDING, 1);;
			super.onUpdate(stack, world, entity, i, bool);
		}	}
	}
	
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE);
	} 
}
