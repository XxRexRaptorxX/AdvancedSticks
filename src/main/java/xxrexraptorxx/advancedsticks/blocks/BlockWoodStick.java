package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class BlockWoodStick extends Block {
	
	public BlockWoodStick() {
		super(Material.WOOD);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("axe", 0);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.WOOD);

	}
	
}