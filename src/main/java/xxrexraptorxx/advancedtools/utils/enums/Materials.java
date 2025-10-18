package xxrexraptorxx.advancedtools.utils.enums;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Optional;

public enum Materials {

    // name | durability | mining_speed | attack_damage | enchantability | attack_speed (unused) | mining_level | upgrade slots
    ADAMANT(600, 1.33f, 1.07f, 2, 1.20f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    ADVANCED(118, 0.592f, 0.296f, 1, 1.00f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ADVANCED_ALLOY(266, 1.33f, 0.67f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ALLTHEMODIUM(1066, 2.33f, 1.67f, 2, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4),
    ALUMINUM(10, 2.33f, 0.0f, 5, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    AMETHYST(222, 1.53f, 0.53f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ANGLESITE(283, 1.73f, 0.87f, 5, 0.40f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    ANTIMONY(50, 1.17f, 0.4f, 2, 0.60f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    APATITE(166, 1.33f, 0.5f, 3, 0.60f, BlockTags.INCORRECT_FOR_STONE_TOOL, 1),
    AQUITE(250, 1.5f, 0.67f, 4, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    ATOMIC_ALLOY(666, 2.0f, 1.17f, 4, 2.00f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    BASALZ(50, 1.67f, 0.6f, 4, 0.55f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BEDROCK(3333, 0.33f, 0.83f, 1, 0.50f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1),
    BENITOITE(300, 1.83f, 0.97f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    BERYLLIUM(60, 1.27f, 0.47f, 2, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BIOSTEEL(183, 1.33f, 0.63f, 5, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BISMUTH(60, 1.13f, 0.43f, 3, 0.70f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    BISMUTH_BRONZE(56, 1.23f, 0.53f, 3, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    BLACK_BRONZE(60, 1.2f, 0.57f, 2, 0.85f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 2),
    BLACK_STEEL(333, 1.17f, 0.73f, 3, 0.88f, BlockTags.DIAMOND_ORES, 2),
    BLAST_PROOF_ALLOY(1000, 1.5f, 1.33f, 2, 0.80f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    BLAZE(40, 1.4f, 0.5f, 5, 0.70f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BLITZ(53, 1.83f, 0.63f, 5, 1.15f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BLIZZ(46, 1.73f, 0.57f, 4, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BLOOD_IRON(466, 1.4f, 1.0f, 5, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    BLUE_STEEL(133, 1.13f, 0.63f, 3, 0.88f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    BLUTONIUM(666, 1.93f, 1.13f, 6, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    BONE(15, 0.67f, 0.17f, 2, 0.30f, BlockTags.INCORRECT_FOR_STONE_TOOL, 3),
    BRASS(46, 1.5f, 0.43f, 3, 0.82f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    BREEZE(36, 1.67f, 0.17f, 4, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    BRONZE(53, 1.27f, 0.5f, 2, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    CADMIUM(73, 1.07f, 0.43f, 2, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    CARBON(333, 1.83f, 0.67f, 4, 0.75f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3),
    CERTUS_QUARTZ(20, 2.17f, 0.27f, 9, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    CERTUS_QUARTZ_CRYSTAL(166, 1.6f, 0.6f, 4, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    CHAROITE(366, 1.53f, 0.77f, 5, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    CINNABAR(33, 1.17f, 0.43f, 5, 0.50f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    COBALT(366, 1.47f, 0.77f, 2, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    COMPRESSED_IRON(266, 1.6f, 1.0f, 4, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    CONSTANTAN(43, 1.33f, 0.47f, 3, 0.82f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    COPPER(44, 1.47f, 0.4f, 3, 0.70f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    CUPRONICKEL(300, 1.4f, 0.67f, 3, 0.82f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    CYANITE(500, 1.4f, 0.93f, 3, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    DARK_STEEL(600, 1.17f, 1.0f, 3, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    DIAMOND(500, 2.0f, 1.0f, 3, 1.20f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    DIOPSIDE(266, 1.47f, 0.73f, 4, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    DURATIUM(666, 1.17f, 1.0f, 1, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    ELECTRUM(8, 2.5f, 0.0f, 6, 0.45f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ELEMENTIUM(300, 1.67f, 0.83f, 6, 1.15f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    EMERALD(200, 1.4f, 0.47f, 4, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ENCHANTED(89, 4.0f, 0.0f, 45, 1.20f, BlockTags.INCORRECT_FOR_STONE_TOOL, 3),
    ENCHANTED_BLOOD_IRON(600, 1.67f, 1.17f, 7, 1.67f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    END(44, 1.77f, 0.57f, 5, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    ENDERIUM(466, 1.67f, 0.93f, 4, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ENDER_CRYSTAL(833, 2.07f, 1.27f, 6, 1.10f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2),
    END_STEEL(566, 1.33f, 1.07f, 3, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ENERGETIC_ALLOY(433, 1.93f, 1.0f, 6, 1.93f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ENERGITE(133, 2.33f, 0.67f, 7, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    ENERGIZED_COPPER(466, 1.83f, 0.93f, 5, 0.80f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    ENERGIZED_GOLD(300, 2.17f, 0.83f, 7, 0.30f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 2),
    FALSITE(1000, 0.33f, 0.33f, 4, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    FLUIX(189, 1.8f, 0.7f, 10, 1.05f, BlockTags.INCORRECT_FOR_IRON_TOOL, 3),
    FLUORITE(16, 2.5f, 0.0f, 7, 1.05f, BlockTags.INCORRECT_FOR_STONE_TOOL, 1),
    GLOWSTONE(33, 2.33f, 0.5f, 8, 0.60f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    GOLD(10, 3.333f, 0.0f, 7, 0.2f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 3),
    GRAPHITE(100, 1.67f, 0.6f, 4, 0.75f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    PLASTIC(26, 2.0f, 0.17f, 1, 0.25f, BlockTags.INCORRECT_FOR_WOODEN_TOOL, 4),
    HIGH_CARBON_BLACK_STEEL(400, 1.23f, 0.8f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    HIGH_CARBON_BLUE_STEEL(166, 1.2f, 0.7f, 3, 0.80f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    HIGH_CARBON_RED_STEEL(183, 1.2f, 0.72f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    HIGH_CARBON_STEEL(116, 1.17f, 0.67f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    HORIZONITE(466, 1.93f, 1.13f, 6, 1.00f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    INANITE(1066, 2.6f, 1.6f, 9, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 3),
    INFUSED_ALLOY(600, 1.83f, 1.07f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    INSANITE(1000, 2.5f, 1.5f, 8, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4),
    INVAR(66, 1.0f, 0.57f, 3, 0.83f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    IRIDIUM(533, 1.67f, 1.0f, 4, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    IRON(63, 1.333f, 0.666f, 4, 0.866f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    KANTHAL(266, 1.73f, 0.73f, 4, 0.70f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    LEAD(15, 0.67f, 0.27f, 2, 0.70f, BlockTags.INCORRECT_FOR_STONE_TOOL, 1),
    LUDICRITE(733, 1.6f, 1.17f, 4, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    LUMIUM(100, 1.67f, 0.67f, 7, 0.45f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    MAGENTITE(533, 1.77f, 1.07f, 5, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    MANASTEEL(233, 1.6f, 0.67f, 10, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    MANGANESE(100, 1.0f, 0.53f, 2, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    NETHERITE(657, 2.333f, 1.333f, 5, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    NETHERITE_DIAMOND(1166, 1.73f, 1.33f, 3, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4),
    NETHERITE_EMERALD(1100, 1.67f, 1.27f, 4, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4),
    NETHERITE_GOLD(1033, 2.17f, 1.17f, 6, 1.20f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    NETHERITE_IRON(1066, 1.83f, 1.2f, 5, 1.15f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    NICKEL(46, 1.0f, 0.5f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    OBSIDIAN(833, 0.67f, 0.67f, 2, 0.60f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1),
    OPAL(400, 1.5f, 0.93f, 5, 1.00f, BlockTags.INCORRECT_FOR_STONE_TOOL, 1),
    OSMIUM(566, 1.5f, 1.07f, 2, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    PERIDOT(200, 1.4f, 0.5f, 5, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    PIG_IRON(66, 0.93f, 0.5f, 2, 0.87f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    PINK_SLIME(466, 1.67f, 0.93f, 5, 0.30f, BlockTags.INCORRECT_FOR_IRON_TOOL, 3),
    PLATINUM(500, 1.6f, 0.97f, 5, 1.00f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    PLUTONIUM(833, 1.17f, 1.5f, 1, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    PRISMARINE(233, 1.43f, 0.7f, 4, 0.55f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    PULSATING_ALLOY(566, 2.0f, 1.07f, 5, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    PYRITE(40, 0.83f, 0.33f, 2, 0.25f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    PYROPE(300, 1.73f, 0.93f, 5, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    QUARTZ(13, 1.67f, 0.17f, 6, 0.60f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    REDSTONE(200, 2.33f, 0.5f, 8, 0.55f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    RED_STEEL(150, 1.13f, 0.65f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    REINFORCED_ALLOY(833, 1.93f, 1.23f, 4, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    RIDICULITE(1666, 2.17f, 1.67f, 10, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    ROSE_GOLD(8, 2.13f, 0.0f, 5, 0.20f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 4),
    RUBY(216, 1.5f, 0.53f, 5, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    SAPPHIRE(216, 1.5f, 0.53f, 5, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    SIGNALUM(333, 2.0f, 0.83f, 6, 0.60f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    SILICON(200, 1.17f, 0.6f, 6, 0.55f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 4),
    SILVER(33, 1.67f, 0.27f, 6, 0.70f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 2),
    SOLARIUM(500, 1.87f, 1.1f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    SOULARIUM(533, 1.8f, 1.07f, 6, 0.85f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    STAINLESS_STEEL(466, 1.53f, 1.0f, 4, 0.90f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    STEEL(100, 1.07f, 0.6f, 3, 0.866f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    STERLING_SILVER(90, 1.73f, 0.53f, 8, 0.70f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 3),
    STONE(24, 0.666f, 0.333f, 1, 0.533f, BlockTags.INCORRECT_FOR_STONE_TOOL, 0),
    SUPERCONDUCTOR(600, 2.5f, 0.93f, 8, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL, 3),
    TERRASTEEL(500, 1.73f, 0.9f, 4, 1.10f, BlockTags.INCORRECT_FOR_IRON_TOOL, 2),
    THORIUM(666, 1.33f, 1.27f, 1, 0.85f, BlockTags.INCORRECT_FOR_STONE_TOOL, 2),
    TIN(40, 1.4f, 0.37f, 2, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1),
    TITANIUM(400, 1.5f, 0.8f, 3, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    TOPAZ(183, 1.33f, 0.5f, 6, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    TUNGSTEN(600, 1.27f, 1.0f, 1, 0.90f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    UNOBTAINIUM(800, 2.07f, 1.4f, 5, 1.25f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    URANIUM(466, 1.27f, 1.0f, 1, 0.90f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    VENTIUM(400, 1.87f, 0.9f, 6, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    VIBRANIUM(633, 1.83f, 1.17f, 6, 1.20f, BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3),
    VIBRANT_ALLOY(600, 2.07f, 1.23f, 7, 1.15f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2),
    WEAK_BLUE_STEEL(116, 1.07f, 0.57f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    WEAK_RED_STEEL(116, 1.07f, 0.58f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    WEAK_STEEL(83, 1.0f, 0.53f, 3, 0.80f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    WITHER_BONE(26, 1.5f, 0.67f, 4, 1.15f, BlockTags.INCORRECT_FOR_STONE_TOOL, 3),
    WOOD(19, 0.666f, 0.0f, 5, 0.2f, BlockTags.INCORRECT_FOR_WOODEN_TOOL, 0),
    WROUGHT_IRON(43, 0.9f, 0.43f, 2, 0.85f, BlockTags.INCORRECT_FOR_IRON_TOOL, 1),
    YELLORIUM(600, 1.47f, 1.07f, 2, 1.10f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    ZANITE(233, 1.5f, 0.6f, 5, 1.05f, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1),
    ZINC(36, 1.33f, 0.33f, 2, 0.75f, BlockTags.INCORRECT_FOR_GOLD_TOOL, 1);

    // Tool value calculation: handle_material_value * 2 + head_material_value * 3 = final tool value


    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantability;
    private final float attackSpeed;
    private final TagKey<Block> incorrectForMaterialKey;
    private final int upgradeSlots;


    Materials(int uses, float speed, float damage, int enchantability, float attackSpeed, TagKey<Block> incorrectForMaterialKey, int upgradeSlots) {
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantability = enchantability;
        this.attackSpeed = attackSpeed;
        this.incorrectForMaterialKey = incorrectForMaterialKey;
        this.upgradeSlots = upgradeSlots;
    }


    public int getUses() {
        return uses;
    }


    public float getSpeed() {
        return speed;
    }


    public float getDamage() {
        return damage;
    }


    public int getEnchantability() {
        return enchantability;
    }


    public float getAttackSpeed() {
        return attackSpeed;
    }


    public TagKey<Block> getIncorrectForMaterialKey() {
        return incorrectForMaterialKey;
    }


    public String getName() {
        return name().toLowerCase();
    }


    public String getRegistryName() {
        return getName().replace("_", "");
    }


    public int getUpgradeSlots() {
        return upgradeSlots;
    }


    public static Optional<Materials> fromName(String name) {
        try {
            String key = ToolUtils.transformMaterialNames(name).trim().toUpperCase().replace(' ', '_');
            return Optional.of(valueOf(key));

        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
