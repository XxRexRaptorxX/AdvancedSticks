package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class BlockBoneStick extends Block {
	
	public BlockBoneStick() {
		super(Material.CORAL);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("axe", 1);
		this.setHardness(2.5F);
		this.setResistance(5.5F);
		this.setSoundType(SoundType.STONE);

	}
	
}