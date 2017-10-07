package xxrexraptorxx.advancedsticks.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xxrexraptorxx.advancedsticks.gui.GuiHandler;
import xxrexraptorxx.advancedsticks.handler.ChestGenHandler;
import xxrexraptorxx.advancedsticks.handler.FuelHandler;
import xxrexraptorxx.advancedsticks.handler.OreDictionaryHandler;
import xxrexraptorxx.advancedsticks.proxy.ServerProxy;
import xxrexraptorxx.advancedsticks.util.Events;
import xxrexraptorxx.advancedsticks.util.UpdateChecker;

/**---------------------------------------------------------------------------------*
 * @author XxRexRaptorxX (RexRaptor)
 * @forumThread http://www.planetminecraft.com/mod/advanced-sticks/
 * @projectPage https://minecraft.curseforge.com/projects/advanced-sticks-mod
 **---------------------------------------------------------------------------------*/


@Mod(modid = AdvancedSticks.MODID, version = AdvancedSticks.VERSION)
public class AdvancedSticks {
   
    public static final String MODID = "advancedsticks";
    public static final String VERSION = "1.5.6";
    
   
    @Instance("advancedsticks")
    public static AdvancedSticks instance = new AdvancedSticks();
    
    @SidedProxy(modId = MODID, clientSide = "xxrexraptorxx.advancedsticks.proxy.ClientProxy", serverSide = "xxrexraptorxx.advancedsticks.proxy.ServerProxy")
    public static ServerProxy proxy = new ServerProxy();
    
    
    // Items //
    public ModItems items;
    
    // Blocks //
    public ModBlocks blocks;
    
    // Recipes //
    public ModRecipes recipes;
    
    
	// Config //
	public static boolean activateLongstickCrafting;
	public static boolean activateBowCrafting;
	public static boolean activateUpdateChecker;
	public static boolean activateChestGeneration;
	public static boolean activateToolChestGeneration;
	public static boolean activateDefaultEnchantments;
	public static boolean activateToolRecycling;
	public static boolean activateBranchDrop;
	public static int branchDropChance;
	
	
    // Creative-Tab //
    public static CreativeTabs mainTab = new CreativeTabs("advancedsticksTab") {
	
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.bough);
		}
	};



    /***********************************************************************************************************************************/ 
    /***********************************************************************************************************************************/
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        // Config //
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
        
    		activateLongstickCrafting = config.get("CRAFTING", "Activate Longstick Crafting", true, "[true/false]").getBoolean();
    		activateBowCrafting = config.get("CRAFTING", "Activate Bow Crafting", true, "[true/false]").getBoolean();
    		activateUpdateChecker = config.get("EVENTS", "Activate Update-Checker", true, "[true/false]").getBoolean();
    		activateChestGeneration = config.get("GENERATION", "Activate Chest Generation", true, "[true/false] ['false' not recommend]").getBoolean();
    		activateToolChestGeneration = config.get("GENERATION", "Activate Tool Chest Generation", true, "[true/false]").getBoolean();
    		activateDefaultEnchantments = config.get("OTHER", "Activate Default Tool Enchantments", true, "[true/false]").getBoolean();
    		activateToolRecycling = config.get("SMELTING", "Activate Tool Recycling", true ,"[true/false]").getBoolean();
    		activateBranchDrop = config.get("EVENTS", "Activate the branch drop of leaves", true, "[true/false]").getBoolean();
    		branchDropChance = config.getInt("The chance of a branch drop from leaves", "EVENTS", 50, 1, 500, "Higher = Rarer");
    		
    	config.save();
        
        
    
        // Update Checker //
    UpdateChecker.checkForUpdates();  
    	
    	// Events //
    MinecraftForge.EVENT_BUS.register(new Events());
    
    
    
 	// Blocks //
 	
 	blocks = new ModBlocks();
    blocks.init();
 	blocks.register();
 	
 	// Items //
 	
 	items = new ModItems();
    items.init();
 	items.register();
 	
  
    }
  
    
    
    
    
   
    @EventHandler
    public void Init(FMLInitializationEvent event) {
    	
    	
   	    // Gui // 
    	    
    	new GuiHandler();

    	// Recipes //
    	
    	recipes = new ModRecipes();
    	recipes.register();
    	

         
        // OreDictionary // 
         
         OreDictionaryHandler.registerOreDictionary();
        
        // Fuel //
         
    	 GameRegistry.registerFuelHandler(new FuelHandler());
        		
    	 
      	 
    	
      	 /** Seed Drop **/
      	 
      	 MinecraftForge.addGrassSeed(new ItemStack(ModItems.shrubSeeds), 1);
      	 
      	 
      	 /** Chest Gen **/
      	 
     	 MinecraftForge.EVENT_BUS.register(new ChestGenHandler());
     	 

    }
   
   
    
    
    
    
    
    
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    	// Proxy //
    	 
        proxy.registerClientStuff();
              
    }
 
}