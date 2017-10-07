package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class BlockQuartzStick extends Block {
	
	public BlockQuartzStick() {
		super(Material.CORAL);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);

	}
	
}