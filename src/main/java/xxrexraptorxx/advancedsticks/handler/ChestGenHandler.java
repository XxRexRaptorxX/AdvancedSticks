package xxrexraptorxx.advancedsticks.handler;

import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChestGenHandler {
	

	    private void addLoot(LootPool pool, Item plakat, int weight) {
	        pool.addEntry(new LootEntryItem(plakat, weight, 0, new LootFunction[0], new LootCondition[0], plakat.getRegistryName().toString())); }
	    
	    @SubscribeEvent
	    public void onLootLoad(LootTableLoadEvent event) {
	    
	    	if(AdvancedSticks.activateChestGeneration) {	
	    
	    	if(event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.stickIron, 20);
	            addLoot(pool, ModItems.stickEnchanted, 10);
	            addLoot(pool, ModItems.elementalStickEarth, 2);
	            addLoot(pool, ModItems.stickGold, 20);
	            addLoot(pool, ModItems.shrubSeeds, 20);
	        if(AdvancedSticks.activateToolChestGeneration) {	     
	            addLoot(pool, ModItems.ironStickGoldSword, 10);
	            addLoot(pool, ModItems.boneStickIronShovel, 10);
	            addLoot(pool, ModItems.diamondStickWoodAxe, 10);
	        }	}
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_VILLAGE_BLACKSMITH)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.stickIron, 50); 
	            addLoot(pool, ModItems.bookOfSticks, 20);
	        if(AdvancedSticks.activateToolChestGeneration) {
	            addLoot(pool, ModItems.ironStickGoldPickaxe, 20);
	            addLoot(pool, ModItems.ironStickIronSword, 20);
	            addLoot(pool, ModItems.ironStickGoldAxe, 20);
	            addLoot(pool, ModItems.goldStickIronHoe, 20);
	            addLoot(pool, ModItems.goldStickDiamondShovel, 10);
	        } 	}
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_NETHER_BRIDGE)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.elementalStickFire, 3);
	            addLoot(pool, ModItems.longBlazerod, 10); 
	            addLoot(pool, ModItems.elementalStickDimension, 1);
	        if(AdvancedSticks.activateToolChestGeneration) {    
	            addLoot(pool, ModItems.diamondStickDiamondAxe, 10);
	            addLoot(pool, ModItems.blazerodGoldSword, 10);
	            addLoot(pool, ModItems.blazerodIronPickaxe, 10);
	            addLoot(pool, ModItems.ironStickIronAxe, 10);
	        }	}
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_STRONGHOLD_LIBRARY)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.elementalStickAir, 2);
	            addLoot(pool, ModItems.bookOfSticks, 20);
	        if(AdvancedSticks.activateToolChestGeneration) {   
	            addLoot(pool, ModItems.endrodIronSword, 10);
	            addLoot(pool, ModItems.endrodDiamondPickaxe, 10);
	        }	}
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_END_CITY_TREASURE)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.elementalStickAir, 2);
	            addLoot(pool, ModItems.elementalStickDimension, 1);
	            addLoot(pool, ModItems.stickAdvanced, 5);
		    if(AdvancedSticks.activateToolChestGeneration) {   
	            addLoot(pool, ModItems.advancedStickIronSword, 10);
	            addLoot(pool, ModItems.advancedStickGoldPickaxe, 10);
	            addLoot(pool, ModItems.diamondStickDiamondShovel, 10);
		    }	}
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_IGLOO_CHEST)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.elementalStickWater, 2);
	        }
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.stickIron, 20);
	            addLoot(pool, ModItems.shrubSeeds, 20);
	            addLoot(pool, ModItems.stickAdvanced, 1);
		    if(AdvancedSticks.activateToolChestGeneration) {   
	            addLoot(pool, ModItems.ironStickStoneShovel, 10);
	            addLoot(pool, ModItems.goldStickGoldAxe, 10);
	            addLoot(pool, ModItems.quartzStickIronPickaxe, 10);
	            addLoot(pool, ModItems.diamondStickStoneSword, 10);
	        }	}
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_WOODLAND_MANSION)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.stickAdvanced, 5);
	            addLoot(pool, ModItems.stickEnchanted, 10);
	            addLoot(pool, ModItems.elementalStickDarkness, 2);
	            addLoot(pool, ModItems.elementalStickNature, 1);
		    if(AdvancedSticks.activateToolChestGeneration) {        
	            addLoot(pool, ModItems.diamondStickDiamondPickaxe, 10);
	            addLoot(pool, ModItems.advancedStickIronSword, 10);
	            addLoot(pool, ModItems.enchantedStickGoldShovel, 10);
	           
	        }	}
	        
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_JUNGLE_TEMPLE)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.elementalStickNature, 1);
		    if(AdvancedSticks.activateToolChestGeneration) {   
	            addLoot(pool, ModItems.boneStickStonePickaxe, 10);
	            addLoot(pool, ModItems.goldStickGoldAxe, 10);
	            addLoot(pool, ModItems.redstoneStickIronSword, 10);      
	        }	}
	        
	        
	        
	        if(event.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID)) {
	            LootPool pool = event.getTable().getPool("main");
	            addLoot(pool, ModItems.elementalStickLight, 2);
		    if(AdvancedSticks.activateToolChestGeneration) {   
	            addLoot(pool, ModItems.boneStickStonePickaxe, 10);
	            addLoot(pool, ModItems.goldStickGoldHoe, 10);
	            addLoot(pool, ModItems.redstoneStickGoldSword, 10);
	            addLoot(pool, ModItems.emeraldStickStoneShovel, 10);
	            addLoot(pool, ModItems.diamondStickIronAxe, 10);    
	        }	} 
        }
	}
} 
