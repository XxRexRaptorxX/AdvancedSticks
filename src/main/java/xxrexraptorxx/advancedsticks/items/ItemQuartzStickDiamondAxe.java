package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.util.ItemAdvancedAxe;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemQuartzStickDiamondAxe extends ItemAdvancedAxe {

	public ItemQuartzStickDiamondAxe(ToolMaterial material) {
		super(material, -3.0F);
		this.setCreativeTab(AdvancedSticks.mainTab);
		
	}

	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.BLUE + "> Quartz Stick");
	}
	
	
}
