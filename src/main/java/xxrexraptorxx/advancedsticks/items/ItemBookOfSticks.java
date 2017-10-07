package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;



public class ItemBookOfSticks extends Item {
	
	public static ResourceLocation Book = new ResourceLocation(AdvancedSticks.MODID, "textures/gui/book_gui.png");
	
	
	public ItemBookOfSticks () {
		super();
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.GRAY + "by XxRexRaptorxX");
	}
	
	

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.openGui(AdvancedSticks.instance, 0, world, (int)player.posX, (int)player.posY, (int)player.posZ);
        	System.out.println("test!!!!!!");
		return itemstack;
		} 

}
		/**
		 * 	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		 *  if (!world.isRemote) {
            player.openGui(AdvancedSticks.MODID, Book, player.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
        }

        return itemStack;
    }
}

*/

