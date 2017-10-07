package xxrexraptorxx.advancedsticks.handler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import xxrexraptorxx.advancedsticks.main.ModBlocks;
import xxrexraptorxx.advancedsticks.main.ModItems;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem().equals(ModItems.bough)) {
			return 100; }  //Burntime (200=1Item, coal=10Items) 
		
		if(fuel.getItem().equals(ModItems.longBlazerod)) {  
			return 6000; }
		
		if(fuel.getItem().equals(ModItems.longstickWood)) {  
			return 280; }
		
		if(fuel.getItem().equals(ModBlocks.woodStickBlock)) {  
			return 1080; }
		
		if(fuel.getItem().equals(ModBlocks.plakat)) {  
			return 10; }
		
		if(fuel.getItem().equals(ModItems.elementalStickAir)) {  
			return 5000; }
		
		if(fuel.getItem().equals(ModItems.elementalStickDarkness)) {  
			return 5000; }
		
		if(fuel.getItem().equals(ModItems.elementalStickDimension)) {  
			return 5000; }
		
		if(fuel.getItem().equals(ModItems.elementalStickEarth)) {  
			return 5000; }
		
		if(fuel.getItem().equals(ModItems.elementalStickFire)) {  
			return 10000; }
		
		if(fuel.getItem().equals(ModItems.elementalStickLight)) {  
			return 5000; }
		
		if(fuel.getItem().equals(ModItems.elementalStickNature)) {  
			return 5500; }
		
		if(fuel.getItem().equals(ModItems.elementalStickWater)) {  
			return 100; }
	return 0;
	
	}

}