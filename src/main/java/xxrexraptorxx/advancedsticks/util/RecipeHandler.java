package xxrexraptorxx.advancedsticks.util;

import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class RecipeHandler {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();

     if(!AdvancedSticks.activateBowCrafting) {
    	ResourceLocation bow1 = new ResourceLocation("advancedsticks:bow_iron");
        modRegistry.remove(bow1);
       	ResourceLocation bow2 = new ResourceLocation("advancedsticks:bow_gold");
        modRegistry.remove(bow2);
       	ResourceLocation bow3 = new ResourceLocation("advancedsticks:bow_diamond");
        modRegistry.remove(bow3);
     }   
     
     if(!AdvancedSticks.activateLongstickCrafting) {
    	ResourceLocation longstick1 = new ResourceLocation("advancedsticks:longstick_advanced");
        modRegistry.remove(longstick1); 
      	ResourceLocation longstick2 = new ResourceLocation("advancedsticks:longstick_advanced_alt");
        modRegistry.remove(longstick2); 
      	ResourceLocation longstick3 = new ResourceLocation("advancedsticks:longstick_advanced2_alt");
        modRegistry.remove(longstick3); 
      	ResourceLocation longstick4 = new ResourceLocation("advancedsticks:longstick_advanced2");
        modRegistry.remove(longstick4); 
      	ResourceLocation longstick5 = new ResourceLocation("advancedsticks:longstick_blazerod");
        modRegistry.remove(longstick5); 
      	ResourceLocation longstick6 = new ResourceLocation("advancedsticks:longstick_bone");
        modRegistry.remove(longstick6); 
      	ResourceLocation longstick7 = new ResourceLocation("advancedsticks:longstick_diamond_alt");
        modRegistry.remove(longstick7); 
      	ResourceLocation longstick8 = new ResourceLocation("advancedsticks:longstick_diamond");
        modRegistry.remove(longstick8); 
      	ResourceLocation longstick9 = new ResourceLocation("advancedsticks:longstick_emerald_alt");
        modRegistry.remove(longstick9); 
      	ResourceLocation longstick10 = new ResourceLocation("advancedsticks:longstick_emerald");
        modRegistry.remove(longstick10); 
      	ResourceLocation longstick11 = new ResourceLocation("advancedsticks:longstick_bone_alt");
        modRegistry.remove(longstick11); 
      	ResourceLocation longstick12 = new ResourceLocation("advancedsticks:longstick_enchanted_alt");
        modRegistry.remove(longstick12); 
      	ResourceLocation longstick13 = new ResourceLocation("advancedsticks:longstick_enchanted");
        modRegistry.remove(longstick13); 
      	ResourceLocation longstick14 = new ResourceLocation("advancedsticks:longstick_enchanted2");
        modRegistry.remove(longstick14); 
      	ResourceLocation longstick15 = new ResourceLocation("advancedsticks:longstick_end_alt");
        modRegistry.remove(longstick15); 
      	ResourceLocation longstick16 = new ResourceLocation("advancedsticks:longstick_end");
        modRegistry.remove(longstick16); 
      	ResourceLocation longstick17 = new ResourceLocation("advancedsticks:longstick_gold_alt");
        modRegistry.remove(longstick17); 
      	ResourceLocation longstick18 = new ResourceLocation("advancedsticks:longstick_gold");
        modRegistry.remove(longstick18); 
      	ResourceLocation longstick19 = new ResourceLocation("advancedsticks:longstick_iron_alt");
        modRegistry.remove(longstick19); 
      	ResourceLocation longstick20 = new ResourceLocation("advancedsticks:longstick_iron");
        modRegistry.remove(longstick20); 
      	ResourceLocation longstick21 = new ResourceLocation("advancedsticks:longstick_quartz_alt");
        modRegistry.remove(longstick21); 
      	ResourceLocation longstick22 = new ResourceLocation("advancedsticks:longstick_quartz");
        modRegistry.remove(longstick22); 
      	ResourceLocation longstick23 = new ResourceLocation("advancedsticks:longstick_redstone_alt");
        modRegistry.remove(longstick23); 
      	ResourceLocation longstick24 = new ResourceLocation("advancedsticks:longstick_redstone");
        modRegistry.remove(longstick24); 
      	ResourceLocation longstick25 = new ResourceLocation("advancedsticks:longstick_redstone2");
        modRegistry.remove(longstick25); 
      	ResourceLocation longstick26 = new ResourceLocation("advancedsticks:longstick_wood_alt");
        modRegistry.remove(longstick26); 
      	ResourceLocation longstick27 = new ResourceLocation("advancedsticks:longstick_wood");
        modRegistry.remove(longstick27); 

        
     }

    }
}  