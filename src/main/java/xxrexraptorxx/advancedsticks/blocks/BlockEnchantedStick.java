package xxrexraptorxx.advancedsticks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;


public class BlockEnchantedStick extends Block {
	
	public BlockEnchantedStick() {
		super(Material.WOOD);
		this.setCreativeTab(AdvancedSticks.mainTab);
		this.setHarvestLevel("axe", 1);
		this.setHardness(3.0F);
		this.setResistance(6.0F);
		this.setSoundType(SoundType.WOOD);

	}

	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    
}