package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import xxrexraptorxx.advancedsticks.main.ModItems;

public class BlockShrub extends BlockCrops{

	@Override
	protected Item getSeed() {
		return ModItems.shrubSeeds;
		
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.bough;
	}
}
