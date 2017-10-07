package xxrexraptorxx.advancedsticks.blocks;

import java.util.List;

import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class BlockGoldStick extends Block {
	
	public BlockGoldStick() {
		super(Material.IRON);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.METAL);

	}
	
}