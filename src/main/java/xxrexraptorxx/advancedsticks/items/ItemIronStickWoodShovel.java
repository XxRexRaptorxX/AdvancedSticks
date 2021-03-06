package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemIronStickWoodShovel extends ItemSpade {

	public ItemIronStickWoodShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(AdvancedSticks.mainTab);
	}
	
	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.BLUE + "> Iron Stick");
	}
	
	
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Item.getItemFromBlock(Blocks.PLANKS);
	} 
}
