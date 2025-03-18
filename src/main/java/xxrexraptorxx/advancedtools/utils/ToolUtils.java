package xxrexraptorxx.advancedtools.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModTags;

import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToolUtils {

    /**
     *  Returns the cleaned name of the handle type from a tool.
     */
    public static String getStickFromName(Item item) {
        String name = BuiltInRegistries.ITEM.getKey(item).getPath();

        if  (BuiltInRegistries.ITEM.getKey(item).getNamespace().equals(ResourceLocation.DEFAULT_NAMESPACE)) {
            return Component.translatable("item." + References.MODID + ".stick_wood").getString();

        } else {
            String handle = Objects.requireNonNull(getHandleAndBaseMaterialFromItem(name))[0];

            if (isVanillaRod(handle)) {
                if(handle.equals("end")) {
                    return Component.translatable("block.minecraft." + handle + "_rod").getString();
                } else {
                    return Component.translatable("item.minecraft." + handle + "_rod").getString();
                }

            } else {
                return Component.translatable("item." + References.MODID + ".stick_" + handle).getString();
            }
        }
    }


    public static String[] getHandleAndBaseMaterialFromItem(String toolName) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)_stick_([a-zA-Z0-9]+)_");
        Matcher matcher = pattern.matcher(toolName);
        if (matcher.find()) {
            return new String[]{matcher.group(1), matcher.group(2)};
        }

        AdvancedTools.LOGGER.error("Invalid input: " + toolName);
        return null;
    }


    public static String getBaseMaterialFromVanillaItem(String name) {
        name = name.replace("wooden", "wood").replace("golden", "gold");

        if (name.contains("_sword")) return name.replace("_sword", "");
        if (name.contains("_pickaxe")) return name.replace("_pickaxe", "");
        if (name.contains("_axe")) return name.replace("_axe", "");
        if (name.contains("_shovel")) return name.replace("_shovel", "");
        if (name.contains("hoe")) return name.replace("_hoe", "");

        AdvancedTools.LOGGER.error("Invalid input: " + name);
        return null;
    }


    /**
     * Converts the names of the AS-tools into the names of the Vanilla base tools via the translation keys
     */
    public static Component getVanillaToolTranslationKey(Item item) {
        if (item.getDescriptionId().contains("wood_axe")) {
            return Component.translatable(Items.WOODEN_AXE.getName().getString());
        } else if (item.getDescriptionId().contains("wood_pickaxe")) {
            return Component.translatable(Items.WOODEN_PICKAXE.getName().getString());
        } else if (item.getDescriptionId().contains("wood_sword")) {
            return Component.translatable(Items.WOODEN_SWORD.getName().getString());
        } else if (item.getDescriptionId().contains("wood_shovel")) {
            return Component.translatable(Items.WOODEN_SHOVEL.getName().getString());
        } else if (item.getDescriptionId().contains("wood_hoe")) {
            return Component.translatable(Items.WOODEN_HOE.getName().getString());

        } else if (item.getDescriptionId().contains("stone_axe")) {
            return Component.translatable(Items.STONE_AXE.getName().getString());
        } else if (item.getDescriptionId().contains("stone_pickaxe")) {
            return Component.translatable(Items.STONE_PICKAXE.getName().getString());
        } else if (item.getDescriptionId().contains("stone_sword")) {
            return Component.translatable(Items.STONE_SWORD.getName().getString());
        } else if (item.getDescriptionId().contains("stone_shovel")) {
            return Component.translatable(Items.STONE_SHOVEL.getName().getString());
        } else if (item.getDescriptionId().contains("stone_hoe")) {
            return Component.translatable(Items.STONE_HOE.getName().getString());

        } else if (item.getDescriptionId().contains("iron_axe")) {
            return Component.translatable(Items.IRON_AXE.getName().getString());
        } else if (item.getDescriptionId().contains("iron_pickaxe")) {
            return Component.translatable(Items.IRON_PICKAXE.getName().getString());
        } else if (item.getDescriptionId().contains("iron_sword")) {
            return Component.translatable(Items.IRON_SWORD.getName().getString());
        } else if (item.getDescriptionId().contains("iron_shovel")) {
            return Component.translatable(Items.IRON_SHOVEL.getName().getString());
        } else if (item.getDescriptionId().contains("iron_hoe")) {
            return Component.translatable(Items.IRON_HOE.getName().getString());

        } else if (item.getDescriptionId().contains("gold_axe")) {
            return Component.translatable(Items.GOLDEN_AXE.getName().getString());
        } else if (item.getDescriptionId().contains("gold_pickaxe")) {
            return Component.translatable(Items.GOLDEN_PICKAXE.getName().getString());
        } else if (item.getDescriptionId().contains("gold_sword")) {
            return Component.translatable(Items.GOLDEN_SWORD.getName().getString());
        } else if (item.getDescriptionId().contains("gold_shovel")) {
            return Component.translatable(Items.GOLDEN_SHOVEL.getName().getString());
        } else if (item.getDescriptionId().contains("gold_hoe")) {
            return Component.translatable(Items.GOLDEN_HOE.getName().getString());

        } else if (item.getDescriptionId().contains("diamond_axe")) {
            return Component.translatable(Items.DIAMOND_AXE.getName().getString());
        } else if (item.getDescriptionId().contains("diamond_pickaxe")) {
            return Component.translatable(Items.DIAMOND_PICKAXE.getName().getString());
        } else if (item.getDescriptionId().contains("diamond_sword")) {
            return Component.translatable(Items.DIAMOND_SWORD.getName().getString());
        } else if (item.getDescriptionId().contains("diamond_shovel")) {
            return Component.translatable(Items.DIAMOND_SHOVEL.getName().getString());
        } else if (item.getDescriptionId().contains("diamond_hoe")) {
            return Component.translatable(Items.DIAMOND_HOE.getName().getString());

        } else if (item.getDescriptionId().contains("netherite_axe")) {
            return Component.translatable(Items.NETHERITE_AXE.getName().getString());
        } else if (item.getDescriptionId().contains("netherite_pickaxe")) {
            return Component.translatable(Items.NETHERITE_PICKAXE.getName().getString());
        } else if (item.getDescriptionId().contains("netherite_sword")) {
            return Component.translatable(Items.NETHERITE_SWORD.getName().getString());
        } else if (item.getDescriptionId().contains("netherite_shovel")) {
            return Component.translatable(Items.NETHERITE_SHOVEL.getName().getString());
        } else if (item.getDescriptionId().contains("netherite_hoe")) {
            return Component.translatable(Items.NETHERITE_HOE.getName().getString());

        } else {
            return Component.literal("ERROR!").withStyle(ChatFormatting.DARK_RED);
        }
    }


    /**
     * Tests whether the material is a gemstone
     */
    public static boolean isGem(String material) {
        return switch (material) {
            case "diamond", "emerald", "amethyst", "quartz", "topaz", "peridot", "ruby", "sapphire", "certusquartz",
                 "fluorite", "cinnabar", "apatite", "aquite", "certusquartzcrystal", "charoite", "diopside",
                 "fluix", "prismarine", "pyrope", "opal", "anglesite", "benitoite", "zanite"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the basic raw material of the material is neither a gem nor an ingot
     */
    public static boolean isSpecial(String material) {
        return switch (material) {
            case "advanced", "enchanted", "bone", "witherbone", "end", "blaze", "breeze", "basalz",
                 "blizz", "blitz", "carbon", "hdpe", "plastic"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the material belongs to a Vanilla rod item
     */
    public static boolean isVanillaRod(String material) {
        return switch (material) {
            case "end", "blaze", "breeze"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the material fulfills all criteria to appear in the creative tab
     */
    public static boolean isValidMaterialForCreative(String material) {
        if (Config.FORCE_ALL_MATERIALS.get()) {
            return true;

        } else {
            return ModTags.isTagNotEmpty(material);
        }
    }


    /**
     * Transforms compressed material names into the correct ones
     */
    public static String transformMaterialNames(String material) {
        if (material.equals("certusquartz")) material = "certus_quartz";
        if (material.equals("witherbone")) material = "wither_bone";
        if (material.equals("blastproofalloy")) material = "blast_proofalloy";
        if (material.equals("certusquartzcrystal")) material = "certus_quartz_crystal";
        if (material.equals("darksteel")) material = "dark_steel";
        if (material.equals("endsteel")) material = "end_steel";
        if (material.equals("energizedcopper")) material = "energized_copper";
        if (material.equals("energizedgold")) material = "energized_gold";
        if (material.equals("stainlesssteel")) material = "stainless_steel";
        if (material.equals("bloodiron")) material = "blood_infused_iron";
        if (material.equals("enchantedbloodiron")) material = "blood_infused_enchanted_iron";
        if (material.equals("netheritediamond")) material = "netherite_diamond";
        if (material.equals("netheriteemerald")) material = "netherite_emerald";
        if (material.equals("netheritegold")) material = "netherite_gold";
        if (material.equals("netheriteiron")) material = "netherite_iron";

        if (material.contains("alloy")) material = material.replace("alloy", "_alloy");

        return material;
    }


    @Nullable
    public static MobEffectInstance getHandleMaterialEffect(String material) {
        return switch (material) {
            case "lumium", "solarium", "glowstone" -> new MobEffectInstance(MobEffects.GLOWING, 300);
            case "breeze" -> new MobEffectInstance(MobEffects.JUMP, 300);
            case "bloodiron" -> new MobEffectInstance(MobEffects.BAD_OMEN, 300);
            case "enchantedbloodiron" -> new MobEffectInstance(MobEffects.BAD_OMEN, 300, 1);
            case "endsteel" -> new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 1);
            case "amethyst", "opal" -> new MobEffectInstance(MobEffects.LUCK, 300);
            case "vibranium" -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300);
            case "end" -> new MobEffectInstance(MobEffects.NIGHT_VISION, 300);
            case "blaze", "pyrope" -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300);
            case "aquite" -> new MobEffectInstance(MobEffects.WATER_BREATHING, 300);
            case "enchanted" -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 300);
            default -> null;
        };
    }


    @Nullable
    public static MobEffectInstance getHandleMaterialRandomEffect(String material) {
        Random random = new Random();

        return switch (material) {
            case "uranium", "thorium", "yellorium" -> new MobEffectInstance(MobEffects.POISON, random.nextInt(100, 1000));
            case "plutonium", "blutonium" -> new MobEffectInstance(MobEffects.POISON, random.nextInt(100, 1000), 1);
            case "witherbone" -> new MobEffectInstance(MobEffects.WITHER, random.nextInt(100, 300));
            case "darksteel" -> new MobEffectInstance(MobEffects.DARKNESS, random.nextInt(100, 300));
            case "terrasteel", "energeticalloy", "fluix" -> new MobEffectInstance(MobEffects.DIG_SPEED, random.nextInt(100, 300));
            case "prismarine" -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, random.nextInt(100, 300));
            case "manasteel" -> new MobEffectInstance(MobEffects.LUCK, random.nextInt(100, 300));
            case "pulsatingalloy" -> new MobEffectInstance(MobEffects.NIGHT_VISION, random.nextInt(100, 800));
            case "atomicalloy" -> new MobEffectInstance(MobEffects.REGENERATION, random.nextInt(100, 300));
            case "enderium" -> new MobEffectInstance(MobEffects.INFESTED, random.nextInt(100, 300));
            case "duratium", "falsite" -> new MobEffectInstance(MobEffects.SATURATION, random.nextInt(100, 500));
            case "energizedcopper", "energizedgold" -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, random.nextInt(300, 500));
            case "basalz" -> new MobEffectInstance(MobEffects.WEAKNESS, random.nextInt(100, 300));
            case "blitz" -> new MobEffectInstance(MobEffects.WIND_CHARGED, random.nextInt(100, 300));
            default -> null;
        };
    }


    @Nullable
    public static MobEffectInstance getHeadMaterialEffect(String material) {
        Random random = new Random();

        return switch (material) {
            case "lumium", "solarium", "glowstone" -> new MobEffectInstance(MobEffects.GLOWING, 300);
            case "enchanted" -> new MobEffectInstance(MobEffects.UNLUCK, 300);
            case "breeze" -> new MobEffectInstance(MobEffects.WIND_CHARGED, 300);
            case "bloodiron" -> new MobEffectInstance(MobEffects.BAD_OMEN, 300);
            case "enchantedbloodiron" -> new MobEffectInstance(MobEffects.BAD_OMEN, 300, 1);
            case "endsteel" -> new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 1);
            case "amethyst", "opal" -> new MobEffectInstance(MobEffects.LUCK, 300);
            case "vibranium" -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300);
            case "blaze", "pyrope" -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300);
            default -> null;
        };
    }


    @Nullable
    public static MobEffectInstance getHeadMaterialRandomEffect(String material) {
        Random random = new Random();

        return switch (material) {
            case "uranium", "thorium" -> new MobEffectInstance(MobEffects.POISON, random.nextInt(100, 300));
            case "witherbone" -> new MobEffectInstance(MobEffects.WITHER, random.nextInt(100, 300));
            default -> null;
        };
    }



    public static Component getToolStatDescription(String handle, String base) {
        DecimalFormat df = new DecimalFormat("#.##");
        String textSeparator = ": ";
        String lineSeperator = "\n";
        ToolMaterial material = ToolMaterials.getMaterial(handle, base);

        if (material == null) {
            throw new NullPointerException("Material is null: " + base + "_" + handle);
        }

        MutableComponent description = Component.translatable("message." + References.MODID + ".material_stats").withStyle(ChatFormatting.BLUE);
        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".base").withStyle(ChatFormatting.WHITE));
        description.append(Component.literal(" " + FormattingUtils.capitalizeWords(base)).withStyle(ChatFormatting.YELLOW));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".handle").withStyle(ChatFormatting.WHITE));
        description.append(Component.literal(" " + FormattingUtils.capitalizeWords(handle)).withStyle(ChatFormatting.YELLOW));

        description.append(Component.literal(lineSeperator + lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".mining_level.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("     " + FormattingUtils.getMiningLevel(material.incorrectBlocksForDrops())).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.MINING_LEVEL)));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".durability.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("        "  + material.durability()).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.DURABILITY)));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".mining_speed.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("    " + df.format(material.speed())).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.MINING_SPEED)));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".damage.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("           " + df.format(material.attackDamageBonus())).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.DAMAGE)));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".enchantability.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("   " + material.enchantmentValue()).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.ENCHANTABILITY)));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".hit_effect.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(FormattingUtils.getHeadEffectNamesFromMaterial(base));

        description.append(Component.literal(lineSeperator));
        description.append(Component.translatable("message." + References.MODID + ".hold_effect.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(FormattingUtils.getHandleEffectNamesFromMaterial(handle));

        return description;
    }



}
