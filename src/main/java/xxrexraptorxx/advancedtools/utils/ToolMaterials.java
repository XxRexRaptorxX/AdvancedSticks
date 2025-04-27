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

    private static final int   SILVER_USES  = 100;
    private static final float SILVER_SPEED = 5.0f;
    private static final float SILVER_DMG   = 0.8f;
    private static final int   SILVER_ENCH  = 18;

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

    private static final int   FLUIX_USES = 50;
    private static final float FLUIX_SPEED= 6.0f;
    private static final float FLUIX_DMG  = 0.5f;
    private static final int   FLUIX_ENCH = 30;

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

    private static final int   MANASTEEL_USES  = 700;
    private static final float MANASTEEL_SPEED = 4.8f;
    private static final float MANASTEEL_DMG   = 2.0f;
    private static final int   MANASTEEL_ENCH  = 30;

    private static final int   GRAPHITE_USES    = 300;
    private static final float GRAPHITE_SPEED   = 5.0f;
    private static final float GRAPHITE_DMG     = 1.8f;
    private static final int   GRAPHITE_ENCH    = 12;

    private static final int   HDPE_USES       = 80;
    private static final float HDPE_SPEED      = 6.0f;
    private static final float HDPE_DMG        = 0.5f;
    private static final int   HDPE_ENCH       = 1;

    private static final int   TUNGSTEN_USES   = 1800;
    private static final float TUNGSTEN_SPEED  = 3.8f;
    private static final float TUNGSTEN_DMG    = 3.0f;
    private static final int   TUNGSTEN_ENCH   = 5;

    private static final int   ADVANCED_ALLOY_USES  = 800;
    private static final float ADVANCED_ALLOY_SPEED = 4.0f;
    private static final float ADVANCED_ALLOY_DMG   = 2.0f;
    private static final int   ADVANCED_ALLOY_ENCH  = 10;

    private static final int   ATOMIC_ALLOY_USES  = 2000;
    private static final float ATOMIC_ALLOY_SPEED = 6.0f;
    private static final float ATOMIC_ALLOY_DMG   = 3.5f;
    private static final int   ATOMIC_ALLOY_ENCH  = 14;

    private static final int   INFUSED_ALLOY_USES  = 1800;
    private static final float INFUSED_ALLOY_SPEED = 5.5f;
    private static final float INFUSED_ALLOY_DMG   = 3.2f;
    private static final int   INFUSED_ALLOY_ENCH  = 13;

    private static final int   REINFORCED_ALLOY_USES  = 2500;
    private static final float REINFORCED_ALLOY_SPEED = 5.8f;
    private static final float REINFORCED_ALLOY_DMG   = 3.7f;
    private static final int   REINFORCED_ALLOY_ENCH  = 12;

    private static final int   BLASTPROOF_ALLOY_USES  = 3000;
    private static final float BLASTPROOF_ALLOY_SPEED = 4.5f;
    private static final float BLASTPROOF_ALLOY_DMG   = 4.0f;
    private static final int   BLASTPROOF_ALLOY_ENCH  = 8;

    private static final int   SUPERCONDUCTOR_USES  = 1800;
    private static final float SUPERCONDUCTOR_SPEED = 7.5f;
    private static final float SUPERCONDUCTOR_DMG   = 2.8f;
    private static final int   SUPERCONDUCTOR_ENCH  = 25;

    private static final int   ELEMENTIUM_USES  = 900;
    private static final float ELEMENTIUM_SPEED = 5.0f;
    private static final float ELEMENTIUM_DMG   = 2.5f;
    private static final int   ELEMENTIUM_ENCH  = 20;

    private static final int   VENTIUM_USES  = 1200;
    private static final float VENTIUM_SPEED = 5.6f;
    private static final float VENTIUM_DMG   = 2.7f;
    private static final int   VENTIUM_ENCH  = 19;

    private static final int   ZANITE_USES  = 700;
    private static final float ZANITE_SPEED = 4.5f;
    private static final float ZANITE_DMG   = 1.8f;
    private static final int   ZANITE_ENCH  = 15;

    private static final int   ANTIMONY_USES  = 150;
    private static final float ANTIMONY_SPEED = 3.5f;
    private static final float ANTIMONY_DMG   = 1.2f;
    private static final int   ANTIMONY_ENCH  = 7;

    private static final int   BERYLLIUM_USES  = 180;
    private static final float BERYLLIUM_SPEED = 3.8f;
    private static final float BERYLLIUM_DMG   = 1.4f;
    private static final int   BERYLLIUM_ENCH  = 8;

    private static final int   MANGANESE_USES  = 300;
    private static final float MANGANESE_SPEED = 3.0f;
    private static final float MANGANESE_DMG   = 1.6f;
    private static final int   MANGANESE_ENCH  = 6;

    private static final int   CADMIUM_USES  = 220;
    private static final float CADMIUM_SPEED = 3.2f;
    private static final float CADMIUM_DMG   = 1.3f;
    private static final int   CADMIUM_ENCH  = 7;

    private static final int   THORIUM_USES  = 2000;
    private static final float THORIUM_SPEED = 4.0f;
    private static final float THORIUM_DMG   = 3.8f;
    private static final int   THORIUM_ENCH  = 5;

    private static final int   PLUTONIUM_USES  = 2500;
    private static final float PLUTONIUM_SPEED = 3.5f;
    private static final float PLUTONIUM_DMG   = 4.5f;
    private static final int   PLUTONIUM_ENCH  = 3;

    private static final int   CYANITE_USES  = 1500;
    private static final float CYANITE_SPEED = 4.2f;
    private static final float CYANITE_DMG   = 2.8f;
    private static final int   CYANITE_ENCH  = 9;

    private static final int   YELLORIUM_USES  = 1800;
    private static final float YELLORIUM_SPEED = 4.4f;
    private static final float YELLORIUM_DMG   = 3.2f;
    private static final int   YELLORIUM_ENCH  = 8;

    private static final int   LUDICRITE_USES  = 2200;
    private static final float LUDICRITE_SPEED = 4.8f;
    private static final float LUDICRITE_DMG   = 3.5f;
    private static final int   LUDICRITE_ENCH  = 12;

    private static final int   DARKSTEEL_USES  = 1800;
    private static final float DARKSTEEL_SPEED = 3.5f;
    private static final float DARKSTEEL_DMG   = 3.0f;
    private static final int   DARKSTEEL_ENCH  = 10;

    private static final int   ENDSTEEL_USES  = 1700;
    private static final float ENDSTEEL_SPEED = 4.0f;
    private static final float ENDSTEEL_DMG   = 3.2f;
    private static final int   ENDSTEEL_ENCH  = 11;

    private static final int   KANTHAL_USES  = 800;
    private static final float KANTHAL_SPEED = 5.2f;
    private static final float KANTHAL_DMG   = 2.2f;
    private static final int   KANTHAL_ENCH  = 14;

    private static final int   RIDICULITE_USES  = 5000;
    private static final float RIDICULITE_SPEED = 6.5f;
    private static final float RIDICULITE_DMG   = 5.0f;
    private static final int   RIDICULITE_ENCH  = 30;

    private static final int   APATITE_USES  = 500;
    private static final float APATITE_SPEED = 4.0f;
    private static final float APATITE_DMG   = 1.5f;
    private static final int   APATITE_ENCH  = 10;

    private static final int   AQUITE_USES  = 750;
    private static final float AQUITE_SPEED = 4.5f;
    private static final float AQUITE_DMG   = 2.0f;
    private static final int   AQUITE_ENCH  = 12;

    private static final int   BASALZ_USES  = 150;
    private static final float BASALZ_SPEED = 5.0f;
    private static final float BASALZ_DMG   = 1.8f;
    private static final int   BASALZ_ENCH  = 14;

    private static final int   BLITZ_USES  = 160;
    private static final float BLITZ_SPEED = 5.5f;
    private static final float BLITZ_DMG   = 1.9f;
    private static final int   BLITZ_ENCH  = 15;

    private static final int   BLIZZ_USES  = 140;
    private static final float BLIZZ_SPEED = 5.2f;
    private static final float BLIZZ_DMG   = 1.7f;
    private static final int   BLIZZ_ENCH  = 14;

    private static final int   CHAROITE_USES  = 1100;
    private static final float CHAROITE_SPEED = 4.6f;
    private static final float CHAROITE_DMG   = 2.3f;
    private static final int   CHAROITE_ENCH  = 17;

    private static final int   CUPRONICKEL_USES  = 900;
    private static final float CUPRONICKEL_SPEED = 4.2f;
    private static final float CUPRONICKEL_DMG   = 2.0f;
    private static final int   CUPRONICKEL_ENCH  = 10;

    private static final int   DIOPSIDE_USES  = 800;
    private static final float DIOPSIDE_SPEED = 4.4f;
    private static final float DIOPSIDE_DMG   = 2.2f;
    private static final int   DIOPSIDE_ENCH  = 12;

    private static final int   ENERGETIC_ALLOY_USES  = 1300;
    private static final float ENERGETIC_ALLOY_SPEED = 5.8f;
    private static final float ENERGETIC_ALLOY_DMG   = 3.0f;
    private static final int   ENERGETIC_ALLOY_ENCH  = 18;

    private static final int   ENERGIZED_COPPER_USES  = 1400;
    private static final float ENERGIZED_COPPER_SPEED = 5.5f;
    private static final float ENERGIZED_COPPER_DMG   = 2.8f;
    private static final int   ENERGIZED_COPPER_ENCH  = 16;

    private static final int   ENERGIZED_GOLD_USES  = 900;
    private static final float ENERGIZED_GOLD_SPEED = 6.5f;
    private static final float ENERGIZED_GOLD_DMG   = 2.5f;
    private static final int   ENERGIZED_GOLD_ENCH  = 22;

    private static final int   FALSITE_USES  = 3000;
    private static final float FALSITE_SPEED = 1.0f;
    private static final float FALSITE_DMG   = 1.0f;
    private static final int   FALSITE_ENCH  = 14;

    private static final int   PRISMARINE_USES  = 700;
    private static final float PRISMARINE_SPEED = 4.3f;
    private static final float PRISMARINE_DMG   = 2.1f;
    private static final int   PRISMARINE_ENCH  = 13;

    private static final int   SILICON_USES  = 600;
    private static final float SILICON_SPEED = 3.5f;
    private static final float SILICON_DMG   = 1.8f;
    private static final int   SILICON_ENCH  = 20;

    private static final int   SOLARIUM_USES  = 1500;
    private static final float SOLARIUM_SPEED = 5.6f;
    private static final float SOLARIUM_DMG   = 3.3f;
    private static final int   SOLARIUM_ENCH  = 18;

    private static final int   STAINLESS_STEEL_USES  = 1400;
    private static final float STAINLESS_STEEL_SPEED = 4.6f;
    private static final float STAINLESS_STEEL_DMG   = 3.0f;
    private static final int   STAINLESS_STEEL_ENCH  = 12;

    private static final int   VIBRANT_ALLOY_USES  = 1800;
    private static final float VIBRANT_ALLOY_SPEED = 6.2f;
    private static final float VIBRANT_ALLOY_DMG   = 3.7f;
    private static final int   VIBRANT_ALLOY_ENCH  = 22;

    private static final int   OPAL_USES  = 1200;
    private static final float OPAL_SPEED = 4.5f;
    private static final float OPAL_DMG   = 2.8f;
    private static final int   OPAL_ENCH  = 16;

    private static final int   HORIZONITE_USES  = 1400;
    private static final float HORIZONITE_SPEED = 5.8f;
    private static final float HORIZONITE_DMG   = 3.4f;
    private static final int   HORIZONITE_ENCH  = 19;

    private static final int   PULSATING_ALLOY_USES  = 1700;
    private static final float PULSATING_ALLOY_SPEED = 6.0f;
    private static final float PULSATING_ALLOY_DMG   = 3.2f;
    private static final int   PULSATING_ALLOY_ENCH  = 15;

    private static final int   PYROPE_USES  = 900;
    private static final float PYROPE_SPEED = 5.2f;
    private static final float PYROPE_DMG   = 2.8f;
    private static final int   PYROPE_ENCH  = 16;

    private static final int   REDSTONE_USES  = 600;
    private static final float REDSTONE_SPEED = 7.0f;
    private static final float REDSTONE_DMG   = 1.5f;
    private static final int   REDSTONE_ENCH  = 25;


    private static final int   CERTUS_QUARTZ_CRYSTAL_USES  = 500;
    private static final float CERTUS_QUARTZ_CRYSTAL_SPEED = 4.8f;
    private static final float CERTUS_QUARTZ_CRYSTAL_DMG   = 1.8f;
    private static final int   CERTUS_QUARTZ_CRYSTAL_ENCH  = 14;

    private static final int   ANGLESITE_USES  = 850;
    private static final float ANGLESITE_SPEED = 5.2f;
    private static final float ANGLESITE_DMG   = 2.6f;
    private static final int   ANGLESITE_ENCH  = 16;

    private static final int   BENITOITE_USES  = 900;
    private static final float BENITOITE_SPEED = 5.5f;
    private static final float BENITOITE_DMG   = 2.9f;
    private static final int   BENITOITE_ENCH  = 18;

    private static final int   BLOOD_IRON_USES  = 1400;
    private static final float BLOOD_IRON_SPEED = 4.2f;
    private static final float BLOOD_IRON_DMG   = 3.0f;
    private static final int   BLOOD_IRON_ENCH  = 15;

    private static final int   BLUTONIUM_USES  = 2000;
    private static final float BLUTONIUM_SPEED = 5.8f;
    private static final float BLUTONIUM_DMG   = 3.4f;
    private static final int   BLUTONIUM_ENCH  = 19;

    private static final int   ENCHANTED_BLOOD_IRON_USES  = 1800;
    private static final float ENCHANTED_BLOOD_IRON_SPEED = 5.0f;
    private static final float ENCHANTED_BLOOD_IRON_DMG   = 3.5f;
    private static final int   ENCHANTED_BLOOD_IRON_ENCH  = 22;

    private static final int   INSANITE_USES  = 3000;
    private static final float INSANITE_SPEED = 7.5f;
    private static final float INSANITE_DMG   = 4.5f;
    private static final int   INSANITE_ENCH  = 25;

    private static final int   MAGENTITE_USES  = 1600;
    private static final float MAGENTITE_SPEED = 5.3f;
    private static final float MAGENTITE_DMG   = 3.2f;
    private static final int   MAGENTITE_ENCH  = 17;

    private static final int   NETHERITE_DIAMOND_USES  = 3500;
    private static final float NETHERITE_DIAMOND_SPEED = 5.2f;
    private static final float NETHERITE_DIAMOND_DMG   = 4.0f;
    private static final int   NETHERITE_DIAMOND_ENCH  = 10;

    private static final int   NETHERITE_EMERALD_USES  = 3300;
    private static final float NETHERITE_EMERALD_SPEED = 5.0f;
    private static final float NETHERITE_EMERALD_DMG   = 3.8f;
    private static final int   NETHERITE_EMERALD_ENCH  = 12;

    private static final int   NETHERITE_GOLD_USES  = 3100;
    private static final float NETHERITE_GOLD_SPEED = 6.5f;
    private static final float NETHERITE_GOLD_DMG   = 3.5f;
    private static final int   NETHERITE_GOLD_ENCH  = 20;

    private static final int   NETHERITE_IRON_USES  = 3200;
    private static final float NETHERITE_IRON_SPEED = 5.5f;
    private static final float NETHERITE_IRON_DMG   = 3.6f;
    private static final int   NETHERITE_IRON_ENCH  = 15;

    private static final int   COMPRESSED_IRON_USES  = 800;
    private static final float COMPRESSED_IRON_SPEED = 4.8f;
    private static final float COMPRESSED_IRON_DMG   = 3.0f;
    private static final int   COMPRESSED_IRON_ENCH  = 12;

    private static final int   ENDER_CRYSTAL_USES  = 2500;
    private static final float ENDER_CRYSTAL_SPEED = 6.2f;
    private static final float ENDER_CRYSTAL_DMG   = 3.8f;
    private static final int   ENDER_CRYSTAL_ENCH  = 20;

    private static final int   GLOWSTONE_USES  = 100;
    private static final float GLOWSTONE_SPEED = 7.0f;
    private static final float GLOWSTONE_DMG   = 1.5f;
    private static final int   GLOWSTONE_ENCH  = 25;

    private static final int   INANITE_USES  = 3200;
    private static final float INANITE_SPEED = 7.8f;
    private static final float INANITE_DMG   = 4.8f;
    private static final int   INANITE_ENCH  = 28;

    private static final int   PINK_SLIME_USES  = 1400;
    private static final float PINK_SLIME_SPEED = 5.0f;
    private static final float PINK_SLIME_DMG   = 2.8f;
    private static final int   PINK_SLIME_ENCH  = 16;

    private static final int   SOULARIUM_USES  = 1600;
    private static final float SOULARIUM_SPEED = 5.4f;
    private static final float SOULARIUM_DMG   = 3.2f;
    private static final int   SOULARIUM_ENCH  = 18;

    private static final int   BLUE_STEEL_USES  = 400;
    private static final float BLUE_STEEL_SPEED = 3.4f;
    private static final float BLUE_STEEL_DMG   = 1.9f;
    private static final int   BLUE_STEEL_ENCH  = 11;

    private static final int   HIGH_CARBON_BLUE_STEEL_USES  = 500;
    private static final float HIGH_CARBON_BLUE_STEEL_SPEED = 3.6f;
    private static final float HIGH_CARBON_BLUE_STEEL_DMG   = 2.1f;
    private static final int   HIGH_CARBON_BLUE_STEEL_ENCH  = 11;

    private static final int   WEAK_BLUE_STEEL_USES   = 350;
    private static final float WEAK_BLUE_STEEL_SPEED  = 3.2f;
    private static final float WEAK_BLUE_STEEL_DMG    = 1.7f;
    private static final int   WEAK_BLUE_STEEL_ENCH   = 10;

    private static final int   WROUGHT_IRON_USES      = 130;
    private static final float WROUGHT_IRON_SPEED     = 2.7f;
    private static final float WROUGHT_IRON_DMG       = 1.3f;
    private static final int   WROUGHT_IRON_ENCH      = 7;

    private static final int   PIG_IRON_USES          = 200;
    private static final float PIG_IRON_SPEED         = 2.8f;
    private static final float PIG_IRON_DMG           = 1.5f;
    private static final int   PIG_IRON_ENCH          = 8;

    private static final int   WEAK_STEEL_USES        = 250;
    private static final float WEAK_STEEL_SPEED       = 3.0f;
    private static final float WEAK_STEEL_DMG         = 1.6f;
    private static final int   WEAK_STEEL_ENCH        = 9;

    private static final int   HIGH_CARBON_STEEL_USES  = 350;
    private static final float HIGH_CARBON_STEEL_SPEED = 3.5f;
    private static final float HIGH_CARBON_STEEL_DMG   = 2.0f;
    private static final int   HIGH_CARBON_STEEL_ENCH  = 9;

    private static final int   BLACK_STEEL_USES        = 1000;
    private static final float BLACK_STEEL_SPEED       = 3.5f;
    private static final float BLACK_STEEL_DMG         = 2.2f;
    private static final int   BLACK_STEEL_ENCH        = 10;

    private static final int   HIGH_CARBON_BLACK_STEEL_USES  = 1200;
    private static final float HIGH_CARBON_BLACK_STEEL_SPEED = 3.7f;
    private static final float HIGH_CARBON_BLACK_STEEL_DMG   = 2.4f;
    private static final int   HIGH_CARBON_BLACK_STEEL_ENCH  = 10;

    private static final int   BLACK_BRONZE_USES    = 180;
    private static final float BLACK_BRONZE_SPEED   = 3.6f;
    private static final float BLACK_BRONZE_DMG     = 1.7f;
    private static final int   BLACK_BRONZE_ENCH    = 8;

    private static final int   BISMUTH_BRONZE_USES  = 170;
    private static final float BISMUTH_BRONZE_SPEED = 3.7f;
    private static final float BISMUTH_BRONZE_DMG   = 1.6f;
    private static final int   BISMUTH_BRONZE_ENCH  = 9;

    private static final int   RED_STEEL_USES       = 450;
    private static final float RED_STEEL_SPEED      = 3.4f;
    private static final float RED_STEEL_DMG        = 1.95f;
    private static final int   RED_STEEL_ENCH       = 12;

    private static final int   HIGH_CARBON_RED_STEEL_USES   = 550;
    private static final float HIGH_CARBON_RED_STEEL_SPEED  = 3.6f;
    private static final float HIGH_CARBON_RED_STEEL_DMG    = 2.15f;
    private static final int   HIGH_CARBON_RED_STEEL_ENCH   = 12;

    private static final int   WEAK_RED_STEEL_USES  = 350;
    private static final float WEAK_RED_STEEL_SPEED = 3.2f;
    private static final float WEAK_RED_STEEL_DMG   = 1.75f;
    private static final int   WEAK_RED_STEEL_ENCH  = 11;

    private static final int   ROSE_GOLD_USES       = 25;
    private static final float ROSE_GOLD_SPEED      = 6.4f;
    private static final float ROSE_GOLD_DMG        = 0.0f;
    private static final int   ROSE_GOLD_ENCH       = 15;

    private static final int   STERLING_SILVER_USES  = 270;
    private static final float STERLING_SILVER_SPEED = 5.2f;
    private static final float STERLING_SILVER_DMG   = 1.6f;
    private static final int   STERLING_SILVER_ENCH  = 24;

    private static final int   PYRITE_USES          = 120;
    private static final float PYRITE_SPEED         = 2.5f;
    private static final float PYRITE_DMG           = 1.0f;
    private static final int   PYRITE_ENCH          = 6;

    private static final int   BISMUTH_USES         = 180;
    private static final float BISMUTH_SPEED        = 3.4f;
    private static final float BISMUTH_DMG          = 1.3f;
    private static final int   BISMUTH_ENCH         = 9;


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
        addMaterial("silver", SILVER_USES, SILVER_SPEED, SILVER_DMG, SILVER_ENCH);
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
        addMaterial("stone", STONE_USES, STONE_SPEED, STONE_DMG, STONE_ENCH);
        addMaterial("adamant", ADAMANT_USES, ADAMANT_SPEED, ADAMANT_DMG, ADAMANT_ENCH);
        addMaterial("advancedalloy", ADVANCED_ALLOY_USES, ADVANCED_ALLOY_SPEED, ADVANCED_ALLOY_DMG, ADVANCED_ALLOY_ENCH);
        addMaterial("antimony", ANTIMONY_USES, ANTIMONY_SPEED, ANTIMONY_DMG, ANTIMONY_ENCH);
        addMaterial("apatite", APATITE_USES, APATITE_SPEED, APATITE_DMG, APATITE_ENCH);
        addMaterial("aquite", AQUITE_USES, AQUITE_SPEED, AQUITE_DMG, AQUITE_ENCH);
        addMaterial("atomicalloy", ATOMIC_ALLOY_USES, ATOMIC_ALLOY_SPEED, ATOMIC_ALLOY_DMG, ATOMIC_ALLOY_ENCH);
        addMaterial("basalz", BASALZ_USES, BASALZ_SPEED, BASALZ_DMG, BASALZ_ENCH);
        addMaterial("bedrock", BEDROCK_USES, BEDROCK_SPEED, BEDROCK_DMG, BEDROCK_ENCH);
        addMaterial("beryllium", BERYLLIUM_USES, BERYLLIUM_SPEED, BERYLLIUM_DMG, BERYLLIUM_ENCH);
        addMaterial("biosteel", BIOSTEEL_USES, BIOSTEEL_SPEED, BIOSTEEL_DMG, BIOSTEEL_ENCH);
        addMaterial("blastproofalloy", BLASTPROOF_ALLOY_USES, BLASTPROOF_ALLOY_SPEED, BLASTPROOF_ALLOY_DMG, BLASTPROOF_ALLOY_ENCH);
        addMaterial("blitz", BLITZ_USES, BLITZ_SPEED, BLITZ_DMG, BLITZ_ENCH);
        addMaterial("blizz", BLIZZ_USES, BLIZZ_SPEED, BLIZZ_DMG, BLIZZ_ENCH);
        addMaterial("cadmium", CADMIUM_USES, CADMIUM_SPEED, CADMIUM_DMG, CADMIUM_ENCH);
        addMaterial("thorium", THORIUM_USES, THORIUM_SPEED, THORIUM_DMG, THORIUM_ENCH);
        addMaterial("carbon", CARBON_USES, CARBON_SPEED, CARBON_DMG, CARBON_ENCH);
        addMaterial("certusquartzcrystal", CERTUS_QUARTZ_CRYSTAL_USES, CERTUS_QUARTZ_CRYSTAL_SPEED, CERTUS_QUARTZ_CRYSTAL_DMG, CERTUS_QUARTZ_CRYSTAL_ENCH);
        addMaterial("charoite", CHAROITE_USES, CHAROITE_SPEED, CHAROITE_DMG, CHAROITE_ENCH);
        addMaterial("cupronickel", CUPRONICKEL_USES, CUPRONICKEL_SPEED, CUPRONICKEL_DMG, CUPRONICKEL_ENCH);
        addMaterial("darksteel", DARKSTEEL_USES, DARKSTEEL_SPEED, DARKSTEEL_DMG, DARKSTEEL_ENCH);
        addMaterial("duratium", DURATIUM_USES, DURATIUM_SPEED, DURATIUM_DMG, DURATIUM_ENCH);
        addMaterial("diopside", DIOPSIDE_USES, DIOPSIDE_SPEED, DIOPSIDE_DMG, DIOPSIDE_ENCH);
        addMaterial("elementium", ELEMENTIUM_USES, ELEMENTIUM_SPEED, ELEMENTIUM_DMG, ELEMENTIUM_ENCH);
        addMaterial("endsteel", ENDSTEEL_USES, ENDSTEEL_SPEED, ENDSTEEL_DMG, ENDSTEEL_ENCH);
        addMaterial("energeticalloy", ENERGETIC_ALLOY_USES, ENERGETIC_ALLOY_SPEED, ENERGETIC_ALLOY_DMG, ENERGETIC_ALLOY_ENCH);
        addMaterial("energite", ENERGITE_USES, ENERGITE_SPEED, ENERGITE_DMG, ENERGITE_ENCH);
        addMaterial("energizedcopper", ENERGIZED_COPPER_USES, ENERGIZED_COPPER_SPEED, ENERGIZED_COPPER_DMG, ENERGIZED_COPPER_ENCH);
        addMaterial("energizedgold", ENERGIZED_GOLD_USES, ENERGIZED_GOLD_SPEED, ENERGIZED_GOLD_DMG, ENERGIZED_GOLD_ENCH);
        addMaterial("falsite", FALSITE_USES, FALSITE_SPEED, FALSITE_DMG, FALSITE_ENCH);
        addMaterial("fluix", FLUIX_USES, FLUIX_SPEED, FLUIX_DMG, FLUIX_ENCH);
        addMaterial("plastic", HDPE_USES, HDPE_SPEED, HDPE_DMG, HDPE_ENCH);
        addMaterial("horizonite", HORIZONITE_USES, HORIZONITE_SPEED, HORIZONITE_DMG, HORIZONITE_ENCH);
        addMaterial("infusedalloy", INFUSED_ALLOY_USES, INFUSED_ALLOY_SPEED, INFUSED_ALLOY_DMG, INFUSED_ALLOY_ENCH);
        addMaterial("kanthal", KANTHAL_USES, KANTHAL_SPEED, KANTHAL_DMG, KANTHAL_ENCH);
        addMaterial("manasteel", MANASTEEL_USES, MANASTEEL_SPEED, MANASTEEL_DMG, MANASTEEL_ENCH);
        addMaterial("manganese", MANGANESE_USES, MANGANESE_SPEED, MANGANESE_DMG, MANGANESE_ENCH);
        addMaterial("obsidian", OBSIDIAN_USES, OBSIDIAN_SPEED, OBSIDIAN_DMG, OBSIDIAN_ENCH);
        addMaterial("plutonium", PLUTONIUM_USES, PLUTONIUM_SPEED, PLUTONIUM_DMG, PLUTONIUM_ENCH);
        addMaterial("prismarine", PRISMARINE_USES, PRISMARINE_SPEED, PRISMARINE_DMG, PRISMARINE_ENCH);
        addMaterial("pulsatingalloy", PULSATING_ALLOY_USES, PULSATING_ALLOY_SPEED, PULSATING_ALLOY_DMG, PULSATING_ALLOY_ENCH);
        addMaterial("pyrope", PYROPE_USES, PYROPE_SPEED, PYROPE_DMG, PYROPE_ENCH);
        addMaterial("redstone", REDSTONE_USES, REDSTONE_SPEED, REDSTONE_DMG, REDSTONE_ENCH);
        addMaterial("reinforcedalloy", REINFORCED_ALLOY_USES, REINFORCED_ALLOY_SPEED, REINFORCED_ALLOY_DMG, REINFORCED_ALLOY_ENCH);
        addMaterial("silicon", SILICON_USES, SILICON_SPEED, SILICON_DMG, SILICON_ENCH);
        addMaterial("solarium", SOLARIUM_USES, SOLARIUM_SPEED, SOLARIUM_DMG, SOLARIUM_ENCH);
        addMaterial("stainlesssteel", STAINLESS_STEEL_USES, STAINLESS_STEEL_SPEED, STAINLESS_STEEL_DMG, STAINLESS_STEEL_ENCH);
        addMaterial("terrasteel", TERRASTEEL_USES, TERRASTEEL_SPEED, TERRASTEEL_DMG, TERRASTEEL_ENCH);
        addMaterial("superconductor", SUPERCONDUCTOR_USES, SUPERCONDUCTOR_SPEED, SUPERCONDUCTOR_DMG, SUPERCONDUCTOR_ENCH);
        addMaterial("tungsten", TUNGSTEN_USES, TUNGSTEN_SPEED, TUNGSTEN_DMG, TUNGSTEN_ENCH);
        addMaterial("ventium", VENTIUM_USES, VENTIUM_SPEED, VENTIUM_DMG, VENTIUM_ENCH);
        addMaterial("vibrantalloy", VIBRANT_ALLOY_USES, VIBRANT_ALLOY_SPEED, VIBRANT_ALLOY_DMG, VIBRANT_ALLOY_ENCH);
        addMaterial("zanite", ZANITE_USES, ZANITE_SPEED, ZANITE_DMG, ZANITE_ENCH);
        addMaterial("opal", OPAL_USES, OPAL_SPEED, OPAL_DMG, OPAL_ENCH);
        addMaterial("anglesite", ANGLESITE_USES, ANGLESITE_SPEED, ANGLESITE_DMG, ANGLESITE_ENCH);
        addMaterial("benitoite", BENITOITE_USES, BENITOITE_SPEED, BENITOITE_DMG, BENITOITE_ENCH);
        addMaterial("bloodiron", BLOOD_IRON_USES, BLOOD_IRON_SPEED, BLOOD_IRON_DMG, BLOOD_IRON_ENCH);
        addMaterial("blutonium", BLUTONIUM_USES, BLUTONIUM_SPEED, BLUTONIUM_DMG, BLUTONIUM_ENCH);
        addMaterial("cyanite", CYANITE_USES, CYANITE_SPEED, CYANITE_DMG, CYANITE_ENCH);
        addMaterial("enchantedbloodiron", ENCHANTED_BLOOD_IRON_USES, ENCHANTED_BLOOD_IRON_SPEED, ENCHANTED_BLOOD_IRON_DMG, ENCHANTED_BLOOD_IRON_ENCH);
        addMaterial("graphite", GRAPHITE_USES, GRAPHITE_SPEED, GRAPHITE_DMG, GRAPHITE_ENCH);
        addMaterial("insanite", INSANITE_USES, INSANITE_SPEED, INSANITE_DMG, INSANITE_ENCH);
        addMaterial("ludicrite", LUDICRITE_USES, LUDICRITE_SPEED, LUDICRITE_DMG, LUDICRITE_ENCH);
        addMaterial("magentite", MAGENTITE_USES, MAGENTITE_SPEED, MAGENTITE_DMG, MAGENTITE_ENCH);
        addMaterial("netheritediamond", NETHERITE_DIAMOND_USES, NETHERITE_DIAMOND_SPEED, NETHERITE_DIAMOND_DMG, NETHERITE_DIAMOND_ENCH);
        addMaterial("netheriteemerald", NETHERITE_EMERALD_USES, NETHERITE_EMERALD_SPEED, NETHERITE_EMERALD_DMG, NETHERITE_EMERALD_ENCH);
        addMaterial("netheritegold", NETHERITE_GOLD_USES, NETHERITE_GOLD_SPEED, NETHERITE_GOLD_DMG, NETHERITE_GOLD_ENCH);
        addMaterial("netheriteiron", NETHERITE_IRON_USES, NETHERITE_IRON_SPEED, NETHERITE_IRON_DMG, NETHERITE_IRON_ENCH);
        addMaterial("ridiculite", RIDICULITE_USES, RIDICULITE_SPEED, RIDICULITE_DMG, RIDICULITE_ENCH);
        addMaterial("yellorium", YELLORIUM_USES, YELLORIUM_SPEED, YELLORIUM_DMG, YELLORIUM_ENCH);
        addMaterial("witherbone", WITHER_BONE_USES, WITHER_BONE_SPEED, WITHER_BONE_DMG, WITHER_BONE_ENCH);
        addMaterial("compressediron", COMPRESSED_IRON_USES, COMPRESSED_IRON_SPEED, COMPRESSED_IRON_DMG, COMPRESSED_IRON_ENCH);
        addMaterial("endercrystal", ENDER_CRYSTAL_USES, ENDER_CRYSTAL_SPEED, ENDER_CRYSTAL_DMG, ENDER_CRYSTAL_ENCH);
        addMaterial("glowstone", GLOWSTONE_USES, GLOWSTONE_SPEED, GLOWSTONE_DMG, GLOWSTONE_ENCH);
        addMaterial("inanite", INANITE_USES, INANITE_SPEED, INANITE_DMG, INANITE_ENCH);
        addMaterial("pinkslime", PINK_SLIME_USES, PINK_SLIME_SPEED, PINK_SLIME_DMG, PINK_SLIME_ENCH);
        addMaterial("soularium", SOULARIUM_USES, SOULARIUM_SPEED, SOULARIUM_DMG, SOULARIUM_ENCH);
        addMaterial("bluesteel", BLUE_STEEL_USES, BLUE_STEEL_SPEED, BLUE_STEEL_DMG, BLUE_STEEL_ENCH);
        addMaterial("highcarbonbluesteel", HIGH_CARBON_BLUE_STEEL_USES, HIGH_CARBON_BLUE_STEEL_SPEED, HIGH_CARBON_BLUE_STEEL_DMG, HIGH_CARBON_BLUE_STEEL_ENCH);
        addMaterial("pyrite", PYRITE_USES, PYRITE_SPEED, PYRITE_DMG, PYRITE_ENCH);
        addMaterial("wroughtiron", WROUGHT_IRON_USES, WROUGHT_IRON_SPEED, WROUGHT_IRON_DMG, WROUGHT_IRON_ENCH);
        addMaterial("weaksteel", WEAK_STEEL_USES, WEAK_STEEL_SPEED, WEAK_STEEL_DMG, WEAK_STEEL_ENCH);
        addMaterial("highcarbonblacksteel", HIGH_CARBON_BLACK_STEEL_USES, HIGH_CARBON_BLACK_STEEL_SPEED, HIGH_CARBON_BLACK_STEEL_DMG, HIGH_CARBON_BLACK_STEEL_ENCH);
        addMaterial("blackbronze", BLACK_BRONZE_USES, BLACK_BRONZE_SPEED, BLACK_BRONZE_DMG, BLACK_BRONZE_ENCH);
        addMaterial("bismuthbronze", BISMUTH_BRONZE_USES, BISMUTH_BRONZE_SPEED, BISMUTH_BRONZE_DMG, BISMUTH_BRONZE_ENCH);
        addMaterial("highcarbonredsteel", HIGH_CARBON_RED_STEEL_USES, HIGH_CARBON_RED_STEEL_SPEED, HIGH_CARBON_RED_STEEL_DMG, HIGH_CARBON_RED_STEEL_ENCH);
        addMaterial("redsteel", RED_STEEL_USES, RED_STEEL_SPEED, RED_STEEL_DMG, RED_STEEL_ENCH);
        addMaterial("highcarbonsteel", HIGH_CARBON_STEEL_USES, HIGH_CARBON_STEEL_SPEED, HIGH_CARBON_STEEL_DMG, HIGH_CARBON_STEEL_ENCH);
        addMaterial("rosegold", ROSE_GOLD_USES, ROSE_GOLD_SPEED, ROSE_GOLD_DMG, ROSE_GOLD_ENCH);
        addMaterial("weakredsteel", WEAK_RED_STEEL_USES, WEAK_RED_STEEL_SPEED, WEAK_RED_STEEL_DMG, WEAK_RED_STEEL_ENCH);
        addMaterial("bismuth", BISMUTH_USES, BISMUTH_SPEED, BISMUTH_DMG, BISMUTH_ENCH);
        addMaterial("pigiron", PIG_IRON_USES, PIG_IRON_SPEED, PIG_IRON_DMG, PIG_IRON_ENCH);
        addMaterial("weakbluesteel", WEAK_BLUE_STEEL_USES, WEAK_BLUE_STEEL_SPEED, WEAK_BLUE_STEEL_DMG, WEAK_BLUE_STEEL_ENCH);
        addMaterial("sterlingsilver", STERLING_SILVER_USES, STERLING_SILVER_SPEED, STERLING_SILVER_DMG, STERLING_SILVER_ENCH);
        addMaterial("blacksteel", BLACK_STEEL_USES, BLACK_STEEL_SPEED, BLACK_STEEL_DMG, BLACK_STEEL_ENCH);
    }


    /**
     *  Generate the ToolMaterials for each base material
     */
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

