package xxrexraptorxx.advancedtools.utils.enums;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Optional;

public enum Materials {

//   name | durability | mining_speed | attack_damage | enchantability | attack_speed (unused) | mining_level
    ADAMANT(600, 1.33f, 1.07f, 2, 1.20f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    ADVANCED(118, 0.592f, 0.296f, 1, 1.00f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ADVANCED_ALLOY(266, 1.33f, 0.67f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ALLTHEMODIUM(1066, 2.33f, 1.67f, 2, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    ALUMINUM(10, 2.33f, 0.0f, 5, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    AMETHYST(222, 1.53f, 0.53f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ANGLESITE(283, 1.73f, 0.87f, 5, 0.40f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    ANTIMONY(50, 1.17f, 0.4f, 2, 0.60f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    APATITE(166, 1.33f, 0.5f, 3, 0.60f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    AQUITE(250, 1.5f, 0.67f, 4, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    ATOMIC_ALLOY(666, 2.0f, 1.17f, 4, 2.00f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    BASALZ(50, 1.67f, 0.6f, 4, 0.55f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BEDROCK(3333, 0.33f, 0.83f, 1, 0.50f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    BENITOITE(300, 1.83f, 0.97f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    BERYLLIUM(60, 1.27f, 0.47f, 2, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BIOSTEEL(183, 1.33f, 0.63f, 5, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BISMUTH(60, 1.13f, 0.43f, 3, 0.70f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    BISMUTH_BRONZE(56, 1.23f, 0.53f, 3, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BLACK_BRONZE(60, 1.2f, 0.57f, 2, 0.85f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    BLACK_STEEL(333, 1.17f, 0.73f, 3, 0.88f, BlockTags.DIAMOND_ORES),
    BLAST_PROOF_ALLOY(1000, 1.5f, 1.33f, 2, 0.80f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    BLAZE(40, 1.4f, 0.5f, 5, 0.70f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BLITZ(53, 1.83f, 0.63f, 5, 1.15f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BLIZZ(46, 1.73f, 0.57f, 4, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BLOOD_IRON(466, 1.4f, 1.0f, 5, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BLUE_STEEL(133, 1.13f, 0.63f, 3, 0.88f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    BLUTONIUM(666, 1.93f, 1.13f, 6, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    BONE(15, 0.67f, 0.17f, 2, 0.30f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    BRASS(46, 1.5f, 0.43f, 3, 0.82f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BREEZE(36, 1.67f, 0.17f, 4, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    BRONZE(53, 1.27f, 0.5f, 2, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CADMIUM(73, 1.07f, 0.43f, 2, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    CARBON(333, 1.83f, 0.67f, 4, 0.75f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    CERTUS_QUARTZ(20, 2.17f, 0.27f, 9, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CERTUS_QUARTZ_CRYSTAL(166, 1.6f, 0.6f, 4, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CHAROITE(366, 1.53f, 0.77f, 5, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CINNABAR(33, 1.17f, 0.43f, 5, 0.50f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    COBALT(366, 1.47f, 0.77f, 2, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    COMPRESSED_IRON(266, 1.6f, 1.0f, 4, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CONSTANTAN(43, 1.33f, 0.47f, 3, 0.82f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    COPPER(44, 1.47f, 0.4f, 3, 0.70f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CUPRONICKEL(300, 1.4f, 0.67f, 3, 0.82f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    CYANITE(500, 1.4f, 0.93f, 3, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    DARK_STEEL(600, 1.17f, 1.0f, 3, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    DIAMOND(500, 2.0f, 1.0f, 3, 1.20f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    DIOPSIDE(266, 1.47f, 0.73f, 4, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    DURATIUM(666, 1.17f, 1.0f, 1, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    ELECTRUM(8, 2.5f, 0.0f, 6, 0.45f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ELEMENTIUM(300, 1.67f, 0.83f, 6, 1.15f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    EMERALD(200, 1.4f, 0.47f, 4, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ENCHANTED(89, 4.0f, 0.0f, 45, 1.20f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    ENCHANTED_BLOOD_IRON(600, 1.67f, 1.17f, 7, 1.67f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    END(44, 1.77f, 0.57f, 5, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    ENDERIUM(466, 1.67f, 0.93f, 4, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ENDER_CRYSTAL(833, 2.07f, 1.27f, 6, 1.10f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    END_STEEL(566, 1.33f, 1.07f, 3, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ENERGETIC_ALLOY(433, 1.93f, 1.0f, 6, 1.93f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ENERGITE(133, 2.33f, 0.67f, 7, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    ENERGIZED_COPPER(466, 1.83f, 0.93f, 5, 0.80f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    ENERGIZED_GOLD(300, 2.17f, 0.83f, 7, 0.30f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    FALSITE(1000, 0.33f, 0.33f, 4, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    FLUIX(189, 1.8f, 0.7f, 10, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    FLUORITE(16, 2.5f, 0.0f, 7, 1.05f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    GLOWSTONE(33, 2.33f, 0.5f, 8, 0.60f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    GOLD(10, 3.333f, 0.0f, 7, 0.2f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    GRAPHITE(100, 1.67f, 0.6f, 4, 0.75f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    PLASTIC(26, 2.0f, 0.17f, 1, 0.25f, BlockTags.INCORRECT_FOR_WOODEN_TOOL),
    HIGH_CARBON_BLACK_STEEL(400, 1.23f, 0.8f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    HIGH_CARBON_BLUE_STEEL(166, 1.2f, 0.7f, 3, 0.80f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    HIGH_CARBON_RED_STEEL(183, 1.2f, 0.72f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    HIGH_CARBON_STEEL(116, 1.17f, 0.67f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    HORIZONITE(466, 1.93f, 1.13f, 6, 1.00f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    INANITE(1066, 2.6f, 1.6f, 9, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    INFUSED_ALLOY(600, 1.83f, 1.07f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    INSANITE(1000, 2.5f, 1.5f, 8, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    INVAR(66, 1.0f, 0.57f, 3, 0.83f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    IRIDIUM(533, 1.67f, 1.0f, 4, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    IRON(63, 1.333f, 0.666f, 4, 0.866f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    KANTHAL(266, 1.73f, 0.73f, 4, 0.70f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    LEAD(15, 0.67f, 0.27f, 2, 0.70f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    LUDICRITE(733, 1.6f, 1.17f, 4, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    LUMIUM(100, 1.67f, 0.67f, 7, 0.45f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    MAGENTITE(533, 1.77f, 1.07f, 5, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    MANASTEEL(233, 1.6f, 0.67f, 10, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    MANGANESE(100, 1.0f, 0.53f, 2, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    NETHERITE(657, 2.333f, 1.333f, 5, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    NETHERITE_DIAMOND(1166, 1.73f, 1.33f, 3, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    NETHERITE_EMERALD(1100, 1.67f, 1.27f, 4, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    NETHERITE_GOLD(1033, 2.17f, 1.17f, 6, 1.20f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    NETHERITE_IRON(1066, 1.83f, 1.2f, 5, 1.15f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    NICKEL(46, 1.0f, 0.5f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    OBSIDIAN(833, 0.67f, 0.67f, 2, 0.60f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    OPAL(400, 1.5f, 0.93f, 5, 1.00f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    OSMIUM(566, 1.5f, 1.07f, 2, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PERIDOT(200, 1.4f, 0.5f, 5, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    PIG_IRON(66, 0.93f, 0.5f, 2, 0.87f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PINK_SLIME(466, 1.67f, 0.93f, 5, 0.30f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PLATINUM(500, 1.6f, 0.97f, 5, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PLUTONIUM(833, 1.17f, 1.5f, 1, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PRISMARINE(233, 1.43f, 0.7f, 4, 0.55f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PULSATING_ALLOY(566, 2.0f, 1.07f, 5, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    PYRITE(40, 0.83f, 0.33f, 2, 0.25f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    PYROPE(300, 1.73f, 0.93f, 5, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    QUARTZ(13, 1.67f, 0.17f, 6, 0.60f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    REDSTONE(200, 2.33f, 0.5f, 8, 0.55f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    RED_STEEL(150, 1.13f, 0.65f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    REINFORCED_ALLOY(833, 1.93f, 1.23f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    RIDICULITE(1666, 2.17f, 1.67f, 10, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ROSE_GOLD(8, 2.13f, 0.0f, 5, 0.20f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    RUBY(216, 1.5f, 0.53f, 5, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    SAPPHIRE(216, 1.5f, 0.53f, 5, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    SIGNALUM(333, 2.0f, 0.83f, 6, 0.60f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    SILICON(200, 1.17f, 0.6f, 6, 0.55f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    SILVER(33, 1.67f, 0.27f, 6, 0.70f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    SOLARIUM(500, 1.87f, 1.1f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    SOULARIUM(533, 1.8f, 1.07f, 6, 0.85f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    STAINLESS_STEEL(466, 1.53f, 1.0f, 4, 0.90f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    STEEL(100, 1.07f, 0.6f, 3, 0.866f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    STERLING_SILVER(90, 1.73f, 0.53f, 8, 0.70f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    STONE(24, 0.666f, 0.333f, 1, 0.533f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    SUPERCONDUCTOR(600, 2.5f, 0.93f, 8, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    TERRASTEEL(500, 1.73f, 0.9f, 4, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    THORIUM(666, 1.33f, 1.27f, 1, 0.85f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    TIN(40, 1.4f, 0.37f, 2, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL),
    TITANIUM(400, 1.5f, 0.8f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    TOPAZ(183, 1.33f, 0.5f, 6, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    TUNGSTEN(600, 1.27f, 1.0f, 1, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    UNOBTAINIUM(800, 2.07f, 1.4f, 5, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    URANIUM(466, 1.27f, 1.0f, 1, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    VENTIUM(400, 1.87f, 0.9f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    VIBRANIUM(633, 1.83f, 1.17f, 6, 1.20f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL),
    VIBRANT_ALLOY(600, 2.07f, 1.23f, 7, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    WEAK_BLUE_STEEL(116, 1.07f, 0.57f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    WEAK_RED_STEEL(116, 1.07f, 0.58f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    WEAK_STEEL(83, 1.0f, 0.53f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    WITHER_BONE(26, 1.5f, 0.67f, 4, 1.15f, BlockTags.INCORRECT_FOR_STONE_TOOL),
    WOOD(19, 0.666f, 0.0f, 5, 0.2f, BlockTags.INCORRECT_FOR_WOODEN_TOOL),
    WROUGHT_IRON(43, 0.9f, 0.43f, 2, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL),
    YELLORIUM(600, 1.47f, 1.07f, 2, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ZANITE(233, 1.5f, 0.6f, 5, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL),
    ZINC(36, 1.33f, 0.33f, 2, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL);

    //Tool value calculation:   handle_material_value * 2 + head_material_value * 3 = final tool value


    private final int   uses;
    private final float speed;
    private final float damage;
    private final int   enchantability;
    private final float attackSpeed;
    private final TagKey<Block> incorrectForMaterialKey;


    Materials(int uses, float speed, float damage, int enchantability, float attackSpeed, TagKey<Block> incorrectForMaterialKey) {
        this.uses           = uses;
        this.speed          = speed;
        this.damage         = damage;
        this.enchantability = enchantability;
        this.attackSpeed    = attackSpeed;
        this.incorrectForMaterialKey = incorrectForMaterialKey;
    }


    public int    getUses()                           { return uses; }
    public float  getSpeed()                          { return speed; }
    public float  getDamage()                         { return damage; }
    public int    getEnchantability()                 { return enchantability; }
    public float  getAttackSpeed()                    { return attackSpeed; }
    public TagKey<Block> getIncorrectForMaterialKey() { return incorrectForMaterialKey; }
    public String getName()                           { return name().toLowerCase(); }
    public String getRegistryName()                   { return getName().replace("_", ""); }


    public static Optional<Materials> fromName(String name) {
        try {
            String key = ToolUtils.transformMaterialNames(name).trim().toUpperCase().replace(' ', '_');
            return Optional.of(valueOf(key));

        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
