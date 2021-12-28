package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedsticks.main.ModItems;
import xxrexraptorxx.advancedsticks.main.References;

public class CreativeTab {

    public static CreativeModeTab MOD_TAB = new CreativeModeTab(References.MODID + "_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IRON_STICK_DIAMOND_PICKAXE.get());
        }
    };
}
