package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import xxrexraptorxx.advancedsticks.main.References;

import java.util.List;

public class ToolMaterials {

    /**            lvl|uses|speed|damage|enchant
     *    WOOD       0, 59,   2.0,  0.0,  15
     *    STONE      1, 131,  4.0,  1.0,  5
     *    IRON       2, 250,  6.0,  2.0,  14
     *    DIAMOND    3, 1561, 8.0,  3.0,  10
     *    GOLD       0, 32,   12.0, 0.0,  22
     *    NETHERITE  4, 2031, 9.0,  4.0,  15
     */
    public static final int   WOOD_BASE_USES = 59;
    public static final float WOOD_BASE_SPEED = 2.0f;
    public static final float WOOD_BASE_DMG = 0.0f;
    public static final int   WOOD_BASE_ENCH = 15;

    public static final int   STONE_BASE_USES = 131 - WOOD_BASE_USES;
    public static final float STONE_BASE_SPEED = 4.0f - WOOD_BASE_SPEED;
    public static final float STONE_BASE_DMG = 1.0f;
    public static final int   STONE_BASE_ENCH = 5;

    public static final int   IRON_BASE_USES = 250 - WOOD_BASE_USES;
    public static final float IRON_BASE_SPEED = 6.0f - WOOD_BASE_SPEED;
    public static final float IRON_BASE_DMG = 2.0f;
    public static final int   IRON_BASE_ENCH = 14;

    public static final int   GOLD_BASE_USES = 32;
    public static final float GOLD_BASE_SPEED = 12.0f - WOOD_BASE_SPEED;
    public static final float GOLD_BASE_DMG = 0.0f;
    public static final int   GOLD_BASE_ENCH = 22;

    public static final int   DIAMOND_BASE_USES = 1561 - WOOD_BASE_USES;
    public static final float DIAMOND_BASE_SPEED = 8.0f - WOOD_BASE_SPEED;
    public static final float DIAMOND_BASE_DMG = 3.0f;
    public static final int   DIAMOND_BASE_ENCH = 10;

    public static final int   NETHERITE_BASE_USES = 2031 - WOOD_BASE_USES;
    public static final float NETHERITE_BASE_SPEED = 9.0f - WOOD_BASE_SPEED;
    public static final float NETHERITE_BASE_DMG = 4.0f;
    public static final int   NETHERITE_BASE_ENCH = 15;

    public static final int   WOOD_USES = WOOD_BASE_USES / 3 * 2;
    public static final float WOOD_SPEED = WOOD_BASE_SPEED / 3 * 2;
    public static final float WOOD_DMG = WOOD_BASE_DMG / 3 * 2;
    public static final int   WOOD_ENCH = WOOD_BASE_ENCH / 3 * 2;

    public static final int   STONE_USES = STONE_BASE_USES / 3 * 2;
    public static final float STONE_SPEED = STONE_BASE_SPEED / 3 * 2;
    public static final float STONE_DMG = STONE_BASE_DMG / 3 * 2;
    public static final int   STONE_ENCH = STONE_BASE_ENCH / 3 * 2;

    public static final int   IRON_USES = IRON_BASE_USES / 3 * 2;
    public static final float IRON_SPEED = IRON_BASE_SPEED / 3 * 2;
    public static final float IRON_DMG = IRON_BASE_DMG / 3 * 2;
    public static final int   IRON_ENCH = IRON_BASE_ENCH / 3 * 2;

    public static final int   GOLD_USES = GOLD_BASE_USES / 3 * 2;
    public static final float GOLD_SPEED = GOLD_BASE_SPEED / 3 * 2;
    public static final float GOLD_DMG = 0.0f;
    public static final int   GOLD_ENCH = GOLD_BASE_ENCH  / 3 * 2;

    public static final int   DIAMOND_USES = DIAMOND_BASE_USES / 3 * 2;
    public static final float DIAMOND_SPEED = DIAMOND_BASE_SPEED / 3 * 2;
    public static final float DIAMOND_DMG = DIAMOND_BASE_DMG / 3 * 2;
    public static final int   DIAMOND_ENCH = DIAMOND_BASE_ENCH / 3 * 2;

    public static final int   NETHERITE_USES = NETHERITE_BASE_USES  / 3 * 2;
    public static final float NETHERITE_SPEED = NETHERITE_BASE_SPEED / 3 * 2;
    public static final float NETHERITE_DMG = NETHERITE_BASE_DMG / 3 * 2;
    public static final int   NETHERITE_ENCH = NETHERITE_BASE_ENCH / 3 * 2;

    public static final int   BONE_USES = 47;
    public static final float BONE_SPEED = 2.0f;
    public static final float BONE_DMG = 0.5f;
    public static final int   BONE_ENCH = 7;

