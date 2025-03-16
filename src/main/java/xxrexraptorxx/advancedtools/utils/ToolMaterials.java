package xxrexraptorxx.advancedtools.utils;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.common.Tags;

import java.util.HashMap;
import java.util.Map;

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

    private static final int   END_USES  = 133;
    private static final float END_SPEED = 5.3f;
    private static final float END_DMG   = 1.7f;
    private static final int   END_ENCH  = 17;

    private static final int   BLAZE_USES  = 120;
    private static final float BLAZE_SPEED = 4.2f;
    private static final float BLAZE_DMG   = 1.5f;
    private static final int   BLAZE_ENCH  = 15;

    private static final int   BREEZE_USES  = 110;
    private static final float BREEZE_SPEED = 5.0f;
    private static final float BREEZE_DMG   = 0.5f;
    private static final int   BREEZE_ENCH  = 13;

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

    private static final int   CERTUSQUARTZ_USES = 60;
    private static final float CERTUSQUARTZ_SPEED = 6.5f;
    private static final float CERTUSQUARTZ_DMG   = 0.8f;
    private static final int   CERTUSQUARTZ_ENCH  = 28;

    private static final int   ALLTHEMODIUM_USES = 3200;
    private static final float ALLTHEMODIUM_SPEED = 7.0f;
    private static final float ALLTHEMODIUM_DMG   = 5.0f;
    private static final int   ALLTHEMODIUM_ENCH  = 8;

    private static final int   COBALT_USES  = 1100;
    private static final float COBALT_SPEED = 4.4f;
    private static final float COBALT_DMG   = 2.3f;
    private static final int   COBALT_ENCH  = 8;

    private static final int   TITANIUM_USES  = 1200;
    private static final float TITANIUM_SPEED = 4.5f;
    private static final float TITANIUM_DMG   = 2.4f;
    private static final int   TITANIUM_ENCH  = 9;

    private static final int   ZINC_USES       = 110;
    private static final float ZINC_SPEED      = 4.0f;
    private static final float ZINC_DMG        = 1.0f;
    private static final int   ZINC_ENCH       = 7;

    private static final int   WITHER_BONE_USES  = 80;
    private static final float WITHER_BONE_SPEED = 4.5f;
    private static final float WITHER_BONE_DMG   = 2.0f;
    private static final int   WITHER_BONE_ENCH  = 12;

    private static final int   ADAMANT_USES    = 1800;
    private static final float ADAMANT_SPEED   = 4.0f;
    private static final float ADAMANT_DMG     = 3.2f;
    private static final int   ADAMANT_ENCH    = 6;

    private static final int   TERRASTEEL_USES = 1500;
    private static final float TERRASTEEL_SPEED= 5.2f;
    private static final float TERRASTEEL_DMG  = 2.7f;
    private static final int   TERRASTEEL_ENCH = 14;

    private static final int   BIOSTEEL_USES   = 550;
    private static final float BIOSTEEL_SPEED  = 4.0f;
    private static final float BIOSTEEL_DMG    = 1.9f;
    private static final int   BIOSTEEL_ENCH   = 15;

    private static final int   DURATIUM_USES   = 2000;
    private static final float DURATIUM_SPEED  = 3.5f;
    private static final float DURATIUM_DMG    = 3.0f;
    private static final int   DURATIUM_ENCH   = 5;

    private static final int   ENERGITE_USES   = 400;
    private static final float ENERGITE_SPEED  = 7.0f;
    private static final float ENERGITE_DMG    = 2.0f;
    private static final int   ENERGITE_ENCH   = 22;

    private static final int   FLUIX_CRYSTAL_USES = 50;
    private static final float FLUIX_CRYSTAL_SPEED= 6.0f;
    private static final float FLUIX_CRYSTAL_DMG  = 0.5f;
    private static final int   FLUIX_CRYSTAL_ENCH = 30;

    private static final int   CARBON_USES     = 1000;
    private static final float CARBON_SPEED    = 5.5f;
    private static final float CARBON_DMG      = 2.0f;
    private static final int   CARBON_ENCH     = 14;

    private static final int   OBSIDIAN_USES   = 2500;
    private static final float OBSIDIAN_SPEED  = 2.0f;
    private static final float OBSIDIAN_DMG    = 2.0f;
    private static final int   OBSIDIAN_ENCH   = 8;

    private static final int   BEDROCK_USES    = 10000;
    private static final float BEDROCK_SPEED   = 1.0f;
    private static final float BEDROCK_DMG     = 2.5f;
    private static final int   BEDROCK_ENCH    = 2;

    private static final int   ELEMENTUM_USES  = 800;
    private static final float ELEMENTUM_SPEED = 5.0f;
    private static final float ELEMENTUM_DMG   = 2.2f;
    private static final int   ELEMENTUM_ENCH  = 16;

    private static final int   MANASTEEL_USES  = 700;
    private static final float MANASTEEL_SPEED = 4.8f;
    private static final float MANASTEEL_DMG   = 2.0f;
    private static final int   MANASTEEL_ENCH  = 30;

    private static final int   GRAPHIT_USES    = 300;
    private static final float GRAPHIT_SPEED   = 5.0f;
    private static final float GRAPHIT_DMG     = 1.8f;
    private static final int   GRAPHIT_ENCH    = 12;

    private static final int   HDPE_USES       = 80;
    private static final float HDPE_SPEED      = 6.0f;
    private static final float HDPE_DMG        = 0.5f;
    private static final int   HDPE_ENCH       = 1;

    private static final int   TUNGSTEN_USES   = 1800;
    private static final float TUNGSTEN_SPEED  = 3.8f;
    private static final float TUNGSTEN_DMG    = 3.0f;
    private static final int   TUNGSTEN_ENCH   = 5;


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


    public static final Map<String, ToolMaterial> TOOL_MATERIALS = new HashMap<>();
    public static final Map<String, Float> SPEED_MAP = new HashMap<>();


    public static void registerToolMaterials() {
        // Vanilla
        TOOL_MATERIALS.put("wood_wood", ToolMaterial.WOOD);
        TOOL_MATERIALS.put("stone_wood", ToolMaterial.STONE);
        TOOL_MATERIALS.put("iron_wood", ToolMaterial.IRON);
        TOOL_MATERIALS.put("gold_wood", ToolMaterial.GOLD);
        TOOL_MATERIALS.put("diamond_wood", ToolMaterial.DIAMOND);
        TOOL_MATERIALS.put("netherite_wood", ToolMaterial.NETHERITE);
        // Modded
        addMaterial("bone", BONE_USES, BONE_SPEED, BONE_DMG, BONE_ENCH);
        addMaterial("copper", COPPER_USES, COPPER_SPEED, COPPER_DMG, COPPER_ENCH);
        addMaterial("advanced", ADVANCED_USES, ADVANCED_SPEED, ADVANCED_DMG, ADVANCED_ENCH);
        addMaterial("enchanted", ENCHANTED_USES, ENCHANTED_SPEED, ENCHANTED_DMG, ENCHANTED_ENCH);
        addMaterial("blaze", BLAZE_USES, BLAZE_SPEED, BLAZE_DMG, BLAZE_ENCH);
        addMaterial("emerald", EMERALD_USES, EMERALD_SPEED, EMERALD_DMG, EMERALD_ENCH);
        addMaterial("amethyst", AMETHYST_USES, AMETHYST_SPEED, AMETHYST_DMG, AMETHYST_ENCH);
        addMaterial("end", END_USES, END_SPEED, END_DMG, END_ENCH);
        addMaterial("iron", IRON_USES, IRON_SPEED, IRON_DMG, IRON_ENCH);
        addMaterial("gold", GOLD_USES, GOLD_SPEED, GOLD_DMG, GOLD_ENCH);
        addMaterial("diamond", DIAMOND_USES, DIAMOND_SPEED, DIAMOND_DMG, DIAMOND_ENCH);
        addMaterial("netherite", NETHERITE_USES, NETHERITE_SPEED, NETHERITE_DMG, NETHERITE_ENCH);
        addMaterial("breeze", BREEZE_USES, BREEZE_SPEED, BREEZE_DMG, BREEZE_ENCH);
        addMaterial("aluminum", ALUMINUM_USES, ALUMINUM_SPEED, ALUMINUM_DMG, ALUMINUM_ENCH);
        addMaterial("electrum", ELECTRUM_USES, ELECTRUM_SPEED, ELECTRUM_DMG, ELECTRUM_ENCH);
        addMaterial("tin", TIN_USES, TIN_SPEED, TIN_DMG, TIN_ENCH);
        addMaterial("brass", BRASS_USES, BRASS_SPEED, BRASS_DMG, BRASS_ENCH);
        addMaterial("bronze", BRONZE_USES, BRONZE_SPEED, BRONZE_DMG, BRONZE_ENCH);
        addMaterial("constantan", CONSTANTAN_USES, CONSTANTAN_SPEED, CONSTANTAN_DMG, CONSTANTAN_ENCH);
        addMaterial("nickel", NICKEL_USES, NICKEL_SPEED, NICKEL_DMG, NICKEL_ENCH);
        addMaterial("invar", INVAR_USES, INVAR_SPEED, INVAR_DMG, INVAR_ENCH);
        addMaterial("steel", STEEL_USES, STEEL_SPEED, STEEL_DMG, STEEL_ENCH);
        addMaterial("lumium", LUMIUM_USES, LUMIUM_SPEED, LUMIUM_DMG, LUMIUM_ENCH);
        addMaterial("iridium", IRIDIUM_USES, IRIDIUM_SPEED, IRIDIUM_DMG, IRIDIUM_ENCH);
        addMaterial("osmium", OSMIUM_USES, OSMIUM_SPEED, OSMIUM_DMG, OSMIUM_ENCH);
        addMaterial("platinum", PLATINUM_USES, PLATINUM_SPEED, PLATINUM_DMG, PLATINUM_ENCH);
        addMaterial("enderium", ENDERIUM_USES, ENDERIUM_SPEED, ENDERIUM_DMG, ENDERIUM_ENCH);
        addMaterial("uranium", URANIUM_USES, URANIUM_SPEED, URANIUM_DMG, URANIUM_ENCH);
        addMaterial("signalum", SIGNALUM_USES, SIGNALUM_SPEED, SIGNALUM_DMG, SIGNALUM_ENCH);
        addMaterial("lead", LEAD_USES, LEAD_SPEED, LEAD_DMG, LEAD_ENCH);
        addMaterial("ruby", RUBY_USES, RUBY_SPEED, RUBY_DMG, RUBY_ENCH);
        addMaterial("sapphire", SAPPHIRE_USES, SAPPHIRE_SPEED, SAPPHIRE_DMG, SAPPHIRE_ENCH);
        addMaterial("topaz", TOPAZ_USES, TOPAZ_SPEED, TOPAZ_DMG, TOPAZ_ENCH);
        addMaterial("peridot", PERIDOT_USES, PERIDOT_SPEED, PERIDOT_DMG, PERIDOT_ENCH);
        addMaterial("cinnabar", CINNABAR_USES, CINNABAR_SPEED, CINNABAR_DMG, CINNABAR_ENCH);
        addMaterial("fluorite", FLUORITE_USES, FLUORITE_SPEED, FLUORITE_DMG, FLUORITE_ENCH);
        addMaterial("vibranium", VIBRANIUM_USES, VIBRANIUM_SPEED, VIBRANIUM_DMG, VIBRANIUM_ENCH);
        addMaterial("unobtainium", UNOBTAINIUM_USES, UNOBTAINIUM_SPEED, UNOBTAINIUM_DMG, UNOBTAINIUM_ENCH);
        addMaterial("allthemodium", ALLTHEMODIUM_USES, ALLTHEMODIUM_SPEED, ALLTHEMODIUM_DMG, ALLTHEMODIUM_ENCH);
        addMaterial("certusquartz", CERTUSQUARTZ_USES, CERTUSQUARTZ_SPEED, CERTUSQUARTZ_DMG, CERTUSQUARTZ_ENCH);
        addMaterial("quartz", QUARTZ_USES, QUARTZ_SPEED, QUARTZ_DMG, QUARTZ_ENCH);
        addMaterial("cobalt", COBALT_USES, COBALT_SPEED, COBALT_DMG, COBALT_ENCH);
        addMaterial("titanium", TITANIUM_USES, TITANIUM_SPEED, TITANIUM_DMG, TITANIUM_ENCH);
        addMaterial("zinc", ZINC_USES, ZINC_SPEED, ZINC_DMG, ZINC_ENCH);
    }


    public static void addMaterial(String name, int uses, float speed, float damage, int enchantability) {
        addWoodMaterial(name, uses, speed, damage, enchantability);
        addStoneMaterial(name, uses, speed, damage, enchantability);
        addIronMaterial(name, uses, speed, damage, enchantability);
        addGoldMaterial(name, uses, speed, damage, enchantability);
        addDiamondMaterial(name, uses, speed, damage, enchantability);
        addNetheriteMaterial(name, uses, speed, damage, enchantability);
    }


    private static void addWoodMaterial(String name, int uses, float speed, float damage, int enchantability) {
        String materialName = "wood_" + name;
        ToolMaterial material = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL,
                WOOD_BASE_USES + uses,
                WOOD_BASE_SPEED + speed,
                WOOD_BASE_DMG + damage,
                WOOD_BASE_ENCH + enchantability,
                ItemTags.WOODEN_TOOL_MATERIALS);
        TOOL_MATERIALS.put(materialName, material);
    }


    private static void addStoneMaterial(String name, int uses, float speed, float damage, int enchantability) {
        String materialName = "stone_" + name;
        ToolMaterial material = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL,
                STONE_BASE_USES + uses,
                STONE_BASE_SPEED + speed,
                STONE_BASE_DMG + damage,
                STONE_BASE_ENCH + enchantability,
                ItemTags.STONE_TOOL_MATERIALS);
        TOOL_MATERIALS.put(materialName, material);
    }


    private static void addIronMaterial(String name, int uses, float speed, float damage, int enchantability) {
        String materialName = "iron_" + name;
        ToolMaterial material = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,
                IRON_BASE_USES + uses,
                IRON_BASE_SPEED + speed,
                IRON_BASE_DMG + damage,
                IRON_BASE_ENCH + enchantability,
                Tags.Items.INGOTS_IRON);
        TOOL_MATERIALS.put(materialName, material);
    }


    private static void addGoldMaterial(String name, int uses, float speed, float damage, int enchantability) {
        String materialName = "gold_" + name;
        ToolMaterial material = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL,
                GOLD_BASE_USES + uses,
                GOLD_BASE_SPEED + speed,
                GOLD_BASE_DMG + damage,
                GOLD_BASE_ENCH + enchantability,
                Tags.Items.INGOTS_GOLD);
        TOOL_MATERIALS.put(materialName, material);
    }


    private static void addDiamondMaterial(String name, int uses, float speed, float damage, int enchantability) {
        String materialName = "diamond_" + name;
        ToolMaterial material = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
                DIAMOND_BASE_USES + uses,
                DIAMOND_BASE_SPEED + speed,
                DIAMOND_BASE_DMG + damage,
                DIAMOND_BASE_ENCH + enchantability,
                Tags.Items.GEMS_DIAMOND);
        TOOL_MATERIALS.put(materialName, material);
    }


    private static void addNetheriteMaterial(String name, int uses, float speed, float damage, int enchantability) {
        String materialName = "netherite_" + name;
        ToolMaterial material = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                NETHERITE_BASE_USES + uses,
                NETHERITE_BASE_SPEED + speed,
                NETHERITE_BASE_DMG + damage,
                NETHERITE_BASE_ENCH + enchantability,
                Tags.Items.INGOTS_NETHERITE);
        TOOL_MATERIALS.put(materialName, material);
    }


    public static ToolMaterial getMaterial(String name) {
        return TOOL_MATERIALS.get(name);
    }


    public static ToolMaterial getMaterial(String handleMaterial, String baseMaterial) {
        String toolMaterial = baseMaterial + "_" + handleMaterial;

        return TOOL_MATERIALS.get(toolMaterial);
    }


    static {
        SPEED_MAP.put("wood_sword", ToolMaterials.WOOD_SWORD_SPEED);
        SPEED_MAP.put("wood_pickaxe", ToolMaterials.WOOD_PICKAXE_SPEED);
        SPEED_MAP.put("wood_axe", ToolMaterials.WOOD_AXE_SPEED);
        SPEED_MAP.put("wood_shovel", ToolMaterials.WOOD_SHOVEL_SPEED);
        SPEED_MAP.put("wood_hoe", ToolMaterials.WOOD_HOE_SPEED);

        SPEED_MAP.put("stone_sword", ToolMaterials.STONE_SWORD_SPEED);
        SPEED_MAP.put("stone_pickaxe", ToolMaterials.STONE_PICKAXE_SPEED);
        SPEED_MAP.put("stone_axe", ToolMaterials.STONE_AXE_SPEED);
        SPEED_MAP.put("stone_shovel", ToolMaterials.STONE_SHOVEL_SPEED);
        SPEED_MAP.put("stone_hoe", ToolMaterials.STONE_HOE_SPEED);

        SPEED_MAP.put("iron_sword", ToolMaterials.IRON_SWORD_SPEED);
        SPEED_MAP.put("iron_pickaxe", ToolMaterials.IRON_PICKAXE_SPEED);
        SPEED_MAP.put("iron_axe", ToolMaterials.IRON_AXE_SPEED);
        SPEED_MAP.put("iron_shovel", ToolMaterials.IRON_SHOVEL_SPEED);
        SPEED_MAP.put("iron_hoe", ToolMaterials.IRON_HOE_SPEED);

        SPEED_MAP.put("gold_sword", ToolMaterials.GOLD_SWORD_SPEED);
        SPEED_MAP.put("gold_pickaxe", ToolMaterials.GOLD_PICKAXE_SPEED);
        SPEED_MAP.put("gold_axe", ToolMaterials.GOLD_AXE_SPEED);
        SPEED_MAP.put("gold_shovel", ToolMaterials.GOLD_SHOVEL_SPEED);
        SPEED_MAP.put("gold_hoe", ToolMaterials.GOLD_HOE_SPEED);

        SPEED_MAP.put("diamond_sword", ToolMaterials.DIAMOND_SWORD_SPEED);
        SPEED_MAP.put("diamond_pickaxe", ToolMaterials.DIAMOND_PICKAXE_SPEED);
        SPEED_MAP.put("diamond_axe", ToolMaterials.DIAMOND_AXE_SPEED);
        SPEED_MAP.put("diamond_shovel", ToolMaterials.DIAMOND_SHOVEL_SPEED);
        SPEED_MAP.put("diamond_hoe", ToolMaterials.DIAMOND_HOE_SPEED);

        SPEED_MAP.put("netherite_sword", ToolMaterials.NETHERITE_SWORD_SPEED);
        SPEED_MAP.put("netherite_pickaxe", ToolMaterials.NETHERITE_PICKAXE_SPEED);
        SPEED_MAP.put("netherite_axe", ToolMaterials.NETHERITE_AXE_SPEED);
        SPEED_MAP.put("netherite_shovel", ToolMaterials.NETHERITE_SHOVEL_SPEED);
        SPEED_MAP.put("netherite_hoe", ToolMaterials.NETHERITE_HOE_SPEED);
    }


    public static float getSpeed(String baseMaterial, String toolType) {
        String key = baseMaterial.toLowerCase() + "_" + toolType.toLowerCase();
        return SPEED_MAP.getOrDefault(key, 1.0f);
    }
}

