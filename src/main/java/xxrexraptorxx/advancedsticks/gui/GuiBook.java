package xxrexraptorxx.advancedsticks.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class GuiBook extends GuiScreen {
	
	public static ResourceLocation Book = new ResourceLocation(AdvancedSticks.MODID.toLowerCase(), "textures/gui/book_gui.png");
	
	public GuiBook(EntityPlayer player) {
		
	}
	
	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();
		
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(Book);
		
		drawTexturedModalRect(width / 2 - 1168, 100, 0, 0, 1440, 1168);
		
		super.drawScreen(x, y, f);
	}
	
	
	

	@Override
	public boolean doesGuiPauseGame() {
		return false;
		
	}
	
}	
	
	
/**	public static ResourceLocation Book = new ResourceLocation(AdvancedSticks.MODID, "textures/gui/book_gui.png");
	
	mc.renderEngine.bindTexture(Book);
	drawTextureModalRect(width / 2 - 1168, 100, 0, 0, 1440, 1168);
		
		
		
	}  **/

