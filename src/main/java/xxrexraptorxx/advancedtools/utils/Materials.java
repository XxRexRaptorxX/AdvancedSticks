package xxrexraptorxx.advancedtools.utils;

import java.util.Optional;

public enum Materials {

//   name |     lvl | uses | speed | damage | enchant
    ADAMANT(600, 1.33f, 1.07f, 2),
    ADVANCED(118, 0.592f, 0.296f, 1),
    ADVANCED_ALLOY(266, 1.33f, 0.67f, 3),
    ALLTHEMODIUM(1066, 2.33f, 1.67f, 2),
    ALUMINUM(10, 2.33f, 0.0f, 5),
    AMETHYST(222, 1.53f, 0.53f, 6),
    ANGLESITE(283, 1.73f, 0.87f, 5),
    ANTIMONY(50, 1.17f, 0.4f, 2),
    APATITE(166, 1.33f, 0.5f, 3),
    AQUITE(250, 1.5f, 0.67f, 4),
    ATOMIC_ALLOY(666, 2.0f, 1.17f, 4),
    BASALZ(50, 1.67f, 0.6f, 4),
    BEDROCK(3333, 0.33f, 0.83f, 1),
    BENITOITE(300, 1.83f, 0.97f, 6),
    BERYLLIUM(60, 1.27f, 0.47f, 2),
    BIOSTEEL(183, 1.33f, 0.63f, 5),
    BISMUTH(60, 1.13f, 0.43f, 3),
    BISMUTH_BRONZE(56, 1.23f, 0.53f, 3),
    BLACK_BRONZE(60, 1.2f, 0.57f, 2),
    BLACK_STEEL(333, 1.17f, 0.73f, 3),
    BLAST_PROOF_ALLOY(1000, 1.5f, 1.33f, 2),
    BLAZE(40, 1.4f, 0.5f, 5),
    BLITZ(53, 1.83f, 0.63f, 5),
    BLIZZ(46, 1.73f, 0.57f, 4),
    BLOOD_IRON(466, 1.4f, 1.0f, 5),
    BLUE_STEEL(133, 1.13f, 0.63f, 3),
    BLUTONIUM(666, 1.93f, 1.13f, 6),
    BONE(15, 0.67f, 0.17f, 2),
    BRASS(46, 1.5f, 0.43f, 3),
    BREEZE(36, 1.67f, 0.17f, 4),
    BRONZE(53, 1.27f, 0.5f, 2),
    CADMIUM(73, 1.07f, 0.43f, 2),
    CARBON(333, 1.83f, 0.67f, 4),
    CERTUS_QUARTZ(20, 2.17f, 0.27f, 9),
    CERTUS_QUARTZ_CRYSTAL(166, 1.6f, 0.6f, 4),
    CHAROITE(366, 1.53f, 0.77f, 5),
    CINNABAR(33, 1.17f, 0.43f, 5),
    COBALT(366, 1.47f, 0.77f, 2),
    COMPRESSED_IRON(266, 1.6f, 1.0f, 4),
    CONSTANTAN(43, 1.33f, 0.47f, 3),
    COPPER(44, 1.47f, 0.4f, 3),
    CUPRONICKEL(300, 1.4f, 0.67f, 3),
    CYANITE(500, 1.4f, 0.93f, 3),
    DARK_STEEL(600, 1.17f, 1.0f, 3),
    DIAMOND(500, 2.0f, 1.0f, 3),
    DIOPSIDE(266, 1.47f, 0.73f, 4),
    DURATIUM(666, 1.17f, 1.0f, 1),
    ELECTRUM(8, 2.5f, 0.0f, 6),
    ELEMENTIUM(300, 1.67f, 0.83f, 6),
    EMERALD(200, 1.4f, 0.47f, 4),
    ENCHANTED(89, 4.0f, 0.0f, 45),
    ENCHANTED_BLOOD_IRON(600, 1.67f, 1.17f, 7),
    END(44, 1.77f, 0.57f, 5),
    ENDERIUM(466, 1.67f, 0.93f, 4),
    ENDER_CRYSTAL(833, 2.07f, 1.27f, 6),
    END_STEEL(566, 1.33f, 1.07f, 3),
    ENERGETIC_ALLOY(433, 1.93f, 1.0f, 6),
    ENERGITE(133, 2.33f, 0.67f, 7),
    ENERGIZED_COPPER(466, 1.83f, 0.93f, 5),
    ENERGIZED_GOLD(300, 2.17f, 0.83f, 7),
    FALSITE(1000, 0.33f, 0.33f, 4),
    FLUIX(16, 2.0f, 0.17f, 10),
    FLUORITE(16, 2.5f, 0.0f, 7),
    GLOWSTONE(33, 2.33f, 0.5f, 8),
    GOLD(10, 3.333f, 0.0f, 7),
    GRAPHITE(100, 1.67f, 0.6f, 4),
    PLASTIC(26, 2.0f, 0.17f, 1),
    HIGH_CARBON_BLACK_STEEL(400, 1.23f, 0.8f, 3),
    HIGH_CARBON_BLUE_STEEL(166, 1.2f, 0.7f, 3),
    HIGH_CARBON_RED_STEEL(183, 1.2f, 0.72f, 4),
    HIGH_CARBON_STEEL(116, 1.17f, 0.67f, 3),
    HORIZONITE(466, 1.93f, 1.13f, 6),
    INANITE(1066, 2.6f, 1.6f, 9),
    INFUSED_ALLOY(600, 1.83f, 1.07f, 4),
    INSANITE(1000, 2.5f, 1.5f, 8),
    INVAR(66, 1.0f, 0.57f, 3),
    IRIDIUM(533, 1.67f, 1.0f, 4),
    IRON(63, 1.333f, 0.666f, 4),
    KANTHAL(266, 1.73f, 0.73f, 4),
    LEAD(15, 0.67f, 0.27f, 2),
    LUDICRITE(733, 1.6f, 1.17f, 4),
    LUMIUM(100, 1.67f, 0.67f, 7),
    MAGENTITE(533, 1.77f, 1.07f, 5),
    MANASTEEL(233, 1.6f, 0.67f, 10),
    MANGANESE(100, 1.0f, 0.53f, 2),
    NETHERITE(657, 2.333f, 1.333f, 5),
    NETHERITE_DIAMOND(1166, 1.73f, 1.33f, 3),
    NETHERITE_EMERALD(1100, 1.67f, 1.27f, 4),
    NETHERITE_GOLD(1033, 2.17f, 1.17f, 6),
    NETHERITE_IRON(1066, 1.83f, 1.2f, 5),
    NICKEL(46, 1.0f, 0.5f, 3),
    OBSIDIAN(833, 0.67f, 0.67f, 2),
    OPAL(400, 1.5f, 0.93f, 5),
    OSMIUM(566, 1.5f, 1.07f, 2),
    PERIDOT(200, 1.4f, 0.5f, 5),
    PIG_IRON(66, 0.93f, 0.5f, 2),
    PINK_SLIME(466, 1.67f, 0.93f, 5),
    PLATINUM(500, 1.6f, 0.97f, 5),
    PLUTONIUM(833, 1.17f, 1.5f, 1),
    PRISMARINE(233, 1.43f, 0.7f, 4),
    PULSATING_ALLOY(566, 2.0f, 1.07f, 5),
    PYRITE(40, 0.83f, 0.33f, 2),
    PYROPE(300, 1.73f, 0.93f, 5),
    QUARTZ(13, 1.67f, 0.17f, 6),
    REDSTONE(200, 2.33f, 0.5f, 8),
    RED_STEEL(150, 1.13f, 0.65f, 4),
    REINFORCED_ALLOY(833, 1.93f, 1.23f, 4),
    RIDICULITE(1666, 2.17f, 1.67f, 10),
    ROSE_GOLD(8, 2.13f, 0.0f, 5),
    RUBY(216, 1.5f, 0.53f, 5),
    SAPPHIRE(216, 1.5f, 0.53f, 5),
    SIGNALUM(333, 2.0f, 0.83f, 6),
    SILICON(200, 1.17f, 0.6f, 6),
    SILVER(33, 1.67f, 0.27f, 6),
    SOLARIUM(500, 1.87f, 1.1f, 6),
    SOULARIUM(533, 1.8f, 1.07f, 6),
    STAINLESS_STEEL(466, 1.53f, 1.0f, 4),
    STEEL(100, 1.07f, 0.6f, 3),
    STERLING_SILVER(90, 1.73f, 0.53f, 8),
    STONE(24, 0.666f, 0.333f, 1),
    STONE_BASE(72, 2.0f, 1.0f, 5),
    SUPERCONDUCTOR(600, 2.5f, 0.93f, 8),
    TERRASTEEL(500, 1.73f, 0.9f, 4),
    THORIUM(666, 1.33f, 1.27f, 1),
    TIN(40, 1.4f, 0.37f, 2),
    TITANIUM(400, 1.5f, 0.8f, 3),
    TOPAZ(183, 1.33f, 0.5f, 6),
    TUNGSTEN(600, 1.27f, 1.0f, 1),
    UNOBTAINIUM(800, 2.07f, 1.4f, 5),
    URANIUM(466, 1.27f, 1.0f, 1),
    VENTIUM(400, 1.87f, 0.9f, 6),
    VIBRANIUM(633, 1.83f, 1.17f, 6),
    VIBRANT_ALLOY(600, 2.07f, 1.23f, 7),
    WEAK_BLUE_STEEL(116, 1.07f, 0.57f, 3),
    WEAK_RED_STEEL(116, 1.07f, 0.58f, 3),
    WEAK_STEEL(83, 1.0f, 0.53f, 3),
    WITHER_BONE(26, 1.5f, 0.67f, 4),
    WOOD(19, 0.666f, 0.0f, 5),
    WROUGHT_IRON(43, 0.9f, 0.43f, 2),
    YELLORIUM(600, 1.47f, 1.07f, 2),
    ZANITE(233, 1.5f, 0.6f, 5),
    ZINC(36, 1.33f, 0.33f, 2);


    private final int   uses;
    private final float speed;
    private final float damage;
    private final int   enchantability;


    Materials(int uses, float speed, float damage, int enchantability) {
        this.uses           = uses;
        this.speed          = speed;
        this.damage         = damage;
        this.enchantability = enchantability;
    }

    public int    getUses()           { return uses; }
    public float  getSpeed()          { return speed; }
    public float  getDamage()         { return damage; }
    public int    getEnchantability() { return enchantability; }
    public String getName()           { return name().toString().toLowerCase(); }
    public String getRegistryName()   { return getName().replace("_", ""); }


    public static Optional<Materials> fromName(String name) {
        try {
            String key = ToolUtils.transformMaterialNames(name).trim().toUpperCase().replace(' ', '_');
            return Optional.of(valueOf(key));

        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
