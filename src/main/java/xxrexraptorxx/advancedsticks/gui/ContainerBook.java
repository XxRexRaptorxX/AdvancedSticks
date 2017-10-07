package xxrexraptorxx.advancedsticks.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerBook extends Container {

	public ContainerBook(EntityPlayer player) {
		
	}

	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
}
