package xxrexraptorxx.advancedsticks.main;

import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
	
	public ModRecipes() {
	}
		public void register() {
			

	      	 /** Melting **/
	      	 
	      	 
	 if (AdvancedSticks.activateToolRecycling) {
	 	    ItemStack stackGoldNugget = new ItemStack(Items.GOLD_NUGGET);
	 	    ItemStack stackGoldNugget2 = new ItemStack(Items.GOLD_NUGGET, 2);
	 	    ItemStack stackIronNugget = new ItemStack(Items.IRON_NUGGET);
	 	    ItemStack stackIronNugget2 = new ItemStack(Items.IRON_NUGGET, 2);
	        ItemStack stackIronBow = new ItemStack(ModItems.ironBow);
	        ItemStack stackGoldBow = new ItemStack(ModItems.goldBow);
	    	 
	 	    
	    	 GameRegistry.addSmelting(ModItems.ironStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.ironStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.ironStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.ironStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.ironStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.goldStickGoldSword, stackGoldNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.goldStickGoldShovel, stackGoldNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.goldStickGoldAxe, stackGoldNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.goldStickGoldHoe, stackGoldNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.goldStickGoldPickaxe, stackGoldNugget2, 20); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.diamondStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.emeraldStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.boneStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.blazerodGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodGoldPickaxe, stackGoldNugget, 10);
	      	 
	    	 GameRegistry.addSmelting(ModItems.enchantedStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.quartzStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.endrodGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodGoldPickaxe, stackGoldNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.advancedStickGoldSword, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickGoldShovel, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickGoldAxe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickGoldHoe, stackGoldNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickGoldPickaxe, stackGoldNugget, 10); 
	      	 
	      	 GameRegistry.addSmelting(stackGoldBow, stackGoldNugget, 10);
	      	 //-----------------------------------------------------------------------//
	    	 GameRegistry.addSmelting(ModItems.ironStickIronSword, stackIronNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.ironStickIronShovel, stackIronNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.ironStickIronAxe, stackIronNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.ironStickIronHoe, stackIronNugget2, 20); 
	      	 GameRegistry.addSmelting(ModItems.ironStickIronPickaxe, stackIronNugget2, 20); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.goldStickIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.goldStickIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.goldStickIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.goldStickIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.goldStickIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.diamondStickIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.diamondStickIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.emeraldStickIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.emeraldStickIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.boneStickIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.boneStickIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.blazerodIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.blazerodIronPickaxe, stackIronNugget, 10);
	      	 
	    	 GameRegistry.addSmelting(ModItems.enchantedStickIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.enchantedStickIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.quartzStickIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.quartzStickIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.endrodIronSword, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodIronShovel, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodIronAxe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodIronHoe, stackIronNugget, 10); 
	      	 GameRegistry.addSmelting(ModItems.endrodIronPickaxe, stackIronNugget, 10); 
	      	 
	    	 GameRegistry.addSmelting(ModItems.advancedStickIronSword, stackIronNugget2, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickIronShovel, stackIronNugget2, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickIronAxe, stackIronNugget2, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickIronHoe, stackIronNugget2, 10); 
	      	 GameRegistry.addSmelting(ModItems.advancedStickIronPickaxe, stackIronNugget2, 10); 
	      	 
	      	 GameRegistry.addSmelting(stackIronBow, stackIronNugget, 10);
	 }
	}	
}
