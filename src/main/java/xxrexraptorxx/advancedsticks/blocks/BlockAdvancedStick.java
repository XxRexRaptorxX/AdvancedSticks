package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class BlockAdvancedStick extends Block {
	
	public BlockAdvancedStick() {
		super(Material.IRON);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.METAL);

	}
	
}