package xxrexraptorxx.advancedsticks.util;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class ItemAdvancedAxe extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] { Blocks.PLANKS, Blocks.WOODEN_SLAB, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE });

	public ItemAdvancedAxe(ToolMaterial material, float attackSpeed) {
		super(material, EFFECTIVE_ON);
		this.damageVsEntity = 6.0F + material.getDamageVsEntity(); 
		this.attackSpeed = attackSpeed;
		ObfuscationReflectionHelper.setPrivateValue(ItemTool.class, this, "axe", "toolClass");
	}

	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	}
}
	
