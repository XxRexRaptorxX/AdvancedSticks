package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class BlockRedstoneStick extends Block {
	
	public BlockRedstoneStick() {
		super(Material.CORAL);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);

	}
	
    public boolean canProvidePower(IBlockState state)
    {
        return true;
    }

    public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return 5;
    }
	
}