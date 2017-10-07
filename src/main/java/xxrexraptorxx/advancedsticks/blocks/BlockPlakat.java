package xxrexraptorxx.advancedsticks.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.main.ModBlocks;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockPlakat extends BlockHorizontal {


	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    protected static final AxisAlignedBB POSTER_EAST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
    protected static final AxisAlignedBB POSTER_WEST_AABB = new AxisAlignedBB(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB POSTER_SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
    protected static final AxisAlignedBB POSTER_NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);

	
	public BlockPlakat() {
		super(Material.CLOTH);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	

	public void addInformation(ItemStack  stack, EntityPlayer playerIn, List addList, boolean advanced) {
    
		addList.add(ChatFormatting.DARK_GRAY + "Hold it in your hand, place it on a block or in a item frame to see the stats.");
	}
	

	
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        switch ((EnumFacing)state.getValue(FACING))
        {
            case NORTH:
                return POSTER_NORTH_AABB;
            case SOUTH:
                return POSTER_SOUTH_AABB;
            case WEST:
                return POSTER_WEST_AABB;
            case EAST:
            default:
                return POSTER_EAST_AABB;
        }
    }
	
	
	
	
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	
    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return true;
    }
	
    
 

	

	
	
	
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return null;
	}
	
	@Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
	
	
	@Override
	  public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
	        this.setDefaultFacing(worldIn, pos, state);
	    }


	    private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (!worldIn.isRemote)
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos.north());
	            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
	            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
	            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
	            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

	            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
	            {
	                enumfacing = EnumFacing.SOUTH;
	            }
	            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
	            {
	                enumfacing = EnumFacing.NORTH;
	            }
	            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
	            {
	                enumfacing = EnumFacing.EAST;
	            }
	            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
	            {
	                enumfacing = EnumFacing.WEST;
	            }

	            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
	        }
	    }
	    
	    
	    @Override
	    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	    {
	        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	    }
	    
	    @Override
	    public EnumBlockRenderType getRenderType(IBlockState state) {
	        return EnumBlockRenderType.MODEL;
	    }

	    @Override
	    public IBlockState getStateFromMeta(int meta){
	        EnumFacing enumfacing = EnumFacing.getFront(meta);

	        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
	        {
	            enumfacing = EnumFacing.NORTH;
	        }

	        return this.getDefaultState().withProperty(FACING, enumfacing);
	    }

	    @Override
	    public int getMetaFromState(IBlockState state) {
	        return ((EnumFacing)state.getValue(FACING)).getIndex();
	    }

	    @Override
	    public IBlockState withRotation(IBlockState state, Rotation rot)
	    {
	        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	    }

	    @Override
	    public IBlockState withMirror(IBlockState state, Mirror mirrorIn){
	        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	    }

	    @Override
	    protected BlockStateContainer createBlockState() {
	        return new BlockStateContainer(this, new IProperty[] {FACING});
	    }
	
}	
