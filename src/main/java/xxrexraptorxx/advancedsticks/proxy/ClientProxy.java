package xxrexraptorxx.advancedsticks.proxy;
 
import xxrexraptorxx.advancedsticks.main.ModBlocks;
import xxrexraptorxx.advancedsticks.main.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
 
public class ClientProxy extends ServerProxy {
 
    @Override
    public void registerClientStuff() {
    	
    	// Items //
    	
       	registerModel(ModItems.shrubSeeds, 0, new ModelResourceLocation(ModItems.shrubSeeds.getRegistryName(), "inventory"));
    	registerModel(ModItems.bough, 0, new ModelResourceLocation(ModItems.bough.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickBone, 0, new ModelResourceLocation(ModItems.stickBone.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickIron, 0, new ModelResourceLocation(ModItems.stickIron.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickGold, 0, new ModelResourceLocation(ModItems.stickGold.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickEnd, 0, new ModelResourceLocation(ModItems.stickEnd.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickQuartz, 0, new ModelResourceLocation(ModItems.stickQuartz.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickEmerald, 0, new ModelResourceLocation(ModItems.stickEmerald.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickDiamond, 0, new ModelResourceLocation(ModItems.stickDiamond.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickRedstone, 0, new ModelResourceLocation(ModItems.stickRedstone.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickAdvanced, 0, new ModelResourceLocation(ModItems.stickAdvanced.getRegistryName(), "inventory"));
    	registerModel(ModItems.stickEnchanted, 0, new ModelResourceLocation(ModItems.stickEnchanted.getRegistryName(), "inventory"));
    	registerModel(ModItems.longstickWood, 0, new ModelResourceLocation(ModItems.longstickWood.getRegistryName(), "inventory"));
    	registerModel(ModItems.longstickBone, 0, new ModelResourceLocation(ModItems.longstickBone.getRegistryName(), "inventory"));
       	registerModel(ModItems.longstickIron, 0, new ModelResourceLocation(ModItems.longstickIron.getRegistryName(), "inventory"));
       	registerModel(ModItems.longstickGold, 0, new ModelResourceLocation(ModItems.longstickGold.getRegistryName(), "inventory"));
      	registerModel(ModItems.longstickEnd, 0, new ModelResourceLocation(ModItems.longstickEnd.getRegistryName(), "inventory"));
      	registerModel(ModItems.longstickQuartz, 0, new ModelResourceLocation(ModItems.longstickQuartz.getRegistryName(), "inventory"));
       	registerModel(ModItems.longstickEmerald, 0, new ModelResourceLocation(ModItems.longstickEmerald.getRegistryName(), "inventory"));
       	registerModel(ModItems.longstickDiamond, 0, new ModelResourceLocation(ModItems.longstickDiamond.getRegistryName(), "inventory"));
       	registerModel(ModItems.longstickRedstone, 0, new ModelResourceLocation(ModItems.longstickRedstone.getRegistryName(), "inventory"));
       	registerModel(ModItems.longstickAdvanced, 0, new ModelResourceLocation(ModItems.longstickAdvanced.getRegistryName(), "inventory"));
     	registerModel(ModItems.longstickEnchanted, 0, new ModelResourceLocation(ModItems.longstickEnchanted.getRegistryName(), "inventory"));
       	registerModel(ModItems.longBlazerod, 0, new ModelResourceLocation(ModItems.longBlazerod.getRegistryName(), "inventory"));
       	registerModel(ModItems.elementalStickAir, 0, new ModelResourceLocation(ModItems.elementalStickAir.getRegistryName(), "inventory"));
       	registerModel(ModItems.elementalStickEarth, 0, new ModelResourceLocation(ModItems.elementalStickEarth.getRegistryName(), "inventory"));
       	registerModel(ModItems.elementalStickFire, 0, new ModelResourceLocation(ModItems.elementalStickFire.getRegistryName(), "inventory"));
       	registerModel(ModItems.elementalStickWater, 0, new ModelResourceLocation(ModItems.elementalStickWater.getRegistryName(), "inventory"));
       	registerModel(ModItems.elementalStickNature, 0, new ModelResourceLocation(ModItems.elementalStickNature.getRegistryName(), "inventory"));
      	registerModel(ModItems.elementalStickLight, 0, new ModelResourceLocation(ModItems.elementalStickLight.getRegistryName(), "inventory"));
      	registerModel(ModItems.elementalStickDarkness, 0, new ModelResourceLocation(ModItems.elementalStickDarkness.getRegistryName(), "inventory"));
      	registerModel(ModItems.elementalStickDimension, 0, new ModelResourceLocation(ModItems.elementalStickDimension.getRegistryName(), "inventory"));
      	
       	registerModel(ModItems.bookOfSticks, 0, new ModelResourceLocation(ModItems.bookOfSticks.getRegistryName(), "inventory"));
      
       	registerModel(ModItems.ironBow, 0, new ModelResourceLocation(ModItems.ironBow.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldBow, 0, new ModelResourceLocation(ModItems.goldBow.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondBow, 0, new ModelResourceLocation(ModItems.diamondBow.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.boneStickWoodSword, 0, new ModelResourceLocation(ModItems.boneStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickWoodAxe, 0, new ModelResourceLocation(ModItems.boneStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.boneStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickWoodShovel, 0, new ModelResourceLocation(ModItems.boneStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickWoodHoe, 0, new ModelResourceLocation(ModItems.boneStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.boneStickStoneSword, 0, new ModelResourceLocation(ModItems.boneStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickStoneAxe, 0, new ModelResourceLocation(ModItems.boneStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickStonePickaxe, 0, new ModelResourceLocation(ModItems.boneStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickStoneShovel, 0, new ModelResourceLocation(ModItems.boneStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickStoneHoe, 0, new ModelResourceLocation(ModItems.boneStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.boneStickIronSword, 0, new ModelResourceLocation(ModItems.boneStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickIronAxe, 0, new ModelResourceLocation(ModItems.boneStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickIronPickaxe, 0, new ModelResourceLocation(ModItems.boneStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickIronShovel, 0, new ModelResourceLocation(ModItems.boneStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickIronHoe, 0, new ModelResourceLocation(ModItems.boneStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.boneStickGoldSword, 0, new ModelResourceLocation(ModItems.boneStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickGoldAxe, 0, new ModelResourceLocation(ModItems.boneStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.boneStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickGoldShovel, 0, new ModelResourceLocation(ModItems.boneStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickGoldHoe, 0, new ModelResourceLocation(ModItems.boneStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.boneStickDiamondSword, 0, new ModelResourceLocation(ModItems.boneStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickDiamondAxe, 0, new ModelResourceLocation(ModItems.boneStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.boneStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickDiamondShovel, 0, new ModelResourceLocation(ModItems.boneStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.boneStickDiamondHoe, 0, new ModelResourceLocation(ModItems.boneStickDiamondHoe.getRegistryName(), "inventory"));

       	registerModel(ModItems.ironStickWoodSword, 0, new ModelResourceLocation(ModItems.ironStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickWoodAxe, 0, new ModelResourceLocation(ModItems.ironStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.ironStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickWoodShovel, 0, new ModelResourceLocation(ModItems.ironStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickWoodHoe, 0, new ModelResourceLocation(ModItems.ironStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.ironStickStoneSword, 0, new ModelResourceLocation(ModItems.ironStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickStoneAxe, 0, new ModelResourceLocation(ModItems.ironStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickStonePickaxe, 0, new ModelResourceLocation(ModItems.ironStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickStoneShovel, 0, new ModelResourceLocation(ModItems.ironStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickStoneHoe, 0, new ModelResourceLocation(ModItems.ironStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.ironStickIronSword, 0, new ModelResourceLocation(ModItems.ironStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickIronAxe, 0, new ModelResourceLocation(ModItems.ironStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickIronPickaxe, 0, new ModelResourceLocation(ModItems.ironStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickIronShovel, 0, new ModelResourceLocation(ModItems.ironStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickIronHoe, 0, new ModelResourceLocation(ModItems.ironStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.ironStickGoldSword, 0, new ModelResourceLocation(ModItems.ironStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickGoldAxe, 0, new ModelResourceLocation(ModItems.ironStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.ironStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickGoldShovel, 0, new ModelResourceLocation(ModItems.ironStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickGoldHoe, 0, new ModelResourceLocation(ModItems.ironStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.ironStickDiamondSword, 0, new ModelResourceLocation(ModItems.ironStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickDiamondAxe, 0, new ModelResourceLocation(ModItems.ironStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.ironStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickDiamondShovel, 0, new ModelResourceLocation(ModItems.ironStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.ironStickDiamondHoe, 0, new ModelResourceLocation(ModItems.ironStickDiamondHoe.getRegistryName(), "inventory"));
       	
    	registerModel(ModItems.goldStickWoodSword, 0, new ModelResourceLocation(ModItems.goldStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickWoodAxe, 0, new ModelResourceLocation(ModItems.goldStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.goldStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickWoodShovel, 0, new ModelResourceLocation(ModItems.goldStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickWoodHoe, 0, new ModelResourceLocation(ModItems.goldStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.goldStickStoneSword, 0, new ModelResourceLocation(ModItems.goldStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickStoneAxe, 0, new ModelResourceLocation(ModItems.goldStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickStonePickaxe, 0, new ModelResourceLocation(ModItems.goldStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickStoneShovel, 0, new ModelResourceLocation(ModItems.goldStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickStoneHoe, 0, new ModelResourceLocation(ModItems.goldStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.goldStickIronSword, 0, new ModelResourceLocation(ModItems.goldStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickIronAxe, 0, new ModelResourceLocation(ModItems.goldStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickIronPickaxe, 0, new ModelResourceLocation(ModItems.goldStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickIronShovel, 0, new ModelResourceLocation(ModItems.goldStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickIronHoe, 0, new ModelResourceLocation(ModItems.goldStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.goldStickGoldSword, 0, new ModelResourceLocation(ModItems.goldStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickGoldAxe, 0, new ModelResourceLocation(ModItems.goldStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.goldStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickGoldShovel, 0, new ModelResourceLocation(ModItems.goldStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickGoldHoe, 0, new ModelResourceLocation(ModItems.goldStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.goldStickDiamondSword, 0, new ModelResourceLocation(ModItems.goldStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickDiamondAxe, 0, new ModelResourceLocation(ModItems.goldStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.goldStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickDiamondShovel, 0, new ModelResourceLocation(ModItems.goldStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.goldStickDiamondHoe, 0, new ModelResourceLocation(ModItems.goldStickDiamondHoe.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.emeraldStickWoodSword, 0, new ModelResourceLocation(ModItems.emeraldStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickWoodAxe, 0, new ModelResourceLocation(ModItems.emeraldStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.emeraldStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickWoodShovel, 0, new ModelResourceLocation(ModItems.emeraldStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickWoodHoe, 0, new ModelResourceLocation(ModItems.emeraldStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.emeraldStickStoneSword, 0, new ModelResourceLocation(ModItems.emeraldStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickStoneAxe, 0, new ModelResourceLocation(ModItems.emeraldStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickStonePickaxe, 0, new ModelResourceLocation(ModItems.emeraldStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickStoneShovel, 0, new ModelResourceLocation(ModItems.emeraldStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickStoneHoe, 0, new ModelResourceLocation(ModItems.emeraldStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.emeraldStickIronSword, 0, new ModelResourceLocation(ModItems.emeraldStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickIronAxe, 0, new ModelResourceLocation(ModItems.emeraldStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickIronPickaxe, 0, new ModelResourceLocation(ModItems.emeraldStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickIronShovel, 0, new ModelResourceLocation(ModItems.emeraldStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickIronHoe, 0, new ModelResourceLocation(ModItems.emeraldStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.emeraldStickGoldSword, 0, new ModelResourceLocation(ModItems.emeraldStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickGoldAxe, 0, new ModelResourceLocation(ModItems.emeraldStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.emeraldStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickGoldShovel, 0, new ModelResourceLocation(ModItems.emeraldStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickGoldHoe, 0, new ModelResourceLocation(ModItems.emeraldStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.emeraldStickDiamondSword, 0, new ModelResourceLocation(ModItems.emeraldStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickDiamondAxe, 0, new ModelResourceLocation(ModItems.emeraldStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.emeraldStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickDiamondShovel, 0, new ModelResourceLocation(ModItems.emeraldStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.emeraldStickDiamondHoe, 0, new ModelResourceLocation(ModItems.emeraldStickDiamondHoe.getRegistryName(), "inventory"));
    	
    	registerModel(ModItems.diamondStickWoodSword, 0, new ModelResourceLocation(ModItems.diamondStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickWoodAxe, 0, new ModelResourceLocation(ModItems.diamondStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.diamondStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickWoodShovel, 0, new ModelResourceLocation(ModItems.diamondStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickWoodHoe, 0, new ModelResourceLocation(ModItems.diamondStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.diamondStickStoneSword, 0, new ModelResourceLocation(ModItems.diamondStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickStoneAxe, 0, new ModelResourceLocation(ModItems.diamondStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickStonePickaxe, 0, new ModelResourceLocation(ModItems.diamondStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickStoneShovel, 0, new ModelResourceLocation(ModItems.diamondStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickStoneHoe, 0, new ModelResourceLocation(ModItems.diamondStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.diamondStickIronSword, 0, new ModelResourceLocation(ModItems.diamondStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickIronAxe, 0, new ModelResourceLocation(ModItems.diamondStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickIronPickaxe, 0, new ModelResourceLocation(ModItems.diamondStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickIronShovel, 0, new ModelResourceLocation(ModItems.diamondStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickIronHoe, 0, new ModelResourceLocation(ModItems.diamondStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.diamondStickGoldSword, 0, new ModelResourceLocation(ModItems.diamondStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickGoldAxe, 0, new ModelResourceLocation(ModItems.diamondStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.diamondStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickGoldShovel, 0, new ModelResourceLocation(ModItems.diamondStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickGoldHoe, 0, new ModelResourceLocation(ModItems.diamondStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.diamondStickDiamondSword, 0, new ModelResourceLocation(ModItems.diamondStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickDiamondAxe, 0, new ModelResourceLocation(ModItems.diamondStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.diamondStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickDiamondShovel, 0, new ModelResourceLocation(ModItems.diamondStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.diamondStickDiamondHoe, 0, new ModelResourceLocation(ModItems.diamondStickDiamondHoe.getRegistryName(), "inventory"));
 
    	registerModel(ModItems.advancedStickWoodSword, 0, new ModelResourceLocation(ModItems.advancedStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickWoodAxe, 0, new ModelResourceLocation(ModItems.advancedStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.advancedStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickWoodShovel, 0, new ModelResourceLocation(ModItems.advancedStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickWoodHoe, 0, new ModelResourceLocation(ModItems.advancedStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.advancedStickStoneSword, 0, new ModelResourceLocation(ModItems.advancedStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickStoneAxe, 0, new ModelResourceLocation(ModItems.advancedStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickStonePickaxe, 0, new ModelResourceLocation(ModItems.advancedStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickStoneShovel, 0, new ModelResourceLocation(ModItems.advancedStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickStoneHoe, 0, new ModelResourceLocation(ModItems.advancedStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.advancedStickIronSword, 0, new ModelResourceLocation(ModItems.advancedStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickIronAxe, 0, new ModelResourceLocation(ModItems.advancedStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickIronPickaxe, 0, new ModelResourceLocation(ModItems.advancedStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickIronShovel, 0, new ModelResourceLocation(ModItems.advancedStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickIronHoe, 0, new ModelResourceLocation(ModItems.advancedStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.advancedStickGoldSword, 0, new ModelResourceLocation(ModItems.advancedStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickGoldAxe, 0, new ModelResourceLocation(ModItems.advancedStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.advancedStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickGoldShovel, 0, new ModelResourceLocation(ModItems.advancedStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickGoldHoe, 0, new ModelResourceLocation(ModItems.advancedStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.advancedStickDiamondSword, 0, new ModelResourceLocation(ModItems.advancedStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickDiamondAxe, 0, new ModelResourceLocation(ModItems.advancedStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.advancedStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickDiamondShovel, 0, new ModelResourceLocation(ModItems.advancedStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.advancedStickDiamondHoe, 0, new ModelResourceLocation(ModItems.advancedStickDiamondHoe.getRegistryName(), "inventory"));  
    	
    	registerModel(ModItems.enchantedStickWoodSword, 0, new ModelResourceLocation(ModItems.enchantedStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickWoodAxe, 0, new ModelResourceLocation(ModItems.enchantedStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.enchantedStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickWoodShovel, 0, new ModelResourceLocation(ModItems.enchantedStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickWoodHoe, 0, new ModelResourceLocation(ModItems.enchantedStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.enchantedStickStoneSword, 0, new ModelResourceLocation(ModItems.enchantedStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickStoneAxe, 0, new ModelResourceLocation(ModItems.enchantedStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickStonePickaxe, 0, new ModelResourceLocation(ModItems.enchantedStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickStoneShovel, 0, new ModelResourceLocation(ModItems.enchantedStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickStoneHoe, 0, new ModelResourceLocation(ModItems.enchantedStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.enchantedStickIronSword, 0, new ModelResourceLocation(ModItems.enchantedStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickIronAxe, 0, new ModelResourceLocation(ModItems.enchantedStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickIronPickaxe, 0, new ModelResourceLocation(ModItems.enchantedStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickIronShovel, 0, new ModelResourceLocation(ModItems.enchantedStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickIronHoe, 0, new ModelResourceLocation(ModItems.enchantedStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.enchantedStickGoldSword, 0, new ModelResourceLocation(ModItems.enchantedStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickGoldAxe, 0, new ModelResourceLocation(ModItems.enchantedStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.enchantedStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickGoldShovel, 0, new ModelResourceLocation(ModItems.enchantedStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickGoldHoe, 0, new ModelResourceLocation(ModItems.enchantedStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.enchantedStickDiamondSword, 0, new ModelResourceLocation(ModItems.enchantedStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickDiamondAxe, 0, new ModelResourceLocation(ModItems.enchantedStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.enchantedStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickDiamondShovel, 0, new ModelResourceLocation(ModItems.enchantedStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.enchantedStickDiamondHoe, 0, new ModelResourceLocation(ModItems.enchantedStickDiamondHoe.getRegistryName(), "inventory"));    
    	
    	registerModel(ModItems.blazerodWoodSword, 0, new ModelResourceLocation(ModItems.blazerodWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodWoodAxe, 0, new ModelResourceLocation(ModItems.blazerodWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodWoodPickaxe, 0, new ModelResourceLocation(ModItems.blazerodWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodWoodShovel, 0, new ModelResourceLocation(ModItems.blazerodWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodWoodHoe, 0, new ModelResourceLocation(ModItems.blazerodWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.blazerodStoneSword, 0, new ModelResourceLocation(ModItems.blazerodStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodStoneAxe, 0, new ModelResourceLocation(ModItems.blazerodStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodStonePickaxe, 0, new ModelResourceLocation(ModItems.blazerodStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodStoneShovel, 0, new ModelResourceLocation(ModItems.blazerodStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodStoneHoe, 0, new ModelResourceLocation(ModItems.blazerodStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.blazerodIronSword, 0, new ModelResourceLocation(ModItems.blazerodIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodIronAxe, 0, new ModelResourceLocation(ModItems.blazerodIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodIronPickaxe, 0, new ModelResourceLocation(ModItems.blazerodIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodIronShovel, 0, new ModelResourceLocation(ModItems.blazerodIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodIronHoe, 0, new ModelResourceLocation(ModItems.blazerodIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.blazerodGoldSword, 0, new ModelResourceLocation(ModItems.blazerodGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodGoldAxe, 0, new ModelResourceLocation(ModItems.blazerodGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodGoldPickaxe, 0, new ModelResourceLocation(ModItems.blazerodGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodGoldShovel, 0, new ModelResourceLocation(ModItems.blazerodGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodGoldHoe, 0, new ModelResourceLocation(ModItems.blazerodGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.blazerodDiamondSword, 0, new ModelResourceLocation(ModItems.blazerodDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodDiamondAxe, 0, new ModelResourceLocation(ModItems.blazerodDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodDiamondPickaxe, 0, new ModelResourceLocation(ModItems.blazerodDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodDiamondShovel, 0, new ModelResourceLocation(ModItems.blazerodDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.blazerodDiamondHoe, 0, new ModelResourceLocation(ModItems.blazerodDiamondHoe.getRegistryName(), "inventory")); 
    	
    	registerModel(ModItems.endrodWoodSword, 0, new ModelResourceLocation(ModItems.endrodWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodWoodAxe, 0, new ModelResourceLocation(ModItems.endrodWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodWoodPickaxe, 0, new ModelResourceLocation(ModItems.endrodWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodWoodShovel, 0, new ModelResourceLocation(ModItems.endrodWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodWoodHoe, 0, new ModelResourceLocation(ModItems.endrodWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.endrodStoneSword, 0, new ModelResourceLocation(ModItems.endrodStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodStoneAxe, 0, new ModelResourceLocation(ModItems.endrodStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodStonePickaxe, 0, new ModelResourceLocation(ModItems.endrodStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodStoneShovel, 0, new ModelResourceLocation(ModItems.endrodStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodStoneHoe, 0, new ModelResourceLocation(ModItems.endrodStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.endrodIronSword, 0, new ModelResourceLocation(ModItems.endrodIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodIronAxe, 0, new ModelResourceLocation(ModItems.endrodIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodIronPickaxe, 0, new ModelResourceLocation(ModItems.endrodIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodIronShovel, 0, new ModelResourceLocation(ModItems.endrodIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodIronHoe, 0, new ModelResourceLocation(ModItems.endrodIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.endrodGoldSword, 0, new ModelResourceLocation(ModItems.endrodGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodGoldAxe, 0, new ModelResourceLocation(ModItems.endrodGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodGoldPickaxe, 0, new ModelResourceLocation(ModItems.endrodGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodGoldShovel, 0, new ModelResourceLocation(ModItems.endrodGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodGoldHoe, 0, new ModelResourceLocation(ModItems.endrodGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.endrodDiamondSword, 0, new ModelResourceLocation(ModItems.endrodDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodDiamondAxe, 0, new ModelResourceLocation(ModItems.endrodDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodDiamondPickaxe, 0, new ModelResourceLocation(ModItems.endrodDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodDiamondShovel, 0, new ModelResourceLocation(ModItems.endrodDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.endrodDiamondHoe, 0, new ModelResourceLocation(ModItems.endrodDiamondHoe.getRegistryName(), "inventory")); 
    	
    	registerModel(ModItems.quartzStickWoodSword, 0, new ModelResourceLocation(ModItems.quartzStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickWoodAxe, 0, new ModelResourceLocation(ModItems.quartzStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.quartzStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickWoodShovel, 0, new ModelResourceLocation(ModItems.quartzStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickWoodHoe, 0, new ModelResourceLocation(ModItems.quartzStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.quartzStickStoneSword, 0, new ModelResourceLocation(ModItems.quartzStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickStoneAxe, 0, new ModelResourceLocation(ModItems.quartzStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickStonePickaxe, 0, new ModelResourceLocation(ModItems.quartzStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickStoneShovel, 0, new ModelResourceLocation(ModItems.quartzStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickStoneHoe, 0, new ModelResourceLocation(ModItems.quartzStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.quartzStickIronSword, 0, new ModelResourceLocation(ModItems.quartzStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickIronAxe, 0, new ModelResourceLocation(ModItems.quartzStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickIronPickaxe, 0, new ModelResourceLocation(ModItems.quartzStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickIronShovel, 0, new ModelResourceLocation(ModItems.quartzStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickIronHoe, 0, new ModelResourceLocation(ModItems.quartzStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.quartzStickGoldSword, 0, new ModelResourceLocation(ModItems.quartzStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickGoldAxe, 0, new ModelResourceLocation(ModItems.quartzStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.quartzStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickGoldShovel, 0, new ModelResourceLocation(ModItems.quartzStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickGoldHoe, 0, new ModelResourceLocation(ModItems.quartzStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.quartzStickDiamondSword, 0, new ModelResourceLocation(ModItems.quartzStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickDiamondAxe, 0, new ModelResourceLocation(ModItems.quartzStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.quartzStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickDiamondShovel, 0, new ModelResourceLocation(ModItems.quartzStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.quartzStickDiamondHoe, 0, new ModelResourceLocation(ModItems.quartzStickDiamondHoe.getRegistryName(), "inventory")); 
    	 	
    	registerModel(ModItems.redstoneStickWoodSword, 0, new ModelResourceLocation(ModItems.redstoneStickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickWoodAxe, 0, new ModelResourceLocation(ModItems.redstoneStickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickWoodPickaxe, 0, new ModelResourceLocation(ModItems.redstoneStickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickWoodShovel, 0, new ModelResourceLocation(ModItems.redstoneStickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickWoodHoe, 0, new ModelResourceLocation(ModItems.redstoneStickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.redstoneStickStoneSword, 0, new ModelResourceLocation(ModItems.redstoneStickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickStoneAxe, 0, new ModelResourceLocation(ModItems.redstoneStickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickStonePickaxe, 0, new ModelResourceLocation(ModItems.redstoneStickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickStoneShovel, 0, new ModelResourceLocation(ModItems.redstoneStickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickStoneHoe, 0, new ModelResourceLocation(ModItems.redstoneStickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.redstoneStickIronSword, 0, new ModelResourceLocation(ModItems.redstoneStickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickIronAxe, 0, new ModelResourceLocation(ModItems.redstoneStickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickIronPickaxe, 0, new ModelResourceLocation(ModItems.redstoneStickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickIronShovel, 0, new ModelResourceLocation(ModItems.redstoneStickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickIronHoe, 0, new ModelResourceLocation(ModItems.redstoneStickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.redstoneStickGoldSword, 0, new ModelResourceLocation(ModItems.redstoneStickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickGoldAxe, 0, new ModelResourceLocation(ModItems.redstoneStickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickGoldPickaxe, 0, new ModelResourceLocation(ModItems.redstoneStickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickGoldShovel, 0, new ModelResourceLocation(ModItems.redstoneStickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickGoldHoe, 0, new ModelResourceLocation(ModItems.redstoneStickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.redstoneStickDiamondSword, 0, new ModelResourceLocation(ModItems.redstoneStickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickDiamondAxe, 0, new ModelResourceLocation(ModItems.redstoneStickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.redstoneStickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickDiamondShovel, 0, new ModelResourceLocation(ModItems.redstoneStickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.redstoneStickDiamondHoe, 0, new ModelResourceLocation(ModItems.redstoneStickDiamondHoe.getRegistryName(), "inventory"));
    	
    /**	registerModel(ModItems.StickWoodSword, 0, new ModelResourceLocation(ModItems.StickWoodSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickWoodAxe, 0, new ModelResourceLocation(ModItems.StickWoodAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickWoodPickaxe, 0, new ModelResourceLocation(ModItems.StickWoodPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickWoodShovel, 0, new ModelResourceLocation(ModItems.StickWoodShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickWoodHoe, 0, new ModelResourceLocation(ModItems.StickWoodHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.StickStoneSword, 0, new ModelResourceLocation(ModItems.StickStoneSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickStoneAxe, 0, new ModelResourceLocation(ModItems.StickStoneAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickStonePickaxe, 0, new ModelResourceLocation(ModItems.StickStonePickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickStoneShovel, 0, new ModelResourceLocation(ModItems.StickStoneShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickStoneHoe, 0, new ModelResourceLocation(ModItems.StickStoneHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.StickIronSword, 0, new ModelResourceLocation(ModItems.StickIronSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickIronAxe, 0, new ModelResourceLocation(ModItems.StickIronAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickIronPickaxe, 0, new ModelResourceLocation(ModItems.StickIronPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickIronShovel, 0, new ModelResourceLocation(ModItems.StickIronShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickIronHoe, 0, new ModelResourceLocation(ModItems.StickIronHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.StickGoldSword, 0, new ModelResourceLocation(ModItems.StickGoldSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickGoldAxe, 0, new ModelResourceLocation(ModItems.StickGoldAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickGoldPickaxe, 0, new ModelResourceLocation(ModItems.StickGoldPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickGoldShovel, 0, new ModelResourceLocation(ModItems.StickGoldShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickGoldHoe, 0, new ModelResourceLocation(ModItems.StickGoldHoe.getRegistryName(), "inventory"));
       	registerModel(ModItems.StickDiamondSword, 0, new ModelResourceLocation(ModItems.StickDiamondSword.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickDiamondAxe, 0, new ModelResourceLocation(ModItems.StickDiamondAxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickDiamondPickaxe, 0, new ModelResourceLocation(ModItems.StickDiamondPickaxe.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickDiamondShovel, 0, new ModelResourceLocation(ModItems.StickDiamondShovel.getRegistryName(), "inventory"));
    	registerModel(ModItems.StickDiamondHoe, 0, new ModelResourceLocation(ModItems.StickDiamondHoe.getRegistryName(), "inventory"));     **/
    	
    	
    	
    	// Blocks //
    	
    	registerModel(ModBlocks.shrub, 0, new ModelResourceLocation(ModBlocks.shrub.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.plakat, 0, new ModelResourceLocation(ModBlocks.plakat.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.woodStickBlock, 0, new ModelResourceLocation(ModBlocks.woodStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.boneStickBlock, 0, new ModelResourceLocation(ModBlocks.boneStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.ironStickBlock, 0, new ModelResourceLocation(ModBlocks.ironStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.goldStickBlock, 0, new ModelResourceLocation(ModBlocks.goldStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.emeraldStickBlock, 0, new ModelResourceLocation(ModBlocks.emeraldStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.diamondStickBlock, 0, new ModelResourceLocation(ModBlocks.diamondStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.advancedStickBlock, 0, new ModelResourceLocation(ModBlocks.advancedStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.enchantedStickBlock, 0, new ModelResourceLocation(ModBlocks.enchantedStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.redstoneStickBlock, 0, new ModelResourceLocation(ModBlocks.redstoneStickBlock.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.quartzStickBlock, 0, new ModelResourceLocation(ModBlocks.quartzStickBlock.getRegistryName(), "inventory"));
    	
    	registerModel(ModBlocks.goldBars, 0, new ModelResourceLocation(ModBlocks.goldBars.getRegistryName(), "inventory"));
    	registerModel(ModBlocks.woodenBars, 0, new ModelResourceLocation(ModBlocks.woodenBars.getRegistryName(), "inventory"));
    	
    	
    	
    	
    }
    
    
    
    
    
    public void registerModel(Object obj, int meta, ModelResourceLocation loc) {
    	Item item = null;
    	if(obj instanceof Item) {
    		item = (Item) obj;
    	} else if(obj instanceof Block) {
    		item = Item.getItemFromBlock((Block)obj);
    	} else {
    		throw new IllegalArgumentException();
    	}	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
    	}
	}
   

  