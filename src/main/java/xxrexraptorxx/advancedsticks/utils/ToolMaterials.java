package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolMaterials {

    /**            lvl|uses|speed|damage|enchant
     *    WOOD       0, 59,   2.0,  0.0,  15
     *    STONE      1, 131,  4.0,  1.0,  5
     *    IRON       2, 250,  6.0,  2.0,  14
     *    DIAMOND    3, 1561, 8.0,  3.0,  10
     *    GOLD       0, 32,   12.0, 0.0,  22
     *    NETHERITE  4, 2031, 9.0,  4.0,  15
     */
    private static final int   WOOD_BASE_USES = 59;
    private static final float WOOD_BASE_SPEED = 2.0f;
    private static final float WOOD_BASE_DMG = 0.0f;
    private static final int   WOOD_BASE_ENCH = 15;

    private static final int   STONE_BASE_USES = 131 - WOOD_BASE_USES;
    private static final float STONE_BASE_SPEED = 4.0f - WOOD_BASE_SPEED;
    private static final float STONE_BASE_DMG = 1.0f;
    private static final int   STONE_BASE_ENCH = 5;

    private static final int   IRON_BASE_USES = 250 - WOOD_BASE_USES;
    private static final float IRON_BASE_SPEED = 6.0f - WOOD_BASE_SPEED;
    private static final float IRON_BASE_DMG = 2.0f;
    private static final int   IRON_BASE_ENCH = 14;

    private static final int   GOLD_BASE_USES = 32;
    private static final float GOLD_BASE_SPEED = 12.0f - WOOD_BASE_SPEED;
    private static final float GOLD_BASE_DMG = 0.0f;
    private static final int   GOLD_BASE_ENCH = 22;

    private static final int   DIAMOND_BASE_USES = 1561 - WOOD_BASE_USES;
    private static final float DIAMOND_BASE_SPEED = 8.0f - WOOD_BASE_SPEED;
    private static final float DIAMOND_BASE_DMG = 3.0f;
    private static final int   DIAMOND_BASE_ENCH = 10;

    private static final int   NETHERITE_BASE_USES = 2031 - WOOD_BASE_USES;
    private static final float NETHERITE_BASE_SPEED = 9.0f - WOOD_BASE_SPEED;
    private static final float NETHERITE_BASE_DMG = 4.0f;
    private static final int   NETHERITE_BASE_ENCH = 15;

    private static final int   WOOD_USES = WOOD_BASE_USES / 3 * 2;
    private static final float WOOD_SPEED = WOOD_BASE_SPEED / 3 * 2;
    private static final float WOOD_DMG = WOOD_BASE_DMG / 3 * 2;
    private static final int   WOOD_ENCH = WOOD_BASE_ENCH / 3 * 2;

    private static final int   STONE_USES = STONE_BASE_USES / 3 * 2;
    private static final float STONE_SPEED = STONE_BASE_SPEED / 3 * 2;
    private static final float STONE_DMG = STONE_BASE_DMG / 3 * 2;
    private static final int   STONE_ENCH = STONE_BASE_ENCH / 3 * 2;

    private static final int   IRON_USES = IRON_BASE_USES / 3 * 2;
    private static final float IRON_SPEED = IRON_BASE_SPEED / 3 * 2;
    private static final float IRON_DMG = IRON_BASE_DMG / 3 * 2;
    private static final int   IRON_ENCH = IRON_BASE_ENCH / 3 * 2;

    private static final int   GOLD_USES = GOLD_BASE_USES / 3 * 2;
    private static final float GOLD_SPEED = GOLD_BASE_SPEED / 3 * 2;
    private static final float GOLD_DMG = 0.0f;
    private static final int   GOLD_ENCH = GOLD_BASE_ENCH  / 3 * 2;

    private static final int   DIAMOND_USES = DIAMOND_BASE_USES / 3 * 2;
    private static final float DIAMOND_SPEED = DIAMOND_BASE_SPEED / 3 * 2;
    private static final float DIAMOND_DMG = DIAMOND_BASE_DMG / 3 * 2;
    private static final int   DIAMOND_ENCH = DIAMOND_BASE_ENCH / 3 * 2;

    private static final int   NETHERITE_USES = NETHERITE_BASE_USES  / 3 * 2;
    private static final float NETHERITE_SPEED = NETHERITE_BASE_SPEED / 3 * 2;
    private static final float NETHERITE_DMG = NETHERITE_BASE_DMG / 3 * 2;
    private static final int   NETHERITE_ENCH = NETHERITE_BASE_ENCH / 3 * 2;

    private static final int   ADVANCED_USES = (DIAMOND_USES / 3 * 2) + (IRON_USES / 3);
    private static final float ADVANCED_SPEED = (DIAMOND_SPEED / 3 * 2) + (IRON_SPEED / 3);
    private static final float ADVANCED_DMG = (DIAMOND_DMG / 3 * 2) + (IRON_DMG / 3);
    private static final int   ADVANCED_ENCH = (DIAMOND_ENCH / 3 * 2) + (IRON_ENCH / 3);

    private static final int   BONE_USES = 47;
    private static final float BONE_SPEED = 2.0f;
    private static final float BONE_DMG = 0.5f;
    private static final int   BONE_ENCH = 7;

    private static final int   ENDROD_USES = 133;
    private static final float ENDROD_SPEED = 5.3f;
    private static final float ENDROD_DMG = 1.7f;
    private static final int   ENDROD_ENCH = 17;

    private static final int   BLAZEROD_USES = 120;
    private static final float BLAZEROD_SPEED = 5.5f;
    private static final float BLAZEROD_DMG = 1.5f;
    private static final int   BLAZEROD_ENCH = 15;

    private static final int   EMERALD_USES = 600;
    private static final float EMERALD_SPEED = 4.2f;
    private static final float EMERALD_DMG = 1.4f;
    private static final int   EMERALD_ENCH = 12;

    private static final int   COPPER_USES = 133;
    private static final float COPPER_SPEED = 4.4f;
    private static final float COPPER_DMG = 1.2f;
    private static final int   COPPER_ENCH = 9;

    private static final int   AMETHYST_USES = 666;
    private static final float AMETHYST_SPEED = 4.6f;
    private static final float AMETHYST_DMG = 1.6f;
    private static final int   AMETHYST_ENCH = 20;

    private static final int   ENCHANTED_USES = WOOD_BASE_USES + 30;
    private static final float ENCHANTED_SPEED = WOOD_BASE_SPEED + 2.0f;
    private static final float ENCHANTED_DMG = WOOD_BASE_DMG;
    private static final int   ENCHANTED_ENCH = WOOD_BASE_ENCH + 30;

    /** SPEED **/
    public static final float WOOD_SWORD_SPEED = 1.6f;
    public static final float WOOD_PICKAXE_SPEED = 1.2f;
    public static final float WOOD_AXE_SPEED = 0.8f;
    public static final float WOOD_SHOVEL_SPEED = 1;
    public static final float WOOD_HOE_SPEED = 1;

    public static final float STONE_SWORD_SPEED = 1.6f;
    public static final float STONE_PICKAXE_SPEED = 1.2f;
    public static final float STONE_AXE_SPEED = 0.8f;
    public static final float STONE_SHOVEL_SPEED = 1;
    public static final float STONE_HOE_SPEED = 2;

    public static final float IRON_SWORD_SPEED = 1.6f;
    public static final float IRON_PICKAXE_SPEED = 1.2f;
    public static final float IRON_AXE_SPEED = 0.9f;
    public static final float IRON_SHOVEL_SPEED = 1;
    public static final float IRON_HOE_SPEED = 3;

    public static final float GOLD_SWORD_SPEED = 1.6f;
    public static final float GOLD_PICKAXE_SPEED = 1.2f;
    public static final float GOLD_AXE_SPEED = 1;
    public static final float GOLD_SHOVEL_SPEED = 1;
    public static final float GOLD_HOE_SPEED = 1;

    public static final float DIAMOND_SWORD_SPEED = 1.6f;
    public static final float DIAMOND_PICKAXE_SPEED = 1.2f;
    public static final float DIAMOND_AXE_SPEED = 1;
    public static final float DIAMOND_SHOVEL_SPEED = 1;
    public static final float DIAMOND_HOE_SPEED = 4;

    public static final float NETHERITE_SWORD_SPEED = 1.6f;
    public static final float NETHERITE_PICKAXE_SPEED = 1.2f;
    public static final float NETHERITE_AXE_SPEED = 1;
    public static final float NETHERITE_SHOVEL_SPEED = 1;
    public static final float NETHERITE_HOE_SPEED = 4;


    public static final ForgeTier WOOD_BONE_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + BONE_USES, WOOD_BASE_SPEED + BONE_SPEED, WOOD_BASE_DMG + BONE_DMG, WOOD_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_COPPER_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + COPPER_USES, WOOD_BASE_SPEED + COPPER_SPEED, WOOD_BASE_DMG + COPPER_DMG, WOOD_BASE_ENCH + COPPER_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_ADVANCED_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + ADVANCED_USES, WOOD_BASE_SPEED + ADVANCED_SPEED, WOOD_BASE_DMG + ADVANCED_DMG, WOOD_BASE_ENCH + ADVANCED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));
    
    public static final ForgeTier WOOD_ENCHANTED_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + ENCHANTED_USES, WOOD_BASE_SPEED + ENCHANTED_SPEED, WOOD_BASE_DMG + ENCHANTED_DMG, WOOD_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_BLAZEROD_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + BLAZEROD_USES, WOOD_BASE_SPEED + BLAZEROD_SPEED, WOOD_BASE_DMG + BLAZEROD_DMG, WOOD_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_EMERALD_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + EMERALD_USES, WOOD_BASE_SPEED + EMERALD_SPEED, WOOD_BASE_DMG + EMERALD_DMG, WOOD_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_AMETHYST_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + AMETHYST_USES, WOOD_BASE_SPEED + AMETHYST_SPEED, WOOD_BASE_DMG + AMETHYST_DMG, WOOD_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_ENDROD_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + ENDROD_USES, WOOD_BASE_SPEED + ENDROD_SPEED, WOOD_BASE_DMG + ENDROD_DMG, WOOD_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_IRON_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + IRON_USES, WOOD_BASE_SPEED + IRON_SPEED, WOOD_BASE_DMG + IRON_DMG, WOOD_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_GOLD_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + GOLD_USES, WOOD_BASE_SPEED + GOLD_SPEED, WOOD_BASE_DMG + GOLD_DMG, WOOD_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_DIAMOND_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + DIAMOND_USES, WOOD_BASE_SPEED + DIAMOND_SPEED, WOOD_BASE_DMG + DIAMOND_DMG, WOOD_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));

    public static final ForgeTier WOOD_NETHERITE_TM = new ForgeTier(Tiers.WOOD.getLevel(), WOOD_BASE_USES + NETHERITE_USES, WOOD_BASE_SPEED + NETHERITE_SPEED, WOOD_BASE_DMG + NETHERITE_DMG, WOOD_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.PLANKS));


    public static final ForgeTier STONE_BONE_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + BONE_USES, STONE_BASE_SPEED + BONE_SPEED, STONE_BASE_DMG + BONE_DMG, STONE_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_COPPER_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + COPPER_USES, STONE_BASE_SPEED + COPPER_SPEED, STONE_BASE_DMG + COPPER_DMG, STONE_BASE_ENCH + COPPER_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_ADVANCED_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + ADVANCED_USES, STONE_BASE_SPEED + ADVANCED_SPEED, STONE_BASE_DMG + ADVANCED_DMG, STONE_BASE_ENCH + ADVANCED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_ENCHANTED_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + ENCHANTED_USES, STONE_BASE_SPEED + ENCHANTED_SPEED, STONE_BASE_DMG + ENCHANTED_DMG, STONE_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_BLAZEROD_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + BLAZEROD_USES, STONE_BASE_SPEED + BLAZEROD_SPEED, STONE_BASE_DMG + BLAZEROD_DMG, STONE_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_EMERALD_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + EMERALD_USES, STONE_BASE_SPEED + EMERALD_SPEED, STONE_BASE_DMG + EMERALD_DMG, STONE_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_AMETHYST_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + AMETHYST_USES, STONE_BASE_SPEED + AMETHYST_SPEED, STONE_BASE_DMG + AMETHYST_DMG, STONE_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_ENDROD_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + ENDROD_USES, STONE_BASE_SPEED + ENDROD_SPEED, STONE_BASE_DMG + ENDROD_DMG, STONE_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_IRON_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + IRON_USES, STONE_BASE_SPEED + IRON_SPEED, STONE_BASE_DMG + IRON_DMG, STONE_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_GOLD_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + GOLD_USES, STONE_BASE_SPEED + GOLD_SPEED, STONE_BASE_DMG + GOLD_DMG, STONE_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_DIAMOND_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + DIAMOND_USES, STONE_BASE_SPEED + DIAMOND_SPEED, STONE_BASE_DMG + DIAMOND_DMG, STONE_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    public static final ForgeTier STONE_NETHERITE_TM = new ForgeTier(Tiers.STONE.getLevel(), STONE_BASE_USES + NETHERITE_USES, STONE_BASE_SPEED + NETHERITE_SPEED, STONE_BASE_DMG + NETHERITE_DMG, STONE_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));


    public static final ForgeTier IRON_BONE_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + BONE_USES, IRON_BASE_SPEED + BONE_SPEED, IRON_BASE_DMG + BONE_DMG, IRON_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_COPPER_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + COPPER_USES, IRON_BASE_SPEED + COPPER_SPEED, IRON_BASE_DMG + COPPER_DMG, IRON_BASE_ENCH + COPPER_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_ADVANCED_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + ADVANCED_USES, IRON_BASE_SPEED + ADVANCED_SPEED, IRON_BASE_DMG + ADVANCED_DMG, IRON_BASE_ENCH + ADVANCED_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_ENCHANTED_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + ENCHANTED_USES, IRON_BASE_SPEED + ENCHANTED_SPEED, IRON_BASE_DMG + ENCHANTED_DMG, IRON_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_BLAZEROD_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + BLAZEROD_USES, IRON_BASE_SPEED + BLAZEROD_SPEED, IRON_BASE_DMG + BLAZEROD_DMG, IRON_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_EMERALD_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + EMERALD_USES, IRON_BASE_SPEED + EMERALD_SPEED, IRON_BASE_DMG + EMERALD_DMG, IRON_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_AMETHYST_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + AMETHYST_USES, IRON_BASE_SPEED + AMETHYST_SPEED, IRON_BASE_DMG + AMETHYST_DMG, IRON_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_ENDROD_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + ENDROD_USES, IRON_BASE_SPEED + ENDROD_SPEED, IRON_BASE_DMG + ENDROD_DMG, IRON_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_IRON_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + IRON_USES, IRON_BASE_SPEED + IRON_SPEED, IRON_BASE_DMG + IRON_DMG, IRON_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_GOLD_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + GOLD_USES, IRON_BASE_SPEED + GOLD_SPEED, IRON_BASE_DMG + GOLD_DMG, IRON_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_DIAMOND_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + DIAMOND_USES, IRON_BASE_SPEED + DIAMOND_SPEED, IRON_BASE_DMG + DIAMOND_DMG, IRON_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));

    public static final ForgeTier IRON_NETHERITE_TM = new ForgeTier(Tiers.IRON.getLevel(), IRON_BASE_USES + NETHERITE_USES, IRON_BASE_SPEED + NETHERITE_SPEED, IRON_BASE_DMG + NETHERITE_DMG, IRON_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.IRON_INGOT));


    public static final ForgeTier GOLD_BONE_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + BONE_SPEED, GOLD_BASE_DMG + BONE_DMG, GOLD_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_COPPER_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + COPPER_USES, IRON_BASE_SPEED + COPPER_SPEED, GOLD_BASE_DMG + COPPER_DMG, GOLD_BASE_ENCH + COPPER_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_ADVANCED_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + ADVANCED_USES, IRON_BASE_SPEED + ADVANCED_SPEED, GOLD_BASE_DMG + ADVANCED_DMG, GOLD_BASE_ENCH + ADVANCED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_ENCHANTED_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + ENCHANTED_USES, GOLD_BASE_SPEED + ENCHANTED_SPEED, GOLD_BASE_DMG + ENCHANTED_DMG, GOLD_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_BLAZEROD_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + BLAZEROD_USES, GOLD_BASE_SPEED + BLAZEROD_SPEED, GOLD_BASE_DMG + BLAZEROD_DMG, GOLD_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_EMERALD_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + EMERALD_USES, GOLD_BASE_SPEED + EMERALD_SPEED, GOLD_BASE_DMG + EMERALD_DMG, GOLD_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_AMETHYST_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + AMETHYST_USES, GOLD_BASE_SPEED + AMETHYST_SPEED, GOLD_BASE_DMG + AMETHYST_DMG, GOLD_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_ENDROD_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + ENDROD_USES, GOLD_BASE_SPEED + ENDROD_SPEED, GOLD_BASE_DMG + ENDROD_DMG, GOLD_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_IRON_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + IRON_SPEED, GOLD_BASE_DMG + IRON_DMG, GOLD_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_GOLD_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + GOLD_SPEED, GOLD_BASE_DMG + GOLD_DMG, GOLD_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_DIAMOND_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + DIAMOND_USES, GOLD_BASE_SPEED + DIAMOND_SPEED, GOLD_BASE_DMG + DIAMOND_DMG, GOLD_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    public static final ForgeTier GOLD_NETHERITE_TM = new ForgeTier(Tiers.GOLD.getLevel(), GOLD_BASE_USES + NETHERITE_USES, GOLD_BASE_SPEED + NETHERITE_SPEED, GOLD_BASE_DMG + NETHERITE_DMG, GOLD_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));


    public static final ForgeTier DIAMOND_BONE_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + BONE_USES, DIAMOND_BASE_SPEED + BONE_SPEED, DIAMOND_BASE_DMG + BONE_DMG, DIAMOND_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_COPPER_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + COPPER_USES, DIAMOND_BASE_SPEED + COPPER_SPEED, DIAMOND_BASE_DMG + COPPER_DMG, DIAMOND_BASE_ENCH + COPPER_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_ADVANCED_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + ADVANCED_USES, DIAMOND_BASE_SPEED + ADVANCED_SPEED, DIAMOND_BASE_DMG + ADVANCED_DMG, DIAMOND_BASE_ENCH + ADVANCED_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_ENCHANTED_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + ENCHANTED_USES, DIAMOND_BASE_SPEED + ENCHANTED_SPEED, DIAMOND_BASE_DMG + ENCHANTED_DMG, DIAMOND_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_BLAZEROD_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + BLAZEROD_USES, DIAMOND_BASE_SPEED + BLAZEROD_SPEED, DIAMOND_BASE_DMG + BLAZEROD_DMG, DIAMOND_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_EMERALD_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + EMERALD_USES, DIAMOND_BASE_SPEED + EMERALD_SPEED, DIAMOND_BASE_DMG + EMERALD_DMG, DIAMOND_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_AMETHYST_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + AMETHYST_USES, DIAMOND_BASE_SPEED + AMETHYST_SPEED, DIAMOND_BASE_DMG + AMETHYST_DMG, DIAMOND_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_ENDROD_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + ENDROD_USES, DIAMOND_BASE_SPEED + ENDROD_SPEED, DIAMOND_BASE_DMG + ENDROD_DMG, DIAMOND_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_IRON_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + IRON_USES, DIAMOND_BASE_SPEED + IRON_SPEED, DIAMOND_BASE_DMG + IRON_DMG, DIAMOND_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_GOLD_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + GOLD_USES, DIAMOND_BASE_SPEED + GOLD_SPEED, DIAMOND_BASE_DMG + GOLD_DMG, DIAMOND_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_DIAMOND_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + DIAMOND_USES, DIAMOND_BASE_SPEED + DIAMOND_SPEED, DIAMOND_BASE_DMG + DIAMOND_DMG, DIAMOND_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));

    public static final ForgeTier DIAMOND_NETHERITE_TM = new ForgeTier(Tiers.DIAMOND.getLevel(), DIAMOND_BASE_USES + NETHERITE_USES, DIAMOND_BASE_SPEED + NETHERITE_SPEED, DIAMOND_BASE_DMG + NETHERITE_DMG, DIAMOND_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.DIAMOND));


    public static final ForgeTier NETHERITE_BONE_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + BONE_USES, NETHERITE_BASE_SPEED + BONE_SPEED, NETHERITE_BASE_DMG + BONE_DMG, NETHERITE_BASE_ENCH + BONE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_COPPER_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + COPPER_USES, NETHERITE_BASE_SPEED + COPPER_SPEED, NETHERITE_BASE_DMG + COPPER_DMG, NETHERITE_BASE_ENCH + COPPER_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_ADVANCED_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + ADVANCED_USES, NETHERITE_BASE_SPEED + ADVANCED_SPEED, NETHERITE_BASE_DMG + ADVANCED_DMG, NETHERITE_BASE_ENCH + ADVANCED_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_ENCHANTED_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + ENCHANTED_USES, NETHERITE_BASE_SPEED + ENCHANTED_SPEED, NETHERITE_BASE_DMG + ENCHANTED_DMG, NETHERITE_BASE_ENCH + ENCHANTED_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_BLAZEROD_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + BLAZEROD_USES, NETHERITE_BASE_SPEED + BLAZEROD_SPEED, NETHERITE_BASE_DMG + BLAZEROD_DMG, NETHERITE_BASE_ENCH + BLAZEROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_EMERALD_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + EMERALD_USES, NETHERITE_BASE_SPEED + EMERALD_SPEED, NETHERITE_BASE_DMG + EMERALD_DMG, NETHERITE_BASE_ENCH + EMERALD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_AMETHYST_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + AMETHYST_USES, NETHERITE_BASE_SPEED + AMETHYST_SPEED, NETHERITE_BASE_DMG + AMETHYST_DMG, NETHERITE_BASE_ENCH + AMETHYST_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_ENDROD_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + ENDROD_USES, NETHERITE_BASE_SPEED + ENDROD_SPEED, NETHERITE_BASE_DMG + ENDROD_DMG, NETHERITE_BASE_ENCH + ENDROD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_IRON_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + IRON_USES, NETHERITE_BASE_SPEED + IRON_SPEED, NETHERITE_BASE_DMG + IRON_DMG, NETHERITE_BASE_ENCH + IRON_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_GOLD_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + GOLD_USES, NETHERITE_BASE_SPEED + GOLD_SPEED, NETHERITE_BASE_DMG + GOLD_DMG, NETHERITE_BASE_ENCH + GOLD_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_DIAMOND_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + DIAMOND_USES, NETHERITE_BASE_SPEED + DIAMOND_SPEED, NETHERITE_BASE_DMG + DIAMOND_DMG, NETHERITE_BASE_ENCH + DIAMOND_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));

    public static final ForgeTier NETHERITE_NETHERITE_TM = new ForgeTier(Tiers.NETHERITE.getLevel(), NETHERITE_BASE_USES + NETHERITE_USES, NETHERITE_BASE_SPEED + NETHERITE_SPEED, NETHERITE_BASE_DMG + NETHERITE_DMG, NETHERITE_BASE_ENCH + NETHERITE_ENCH, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NETHERITE_INGOT));
}

