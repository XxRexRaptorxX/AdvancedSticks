package xxrexraptorxx.advancedtools.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.registry.ModToolMaterials;
import xxrexraptorxx.advancedtools.utils.enums.ToolMaterialStatTypes;

import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.util.Arrays;
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
            return FormattingUtils.setModLangComponent("item","stick_wood").getString();

        } else {
            String handle = Objects.requireNonNull(getPartsFromTool(name))[0];

            if (isVanillaRod(handle)) {
                if(handle.equals("end")) {
                    return Component.translatable("block.minecraft." + handle + "_rod").getString();
                } else {
                    return Component.translatable("item.minecraft." + handle + "_rod").getString();
                }

            } else {
                return FormattingUtils.setModLangComponent("item","stick_" + handle).getString();
            }
        }
    }


    private static final Pattern MODDED_NAME_PATTERN = Pattern.compile("^([a-zA-Z0-9]+)_stick_([a-zA-Z0-9]+)_([a-zA-Z0-9]+)$");
    private static final Pattern VANILLA_NAME_PATTERN = Pattern.compile("^([a-zA-Z0-9]+)_([a-zA-Z0-9]+)$");
    private static final Pattern TM_NAME_PATTERN = Pattern.compile("^([a-zA-Z0-9]+)_([a-zA-Z0-9]+)$");

    /**
     * Extracts handleMaterial, headMaterial and toolType from the item name.
     * Supports both mod tools and vanilla tools.
     *
     * @param toolName The registry name of the tool (e.g. "wood_stick_iron_pickaxe" or "iron_pickaxe")
     * @return A string array {handleMaterial, headMaterial, toolType} or null on error
     */
    public static String[] getPartsFromTool(String toolName) {
        Matcher modMatcher = MODDED_NAME_PATTERN.matcher(toolName);

        // MODDED SCHEME
        if (modMatcher.matches()) {
            return new String[]{modMatcher.group(1), modMatcher.group(2), modMatcher.group(3)};
        }

        // VANILLA SCHEME
        Matcher vanillaMatcher = VANILLA_NAME_PATTERN.matcher(toolName);
        if (vanillaMatcher.matches()) {
            String headMaterial = vanillaMatcher.group(1);
            String toolType = vanillaMatcher.group(2);
            return new String[]{"wood", headMaterial, toolType};
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
    public static Component getToolTranslationKey(Item item) {
        String itemName = BuiltInRegistries.ITEM.getKey(item).getPath();
        String handleMaterial = Objects.requireNonNull(getPartsFromTool(itemName))[0];
        String headMaterial = Objects.requireNonNull(getPartsFromTool(itemName))[1];
        String toolType = Objects.requireNonNull(getPartsFromTool(itemName))[2];

        //VANILLA
        if (Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(headMaterial) && handleMaterial.equals("wood")) {
            //name fix
            if (headMaterial.equals("wood")) {
                headMaterial = "wooden";
            } else if (headMaterial.equals("gold")) {
                headMaterial = "golden";
            }

            String vanillaItemName = headMaterial + "_" + toolType;
            Item vanillaItem = BuiltInRegistries.ITEM.getOptional(ResourceLocation.withDefaultNamespace(vanillaItemName)).orElse(Items.AIR);

            if (vanillaItem == Items.AIR) AdvancedTools.LOGGER.error("Invalid item! [" + item + "]");

            return Component.translatable(vanillaItem.getDescriptionId());

        //MODDED
        } else {
            return FormattingUtils.setModLangComponent("material", headMaterial).append(" ")
                    .append(FormattingUtils.setModLangComponent("tooltype", toolType));
        }

    }


    /**
     * Tests whether the material is a gemstone
     */
    public static boolean isGem(String material) {
        return switch (material) {
            case "diamond", "emerald", "amethyst", "quartz", "topaz", "peridot", "ruby", "sapphire", "certusquartz",
                 "fluorite", "cinnabar", "apatite", "aquite", "certusquartzcrystal", "charoite", "diopside",
                 "fluix", "prismarine", "pyrope", "opal", "anglesite", "benitoite", "zanite", "endercrystal", "pyrite"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the basic raw material of the material is neither a gem nor an ingot or the material has multiple possible item tags
     */
    public static boolean isSpecial(String material) {
        return switch (material) {
            case "advanced", "enchanted", "bone", "witherbone", "end", "blaze", "breeze", "basalz",
                 "blizz", "blitz", "carbon", "plastic", "glowstone", "redstone", "superconductor", "obsidian",
                 "bedrock", "silicon", "wood", "wooden", "stone"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the material belongs to a rod item
     */
    public static boolean isRod(String material) {
        return switch (material) {
            case "end", "blaze", "breeze", "basalz", "blizz", "blitz", "wood", "stick"
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
     * Tests whether the material is fire & lava safe
     */
    public static boolean isFireResistant(String material) {
        return switch (material) {
            case "netherite", "netheriteiron", "netheritegold", "netheritediamond", "netheriteemerald", "bedrock", "obsidian", "allthemodium", "vibranium", "unobtainium"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the rod fulfills all criteria to appear in the creative tab
     */
    public static boolean isValidRodForCreative(String rod) {
        if (Config.FORCE_ALL_MATERIALS.get()) {
            return true;

        } else {
            return Config.HANDLE_MATERIALS.get().contains(rod) && ModTags.isTagValidAndHasMatchingItems(rod);
        }
    }


    /**
     * Tests whether the item fulfills all criteria to appear in the creative tab
     */
    public static boolean isValidForCreative(String head, String handle) {
        if (Config.FORCE_ALL_MATERIALS.get()) {
            return true;

        } else {
            return Config.HANDLE_MATERIALS.get().contains(handle) && Config.TOOL_HEAD_MATERIALS.get().contains(head) &&
                    ModTags.isTagValidAndHasMatchingItems(handle) && ModTags.isTagValidAndHasMatchingItems(head);
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
        if (material.equals("compressediron")) material = "compressed_iron";
        if (material.equals("pinkslime")) material = "pink_slime";
        if (material.equals("endercrystal")) material = "ender_crystal";
        if (material.equals("hdpe")) material = "plastic"; //name fix to make HDPE more versatile
        if (material.equals("bluesteel")) material = "blue_steel";
        if (material.equals("highcarbonbluesteel")) material = "high_carbon_blue_steel";
        if (material.equals("wroughtiron")) material = "wrought_iron";
        if (material.equals("weaksteel")) material = "weak_steel";
        if (material.equals("highcarbonblacksteel")) material = "high_carbon_black_steel";
        if (material.equals("blackbronze")) material = "black_bronze";
        if (material.equals("bismuthbronze")) material = "bismuth_bronze";
        if (material.equals("highcarbonredsteel")) material = "high_carbon_red_steel";
        if (material.equals("redsteel")) material = "red_steel";
        if (material.equals("highcarbonsteel")) material = "high_carbon_steel";
        if (material.equals("rosegold")) material = "rose_gold";
        if (material.equals("weakredsteel")) material = "weak_red_steel";
        if (material.equals("pigiron")) material = "pig_iron";
        if (material.equals("weakbluesteel")) material = "weak_blue_steel";
        if (material.equals("sterlingsilver")) material = "sterling_silver";
        if (material.equals("blacksteel")) material = "black_steel";

        if (material.contains("alloy")) material = material.replace("alloy", "_alloy");

        return material;
    }


    @Nullable
    public static MobEffectInstance getHandleMaterialEffect(String material) {
        if (Config.DISABLED_MATERIAL_EFFECTS.get().contains(material)) return null;

        return switch (material) {
            case "lumium", "glowstone" -> new MobEffectInstance(MobEffects.GLOWING, 30);
            case "breeze" -> new MobEffectInstance(MobEffects.JUMP_BOOST, 30);
            case "bloodiron", "soularium" -> new MobEffectInstance(MobEffects.BAD_OMEN, 30);
            case "enchantedbloodiron" -> new MobEffectInstance(MobEffects.BAD_OMEN, 30, 1);
            case "endsteel" -> new MobEffectInstance(MobEffects.SLOW_FALLING, 30);
            case "rosegold" -> getOptionalEffect("love", 30, 0 , MobEffects.LUCK);
            case "sterlingsilver" -> new MobEffectInstance(MobEffects.LUCK, 30);
            case "vibranium" -> new MobEffectInstance(MobEffects.RESISTANCE, 30);
            case "end" -> new MobEffectInstance(MobEffects.NIGHT_VISION, 30);
            case "blaze", "pyrope" -> getOptionalEffect("warming", 30, 0, MobEffects.FIRE_RESISTANCE);
            case "solarium", "elementium" -> getOptionalEffect("photosynthesis", 30, 0, MobEffects.GLOWING);
            case "aquite", "prismarine" -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 30);
            case "pinkslime" -> new MobEffectInstance(MobEffects.OOZING, 30);
            case "emerald" -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 30);
            case "amethyst" -> getOptionalEffect("magic_resistance", 30, 0, MobEffects.LUCK);
            case "superconductor", "electrum" -> getOptionalEffect("conductive", 30, 0, null);
            case "opal" -> getOptionalEffect("nullifier", "remove_effects", 30, 0, MobEffects.LUCK);
            case "magnetite" -> getOptionalEffect("magnetizing", "magnetic", 30, 0, null);
            case "enchanted" -> getOptionalEffect("water_walk", 30, 0, MobEffects.SLOW_FALLING);
            case "blastproofalloy" -> getOptionalEffect("explosion_resistance", 30, 0, null);
            case "horizonite" -> getOptionalEffect("spiderclimb", "spider_climb", 30, 0, null);
            default -> null;
        };
    }


    @Nullable
    public static MobEffectInstance getHandleMaterialRandomEffect(String material) {
        if (Config.DISABLED_MATERIAL_EFFECTS.get().contains(material)) return null;

        Random random = new Random();

        return switch (material) {
            case "uranium", "thorium", "yellorium", "cyanite", "ludicrite" -> getOptionalEffect("radiation", random.nextInt(100, 1000), 0, MobEffects.POISON);
            case "plutonium", "blutonium", "magentite", "ridiculite", "inanite", "insanite" -> getOptionalEffect("radiation", random.nextInt(100, 1000), 1, MobEffects.POISON);
            case "witherbone" -> new MobEffectInstance(MobEffects.WITHER, random.nextInt(100, 300));
            case "darksteel" -> new MobEffectInstance(MobEffects.DARKNESS, random.nextInt(100, 300));
            case "energeticalloy", "fluix" -> getOptionalEffect("hyperactive", random.nextInt(100, 300), 0, MobEffects.HASTE);
            case "terrasteel" -> getOptionalEffect("ore_sense", random.nextInt(100, 500), 0, MobEffects.HASTE);
            case "prismarine" -> getOptionalEffect("swimspeed", random.nextInt(100, 300), 0, MobEffects.DOLPHINS_GRACE);
            case "manasteel", "certusquartz" -> getOptionalEffect("mana", "manafruit", random.nextInt(100, 500), 0, MobEffects.LUCK);
            case "pulsatingalloy" -> new MobEffectInstance(MobEffects.NIGHT_VISION, random.nextInt(100, 800));
            case "atomicalloy" -> new MobEffectInstance(MobEffects.REGENERATION, random.nextInt(100, 300));
            case "enderium" -> getOptionalEffect("teleportation", "enderlock", random.nextInt(100, 300), 0, MobEffects.INFESTED);
            case "duratium", "falsite", "pigiron" -> new MobEffectInstance(MobEffects.SATURATION, random.nextInt(100, 500));
            case "energizedcopper", "energizedgold", "energite" -> getOptionalEffect("supercharge", "hyperactive", random.nextInt(300, 500), 0, MobEffects.SPEED);
            case "basalz" -> new MobEffectInstance(MobEffects.WEAKNESS, random.nextInt(100, 300));
            case "blitz" -> new MobEffectInstance(MobEffects.WIND_CHARGED, random.nextInt(100, 300));
            case "blizz" -> getOptionalEffect("freezing", random.nextInt(100, 300), 0, null);
            case "allthemodium", "unobtainium" -> new MobEffectInstance(MobEffects.STRENGTH, random.nextInt(100, 300));
            case "endercrystal" -> getOptionalEffect("enderlock", "air_swim", random.nextInt(100, 300), 0, MobEffects.NIGHT_VISION);
            default -> null;
        };
    }


    @Nullable
    public static MobEffectInstance getHeadMaterialEffect(String material) {
        if (Config.DISABLED_MATERIAL_EFFECTS.get().contains(material)) return null;

        Random random = new Random();

        return switch (material) {
            case "lumium", "solarium", "glowstone" -> new MobEffectInstance(MobEffects.GLOWING, random.nextInt(50, 100));
            case "breeze" -> new MobEffectInstance(MobEffects.JUMP_BOOST, random.nextInt(50, 100));
            case "bloodiron" -> getOptionalEffect("fear", random.nextInt(50, 300), 0, MobEffects.BAD_OMEN);
            case "soularium" -> getOptionalEffect("soulpierced", "fear", random.nextInt(50, 300), 0, MobEffects.BAD_OMEN);
            case "enchantedbloodiron" -> getOptionalEffect("fear", random.nextInt(100, 300), 1, MobEffects.BAD_OMEN);
            case "endsteel" -> new MobEffectInstance(MobEffects.SLOW_FALLING, random.nextInt(50, 100));
            case "rosegold", "sterlingsilver" -> new MobEffectInstance(MobEffects.LUCK, random.nextInt(50, 100));
            case "end" -> getOptionalEffect("flashed", random.nextInt(50, 80), 0, MobEffects.NIGHT_VISION);
            case "blaze", "pyrope" -> getOptionalEffect("burning", random.nextInt(50, 100), 0, MobEffects.FIRE_RESISTANCE);
            case "pinkslime" -> getOptionalEffect("sticky", random.nextInt(50, 200), 0, MobEffects.OOZING);
            case "amethyst" -> getOptionalEffect("nullifier", "remove_effects", random.nextInt(50, 100), 0, MobEffects.LUCK);
            case "superconductor", "electrum" -> getOptionalEffect("conductive", random.nextInt(50, 100), 0, null);
            case "opal" -> getOptionalEffect("curing", random.nextInt(50, 100), 0, MobEffects.UNLUCK);
            case "magnetite" -> getOptionalEffect("magnetizing", "magnetic", random.nextInt(50, 100), 0, null);
            case "enchanted" -> getOptionalEffect("slippery", "weakened_soul", random.nextInt(50, 100), 0, MobEffects.UNLUCK);
            case "terrasteel" -> getOptionalEffect("gravity", "concrete_feet", random.nextInt(50, 100), 0, MobEffects.SLOWNESS);
            default -> null;
        };
    }


    @Nullable
    public static MobEffectInstance getHeadMaterialRandomEffect(String material) {
        if (Config.DISABLED_MATERIAL_EFFECTS.get().contains(material)) return null;

        Random random = new Random();

        return switch (material) {
            case "uranium", "thorium", "yellorium", "cyanite", "ludicrite" -> getOptionalEffect("radiation", random.nextInt(50, 100), 0, MobEffects.POISON);
            case "plutonium", "blutonium", "magentite", "ridiculite", "inanite", "insanite" -> getOptionalEffect("radiation", random.nextInt(100, 150), 1, MobEffects.POISON);
            case "witherbone" -> new MobEffectInstance(MobEffects.WITHER, random.nextInt(50, 100));
            case "darksteel" -> new MobEffectInstance(MobEffects.DARKNESS, random.nextInt(50, 100));
            case "energeticalloy", "fluix" -> getOptionalEffect("explosive", "explosion", random.nextInt(50, 100), 0, MobEffects.HASTE);
            case "manasteel" -> getOptionalEffect("mana_impedance", "mana", random.nextInt(100, 500), 0, MobEffects.UNLUCK);
            case "pulsatingalloy" -> new MobEffectInstance(MobEffects.NIGHT_VISION, random.nextInt(100, 300));
            case "atomicalloy" -> getOptionalEffect("bleeding", random.nextInt(50, 100), 0, MobEffects.WEAKNESS);
            case "enderium" -> getOptionalEffect("teleportation", random.nextInt(50, 100), 0, MobEffects.INFESTED);
            case "duratium", "falsite", "pigiron" -> new MobEffectInstance(MobEffects.HUNGER, random.nextInt(50, 120));
            case "energizedcopper", "energizedgold", "energite" -> getOptionalEffect("supercharge", "hyperactive", random.nextInt(50, 100), 0, MobEffects.SPEED);
            case "basalz" -> getOptionalEffect("concrete_feet", "fear", random.nextInt(50, 100), 0 , MobEffects.WEAKNESS);
            case "blitz" -> new MobEffectInstance(MobEffects.WIND_CHARGED, random.nextInt(100, 500));
            case "infusedalloy" -> getOptionalEffect("corrosive", random.nextInt(50, 100), 0, null);
            case "blizz" -> getOptionalEffect("freezing", random.nextInt(50, 100), 0, null);
            case "bedrock" -> getOptionalEffect("stunned", "stun", random.nextInt(10, 80), 0, null);
            case "endercrystal" -> getOptionalEffect("teleportation", random.nextInt(50, 100), 0, MobEffects.LEVITATION);
            default -> null;
        };
    }



    public static Component getToolStatDescription(String handle, String base) {
        DecimalFormat df = new DecimalFormat("#.##");
        String textSeparator = ": ";
        String lineSeperator = "\n";
        ToolMaterial material = ModToolMaterials.getMaterial(handle, base);

        if (material == null) {
            throw new NullPointerException("Material is null: " + base + "_" + handle);
        }

        MutableComponent description = Component.translatable(FormattingUtils.setLangTag("message","material_stats")).withStyle(ChatFormatting.BLUE);
        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","base").withStyle(ChatFormatting.WHITE).append(" "));
        description.append(FormattingUtils.setModLangComponent("material", base).withStyle(ChatFormatting.YELLOW));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","handle").withStyle(ChatFormatting.WHITE).append(" "));
        description.append(FormattingUtils.setModLangComponent("material", handle).withStyle(ChatFormatting.YELLOW));

        description.append(Component.literal(lineSeperator + lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","mining_level.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("     " + FormattingUtils.getMiningLevel(material)).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.MINING_LEVEL)));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","durability.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("        "  + material.durability()).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.DURABILITY)));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","mining_speed.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("    " + df.format(material.speed())).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.MINING_SPEED)));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","damage.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("           " + df.format(material.attackDamageBonus())).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.DAMAGE)));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","enchantability.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(Component.literal("   " + material.enchantmentValue()).withStyle(FormattingUtils.getToolStatsFormatting(material, ToolMaterialStatTypes.ENCHANTABILITY)));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","hit_effect.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(FormattingUtils.getHeadEffectNamesFromMaterial(base));

        description.append(Component.literal(lineSeperator));
        description.append(FormattingUtils.setModLangComponent("message","hold_effect.jei_desc").append(textSeparator).withStyle(ChatFormatting.WHITE));
        description.append(FormattingUtils.getHandleEffectNamesFromMaterial(handle));

        return description;
    }


    @Nullable
    public static MobEffectInstance getOptionalEffect(String effectId, int duration, int amplifier, @Nullable Holder<MobEffect> alternativeEffect) {
        if (effectId == null) return null;

        for (MobEffect effect : BuiltInRegistries.MOB_EFFECT) {
            ResourceLocation key = BuiltInRegistries.MOB_EFFECT.getKey(effect);

            if (key != null && key.getPath().equals(effectId)) {
                return new MobEffectInstance(BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect), duration, amplifier);
            }
        }

        if (alternativeEffect == null) {
            return null;
        } else {
            return new MobEffectInstance(alternativeEffect, duration, amplifier);
        }
    }


    @Nullable
    public static MobEffectInstance getOptionalEffect(String effectId, String alternativeEffectId, int duration, int amplifier, @Nullable Holder<MobEffect> fallbackEffect) {
        if (effectId == null && alternativeEffectId == null) return null;

        for (MobEffect effect : BuiltInRegistries.MOB_EFFECT) {
            ResourceLocation key = BuiltInRegistries.MOB_EFFECT.getKey(effect);

            if (key != null && key.getPath().equals(effectId)) {
                return new MobEffectInstance(BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect), duration, amplifier);
            }
            if (key != null && key.getPath().equals(alternativeEffectId)) {
                return new MobEffectInstance(BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect), duration, amplifier);
            }
        }

        if (fallbackEffect == null) {
            return null;
        } else {
            return new MobEffectInstance(fallbackEffect, duration, amplifier);
        }
    }

}
