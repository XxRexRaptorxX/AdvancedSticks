package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.common.Tags;

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

    private static final int   WOOD_USES = WOOD_BASE_USES / 3 * 2; //38
    private static final float WOOD_SPEED = WOOD_BASE_SPEED / 3 * 2; //1.3
    private static final float WOOD_DMG = WOOD_BASE_DMG / 3 * 2; //0
    private static final int   WOOD_ENCH = WOOD_BASE_ENCH / 3 * 2; //10

    private static final int   STONE_USES = STONE_BASE_USES / 3 * 2; //48
    private static final float STONE_SPEED = STONE_BASE_SPEED / 3 * 2; //1.3
    private static final float STONE_DMG = STONE_BASE_DMG / 3 * 2; //0.6
    private static final int   STONE_ENCH = STONE_BASE_ENCH / 3 * 2; //2

    private static final int   IRON_USES = IRON_BASE_USES / 3 * 2; //126
    private static final float IRON_SPEED = IRON_BASE_SPEED / 3 * 2; //2.6
    private static final float IRON_DMG = IRON_BASE_DMG / 3 * 2; //1.3
    private static final int   IRON_ENCH = IRON_BASE_ENCH / 3 * 2; //8

    private static final int   GOLD_USES = GOLD_BASE_USES / 3 * 2; // 20
    private static final float GOLD_SPEED = GOLD_BASE_SPEED / 3 * 2; //6.6
    private static final float GOLD_DMG = 0.0f;
    private static final int   GOLD_ENCH = GOLD_BASE_ENCH  / 3 * 2; //14

    private static final int   DIAMOND_USES = DIAMOND_BASE_USES / 3 * 2; //1000
    private static final float DIAMOND_SPEED = DIAMOND_BASE_SPEED / 3 * 2; //4.0
    private static final float DIAMOND_DMG = DIAMOND_BASE_DMG / 3 * 2; //2.0
    private static final int   DIAMOND_ENCH = DIAMOND_BASE_ENCH / 3 * 2; //6

    private static final int   NETHERITE_USES = NETHERITE_BASE_USES  / 3 * 2; //1314
    private static final float NETHERITE_SPEED = NETHERITE_BASE_SPEED / 3 * 2; //4.6
    private static final float NETHERITE_DMG = NETHERITE_BASE_DMG / 3 * 2; //2.6
    private static final int   NETHERITE_ENCH = NETHERITE_BASE_ENCH / 3 * 2; //10

    private static final int   ADVANCED_USES = (DIAMOND_USES / 3 * 2) + (IRON_USES / 3); //708
    private static final float ADVANCED_SPEED = (DIAMOND_SPEED / 3 * 2) + (IRON_SPEED / 3); //3.5
    private static final float ADVANCED_DMG = (DIAMOND_DMG / 3 * 2) + (IRON_DMG / 3); //1.7
    private static final int   ADVANCED_ENCH = (DIAMOND_ENCH / 3 * 2) + (IRON_ENCH / 3); //6

    private static final int   BONE_USES  = 47;
    private static final float BONE_SPEED = 2.0f;
    private static final float BONE_DMG   = 0.5f;
    private static final int   BONE_ENCH  = 7;

    private static final int   ENDROD_USES  = 133;
    private static final float ENDROD_SPEED = 5.3f;
    private static final float ENDROD_DMG   = 1.7f;
    private static final int   ENDROD_ENCH  = 17;

    private static final int   BLAZEROD_USES  = 120;
    private static final float BLAZEROD_SPEED = 4.2f;
    private static final float BLAZEROD_DMG   = 1.5f;
    private static final int   BLAZEROD_ENCH  = 15;

    private static final int   BREEZEROD_USES  = 110;
    private static final float BREEZEROD_SPEED = 5.0f;
    private static final float BREEZEROD_DMG   = 0.5f;
    private static final int   BREEZEROD_ENCH  = 13;

    private static final int   EMERALD_USES  = 600;
    private static final float EMERALD_SPEED = 4.2f;
    private static final float EMERALD_DMG   = 1.4f;
    private static final int   EMERALD_ENCH  = 12;

    private static final int   COPPER_USES  = 133;
    private static final float COPPER_SPEED = 4.4f;
    private static final float COPPER_DMG   = 1.2f;
    private static final int   COPPER_ENCH  = 9;

    private static final int   AMETHYST_USES  = 666;
    private static final float AMETHYST_SPEED = 4.6f;
    private static final float AMETHYST_DMG   = 1.6f;
    private static final int   AMETHYST_ENCH  = 20;

    private static final int   ENCHANTED_USES = WOOD_BASE_USES + 30; //89
    private static final float ENCHANTED_SPEED = WOOD_BASE_SPEED + 2.0f; //4
    private static final float ENCHANTED_DMG = WOOD_BASE_DMG; //0
    private static final int   ENCHANTED_ENCH = WOOD_BASE_ENCH + 30; //45

    private static final int   ALUMINUM_USES  = 30;
    private static final float ALUMINUM_SPEED = 7.0f;
    private static final float ALUMINUM_DMG   = 0.0f;
    private static final int   ALUMINUM_ENCH  = 16;

    private static final int   ELECTRUM_USES  = 25;
    private static final float ELECTRUM_SPEED = 7.5f;
    private static final float ELECTRUM_DMG   = 0.0f;
    private static final int   ELECTRUM_ENCH  = 18;

    private static final int   TIN_USES       = 120;
    private static final float TIN_SPEED      = 4.2f;
    private static final float TIN_DMG        = 1.1f;
    private static final int   TIN_ENCH       = 8;

    private static final int   BRASS_USES     = 140;
    private static final float BRASS_SPEED    = 4.5f;
    private static final float BRASS_DMG      = 1.3f;
    private static final int   BRASS_ENCH     = 10;

    private static final int   BRONZE_USES    = 160;
    private static final float BRONZE_SPEED   = 3.8f;
    private static final float BRONZE_DMG     = 1.5f;
    private static final int   BRONZE_ENCH    = 8;

    private static final int   CONSTANTAN_USES  = 130;
    private static final float CONSTANTAN_SPEED = 4.0f;
    private static final float CONSTANTAN_DMG   = 1.4f;
    private static final int   CONSTANTAN_ENCH  = 11;

    private static final int   NICKEL_USES    = 140;
    private static final float NICKEL_SPEED   = 3.0f;
    private static final float NICKEL_DMG     = 1.5f;
    private static final int   NICKEL_ENCH    = 9;

    private static final int   INVAR_USES     = 200;
    private static final float INVAR_SPEED    = 3.0f;
    private static final float INVAR_DMG      = 1.7f;
    private static final int   INVAR_ENCH     = 10;

    private static final int   STEEL_USES     = 300;
    private static final float STEEL_SPEED    = 3.2f;
    private static final float STEEL_DMG      = 1.8f;
    private static final int   STEEL_ENCH     = 10;

    private static final int   LUMIUM_USES    = 300;
    private static final float LUMIUM_SPEED   = 5.0f;
    private static final float LUMIUM_DMG     = 2.0f;
    private static final int   LUMIUM_ENCH    = 22;

    private static final int   IRIDIUM_USES   = 1600;
    private static final float IRIDIUM_SPEED  = 5.0f;
    private static final float IRIDIUM_DMG    = 3.0f;
    private static final int   IRIDIUM_ENCH   = 14;

    private static final int   OSMIUM_USES    = 1700;
    private static final float OSMIUM_SPEED   = 4.5f;
    private static final float OSMIUM_DMG     = 3.2f;
    private static final int   OSMIUM_ENCH    = 8;

    private static final int   PLATINUM_USES  = 1500;
    private static final float PLATINUM_SPEED = 4.8f;
    private static final float PLATINUM_DMG   = 2.9f;
    private static final int   PLATINUM_ENCH  = 16;

    private static final int   ENDERIUM_USES  = 1400;
    private static final float ENDERIUM_SPEED = 5.0f;
    private static final float ENDERIUM_DMG   = 2.8f;
    private static final int   ENDERIUM_ENCH  = 12;

    private static final int   URANIUM_USES   = 1400;
    private static final float URANIUM_SPEED  = 3.8f;
    private static final float URANIUM_DMG    = 3.0f;
    private static final int   URANIUM_ENCH   = 5;

    private static final int   SIGNALUM_USES  = 1000;
    private static final float SIGNALUM_SPEED = 6.0f;
    private static final float SIGNALUM_DMG   = 2.5f;
    private static final int   SIGNALUM_ENCH  = 20;

    private static final int   LEAD_USES      = 45;
    private static final float LEAD_SPEED     = 2.0f;
    private static final float LEAD_DMG       = 0.8f;
    private static final int   LEAD_ENCH      = 6;

    private static final int   RUBY_USES      = 650;
    private static final float RUBY_SPEED     = 4.5f;
    private static final float RUBY_DMG       = 1.6f;
    private static final int   RUBY_ENCH      = 15;

    private static final int   SAPPHIRE_USES  = 650;
    private static final float SAPPHIRE_SPEED = 4.5f;
    private static final float SAPPHIRE_DMG   = 1.6f;
    private static final int   SAPPHIRE_ENCH  = 15;

    private static final int   TOPAZ_USES     = 550;
    private static final float TOPAZ_SPEED    = 4.0f;
    private static final float TOPAZ_DMG      = 1.5f;
    private static final int   TOPAZ_ENCH     = 18;

    private static final int   PERIDOT_USES   = 600;
    private static final float PERIDOT_SPEED  = 4.2f;
    private static final float PERIDOT_DMG    = 1.5f;
    private static final int   PERIDOT_ENCH   = 17;

    private static final int   CINNABAR_USES  = 100;
    private static final float CINNABAR_SPEED = 3.5f;
    private static final float CINNABAR_DMG   = 1.3f;
    private static final int   CINNABAR_ENCH  = 15;

    private static final int   FLUORITE_USES  = 50;
    private static final float FLUORITE_SPEED = 7.5f;
    private static final float FLUORITE_DMG   = 0.0f;
    private static final int   FLUORITE_ENCH  = 22;

    private static final int   VIBRANIUM_USES = 1900;
    private static final float VIBRANIUM_SPEED = 5.5f;
    private static final float VIBRANIUM_DMG   = 3.5f;
    private static final int   VIBRANIUM_ENCH  = 20;

    private static final int   UNOBTAINIUM_USES = 2400;
    private static final float UNOBTAINIUM_SPEED = 6.2f;
    private static final float UNOBTAINIUM_DMG   = 4.2f;
    private static final int   UNOBTAINIUM_ENCH  = 15;

    private static final int   QUARTZ_USES = 40;
    private static final float QUARTZ_SPEED = 5.0f;
    private static final float QUARTZ_DMG   = 0.5f;
    private static final int   QUARTZ_ENCH  = 20;

    private static final int   CERTUS_QUARTZ_USES = 60;
    private static final float CERTUS_QUARTZ_SPEED = 6.5f;
    private static final float CERTUS_QUARTZ_DMG   = 0.8f;
    private static final int   CERTUS_QUARTZ_ENCH  = 28;

    private static final int   ALLTHEMODIUM_USES = 3200;
    private static final float ALLTHEMODIUM_SPEED = 7.0f;
    private static final float ALLTHEMODIUM_DMG   = 5.0f;
    private static final int   ALLTHEMODIUM_ENCH  = 8;


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

    //                        [TOOL_STICK_TM]                               incorrect blocks                         durability                          mining speed                                    damage                                enchanting                    repair materials
    public static ToolMaterial WOOD_BONE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + BONE_USES, WOOD_BASE_SPEED + BONE_SPEED, WOOD_BASE_DMG + BONE_DMG, WOOD_BASE_ENCH + BONE_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_COPPER_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + COPPER_USES, WOOD_BASE_SPEED + COPPER_SPEED, WOOD_BASE_DMG + COPPER_DMG, WOOD_BASE_ENCH + COPPER_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ADVANCED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ADVANCED_USES, WOOD_BASE_SPEED + ADVANCED_SPEED, WOOD_BASE_DMG + ADVANCED_DMG, WOOD_BASE_ENCH + ADVANCED_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ENCHANTED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ENCHANTED_USES, WOOD_BASE_SPEED + ENCHANTED_SPEED, WOOD_BASE_DMG + ENCHANTED_DMG, WOOD_BASE_ENCH + ENCHANTED_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_BLAZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + BLAZEROD_USES, WOOD_BASE_SPEED + BLAZEROD_SPEED, WOOD_BASE_DMG + BLAZEROD_DMG, WOOD_BASE_ENCH + BLAZEROD_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_EMERALD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + EMERALD_USES, WOOD_BASE_SPEED + EMERALD_SPEED, WOOD_BASE_DMG + EMERALD_DMG, WOOD_BASE_ENCH + EMERALD_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_AMETHYST_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + AMETHYST_USES, WOOD_BASE_SPEED + AMETHYST_SPEED, WOOD_BASE_DMG + AMETHYST_DMG, WOOD_BASE_ENCH + AMETHYST_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ENDROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ENDROD_USES, WOOD_BASE_SPEED + ENDROD_SPEED, WOOD_BASE_DMG + ENDROD_DMG, WOOD_BASE_ENCH + ENDROD_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_IRON_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + IRON_USES, WOOD_BASE_SPEED + IRON_SPEED, WOOD_BASE_DMG + IRON_DMG, WOOD_BASE_ENCH + IRON_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_GOLD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + GOLD_USES, WOOD_BASE_SPEED + GOLD_SPEED, WOOD_BASE_DMG + GOLD_DMG, WOOD_BASE_ENCH + GOLD_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_DIAMOND_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + DIAMOND_USES, WOOD_BASE_SPEED + DIAMOND_SPEED, WOOD_BASE_DMG + DIAMOND_DMG, WOOD_BASE_ENCH + DIAMOND_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_NETHERITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + NETHERITE_USES, WOOD_BASE_SPEED + NETHERITE_SPEED, WOOD_BASE_DMG + NETHERITE_DMG, WOOD_BASE_ENCH + NETHERITE_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_BREEZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + BREEZEROD_USES, WOOD_BASE_SPEED + BREEZEROD_SPEED, WOOD_BASE_DMG + BREEZEROD_DMG, WOOD_BASE_ENCH + BREEZEROD_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ALUMINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ALUMINUM_USES, WOOD_BASE_SPEED + ALUMINUM_SPEED, WOOD_BASE_DMG + ALUMINUM_DMG, WOOD_BASE_ENCH + ALUMINUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ELECTRUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ELECTRUM_USES, WOOD_BASE_SPEED + ELECTRUM_SPEED, WOOD_BASE_DMG + ELECTRUM_DMG, WOOD_BASE_ENCH + ELECTRUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_TIN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + TIN_USES, WOOD_BASE_SPEED + TIN_SPEED, WOOD_BASE_DMG + TIN_DMG, WOOD_BASE_ENCH + TIN_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_BRASS_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + BRASS_USES, WOOD_BASE_SPEED + BRASS_SPEED, WOOD_BASE_DMG + BRASS_DMG, WOOD_BASE_ENCH + BRASS_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_BRONZE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + BRONZE_USES, WOOD_BASE_SPEED + BRONZE_SPEED, WOOD_BASE_DMG + BRONZE_DMG, WOOD_BASE_ENCH + BRONZE_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_CONSTANTAN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + CONSTANTAN_USES, WOOD_BASE_SPEED + CONSTANTAN_SPEED, WOOD_BASE_DMG + CONSTANTAN_DMG, WOOD_BASE_ENCH + CONSTANTAN_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_NICKEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + NICKEL_USES, WOOD_BASE_SPEED + NICKEL_SPEED, WOOD_BASE_DMG + NICKEL_DMG, WOOD_BASE_ENCH + NICKEL_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_INVAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + INVAR_USES, WOOD_BASE_SPEED + INVAR_SPEED, WOOD_BASE_DMG + INVAR_DMG, WOOD_BASE_ENCH + INVAR_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_STEEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + STEEL_USES, WOOD_BASE_SPEED + STEEL_SPEED, WOOD_BASE_DMG + STEEL_DMG, WOOD_BASE_ENCH + STEEL_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_LUMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + LUMIUM_USES, WOOD_BASE_SPEED + LUMIUM_SPEED, WOOD_BASE_DMG + LUMIUM_DMG, WOOD_BASE_ENCH + LUMIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_IRIDIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + IRIDIUM_USES, WOOD_BASE_SPEED + IRIDIUM_SPEED, WOOD_BASE_DMG + IRIDIUM_DMG, WOOD_BASE_ENCH + IRIDIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_OSMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + OSMIUM_USES, WOOD_BASE_SPEED + OSMIUM_SPEED, WOOD_BASE_DMG + OSMIUM_DMG, WOOD_BASE_ENCH + OSMIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_PLATINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + PLATINUM_USES, WOOD_BASE_SPEED + PLATINUM_SPEED, WOOD_BASE_DMG + PLATINUM_DMG, WOOD_BASE_ENCH + PLATINUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ENDERIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ENDERIUM_USES, WOOD_BASE_SPEED + ENDERIUM_SPEED, WOOD_BASE_DMG + ENDERIUM_DMG, WOOD_BASE_ENCH + ENDERIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_URANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + URANIUM_USES, WOOD_BASE_SPEED + URANIUM_SPEED, WOOD_BASE_DMG + URANIUM_DMG, WOOD_BASE_ENCH + URANIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_SIGNALUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + SIGNALUM_USES, WOOD_BASE_SPEED + SIGNALUM_SPEED, WOOD_BASE_DMG + SIGNALUM_DMG, WOOD_BASE_ENCH + SIGNALUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_LEAD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + LEAD_USES, WOOD_BASE_SPEED + LEAD_SPEED, WOOD_BASE_DMG + LEAD_DMG, WOOD_BASE_ENCH + LEAD_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_RUBY_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + RUBY_USES, WOOD_BASE_SPEED + RUBY_SPEED, WOOD_BASE_DMG + RUBY_DMG, WOOD_BASE_ENCH + RUBY_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_SAPPHIRE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + SAPPHIRE_USES, WOOD_BASE_SPEED + SAPPHIRE_SPEED, WOOD_BASE_DMG + SAPPHIRE_DMG, WOOD_BASE_ENCH + SAPPHIRE_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_TOPAZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + TOPAZ_USES, WOOD_BASE_SPEED + TOPAZ_SPEED, WOOD_BASE_DMG + TOPAZ_DMG, WOOD_BASE_ENCH + TOPAZ_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_PERIDOT_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + PERIDOT_USES, WOOD_BASE_SPEED + PERIDOT_SPEED, WOOD_BASE_DMG + PERIDOT_DMG, WOOD_BASE_ENCH + PERIDOT_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_CINNABAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + CINNABAR_USES, WOOD_BASE_SPEED + CINNABAR_SPEED, WOOD_BASE_DMG + CINNABAR_DMG, WOOD_BASE_ENCH + CINNABAR_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_FLUORITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + FLUORITE_USES, WOOD_BASE_SPEED + FLUORITE_SPEED, WOOD_BASE_DMG + FLUORITE_DMG, WOOD_BASE_ENCH + FLUORITE_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_VIBRANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + VIBRANIUM_USES, WOOD_BASE_SPEED + VIBRANIUM_SPEED, WOOD_BASE_DMG + VIBRANIUM_DMG, WOOD_BASE_ENCH + VIBRANIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_UNOBTAINIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + UNOBTAINIUM_USES, WOOD_BASE_SPEED + UNOBTAINIUM_SPEED, WOOD_BASE_DMG + UNOBTAINIUM_DMG, WOOD_BASE_ENCH + UNOBTAINIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_ALLTHEMODIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + ALLTHEMODIUM_USES, WOOD_BASE_SPEED + ALLTHEMODIUM_SPEED, WOOD_BASE_DMG + ALLTHEMODIUM_DMG, WOOD_BASE_ENCH + ALLTHEMODIUM_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_CERTUS_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + CERTUS_QUARTZ_USES, WOOD_BASE_SPEED + CERTUS_QUARTZ_SPEED, WOOD_BASE_DMG + CERTUS_QUARTZ_DMG, WOOD_BASE_ENCH + CERTUS_QUARTZ_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);
    public static ToolMaterial WOOD_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, WOOD_BASE_USES + QUARTZ_USES, WOOD_BASE_SPEED + QUARTZ_SPEED, WOOD_BASE_DMG + QUARTZ_DMG, WOOD_BASE_ENCH + QUARTZ_ENCH, ItemTags.WOODEN_TOOL_MATERIALS);

    public static ToolMaterial STONE_BONE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + BONE_USES, STONE_BASE_SPEED + BONE_SPEED, STONE_BASE_DMG + BONE_DMG, STONE_BASE_ENCH + BONE_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_COPPER_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + COPPER_USES, STONE_BASE_SPEED + COPPER_SPEED, STONE_BASE_DMG + COPPER_DMG, STONE_BASE_ENCH + COPPER_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ADVANCED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ADVANCED_USES, STONE_BASE_SPEED + ADVANCED_SPEED, STONE_BASE_DMG + ADVANCED_DMG, STONE_BASE_ENCH + ADVANCED_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ENCHANTED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ENCHANTED_USES, STONE_BASE_SPEED + ENCHANTED_SPEED, STONE_BASE_DMG + ENCHANTED_DMG, STONE_BASE_ENCH + ENCHANTED_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_BLAZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + BLAZEROD_USES, STONE_BASE_SPEED + BLAZEROD_SPEED, STONE_BASE_DMG + BLAZEROD_DMG, STONE_BASE_ENCH + BLAZEROD_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_EMERALD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + EMERALD_USES, STONE_BASE_SPEED + EMERALD_SPEED, STONE_BASE_DMG + EMERALD_DMG, STONE_BASE_ENCH + EMERALD_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_AMETHYST_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + AMETHYST_USES, STONE_BASE_SPEED + AMETHYST_SPEED, STONE_BASE_DMG + AMETHYST_DMG, STONE_BASE_ENCH + AMETHYST_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ENDROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ENDROD_USES, STONE_BASE_SPEED + ENDROD_SPEED, STONE_BASE_DMG + ENDROD_DMG, STONE_BASE_ENCH + ENDROD_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_IRON_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + IRON_USES, STONE_BASE_SPEED + IRON_SPEED, STONE_BASE_DMG + IRON_DMG, STONE_BASE_ENCH + IRON_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_GOLD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + GOLD_USES, STONE_BASE_SPEED + GOLD_SPEED, STONE_BASE_DMG + GOLD_DMG, STONE_BASE_ENCH + GOLD_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_DIAMOND_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + DIAMOND_USES, STONE_BASE_SPEED + DIAMOND_SPEED, STONE_BASE_DMG + DIAMOND_DMG, STONE_BASE_ENCH + DIAMOND_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_NETHERITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + NETHERITE_USES, STONE_BASE_SPEED + NETHERITE_SPEED, STONE_BASE_DMG + NETHERITE_DMG, STONE_BASE_ENCH + NETHERITE_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_BREEZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + BREEZEROD_USES, STONE_BASE_SPEED + BREEZEROD_SPEED, STONE_BASE_DMG + BREEZEROD_DMG, STONE_BASE_ENCH + BREEZEROD_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ALUMINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ALUMINUM_USES, STONE_BASE_SPEED + ALUMINUM_SPEED, STONE_BASE_DMG + ALUMINUM_DMG, STONE_BASE_ENCH + ALUMINUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ELECTRUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ELECTRUM_USES, STONE_BASE_SPEED + ELECTRUM_SPEED, STONE_BASE_DMG + ELECTRUM_DMG, STONE_BASE_ENCH + ELECTRUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_TIN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + TIN_USES, STONE_BASE_SPEED + TIN_SPEED, STONE_BASE_DMG + TIN_DMG, STONE_BASE_ENCH + TIN_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_BRASS_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + BRASS_USES, STONE_BASE_SPEED + BRASS_SPEED, STONE_BASE_DMG + BRASS_DMG, STONE_BASE_ENCH + BRASS_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_BRONZE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + BRONZE_USES, STONE_BASE_SPEED + BRONZE_SPEED, STONE_BASE_DMG + BRONZE_DMG, STONE_BASE_ENCH + BRONZE_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_CONSTANTAN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + CONSTANTAN_USES, STONE_BASE_SPEED + CONSTANTAN_SPEED, STONE_BASE_DMG + CONSTANTAN_DMG, STONE_BASE_ENCH + CONSTANTAN_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_NICKEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + NICKEL_USES, STONE_BASE_SPEED + NICKEL_SPEED, STONE_BASE_DMG + NICKEL_DMG, STONE_BASE_ENCH + NICKEL_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_INVAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + INVAR_USES, STONE_BASE_SPEED + INVAR_SPEED, STONE_BASE_DMG + INVAR_DMG, STONE_BASE_ENCH + INVAR_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_STEEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + STEEL_USES, STONE_BASE_SPEED + STEEL_SPEED, STONE_BASE_DMG + STEEL_DMG, STONE_BASE_ENCH + STEEL_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_LUMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + LUMIUM_USES, STONE_BASE_SPEED + LUMIUM_SPEED, STONE_BASE_DMG + LUMIUM_DMG, STONE_BASE_ENCH + LUMIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_IRIDIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + IRIDIUM_USES, STONE_BASE_SPEED + IRIDIUM_SPEED, STONE_BASE_DMG + IRIDIUM_DMG, STONE_BASE_ENCH + IRIDIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_OSMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + OSMIUM_USES, STONE_BASE_SPEED + OSMIUM_SPEED, STONE_BASE_DMG + OSMIUM_DMG, STONE_BASE_ENCH + OSMIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_PLATINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + PLATINUM_USES, STONE_BASE_SPEED + PLATINUM_SPEED, STONE_BASE_DMG + PLATINUM_DMG, STONE_BASE_ENCH + PLATINUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ENDERIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ENDERIUM_USES, STONE_BASE_SPEED + ENDERIUM_SPEED, STONE_BASE_DMG + ENDERIUM_DMG, STONE_BASE_ENCH + ENDERIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_URANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + URANIUM_USES, STONE_BASE_SPEED + URANIUM_SPEED, STONE_BASE_DMG + URANIUM_DMG, STONE_BASE_ENCH + URANIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_SIGNALUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + SIGNALUM_USES, STONE_BASE_SPEED + SIGNALUM_SPEED, STONE_BASE_DMG + SIGNALUM_DMG, STONE_BASE_ENCH + SIGNALUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_LEAD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + LEAD_USES, STONE_BASE_SPEED + LEAD_SPEED, STONE_BASE_DMG + LEAD_DMG, STONE_BASE_ENCH + LEAD_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_RUBY_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + RUBY_USES, STONE_BASE_SPEED + RUBY_SPEED, STONE_BASE_DMG + RUBY_DMG, STONE_BASE_ENCH + RUBY_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_SAPPHIRE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + SAPPHIRE_USES, STONE_BASE_SPEED + SAPPHIRE_SPEED, STONE_BASE_DMG + SAPPHIRE_DMG, STONE_BASE_ENCH + SAPPHIRE_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_TOPAZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + TOPAZ_USES, STONE_BASE_SPEED + TOPAZ_SPEED, STONE_BASE_DMG + TOPAZ_DMG, STONE_BASE_ENCH + TOPAZ_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_PERIDOT_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + PERIDOT_USES, STONE_BASE_SPEED + PERIDOT_SPEED, STONE_BASE_DMG + PERIDOT_DMG, STONE_BASE_ENCH + PERIDOT_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_CINNABAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + CINNABAR_USES, STONE_BASE_SPEED + CINNABAR_SPEED, STONE_BASE_DMG + CINNABAR_DMG, STONE_BASE_ENCH + CINNABAR_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_FLUORITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + FLUORITE_USES, STONE_BASE_SPEED + FLUORITE_SPEED, STONE_BASE_DMG + FLUORITE_DMG, STONE_BASE_ENCH + FLUORITE_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_VIBRANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + VIBRANIUM_USES, STONE_BASE_SPEED + VIBRANIUM_SPEED, STONE_BASE_DMG + VIBRANIUM_DMG, STONE_BASE_ENCH + VIBRANIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_UNOBTAINIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + UNOBTAINIUM_USES, STONE_BASE_SPEED + UNOBTAINIUM_SPEED, STONE_BASE_DMG + UNOBTAINIUM_DMG, STONE_BASE_ENCH + UNOBTAINIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_ALLTHEMODIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + ALLTHEMODIUM_USES, STONE_BASE_SPEED + ALLTHEMODIUM_SPEED, STONE_BASE_DMG + ALLTHEMODIUM_DMG, STONE_BASE_ENCH + ALLTHEMODIUM_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_CERTUS_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + CERTUS_QUARTZ_USES, STONE_BASE_SPEED + CERTUS_QUARTZ_SPEED, STONE_BASE_DMG + CERTUS_QUARTZ_DMG, STONE_BASE_ENCH + CERTUS_QUARTZ_ENCH, ItemTags.STONE_TOOL_MATERIALS);
    public static ToolMaterial STONE_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, STONE_BASE_USES + QUARTZ_USES, STONE_BASE_SPEED + QUARTZ_SPEED, STONE_BASE_DMG + QUARTZ_DMG, STONE_BASE_ENCH + QUARTZ_ENCH, ItemTags.STONE_TOOL_MATERIALS);

    public static ToolMaterial IRON_BONE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + BONE_USES, IRON_BASE_SPEED + BONE_SPEED, IRON_BASE_DMG + BONE_DMG, IRON_BASE_ENCH + BONE_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_COPPER_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + COPPER_USES, IRON_BASE_SPEED + COPPER_SPEED, IRON_BASE_DMG + COPPER_DMG, IRON_BASE_ENCH + COPPER_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ADVANCED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ADVANCED_USES, IRON_BASE_SPEED + ADVANCED_SPEED, IRON_BASE_DMG + ADVANCED_DMG, IRON_BASE_ENCH + ADVANCED_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ENCHANTED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ENCHANTED_USES, IRON_BASE_SPEED + ENCHANTED_SPEED, IRON_BASE_DMG + ENCHANTED_DMG, IRON_BASE_ENCH + ENCHANTED_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_BLAZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + BLAZEROD_USES, IRON_BASE_SPEED + BLAZEROD_SPEED, IRON_BASE_DMG + BLAZEROD_DMG, IRON_BASE_ENCH + BLAZEROD_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_EMERALD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + EMERALD_USES, IRON_BASE_SPEED + EMERALD_SPEED, IRON_BASE_DMG + EMERALD_DMG, IRON_BASE_ENCH + EMERALD_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_AMETHYST_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + AMETHYST_USES, IRON_BASE_SPEED + AMETHYST_SPEED, IRON_BASE_DMG + AMETHYST_DMG, IRON_BASE_ENCH + AMETHYST_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ENDROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ENDROD_USES, IRON_BASE_SPEED + ENDROD_SPEED, IRON_BASE_DMG + ENDROD_DMG, IRON_BASE_ENCH + ENDROD_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_IRON_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + IRON_USES, IRON_BASE_SPEED + IRON_SPEED, IRON_BASE_DMG + IRON_DMG, IRON_BASE_ENCH + IRON_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_GOLD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + GOLD_USES, IRON_BASE_SPEED + GOLD_SPEED, IRON_BASE_DMG + GOLD_DMG, IRON_BASE_ENCH + GOLD_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_DIAMOND_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + DIAMOND_USES, IRON_BASE_SPEED + DIAMOND_SPEED, IRON_BASE_DMG + DIAMOND_DMG, IRON_BASE_ENCH + DIAMOND_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_NETHERITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + NETHERITE_USES, IRON_BASE_SPEED + NETHERITE_SPEED, IRON_BASE_DMG + NETHERITE_DMG, IRON_BASE_ENCH + NETHERITE_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_BREEZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + BREEZEROD_USES, IRON_BASE_SPEED + BREEZEROD_SPEED, IRON_BASE_DMG + BREEZEROD_DMG, IRON_BASE_ENCH + BREEZEROD_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ALUMINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ALUMINUM_USES, IRON_BASE_SPEED + ALUMINUM_SPEED, IRON_BASE_DMG + ALUMINUM_DMG, IRON_BASE_ENCH + ALUMINUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ELECTRUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ELECTRUM_USES, IRON_BASE_SPEED + ELECTRUM_SPEED, IRON_BASE_DMG + ELECTRUM_DMG, IRON_BASE_ENCH + ELECTRUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_TIN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + TIN_USES, IRON_BASE_SPEED + TIN_SPEED, IRON_BASE_DMG + TIN_DMG, IRON_BASE_ENCH + TIN_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_BRASS_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + BRASS_USES, IRON_BASE_SPEED + BRASS_SPEED, IRON_BASE_DMG + BRASS_DMG, IRON_BASE_ENCH + BRASS_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_BRONZE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + BRONZE_USES, IRON_BASE_SPEED + BRONZE_SPEED, IRON_BASE_DMG + BRONZE_DMG, IRON_BASE_ENCH + BRONZE_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_CONSTANTAN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + CONSTANTAN_USES, IRON_BASE_SPEED + CONSTANTAN_SPEED, IRON_BASE_DMG + CONSTANTAN_DMG, IRON_BASE_ENCH + CONSTANTAN_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_NICKEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + NICKEL_USES, IRON_BASE_SPEED + NICKEL_SPEED, IRON_BASE_DMG + NICKEL_DMG, IRON_BASE_ENCH + NICKEL_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_INVAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + INVAR_USES, IRON_BASE_SPEED + INVAR_SPEED, IRON_BASE_DMG + INVAR_DMG, IRON_BASE_ENCH + INVAR_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_STEEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + STEEL_USES, IRON_BASE_SPEED + STEEL_SPEED, IRON_BASE_DMG + STEEL_DMG, IRON_BASE_ENCH + STEEL_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_LUMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + LUMIUM_USES, IRON_BASE_SPEED + LUMIUM_SPEED, IRON_BASE_DMG + LUMIUM_DMG, IRON_BASE_ENCH + LUMIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_IRIDIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + IRIDIUM_USES, IRON_BASE_SPEED + IRIDIUM_SPEED, IRON_BASE_DMG + IRIDIUM_DMG, IRON_BASE_ENCH + IRIDIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_OSMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + OSMIUM_USES, IRON_BASE_SPEED + OSMIUM_SPEED, IRON_BASE_DMG + OSMIUM_DMG, IRON_BASE_ENCH + OSMIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_PLATINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + PLATINUM_USES, IRON_BASE_SPEED + PLATINUM_SPEED, IRON_BASE_DMG + PLATINUM_DMG, IRON_BASE_ENCH + PLATINUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ENDERIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ENDERIUM_USES, IRON_BASE_SPEED + ENDERIUM_SPEED, IRON_BASE_DMG + ENDERIUM_DMG, IRON_BASE_ENCH + ENDERIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_URANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + URANIUM_USES, IRON_BASE_SPEED + URANIUM_SPEED, IRON_BASE_DMG + URANIUM_DMG, IRON_BASE_ENCH + URANIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_SIGNALUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + SIGNALUM_USES, IRON_BASE_SPEED + SIGNALUM_SPEED, IRON_BASE_DMG + SIGNALUM_DMG, IRON_BASE_ENCH + SIGNALUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_LEAD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + LEAD_USES, IRON_BASE_SPEED + LEAD_SPEED, IRON_BASE_DMG + LEAD_DMG, IRON_BASE_ENCH + LEAD_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_RUBY_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + RUBY_USES, IRON_BASE_SPEED + RUBY_SPEED, IRON_BASE_DMG + RUBY_DMG, IRON_BASE_ENCH + RUBY_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_SAPPHIRE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + SAPPHIRE_USES, IRON_BASE_SPEED + SAPPHIRE_SPEED, IRON_BASE_DMG + SAPPHIRE_DMG, IRON_BASE_ENCH + SAPPHIRE_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_TOPAZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + TOPAZ_USES, IRON_BASE_SPEED + TOPAZ_SPEED, IRON_BASE_DMG + TOPAZ_DMG, IRON_BASE_ENCH + TOPAZ_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_PERIDOT_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + PERIDOT_USES, IRON_BASE_SPEED + PERIDOT_SPEED, IRON_BASE_DMG + PERIDOT_DMG, IRON_BASE_ENCH + PERIDOT_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_CINNABAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + CINNABAR_USES, IRON_BASE_SPEED + CINNABAR_SPEED, IRON_BASE_DMG + CINNABAR_DMG, IRON_BASE_ENCH + CINNABAR_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_FLUORITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + FLUORITE_USES, IRON_BASE_SPEED + FLUORITE_SPEED, IRON_BASE_DMG + FLUORITE_DMG, IRON_BASE_ENCH + FLUORITE_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_VIBRANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + VIBRANIUM_USES, IRON_BASE_SPEED + VIBRANIUM_SPEED, IRON_BASE_DMG + VIBRANIUM_DMG, IRON_BASE_ENCH + VIBRANIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_UNOBTAINIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + UNOBTAINIUM_USES, IRON_BASE_SPEED + UNOBTAINIUM_SPEED, IRON_BASE_DMG + UNOBTAINIUM_DMG, IRON_BASE_ENCH + UNOBTAINIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_ALLTHEMODIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + ALLTHEMODIUM_USES, IRON_BASE_SPEED + ALLTHEMODIUM_SPEED, IRON_BASE_DMG + ALLTHEMODIUM_DMG, IRON_BASE_ENCH + ALLTHEMODIUM_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_CERTUS_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + CERTUS_QUARTZ_USES, IRON_BASE_SPEED + CERTUS_QUARTZ_SPEED, IRON_BASE_DMG + CERTUS_QUARTZ_DMG, IRON_BASE_ENCH + CERTUS_QUARTZ_ENCH, Tags.Items.INGOTS_IRON);
    public static ToolMaterial IRON_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, IRON_BASE_USES + QUARTZ_USES, IRON_BASE_SPEED + QUARTZ_SPEED, IRON_BASE_DMG + QUARTZ_DMG, IRON_BASE_ENCH + QUARTZ_ENCH, Tags.Items.INGOTS_IRON);

    public static ToolMaterial GOLD_BONE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + BONE_USES, IRON_BASE_SPEED + BONE_SPEED, GOLD_BASE_DMG + BONE_DMG, GOLD_BASE_ENCH + BONE_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_COPPER_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + COPPER_USES, IRON_BASE_SPEED + COPPER_SPEED, GOLD_BASE_DMG + COPPER_DMG, GOLD_BASE_ENCH + COPPER_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ADVANCED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ADVANCED_USES, IRON_BASE_SPEED + ADVANCED_SPEED, GOLD_BASE_DMG + ADVANCED_DMG, GOLD_BASE_ENCH + ADVANCED_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ENCHANTED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ENCHANTED_USES, GOLD_BASE_SPEED + ENCHANTED_SPEED, GOLD_BASE_DMG + ENCHANTED_DMG, GOLD_BASE_ENCH + ENCHANTED_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_BLAZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + BLAZEROD_USES, GOLD_BASE_SPEED + BLAZEROD_SPEED, GOLD_BASE_DMG + BLAZEROD_DMG, GOLD_BASE_ENCH + BLAZEROD_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_EMERALD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + EMERALD_USES, GOLD_BASE_SPEED + EMERALD_SPEED, GOLD_BASE_DMG + EMERALD_DMG, GOLD_BASE_ENCH + EMERALD_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_AMETHYST_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + AMETHYST_USES, GOLD_BASE_SPEED + AMETHYST_SPEED, GOLD_BASE_DMG + AMETHYST_DMG, GOLD_BASE_ENCH + AMETHYST_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ENDROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ENDROD_USES, GOLD_BASE_SPEED + ENDROD_SPEED, GOLD_BASE_DMG + ENDROD_DMG, GOLD_BASE_ENCH + ENDROD_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_IRON_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + IRON_USES, IRON_BASE_SPEED + IRON_SPEED, GOLD_BASE_DMG + IRON_DMG, GOLD_BASE_ENCH + IRON_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_GOLD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + GOLD_USES, IRON_BASE_SPEED + GOLD_SPEED, GOLD_BASE_DMG + GOLD_DMG, GOLD_BASE_ENCH + GOLD_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_DIAMOND_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + DIAMOND_USES, GOLD_BASE_SPEED + DIAMOND_SPEED, GOLD_BASE_DMG + DIAMOND_DMG, GOLD_BASE_ENCH + DIAMOND_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_NETHERITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + NETHERITE_USES, GOLD_BASE_SPEED + NETHERITE_SPEED, GOLD_BASE_DMG + NETHERITE_DMG, GOLD_BASE_ENCH + NETHERITE_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_BREEZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + BREEZEROD_USES, GOLD_BASE_SPEED + BREEZEROD_SPEED, GOLD_BASE_DMG + BREEZEROD_DMG, GOLD_BASE_ENCH + BREEZEROD_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ALUMINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ALUMINUM_USES, GOLD_BASE_SPEED + ALUMINUM_SPEED, GOLD_BASE_DMG + ALUMINUM_DMG, GOLD_BASE_ENCH + ALUMINUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ELECTRUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ELECTRUM_USES, GOLD_BASE_SPEED + ELECTRUM_SPEED, GOLD_BASE_DMG + ELECTRUM_DMG, GOLD_BASE_ENCH + ELECTRUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_TIN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + TIN_USES, GOLD_BASE_SPEED + TIN_SPEED, GOLD_BASE_DMG + TIN_DMG, GOLD_BASE_ENCH + TIN_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_BRASS_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + BRASS_USES, GOLD_BASE_SPEED + BRASS_SPEED, GOLD_BASE_DMG + BRASS_DMG, GOLD_BASE_ENCH + BRASS_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_BRONZE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + BRONZE_USES, GOLD_BASE_SPEED + BRONZE_SPEED, GOLD_BASE_DMG + BRONZE_DMG, GOLD_BASE_ENCH + BRONZE_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_CONSTANTAN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + CONSTANTAN_USES, GOLD_BASE_SPEED + CONSTANTAN_SPEED, GOLD_BASE_DMG + CONSTANTAN_DMG, GOLD_BASE_ENCH + CONSTANTAN_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_NICKEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + NICKEL_USES, GOLD_BASE_SPEED + NICKEL_SPEED, GOLD_BASE_DMG + NICKEL_DMG, GOLD_BASE_ENCH + NICKEL_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_INVAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + INVAR_USES, GOLD_BASE_SPEED + INVAR_SPEED, GOLD_BASE_DMG + INVAR_DMG, GOLD_BASE_ENCH + INVAR_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_STEEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + STEEL_USES, GOLD_BASE_SPEED + STEEL_SPEED, GOLD_BASE_DMG + STEEL_DMG, GOLD_BASE_ENCH + STEEL_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_LUMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + LUMIUM_USES, GOLD_BASE_SPEED + LUMIUM_SPEED, GOLD_BASE_DMG + LUMIUM_DMG, GOLD_BASE_ENCH + LUMIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_IRIDIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + IRIDIUM_USES, GOLD_BASE_SPEED + IRIDIUM_SPEED, GOLD_BASE_DMG + IRIDIUM_DMG, GOLD_BASE_ENCH + IRIDIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_OSMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + OSMIUM_USES, GOLD_BASE_SPEED + OSMIUM_SPEED, GOLD_BASE_DMG + OSMIUM_DMG, GOLD_BASE_ENCH + OSMIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_PLATINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + PLATINUM_USES, GOLD_BASE_SPEED + PLATINUM_SPEED, GOLD_BASE_DMG + PLATINUM_DMG, GOLD_BASE_ENCH + PLATINUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ENDERIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ENDERIUM_USES, GOLD_BASE_SPEED + ENDERIUM_SPEED, GOLD_BASE_DMG + ENDERIUM_DMG, GOLD_BASE_ENCH + ENDERIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_URANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + URANIUM_USES, GOLD_BASE_SPEED + URANIUM_SPEED, GOLD_BASE_DMG + URANIUM_DMG, GOLD_BASE_ENCH + URANIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_SIGNALUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + SIGNALUM_USES, GOLD_BASE_SPEED + SIGNALUM_SPEED, GOLD_BASE_DMG + SIGNALUM_DMG, GOLD_BASE_ENCH + SIGNALUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_LEAD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + LEAD_USES, GOLD_BASE_SPEED + LEAD_SPEED, GOLD_BASE_DMG + LEAD_DMG, GOLD_BASE_ENCH + LEAD_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_RUBY_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + RUBY_USES, GOLD_BASE_SPEED + RUBY_SPEED, GOLD_BASE_DMG + RUBY_DMG, GOLD_BASE_ENCH + RUBY_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_SAPPHIRE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + SAPPHIRE_USES, GOLD_BASE_SPEED + SAPPHIRE_SPEED, GOLD_BASE_DMG + SAPPHIRE_DMG, GOLD_BASE_ENCH + SAPPHIRE_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_TOPAZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + TOPAZ_USES, GOLD_BASE_SPEED + TOPAZ_SPEED, GOLD_BASE_DMG + TOPAZ_DMG, GOLD_BASE_ENCH + TOPAZ_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_PERIDOT_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + PERIDOT_USES, GOLD_BASE_SPEED + PERIDOT_SPEED, GOLD_BASE_DMG + PERIDOT_DMG, GOLD_BASE_ENCH + PERIDOT_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_CINNABAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + CINNABAR_USES, GOLD_BASE_SPEED + CINNABAR_SPEED, GOLD_BASE_DMG + CINNABAR_DMG, GOLD_BASE_ENCH + CINNABAR_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_FLUORITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + FLUORITE_USES, GOLD_BASE_SPEED + FLUORITE_SPEED, GOLD_BASE_DMG + FLUORITE_DMG, GOLD_BASE_ENCH + FLUORITE_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_VIBRANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + VIBRANIUM_USES, GOLD_BASE_SPEED + VIBRANIUM_SPEED, GOLD_BASE_DMG + VIBRANIUM_DMG, GOLD_BASE_ENCH + VIBRANIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_UNOBTAINIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + UNOBTAINIUM_USES, GOLD_BASE_SPEED + UNOBTAINIUM_SPEED, GOLD_BASE_DMG + UNOBTAINIUM_DMG, GOLD_BASE_ENCH + UNOBTAINIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_ALLTHEMODIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + ALLTHEMODIUM_USES, GOLD_BASE_SPEED + ALLTHEMODIUM_SPEED, GOLD_BASE_DMG + ALLTHEMODIUM_DMG, GOLD_BASE_ENCH + ALLTHEMODIUM_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_CERTUS_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + CERTUS_QUARTZ_USES, GOLD_BASE_SPEED + CERTUS_QUARTZ_SPEED, GOLD_BASE_DMG + CERTUS_QUARTZ_DMG, GOLD_BASE_ENCH + CERTUS_QUARTZ_ENCH, Tags.Items.INGOTS_GOLD);
    public static ToolMaterial GOLD_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, GOLD_BASE_USES + QUARTZ_USES, GOLD_BASE_SPEED + QUARTZ_SPEED, GOLD_BASE_DMG + QUARTZ_DMG, GOLD_BASE_ENCH + QUARTZ_ENCH, Tags.Items.INGOTS_GOLD);

    public static ToolMaterial DIAMOND_BONE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + BONE_USES, DIAMOND_BASE_SPEED + BONE_SPEED, DIAMOND_BASE_DMG + BONE_DMG, DIAMOND_BASE_ENCH + BONE_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_COPPER_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + COPPER_USES, DIAMOND_BASE_SPEED + COPPER_SPEED, DIAMOND_BASE_DMG + COPPER_DMG, DIAMOND_BASE_ENCH + COPPER_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ADVANCED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ADVANCED_USES, DIAMOND_BASE_SPEED + ADVANCED_SPEED, DIAMOND_BASE_DMG + ADVANCED_DMG, DIAMOND_BASE_ENCH + ADVANCED_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ENCHANTED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ENCHANTED_USES, DIAMOND_BASE_SPEED + ENCHANTED_SPEED, DIAMOND_BASE_DMG + ENCHANTED_DMG, DIAMOND_BASE_ENCH + ENCHANTED_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_BLAZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + BLAZEROD_USES, DIAMOND_BASE_SPEED + BLAZEROD_SPEED, DIAMOND_BASE_DMG + BLAZEROD_DMG, DIAMOND_BASE_ENCH + BLAZEROD_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_EMERALD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + EMERALD_USES, DIAMOND_BASE_SPEED + EMERALD_SPEED, DIAMOND_BASE_DMG + EMERALD_DMG, DIAMOND_BASE_ENCH + EMERALD_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_AMETHYST_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + AMETHYST_USES, DIAMOND_BASE_SPEED + AMETHYST_SPEED, DIAMOND_BASE_DMG + AMETHYST_DMG, DIAMOND_BASE_ENCH + AMETHYST_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ENDROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ENDROD_USES, DIAMOND_BASE_SPEED + ENDROD_SPEED, DIAMOND_BASE_DMG + ENDROD_DMG, DIAMOND_BASE_ENCH + ENDROD_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_IRON_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + IRON_USES, DIAMOND_BASE_SPEED + IRON_SPEED, DIAMOND_BASE_DMG + IRON_DMG, DIAMOND_BASE_ENCH + IRON_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_GOLD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + GOLD_USES, DIAMOND_BASE_SPEED + GOLD_SPEED, DIAMOND_BASE_DMG + GOLD_DMG, DIAMOND_BASE_ENCH + GOLD_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_DIAMOND_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + DIAMOND_USES, DIAMOND_BASE_SPEED + DIAMOND_SPEED, DIAMOND_BASE_DMG + DIAMOND_DMG, DIAMOND_BASE_ENCH + DIAMOND_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_NETHERITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + NETHERITE_USES, DIAMOND_BASE_SPEED + NETHERITE_SPEED, DIAMOND_BASE_DMG + NETHERITE_DMG, DIAMOND_BASE_ENCH + NETHERITE_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_BREEZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + BREEZEROD_USES, DIAMOND_BASE_SPEED + BREEZEROD_SPEED, DIAMOND_BASE_DMG + BREEZEROD_DMG, DIAMOND_BASE_ENCH + BREEZEROD_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ALUMINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ALUMINUM_USES, DIAMOND_BASE_SPEED + ALUMINUM_SPEED, DIAMOND_BASE_DMG + ALUMINUM_DMG, DIAMOND_BASE_ENCH + ALUMINUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ELECTRUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ELECTRUM_USES, DIAMOND_BASE_SPEED + ELECTRUM_SPEED, DIAMOND_BASE_DMG + ELECTRUM_DMG, DIAMOND_BASE_ENCH + ELECTRUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_TIN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + TIN_USES, DIAMOND_BASE_SPEED + TIN_SPEED, DIAMOND_BASE_DMG + TIN_DMG, DIAMOND_BASE_ENCH + TIN_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_BRASS_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + BRASS_USES, DIAMOND_BASE_SPEED + BRASS_SPEED, DIAMOND_BASE_DMG + BRASS_DMG, DIAMOND_BASE_ENCH + BRASS_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_BRONZE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + BRONZE_USES, DIAMOND_BASE_SPEED + BRONZE_SPEED, DIAMOND_BASE_DMG + BRONZE_DMG, DIAMOND_BASE_ENCH + BRONZE_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_CONSTANTAN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + CONSTANTAN_USES, DIAMOND_BASE_SPEED + CONSTANTAN_SPEED, DIAMOND_BASE_DMG + CONSTANTAN_DMG, DIAMOND_BASE_ENCH + CONSTANTAN_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_NICKEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + NICKEL_USES, DIAMOND_BASE_SPEED + NICKEL_SPEED, DIAMOND_BASE_DMG + NICKEL_DMG, DIAMOND_BASE_ENCH + NICKEL_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_INVAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + INVAR_USES, DIAMOND_BASE_SPEED + INVAR_SPEED, DIAMOND_BASE_DMG + INVAR_DMG, DIAMOND_BASE_ENCH + INVAR_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_STEEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + STEEL_USES, DIAMOND_BASE_SPEED + STEEL_SPEED, DIAMOND_BASE_DMG + STEEL_DMG, DIAMOND_BASE_ENCH + STEEL_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_LUMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + LUMIUM_USES, DIAMOND_BASE_SPEED + LUMIUM_SPEED, DIAMOND_BASE_DMG + LUMIUM_DMG, DIAMOND_BASE_ENCH + LUMIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_IRIDIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + IRIDIUM_USES, DIAMOND_BASE_SPEED + IRIDIUM_SPEED, DIAMOND_BASE_DMG + IRIDIUM_DMG, DIAMOND_BASE_ENCH + IRIDIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_OSMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + OSMIUM_USES, DIAMOND_BASE_SPEED + OSMIUM_SPEED, DIAMOND_BASE_DMG + OSMIUM_DMG, DIAMOND_BASE_ENCH + OSMIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_PLATINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + PLATINUM_USES, DIAMOND_BASE_SPEED + PLATINUM_SPEED, DIAMOND_BASE_DMG + PLATINUM_DMG, DIAMOND_BASE_ENCH + PLATINUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ENDERIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ENDERIUM_USES, DIAMOND_BASE_SPEED + ENDERIUM_SPEED, DIAMOND_BASE_DMG + ENDERIUM_DMG, DIAMOND_BASE_ENCH + ENDERIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_URANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + URANIUM_USES, DIAMOND_BASE_SPEED + URANIUM_SPEED, DIAMOND_BASE_DMG + URANIUM_DMG, DIAMOND_BASE_ENCH + URANIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_SIGNALUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + SIGNALUM_USES, DIAMOND_BASE_SPEED + SIGNALUM_SPEED, DIAMOND_BASE_DMG + SIGNALUM_DMG, DIAMOND_BASE_ENCH + SIGNALUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_LEAD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + LEAD_USES, DIAMOND_BASE_SPEED + LEAD_SPEED, DIAMOND_BASE_DMG + LEAD_DMG, DIAMOND_BASE_ENCH + LEAD_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_RUBY_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + RUBY_USES, DIAMOND_BASE_SPEED + RUBY_SPEED, DIAMOND_BASE_DMG + RUBY_DMG, DIAMOND_BASE_ENCH + RUBY_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_SAPPHIRE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + SAPPHIRE_USES, DIAMOND_BASE_SPEED + SAPPHIRE_SPEED, DIAMOND_BASE_DMG + SAPPHIRE_DMG, DIAMOND_BASE_ENCH + SAPPHIRE_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_TOPAZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + TOPAZ_USES, DIAMOND_BASE_SPEED + TOPAZ_SPEED, DIAMOND_BASE_DMG + TOPAZ_DMG, DIAMOND_BASE_ENCH + TOPAZ_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_PERIDOT_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + PERIDOT_USES, DIAMOND_BASE_SPEED + PERIDOT_SPEED, DIAMOND_BASE_DMG + PERIDOT_DMG, DIAMOND_BASE_ENCH + PERIDOT_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_CINNABAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + CINNABAR_USES, DIAMOND_BASE_SPEED + CINNABAR_SPEED, DIAMOND_BASE_DMG + CINNABAR_DMG, DIAMOND_BASE_ENCH + CINNABAR_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_FLUORITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + FLUORITE_USES, DIAMOND_BASE_SPEED + FLUORITE_SPEED, DIAMOND_BASE_DMG + FLUORITE_DMG, DIAMOND_BASE_ENCH + FLUORITE_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_VIBRANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + VIBRANIUM_USES, DIAMOND_BASE_SPEED + VIBRANIUM_SPEED, DIAMOND_BASE_DMG + VIBRANIUM_DMG, DIAMOND_BASE_ENCH + VIBRANIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_UNOBTAINIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + UNOBTAINIUM_USES, DIAMOND_BASE_SPEED + UNOBTAINIUM_SPEED, DIAMOND_BASE_DMG + UNOBTAINIUM_DMG, DIAMOND_BASE_ENCH + UNOBTAINIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_ALLTHEMODIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + ALLTHEMODIUM_USES, DIAMOND_BASE_SPEED + ALLTHEMODIUM_SPEED, DIAMOND_BASE_DMG + ALLTHEMODIUM_DMG, DIAMOND_BASE_ENCH + ALLTHEMODIUM_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_CERTUS_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + CERTUS_QUARTZ_USES, DIAMOND_BASE_SPEED + CERTUS_QUARTZ_SPEED, DIAMOND_BASE_DMG + CERTUS_QUARTZ_DMG, DIAMOND_BASE_ENCH + CERTUS_QUARTZ_ENCH, Tags.Items.GEMS_DIAMOND);
    public static ToolMaterial DIAMOND_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, DIAMOND_BASE_USES + QUARTZ_USES, DIAMOND_BASE_SPEED + QUARTZ_SPEED, DIAMOND_BASE_DMG + QUARTZ_DMG, DIAMOND_BASE_ENCH + QUARTZ_ENCH, Tags.Items.GEMS_DIAMOND);

    public static ToolMaterial NETHERITE_BONE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + BONE_USES, NETHERITE_BASE_SPEED + BONE_SPEED, NETHERITE_BASE_DMG + BONE_DMG, NETHERITE_BASE_ENCH + BONE_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_COPPER_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + COPPER_USES, NETHERITE_BASE_SPEED + COPPER_SPEED, NETHERITE_BASE_DMG + COPPER_DMG, NETHERITE_BASE_ENCH + COPPER_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ADVANCED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ADVANCED_USES, NETHERITE_BASE_SPEED + ADVANCED_SPEED, NETHERITE_BASE_DMG + ADVANCED_DMG, NETHERITE_BASE_ENCH + ADVANCED_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ENCHANTED_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ENCHANTED_USES, NETHERITE_BASE_SPEED + ENCHANTED_SPEED, NETHERITE_BASE_DMG + ENCHANTED_DMG, NETHERITE_BASE_ENCH + ENCHANTED_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_BLAZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + BLAZEROD_USES, NETHERITE_BASE_SPEED + BLAZEROD_SPEED, NETHERITE_BASE_DMG + BLAZEROD_DMG, NETHERITE_BASE_ENCH + BLAZEROD_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_EMERALD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + EMERALD_USES, NETHERITE_BASE_SPEED + EMERALD_SPEED, NETHERITE_BASE_DMG + EMERALD_DMG, NETHERITE_BASE_ENCH + EMERALD_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_AMETHYST_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + AMETHYST_USES, NETHERITE_BASE_SPEED + AMETHYST_SPEED, NETHERITE_BASE_DMG + AMETHYST_DMG, NETHERITE_BASE_ENCH + AMETHYST_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ENDROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ENDROD_USES, NETHERITE_BASE_SPEED + ENDROD_SPEED, NETHERITE_BASE_DMG + ENDROD_DMG, NETHERITE_BASE_ENCH + ENDROD_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_IRON_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + IRON_USES, NETHERITE_BASE_SPEED + IRON_SPEED, NETHERITE_BASE_DMG + IRON_DMG, NETHERITE_BASE_ENCH + IRON_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_GOLD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + GOLD_USES, NETHERITE_BASE_SPEED + GOLD_SPEED, NETHERITE_BASE_DMG + GOLD_DMG, NETHERITE_BASE_ENCH + GOLD_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_DIAMOND_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + DIAMOND_USES, NETHERITE_BASE_SPEED + DIAMOND_SPEED, NETHERITE_BASE_DMG + DIAMOND_DMG, NETHERITE_BASE_ENCH + DIAMOND_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_NETHERITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + NETHERITE_USES, NETHERITE_BASE_SPEED + NETHERITE_SPEED, NETHERITE_BASE_DMG + NETHERITE_DMG, NETHERITE_BASE_ENCH + NETHERITE_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_BREEZEROD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + BREEZEROD_USES, NETHERITE_BASE_SPEED + BREEZEROD_SPEED, NETHERITE_BASE_DMG + BREEZEROD_DMG, NETHERITE_BASE_ENCH + BREEZEROD_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ALUMINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ALUMINUM_USES, NETHERITE_BASE_SPEED + ALUMINUM_SPEED, NETHERITE_BASE_DMG + ALUMINUM_DMG, NETHERITE_BASE_ENCH + ALUMINUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ELECTRUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ELECTRUM_USES, NETHERITE_BASE_SPEED + ELECTRUM_SPEED, NETHERITE_BASE_DMG + ELECTRUM_DMG, NETHERITE_BASE_ENCH + ELECTRUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_TIN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + TIN_USES, NETHERITE_BASE_SPEED + TIN_SPEED, NETHERITE_BASE_DMG + TIN_DMG, NETHERITE_BASE_ENCH + TIN_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_BRASS_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + BRASS_USES, NETHERITE_BASE_SPEED + BRASS_SPEED, NETHERITE_BASE_DMG + BRASS_DMG, NETHERITE_BASE_ENCH + BRASS_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_BRONZE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + BRONZE_USES, NETHERITE_BASE_SPEED + BRONZE_SPEED, NETHERITE_BASE_DMG + BRONZE_DMG, NETHERITE_BASE_ENCH + BRONZE_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_CONSTANTAN_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + CONSTANTAN_USES, NETHERITE_BASE_SPEED + CONSTANTAN_SPEED, NETHERITE_BASE_DMG + CONSTANTAN_DMG, NETHERITE_BASE_ENCH + CONSTANTAN_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_NICKEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + NICKEL_USES, NETHERITE_BASE_SPEED + NICKEL_SPEED, NETHERITE_BASE_DMG + NICKEL_DMG, NETHERITE_BASE_ENCH + NICKEL_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_INVAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + INVAR_USES, NETHERITE_BASE_SPEED + INVAR_SPEED, NETHERITE_BASE_DMG + INVAR_DMG, NETHERITE_BASE_ENCH + INVAR_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_STEEL_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + STEEL_USES, NETHERITE_BASE_SPEED + STEEL_SPEED, NETHERITE_BASE_DMG + STEEL_DMG, NETHERITE_BASE_ENCH + STEEL_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_LUMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + LUMIUM_USES, NETHERITE_BASE_SPEED + LUMIUM_SPEED, NETHERITE_BASE_DMG + LUMIUM_DMG, NETHERITE_BASE_ENCH + LUMIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_IRIDIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + IRIDIUM_USES, NETHERITE_BASE_SPEED + IRIDIUM_SPEED, NETHERITE_BASE_DMG + IRIDIUM_DMG, NETHERITE_BASE_ENCH + IRIDIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_OSMIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + OSMIUM_USES, NETHERITE_BASE_SPEED + OSMIUM_SPEED, NETHERITE_BASE_DMG + OSMIUM_DMG, NETHERITE_BASE_ENCH + OSMIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_PLATINUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + PLATINUM_USES, NETHERITE_BASE_SPEED + PLATINUM_SPEED, NETHERITE_BASE_DMG + PLATINUM_DMG, NETHERITE_BASE_ENCH + PLATINUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ENDERIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ENDERIUM_USES, NETHERITE_BASE_SPEED + ENDERIUM_SPEED, NETHERITE_BASE_DMG + ENDERIUM_DMG, NETHERITE_BASE_ENCH + ENDERIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_URANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + URANIUM_USES, NETHERITE_BASE_SPEED + URANIUM_SPEED, NETHERITE_BASE_DMG + URANIUM_DMG, NETHERITE_BASE_ENCH + URANIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_SIGNALUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + SIGNALUM_USES, NETHERITE_BASE_SPEED + SIGNALUM_SPEED, NETHERITE_BASE_DMG + SIGNALUM_DMG, NETHERITE_BASE_ENCH + SIGNALUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_LEAD_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + LEAD_USES, NETHERITE_BASE_SPEED + LEAD_SPEED, NETHERITE_BASE_DMG + LEAD_DMG, NETHERITE_BASE_ENCH + LEAD_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_RUBY_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + RUBY_USES, NETHERITE_BASE_SPEED + RUBY_SPEED, NETHERITE_BASE_DMG + RUBY_DMG, NETHERITE_BASE_ENCH + RUBY_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_SAPPHIRE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + SAPPHIRE_USES, NETHERITE_BASE_SPEED + SAPPHIRE_SPEED, NETHERITE_BASE_DMG + SAPPHIRE_DMG, NETHERITE_BASE_ENCH + SAPPHIRE_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_TOPAZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + TOPAZ_USES, NETHERITE_BASE_SPEED + TOPAZ_SPEED, NETHERITE_BASE_DMG + TOPAZ_DMG, NETHERITE_BASE_ENCH + TOPAZ_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_PERIDOT_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + PERIDOT_USES, NETHERITE_BASE_SPEED + PERIDOT_SPEED, NETHERITE_BASE_DMG + PERIDOT_DMG, NETHERITE_BASE_ENCH + PERIDOT_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_CINNABAR_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + CINNABAR_USES, NETHERITE_BASE_SPEED + CINNABAR_SPEED, NETHERITE_BASE_DMG + CINNABAR_DMG, NETHERITE_BASE_ENCH + CINNABAR_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_FLUORITE_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + FLUORITE_USES, NETHERITE_BASE_SPEED + FLUORITE_SPEED, NETHERITE_BASE_DMG + FLUORITE_DMG, NETHERITE_BASE_ENCH + FLUORITE_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_VIBRANIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + VIBRANIUM_USES, NETHERITE_BASE_SPEED + VIBRANIUM_SPEED, NETHERITE_BASE_DMG + VIBRANIUM_DMG, NETHERITE_BASE_ENCH + VIBRANIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_UNOBTAINIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + UNOBTAINIUM_USES, NETHERITE_BASE_SPEED + UNOBTAINIUM_SPEED, NETHERITE_BASE_DMG + UNOBTAINIUM_DMG, NETHERITE_BASE_ENCH + UNOBTAINIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_ALLTHEMODIUM_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + ALLTHEMODIUM_USES, NETHERITE_BASE_SPEED + ALLTHEMODIUM_SPEED, NETHERITE_BASE_DMG + ALLTHEMODIUM_DMG, NETHERITE_BASE_ENCH + ALLTHEMODIUM_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_CERTUS_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + CERTUS_QUARTZ_USES, NETHERITE_BASE_SPEED + CERTUS_QUARTZ_SPEED, NETHERITE_BASE_DMG + CERTUS_QUARTZ_DMG, NETHERITE_BASE_ENCH + CERTUS_QUARTZ_ENCH, Tags.Items.INGOTS_NETHERITE);
    public static ToolMaterial NETHERITE_QUARTZ_TM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, NETHERITE_BASE_USES + QUARTZ_USES, NETHERITE_BASE_SPEED + QUARTZ_SPEED, NETHERITE_BASE_DMG + QUARTZ_DMG, NETHERITE_BASE_ENCH + QUARTZ_ENCH, Tags.Items.INGOTS_NETHERITE);

}

