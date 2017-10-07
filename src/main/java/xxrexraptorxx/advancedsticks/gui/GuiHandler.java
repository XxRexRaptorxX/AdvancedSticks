package xxrexraptorxx.advancedsticks.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

public class GuiHandler implements IGuiHandler {

	public GuiHandler() {
		NetworkRegistry.INSTANCE.registerGuiHandler(AdvancedSticks.instance, this);
	}
	
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		switch(ID) {
		default: return null;
		case 0: return new ContainerBook(player);
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		switch(ID) {
		default: return null;
		case 0: return new GuiBook(player);
		}
	}
}
