package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemElementalStickEarth extends Item {

	public ItemElementalStickEarth () {
		super();
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setMaxStackSize(1);
	}
		

	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.GOLD + "- Earth -");
	}
	
	
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
		
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(Enchantments.PUNCH, 5);
			super.onUpdate(stack, world, entity, i, bool);
		}
	}
	
	
}
