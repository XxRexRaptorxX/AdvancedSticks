package xxrexraptorxx.advancedsticks.util;

import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.oredict.OreDictionary;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.main.ModItems;



public class Events {    

	
    	/** Update-Checker **/
	
	private boolean hasShownUp = false;
	
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		if(AdvancedSticks.activateUpdateChecker){
		if (UpdateChecker.isNewVersionAvailable() && !hasShownUp && Minecraft.getMinecraft().currentScreen == null) {
	        
				ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "https://minecraft.curseforge.com/projects/advanced-sticks-mod");
	            Style clickableChatStyle = new Style().setClickEvent(versionCheckChatClickEvent);
	            Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BLUE + "A newer version of Advanced Sticks is available!"));
	            TextComponentString versionWarningChatComponent = new TextComponentString(TextFormatting.GRAY + "Click here to update!");
	            versionWarningChatComponent.setStyle(clickableChatStyle);
	            Minecraft.getMinecraft().player.sendMessage(versionWarningChatComponent);

			hasShownUp = true;
			}
		 }
	}
	
	
	
	
		/** Bough Drop **/
	
	@SubscribeEvent
	public void BoughDrop(HarvestDropsEvent event) {
		if(AdvancedSticks.activateBranchDrop){
		if(event.getState().getBlock() instanceof BlockLeaves) {
			Random random = new Random();
			
			if(random.nextInt(AdvancedSticks.branchDropChance) == 0) {
			event.getDrops().add(new ItemStack(ModItems.bough));
		  }
		}
	  }
	}	
	

	
	
		/** Bow FOV **/ 
	
	@SubscribeEvent
	public void onFOVUpdate(FOVUpdateEvent event) {
		EntityPlayer player = event.getEntity();
		if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.diamondBow) {
				
				int i = player.getItemInUseMaxCount();
				float f1 = (float) i / 7.0F;
				                     //speed
				
				if (f1 > 1.0F) {
					f1 = 1.0F;
				} else {
					f1 = f1 * f1;
				}
				                                        //zoom wight
			event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.15F);	
				} 
		
		
		if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.goldBow) {
			
			int i = player.getItemInUseMaxCount();
			float f1 = (float) i / 7.0F;
			                     //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.15F);	
			} 
		
		
		if (player.isHandActive() && player.getActiveItemStack() != null && player.getActiveItemStack().getItem() == ModItems.ironBow) {
			
			int i = player.getItemInUseMaxCount();
			float f1 = (float) i / 7.0F;
			                     //speed
			
			if (f1 > 1.0F) {
				f1 = 1.0F;
			} else {
				f1 = f1 * f1;
			}
			                                        //zoom wight
		event.setNewfov(event.getNewfov() * 1.0F - f1 * 0.15F);	
			} 
		}
	}