    public static final int   ENDROD_USES = 133;
    public static final float ENDROD_SPEED = 5.3f;
    public static final float ENDROD_DMG = 1.7f;
    public static final int   ENDROD_ENCH = 17;

    public static final int   BLAZEROD_USES = 120;
    public static final float BLAZEROD_SPEED = 5.5f;
    public static final float BLAZEROD_DMG = 1.5f;
    public static final int   BLAZEROD_ENCH = 15;

    public static final int   EMERALD_USES = 600;
    public static final float EMERALD_SPEED = 4.2f;
    public static final float EMERALD_DMG = 1.4f;
    public static final int   EMERALD_ENCH = 12;

    public static final int   AMETHYST_USES = 666;
    public static final float AMETHYST_SPEED = 4.6f;
    public static final float AMETHYST_DMG = 1.6f;
    public static final int   AMETHYST_ENCH = 20;

    public static final int   ENCHANTED_USES = WOOD_BASE_USES + 30;
    public static final float ENCHANTED_SPEED = WOOD_BASE_SPEED + 2.0f;
    public static final float ENCHANTED_DMG = WOOD_BASE_DMG;
    public static final int   ENCHANTED_ENCH = WOOD_BASE_ENCH + 30;

    public static final Tier WOOD_BONE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + BONE_USES, WOOD_BASE_SPEED + BONE_SPEED, WOOD_BASE_DMG + BONE_DMG, WOOD_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-bone"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_ENCHANTED_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + ENCHANTED_USES, WOOD_BASE_SPEED + ENCHANTED_SPEED, WOOD_BASE_DMG + ENCHANTED_DMG, WOOD_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-enchanted"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_BLAZEROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + BLAZEROD_USES, WOOD_BASE_SPEED + BLAZEROD_SPEED, WOOD_BASE_DMG + BLAZEROD_DMG, WOOD_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-blaze"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_EMERALD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + EMERALD_USES, WOOD_BASE_SPEED + EMERALD_SPEED, WOOD_BASE_DMG + EMERALD_DMG, WOOD_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-emerald"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_AMETHYST_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + AMETHYST_USES, WOOD_BASE_SPEED + AMETHYST_SPEED, WOOD_BASE_DMG + AMETHYST_DMG, WOOD_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-amethyst"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_ENDROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + ENDROD_USES, WOOD_BASE_SPEED + ENDROD_SPEED, WOOD_BASE_DMG + ENDROD_DMG, WOOD_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-endrod"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_IRON_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + IRON_USES, WOOD_BASE_SPEED + IRON_SPEED, WOOD_BASE_DMG + IRON_DMG, WOOD_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-iron"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_GOLD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + GOLD_USES, WOOD_BASE_SPEED + GOLD_SPEED, WOOD_BASE_DMG + GOLD_DMG, WOOD_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-gold"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_DIAMOND_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + DIAMOND_USES, WOOD_BASE_SPEED + DIAMOND_SPEED, WOOD_BASE_DMG + DIAMOND_DMG, WOOD_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-diamond"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));

