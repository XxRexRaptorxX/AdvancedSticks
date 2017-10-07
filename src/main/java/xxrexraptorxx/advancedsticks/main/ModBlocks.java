package xxrexraptorxx.advancedsticks.main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xxrexraptorxx.advancedsticks.blocks.*;
import xxrexraptorxx.advancedsticks.util.NameUtils;

public class ModBlocks {

	
	
	public static Block shrub;
	public static Block plakat;
	public static Block woodStickBlock;
	public static Block ironStickBlock;
	public static Block goldStickBlock;
	public static Block boneStickBlock;
	public static Block emeraldStickBlock;
	public static Block diamondStickBlock;
	public static Block advancedStickBlock;
	public static Block enchantedStickBlock;
	public static Block redstoneStickBlock;
	public static Block quartzStickBlock;
	
	public static Block goldBars;
	public static Block woodenBars;
	
	
	
	
		public void init() {
		
			
			shrub = new BlockShrub();
			plakat = new BlockPlakat();
			woodStickBlock = new BlockWoodStick();
			boneStickBlock = new BlockBoneStick();
			ironStickBlock = new BlockIronStick();
			goldStickBlock = new BlockGoldStick();
			emeraldStickBlock = new BlockEmeraldStick();
			diamondStickBlock = new BlockDiamondStick();
			advancedStickBlock = new BlockAdvancedStick();
			enchantedStickBlock = new BlockEnchantedStick();
			redstoneStickBlock = new BlockRedstoneStick();
			quartzStickBlock = new BlockQuartzStick();
			
			goldBars = new BlockGoldBars();
			woodenBars = new BlockWoodenBars();

			
			
			
			
			
			
			NameUtils.setNames(shrub, "shrub");
			NameUtils.setNames(plakat, "plakat");
			NameUtils.setNames(woodStickBlock, "wood_stick_block");
			NameUtils.setNames(boneStickBlock, "bone_stick_block");
			NameUtils.setNames(ironStickBlock, "iron_stick_block");
			NameUtils.setNames(goldStickBlock, "gold_stick_block");
			NameUtils.setNames(emeraldStickBlock, "emerald_stick_block");
			NameUtils.setNames(diamondStickBlock, "diamond_stick_block");
			NameUtils.setNames(advancedStickBlock, "advanced_stick_block");
			NameUtils.setNames(enchantedStickBlock, "enchanted_stick_block");
			NameUtils.setNames(redstoneStickBlock, "redstone_stick_block");
			NameUtils.setNames(quartzStickBlock, "quartz_stick_block");
			
			NameUtils.setNames(goldBars, "gold_bars");
			NameUtils.setNames(woodenBars, "wooden_bars");
					
		}
		
		
		
		public void register() {
			
			
			registerBlock(shrub);
			registerBlock(plakat);
			registerBlock(woodStickBlock);
			registerBlock(boneStickBlock);
			registerBlock(ironStickBlock);
			registerBlock(goldStickBlock);
			registerBlock(emeraldStickBlock);
			registerBlock(diamondStickBlock);
			registerBlock(advancedStickBlock);
			registerBlock(enchantedStickBlock);
			registerBlock(redstoneStickBlock);
			registerBlock(quartzStickBlock);
			
			registerBlock(goldBars);
			registerBlock(woodenBars);
			
			
			
			
		}
		
		
		
		
		
		private static void registerBlock(Block block) {
			ForgeRegistries.BLOCKS.register(block);
			ItemBlock itemblock = new ItemBlock(block);
			itemblock.setRegistryName(block.getRegistryName());
			ForgeRegistries.ITEMS.register(itemblock);
		}
		
}
