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

public class ItemElementalStickFire extends Item {

	public ItemElementalStickFire () {
		super();
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setMaxStackSize(1);
	}
		

	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.DARK_RED + "x Fire x");
	}
	
	public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
		super.onUpdate(stack, world, entity, i, bool);
		
		if(stack.isItemEnchanted() == false) {
			stack.addEnchantment(Enchantments.FIRE_ASPECT, 5);;
			super.onUpdate(stack, world, entity, i, bool);
		}
	}
	
}