    public static final Tier WOOD_NETHERITE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + NETHERITE_USES, WOOD_BASE_SPEED + NETHERITE_SPEED, WOOD_BASE_DMG + NETHERITE_DMG, WOOD_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS)),
            new ResourceLocation(References.MODID, "wood-netherite"), List.of(Tiers.WOOD), List.of(Tiers.WOOD));


    public static final Tier STONE_BONE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + BONE_USES, STONE_BASE_SPEED + BONE_SPEED, STONE_BASE_DMG + BONE_DMG, STONE_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-bone"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_ENCHANTED_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + ENCHANTED_USES, STONE_BASE_SPEED + ENCHANTED_SPEED, STONE_BASE_DMG + ENCHANTED_DMG, STONE_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-enchanted"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_BLAZEROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + BLAZEROD_USES, STONE_BASE_SPEED + BLAZEROD_SPEED, STONE_BASE_DMG + BLAZEROD_DMG, STONE_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-blaze"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_EMERALD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + EMERALD_USES, STONE_BASE_SPEED + EMERALD_SPEED, STONE_BASE_DMG + EMERALD_DMG, STONE_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-emerald"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_AMETHYST_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + AMETHYST_USES, STONE_BASE_SPEED + AMETHYST_SPEED, STONE_BASE_DMG + AMETHYST_DMG, STONE_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-amethyst"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_ENDROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + ENDROD_USES, STONE_BASE_SPEED + ENDROD_SPEED, STONE_BASE_DMG + ENDROD_DMG, STONE_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-endrod"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_IRON_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + IRON_USES, STONE_BASE_SPEED + IRON_SPEED, STONE_BASE_DMG + IRON_DMG, STONE_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-iron"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_GOLD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + GOLD_USES, STONE_BASE_SPEED + GOLD_SPEED, STONE_BASE_DMG + GOLD_DMG, STONE_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-gold"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_DIAMOND_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + DIAMOND_USES, STONE_BASE_SPEED + DIAMOND_SPEED, STONE_BASE_DMG + DIAMOND_DMG, STONE_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-diamond"), List.of(Tiers.WOOD), List.of(Tiers.STONE));

    public static final Tier STONE_NETHERITE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + NETHERITE_USES, STONE_BASE_SPEED + NETHERITE_SPEED, STONE_BASE_DMG + NETHERITE_DMG, STONE_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
            new ResourceLocation(References.MODID, "stone-netherite"), List.of(Tiers.WOOD), List.of(Tiers.STONE));


    public static final Tier IRON_BONE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + BONE_USES, IRON_BASE_SPEED + BONE_SPEED, IRON_BASE_DMG + BONE_DMG, IRON_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-bone"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_ENCHANTED_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + ENCHANTED_USES, IRON_BASE_SPEED + ENCHANTED_SPEED, IRON_BASE_DMG + ENCHANTED_DMG, IRON_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-enchanted"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_BLAZEROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + BLAZEROD_USES, IRON_BASE_SPEED + BLAZEROD_SPEED, IRON_BASE_DMG + BLAZEROD_DMG, IRON_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-blaze"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_EMERALD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + EMERALD_USES, IRON_BASE_SPEED + EMERALD_SPEED, IRON_BASE_DMG + EMERALD_DMG, IRON_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-emerald"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_AMETHYST_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + AMETHYST_USES, IRON_BASE_SPEED + AMETHYST_SPEED, IRON_BASE_DMG + AMETHYST_DMG, IRON_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-amethyst"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_ENDROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + ENDROD_USES, IRON_BASE_SPEED + ENDROD_SPEED, IRON_BASE_DMG + ENDROD_DMG, IRON_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-endrod"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_IRON_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + IRON_USES, IRON_BASE_SPEED + IRON_SPEED, IRON_BASE_DMG + IRON_DMG, IRON_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-iron"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_GOLD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + GOLD_USES, IRON_BASE_SPEED + GOLD_SPEED, IRON_BASE_DMG + GOLD_DMG, IRON_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-gold"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_DIAMOND_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + DIAMOND_USES, IRON_BASE_SPEED + DIAMOND_SPEED, IRON_BASE_DMG + DIAMOND_DMG, IRON_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-diamond"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier IRON_NETHERITE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + NETHERITE_USES, IRON_BASE_SPEED + NETHERITE_SPEED, IRON_BASE_DMG + NETHERITE_DMG, IRON_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(References.MODID, "iron-netherite"), List.of(Tiers.STONE), List.of(Tiers.IRON));


    public static final Tier GOLD_BONE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + BONE_SPEED, GOLD_BASE_DMG + BONE_DMG, GOLD_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-bone"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_ENCHANTED_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + ENCHANTED_USES, GOLD_BASE_SPEED + ENCHANTED_SPEED, GOLD_BASE_DMG + ENCHANTED_DMG, GOLD_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-enchanted"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_BLAZEROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + BLAZEROD_USES, GOLD_BASE_SPEED + BLAZEROD_SPEED, GOLD_BASE_DMG + BLAZEROD_DMG, GOLD_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-blaze"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_EMERALD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + EMERALD_USES, GOLD_BASE_SPEED + EMERALD_SPEED, GOLD_BASE_DMG + EMERALD_DMG, GOLD_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-emerald"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_AMETHYST_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + AMETHYST_USES, GOLD_BASE_SPEED + AMETHYST_SPEED, GOLD_BASE_DMG + AMETHYST_DMG, GOLD_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-amethyst"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_ENDROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + ENDROD_USES, GOLD_BASE_SPEED + ENDROD_SPEED, GOLD_BASE_DMG + ENDROD_DMG, GOLD_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-endrod"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_IRON_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + IRON_SPEED, GOLD_BASE_DMG + IRON_DMG, GOLD_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-iron"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_GOLD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + GOLD_SPEED, GOLD_BASE_DMG + GOLD_DMG, GOLD_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-gold"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_DIAMOND_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + DIAMOND_USES, GOLD_BASE_SPEED + DIAMOND_SPEED, GOLD_BASE_DMG + DIAMOND_DMG, GOLD_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-diamond"), List.of(Tiers.IRON), List.of(Tiers.GOLD));

    public static final Tier GOLD_NETHERITE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + NETHERITE_USES, GOLD_BASE_SPEED + NETHERITE_SPEED, GOLD_BASE_DMG + NETHERITE_DMG, GOLD_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
            new ResourceLocation(References.MODID, "gold-netherite"), List.of(Tiers.IRON), List.of(Tiers.GOLD));


    public static final Tier DIAMOND_BONE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + BONE_USES, DIAMOND_BASE_SPEED + BONE_SPEED, DIAMOND_BASE_DMG + BONE_DMG, DIAMOND_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-bone"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_ENCHANTED_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + ENCHANTED_USES, DIAMOND_BASE_SPEED + ENCHANTED_SPEED, DIAMOND_BASE_DMG + ENCHANTED_DMG, DIAMOND_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-enchanted"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_BLAZEROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + BLAZEROD_USES, DIAMOND_BASE_SPEED + BLAZEROD_SPEED, DIAMOND_BASE_DMG + BLAZEROD_DMG, DIAMOND_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-blaze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_EMERALD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + EMERALD_USES, DIAMOND_BASE_SPEED + EMERALD_SPEED, DIAMOND_BASE_DMG + EMERALD_DMG, DIAMOND_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-emerald"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_AMETHYST_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + AMETHYST_USES, DIAMOND_BASE_SPEED + AMETHYST_SPEED, DIAMOND_BASE_DMG + AMETHYST_DMG, DIAMOND_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-amethyst"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_ENDROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + ENDROD_USES, DIAMOND_BASE_SPEED + ENDROD_SPEED, DIAMOND_BASE_DMG + ENDROD_DMG, DIAMOND_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-endrod"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_IRON_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + IRON_USES, DIAMOND_BASE_SPEED + IRON_SPEED, DIAMOND_BASE_DMG + IRON_DMG, DIAMOND_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-iron"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_GOLD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + GOLD_USES, DIAMOND_BASE_SPEED + GOLD_SPEED, DIAMOND_BASE_DMG + GOLD_DMG, DIAMOND_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-gold"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_DIAMOND_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + DIAMOND_USES, DIAMOND_BASE_SPEED + DIAMOND_SPEED, DIAMOND_BASE_DMG + DIAMOND_DMG, DIAMOND_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-diamond"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier DIAMOND_NETHERITE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + NETHERITE_USES, DIAMOND_BASE_SPEED + NETHERITE_SPEED, DIAMOND_BASE_DMG + NETHERITE_DMG, DIAMOND_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND)),
            new ResourceLocation(References.MODID, "diamond-netherite"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));


    public static final Tier NETHERITE_BONE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + BONE_USES, NETHERITE_BASE_SPEED + BONE_SPEED, NETHERITE_BASE_DMG + BONE_DMG, NETHERITE_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-bone"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_ENCHANTED_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + ENCHANTED_USES, NETHERITE_BASE_SPEED + ENCHANTED_SPEED, NETHERITE_BASE_DMG + ENCHANTED_DMG, NETHERITE_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-enchanted"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_BLAZEROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + BLAZEROD_USES, NETHERITE_BASE_SPEED + BLAZEROD_SPEED, NETHERITE_BASE_DMG + BLAZEROD_DMG, NETHERITE_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-blaze"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_EMERALD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + EMERALD_USES, NETHERITE_BASE_SPEED + EMERALD_SPEED, NETHERITE_BASE_DMG + EMERALD_DMG, NETHERITE_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-emerald"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_AMETHYST_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + AMETHYST_USES, NETHERITE_BASE_SPEED + AMETHYST_SPEED, NETHERITE_BASE_DMG + AMETHYST_DMG, NETHERITE_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-amethyst"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_ENDROD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + ENDROD_USES, NETHERITE_BASE_SPEED + ENDROD_SPEED, NETHERITE_BASE_DMG + ENDROD_DMG, NETHERITE_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-endrod"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_IRON_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + IRON_USES, NETHERITE_BASE_SPEED + IRON_SPEED, NETHERITE_BASE_DMG + IRON_DMG, NETHERITE_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-iron"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_GOLD_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + GOLD_USES, NETHERITE_BASE_SPEED + GOLD_SPEED, NETHERITE_BASE_DMG + GOLD_DMG, NETHERITE_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-gold"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_DIAMOND_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + DIAMOND_USES, NETHERITE_BASE_SPEED + DIAMOND_SPEED, NETHERITE_BASE_DMG + DIAMOND_DMG, NETHERITE_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-diamond"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier NETHERITE_NETHERITE_TM = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + NETHERITE_USES, NETHERITE_BASE_SPEED + NETHERITE_SPEED, NETHERITE_BASE_DMG + NETHERITE_DMG, NETHERITE_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(References.MODID, "netherite-netherite"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
