package xxrexraptorxx.advancedsticks.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

public class ItemStickEnchanted extends Item {
	
	public ItemStickEnchanted () {
		super();
		this.setCreativeTab(AdvancedSticks.mainTab);
	}
	
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    
}
