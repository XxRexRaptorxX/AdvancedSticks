package xxrexraptorxx.advancedtools.utils.enums;

import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Optional;

public enum Materials {

//   name | durability | mining_speed | attack_damage | enchantability | attack_speed (unused)
    ADAMANT(600, 1.33f, 1.07f, 2, 1.20f),
    ADVANCED(118, 0.592f, 0.296f, 1, 1.00f),
    ADVANCED_ALLOY(266, 1.33f, 0.67f, 3, 0.90f),
    ALLTHEMODIUM(1066, 2.33f, 1.67f, 2, 1.25f),
    ALUMINUM(10, 2.33f, 0.0f, 5, 0.75f),
    AMETHYST(222, 1.53f, 0.53f, 6, 1.05f),
    ANGLESITE(283, 1.73f, 0.87f, 5, 0.40f),
    ANTIMONY(50, 1.17f, 0.4f, 2, 0.60f),
    APATITE(166, 1.33f, 0.5f, 3, 0.60f),
    AQUITE(250, 1.5f, 0.67f, 4, 1.00f),
    ATOMIC_ALLOY(666, 2.0f, 1.17f, 4, 2.00f),
    BASALZ(50, 1.67f, 0.6f, 4, 0.55f),
    BEDROCK(3333, 0.33f, 0.83f, 1, 0.50f),
    BENITOITE(300, 1.83f, 0.97f, 6, 1.05f),
    BERYLLIUM(60, 1.27f, 0.47f, 2, 1.00f),
    BIOSTEEL(183, 1.33f, 0.63f, 5, 0.85f),
    BISMUTH(60, 1.13f, 0.43f, 3, 0.70f),
    BISMUTH_BRONZE(56, 1.23f, 0.53f, 3, 0.85f),
    BLACK_BRONZE(60, 1.2f, 0.57f, 2, 0.85f),
    BLACK_STEEL(333, 1.17f, 0.73f, 3, 0.88f),
    BLAST_PROOF_ALLOY(1000, 1.5f, 1.33f, 2, 0.80f),
    BLAZE(40, 1.4f, 0.5f, 5, 0.70f),
    BLITZ(53, 1.83f, 0.63f, 5, 1.15f),
    BLIZZ(46, 1.73f, 0.57f, 4, 1.05f),
    BLOOD_IRON(466, 1.4f, 1.0f, 5, 0.85f),
    BLUE_STEEL(133, 1.13f, 0.63f, 3, 0.88f),
    BLUTONIUM(666, 1.93f, 1.13f, 6, 1.10f),
    BONE(15, 0.67f, 0.17f, 2, 0.30f),
    BRASS(46, 1.5f, 0.43f, 3, 0.82f),
    BREEZE(36, 1.67f, 0.17f, 4, 1.05f),
    BRONZE(53, 1.27f, 0.5f, 2, 0.80f),
    CADMIUM(73, 1.07f, 0.43f, 2, 0.75f),
    CARBON(333, 1.83f, 0.67f, 4, 0.75f),
    CERTUS_QUARTZ(20, 2.17f, 0.27f, 9, 1.00f),
    CERTUS_QUARTZ_CRYSTAL(166, 1.6f, 0.6f, 4, 1.00f),
    CHAROITE(366, 1.53f, 0.77f, 5, 1.05f),
    CINNABAR(33, 1.17f, 0.43f, 5, 0.50f),
    COBALT(366, 1.47f, 0.77f, 2, 0.90f),
    COMPRESSED_IRON(266, 1.6f, 1.0f, 4, 0.85f),
    CONSTANTAN(43, 1.33f, 0.47f, 3, 0.82f),
    COPPER(44, 1.47f, 0.4f, 3, 0.70f),
    CUPRONICKEL(300, 1.4f, 0.67f, 3, 0.82f),
    CYANITE(500, 1.4f, 0.93f, 3, 1.05f),
    DARK_STEEL(600, 1.17f, 1.0f, 3, 0.90f),
    DIAMOND(500, 2.0f, 1.0f, 3, 1.20f),
    DIOPSIDE(266, 1.47f, 0.73f, 4, 1.05f),
    DURATIUM(666, 1.17f, 1.0f, 1, 1.10f),
    ELECTRUM(8, 2.5f, 0.0f, 6, 0.45f),
    ELEMENTIUM(300, 1.67f, 0.83f, 6, 1.15f),
    EMERALD(200, 1.4f, 0.47f, 4, 1.15f),
    ENCHANTED(89, 4.0f, 0.0f, 45, 1.20f),
    ENCHANTED_BLOOD_IRON(600, 1.67f, 1.17f, 7, 1.67f),
    END(44, 1.77f, 0.57f, 5, 1.10f),
    ENDERIUM(466, 1.67f, 0.93f, 4, 1.10f),
    ENDER_CRYSTAL(833, 2.07f, 1.27f, 6, 1.10f),
    END_STEEL(566, 1.33f, 1.07f, 3, 1.10f),
    ENERGETIC_ALLOY(433, 1.93f, 1.0f, 6, 1.93f),
    ENERGITE(133, 2.33f, 0.67f, 7, 1.10f),
    ENERGIZED_COPPER(466, 1.83f, 0.93f, 5, 0.80f),
    ENERGIZED_GOLD(300, 2.17f, 0.83f, 7, 0.30f),
    FALSITE(1000, 0.33f, 0.33f, 4, 1.00f),
    FLUIX(16, 2.0f, 0.17f, 10, 1.05f),
    FLUORITE(16, 2.5f, 0.0f, 7, 1.05f),
    GLOWSTONE(33, 2.33f, 0.5f, 8, 0.60f),
    GOLD(10, 3.333f, 0.0f, 7, 0.2f),
    GRAPHITE(100, 1.67f, 0.6f, 4, 0.75f),
    PLASTIC(26, 2.0f, 0.17f, 1, 0.25f),
    HIGH_CARBON_BLACK_STEEL(400, 1.23f, 0.8f, 3, 0.90f),
    HIGH_CARBON_BLUE_STEEL(166, 1.2f, 0.7f, 3, 0.80f),
    HIGH_CARBON_RED_STEEL(183, 1.2f, 0.72f, 4, 0.90f),
    HIGH_CARBON_STEEL(116, 1.17f, 0.67f, 3, 0.90f),
    HORIZONITE(466, 1.93f, 1.13f, 6, 1.00f),
    INANITE(1066, 2.6f, 1.6f, 9, 1.10f),
    INFUSED_ALLOY(600, 1.83f, 1.07f, 4, 0.90f),
    INSANITE(1000, 2.5f, 1.5f, 8, 1.10f),
    INVAR(66, 1.0f, 0.57f, 3, 0.83f),
    IRIDIUM(533, 1.67f, 1.0f, 4, 1.10f),
    IRON(63, 1.333f, 0.666f, 4, 0.866f),
    KANTHAL(266, 1.73f, 0.73f, 4, 0.70f),
    LEAD(15, 0.67f, 0.27f, 2, 0.70f),
    LUDICRITE(733, 1.6f, 1.17f, 4, 1.15f),
    LUMIUM(100, 1.67f, 0.67f, 7, 0.45f),
    MAGENTITE(533, 1.77f, 1.07f, 5, 1.10f),
    MANASTEEL(233, 1.6f, 0.67f, 10, 1.00f),
    MANGANESE(100, 1.0f, 0.53f, 2, 0.80f),
    NETHERITE(657, 2.333f, 1.333f, 5, 1.25f),
    NETHERITE_DIAMOND(1166, 1.73f, 1.33f, 3, 1.25f),
    NETHERITE_EMERALD(1100, 1.67f, 1.27f, 4, 1.25f),
    NETHERITE_GOLD(1033, 2.17f, 1.17f, 6, 1.20f),
    NETHERITE_IRON(1066, 1.83f, 1.2f, 5, 1.15f),
    NICKEL(46, 1.0f, 0.5f, 3, 0.80f),
    OBSIDIAN(833, 0.67f, 0.67f, 2, 0.60f),
    OPAL(400, 1.5f, 0.93f, 5, 1.00f),
    OSMIUM(566, 1.5f, 1.07f, 2, 0.90f),
    PERIDOT(200, 1.4f, 0.5f, 5, 1.10f),
    PIG_IRON(66, 0.93f, 0.5f, 2, 0.87f),
    PINK_SLIME(466, 1.67f, 0.93f, 5, 0.30f),
    PLATINUM(500, 1.6f, 0.97f, 5, 1.00f),
    PLUTONIUM(833, 1.17f, 1.5f, 1, 0.85f),
    PRISMARINE(233, 1.43f, 0.7f, 4, 0.55f),
    PULSATING_ALLOY(566, 2.0f, 1.07f, 5, 1.15f),
    PYRITE(40, 0.83f, 0.33f, 2, 0.25f),
    PYROPE(300, 1.73f, 0.93f, 5, 1.05f),
    QUARTZ(13, 1.67f, 0.17f, 6, 0.60f),
    REDSTONE(200, 2.33f, 0.5f, 8, 0.55f),
    RED_STEEL(150, 1.13f, 0.65f, 4, 0.90f),
    REINFORCED_ALLOY(833, 1.93f, 1.23f, 4, 0.90f),
    RIDICULITE(1666, 2.17f, 1.67f, 10, 1.10f),
    ROSE_GOLD(8, 2.13f, 0.0f, 5, 0.20f),
    RUBY(216, 1.5f, 0.53f, 5, 1.10f),
    SAPPHIRE(216, 1.5f, 0.53f, 5, 1.10f),
    SIGNALUM(333, 2.0f, 0.83f, 6, 0.60f),
    SILICON(200, 1.17f, 0.6f, 6, 0.55f),
    SILVER(33, 1.67f, 0.27f, 6, 0.70f),
    SOLARIUM(500, 1.87f, 1.1f, 6, 1.05f),
    SOULARIUM(533, 1.8f, 1.07f, 6, 0.85f),
    STAINLESS_STEEL(466, 1.53f, 1.0f, 4, 0.90f),
    STEEL(100, 1.07f, 0.6f, 3, 0.866f),
    STERLING_SILVER(90, 1.73f, 0.53f, 8, 0.70f),
    STONE(24, 0.666f, 0.333f, 1, 0.533f),
    STONE_BASE(72, 2.0f, 1.0f, 5, 2.0f),
    SUPERCONDUCTOR(600, 2.5f, 0.93f, 8, 1.10f),
    TERRASTEEL(500, 1.73f, 0.9f, 4, 1.10f),
    THORIUM(666, 1.33f, 1.27f, 1, 0.85f),
    TIN(40, 1.4f, 0.37f, 2, 0.75f),
    TITANIUM(400, 1.5f, 0.8f, 3, 0.90f),
    TOPAZ(183, 1.33f, 0.5f, 6, 1.15f),
    TUNGSTEN(600, 1.27f, 1.0f, 1, 0.90f),
    UNOBTAINIUM(800, 2.07f, 1.4f, 5, 1.25f),
    URANIUM(466, 1.27f, 1.0f, 1, 0.90f),
    VENTIUM(400, 1.87f, 0.9f, 6, 1.05f),
    VIBRANIUM(633, 1.83f, 1.17f, 6, 1.20f),
    VIBRANT_ALLOY(600, 2.07f, 1.23f, 7, 1.15f),
    WEAK_BLUE_STEEL(116, 1.07f, 0.57f, 3, 0.80f),
    WEAK_RED_STEEL(116, 1.07f, 0.58f, 3, 0.80f),
    WEAK_STEEL(83, 1.0f, 0.53f, 3, 0.80f),
    WITHER_BONE(26, 1.5f, 0.67f, 4, 1.15f),
    WOOD(19, 0.666f, 0.0f, 5, 0.2f),
    WROUGHT_IRON(43, 0.9f, 0.43f, 2, 0.85f),
    YELLORIUM(600, 1.47f, 1.07f, 2, 1.10f),
    ZANITE(233, 1.5f, 0.6f, 5, 1.05f),
    ZINC(36, 1.33f, 0.33f, 2, 0.75f);

    //Tool value calculation:   handle_material_value * 2 + head_material_value * 3 = final tool value


    private final int   uses;
    private final float speed;
    private final float damage;
    private final int   enchantability;
    private final float attackSpeed;


    Materials(int uses, float speed, float damage, int enchantability, float attackSpeed) {
        this.uses           = uses;
        this.speed          = speed;
        this.damage         = damage;
        this.enchantability = enchantability;
        this.attackSpeed    = attackSpeed;
    }


    public int    getUses()           { return uses; }
    public float  getSpeed()          { return speed; }
    public float  getDamage()         { return damage; }
    public int    getEnchantability() { return enchantability; }
    public float  getAttackSpeed()    { return attackSpeed; }
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
