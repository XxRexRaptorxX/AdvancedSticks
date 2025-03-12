package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.registry.ModTags;

import java.util.HashMap;
import java.util.Map;

public class ToolUtils {

    /** Returns the cleaned name of the handle type from a AS-Tool.
     *
     * @param item AS-Tool
     * @return name
     */
    public static String getStickFromName(Item item) {
        String name = BuiltInRegistries.ITEM.getKey(item).toString();
        int prefix = References.MODID.length() + 1;

        if(name.contains("rod")) {
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_"));

        } else if (name.contains(References.MODID + ":enchanted_stick") || name.contains(References.MODID + ":advanced_stick")){
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_")) + " " + Component.translatable("item." + ResourceLocation.DEFAULT_NAMESPACE + ".stick").getString();
        } else {
            return name.substring(prefix, prefix + 1).toUpperCase() +
                    name.substring(prefix + 1, name.indexOf("_")) + " " + Component.translatable("item." + References.MODID + ".rod").getString();
        }
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



    private static final Map<String, ToolMaterial> MATERIAL_MAP = new HashMap<>();

    static {
        MATERIAL_MAP.put("wood_bone", ToolMaterials.WOOD_BONE_TM);
        MATERIAL_MAP.put("wood_copper", ToolMaterials.WOOD_COPPER_TM);
        MATERIAL_MAP.put("wood_advanced", ToolMaterials.WOOD_ADVANCED_TM);
        MATERIAL_MAP.put("wood_enchanted", ToolMaterials.WOOD_ENCHANTED_TM);
        MATERIAL_MAP.put("wood_blaze", ToolMaterials.WOOD_BLAZE_TM);
        MATERIAL_MAP.put("wood_emerald", ToolMaterials.WOOD_EMERALD_TM);
        MATERIAL_MAP.put("wood_amethyst", ToolMaterials.WOOD_AMETHYST_TM);
        MATERIAL_MAP.put("wood_end", ToolMaterials.WOOD_END_TM);
        MATERIAL_MAP.put("wood_iron", ToolMaterials.WOOD_IRON_TM);
        MATERIAL_MAP.put("wood_gold", ToolMaterials.WOOD_GOLD_TM);
        MATERIAL_MAP.put("wood_diamond", ToolMaterials.WOOD_DIAMOND_TM);
        MATERIAL_MAP.put("wood_netherite", ToolMaterials.WOOD_NETHERITE_TM);
        MATERIAL_MAP.put("wood_breeze", ToolMaterials.WOOD_BREEZE_TM);
        MATERIAL_MAP.put("wood_aluminum", ToolMaterials.WOOD_ALUMINUM_TM);
        MATERIAL_MAP.put("wood_electrum", ToolMaterials.WOOD_ELECTRUM_TM);
        MATERIAL_MAP.put("wood_tin", ToolMaterials.WOOD_TIN_TM);
        MATERIAL_MAP.put("wood_brass", ToolMaterials.WOOD_BRASS_TM);
        MATERIAL_MAP.put("wood_bronze", ToolMaterials.WOOD_BRONZE_TM);
        MATERIAL_MAP.put("wood_constantan", ToolMaterials.WOOD_CONSTANTAN_TM);
        MATERIAL_MAP.put("wood_nickel", ToolMaterials.WOOD_NICKEL_TM);
        MATERIAL_MAP.put("wood_invar", ToolMaterials.WOOD_INVAR_TM);
        MATERIAL_MAP.put("wood_steel", ToolMaterials.WOOD_STEEL_TM);
        MATERIAL_MAP.put("wood_lumium", ToolMaterials.WOOD_LUMIUM_TM);
        MATERIAL_MAP.put("wood_iridium", ToolMaterials.WOOD_IRIDIUM_TM);
        MATERIAL_MAP.put("wood_osmium", ToolMaterials.WOOD_OSMIUM_TM);
        MATERIAL_MAP.put("wood_platinum", ToolMaterials.WOOD_PLATINUM_TM);
        MATERIAL_MAP.put("wood_enderium", ToolMaterials.WOOD_ENDERIUM_TM);
        MATERIAL_MAP.put("wood_uranium", ToolMaterials.WOOD_URANIUM_TM);
        MATERIAL_MAP.put("wood_signalum", ToolMaterials.WOOD_SIGNALUM_TM);
        MATERIAL_MAP.put("wood_lead", ToolMaterials.WOOD_LEAD_TM);
        MATERIAL_MAP.put("wood_ruby", ToolMaterials.WOOD_RUBY_TM);
        MATERIAL_MAP.put("wood_sapphire", ToolMaterials.WOOD_SAPPHIRE_TM);
        MATERIAL_MAP.put("wood_topaz", ToolMaterials.WOOD_TOPAZ_TM);
        MATERIAL_MAP.put("wood_peridot", ToolMaterials.WOOD_PERIDOT_TM);
        MATERIAL_MAP.put("wood_cinnabar", ToolMaterials.WOOD_CINNABAR_TM);
        MATERIAL_MAP.put("wood_fluorite", ToolMaterials.WOOD_FLUORITE_TM);
        MATERIAL_MAP.put("wood_vibranium", ToolMaterials.WOOD_VIBRANIUM_TM);
        MATERIAL_MAP.put("wood_unobtainium", ToolMaterials.WOOD_UNOBTAINIUM_TM);
        MATERIAL_MAP.put("wood_allthemodium", ToolMaterials.WOOD_ALLTHEMODIUM_TM);
        MATERIAL_MAP.put("wood_certusquartz", ToolMaterials.WOOD_CERTUSQUARTZ_TM);
        MATERIAL_MAP.put("wood_quartz", ToolMaterials.WOOD_QUARTZ_TM);
        MATERIAL_MAP.put("wood_cobalt", ToolMaterials.WOOD_COBALT_TM);
        MATERIAL_MAP.put("wood_titanium", ToolMaterials.WOOD_TITANIUM_TM);
        MATERIAL_MAP.put("wood_zinc", ToolMaterials.WOOD_ZINC_TM);

        MATERIAL_MAP.put("stone_bone", ToolMaterials.STONE_BONE_TM);
        MATERIAL_MAP.put("stone_copper", ToolMaterials.STONE_COPPER_TM);
        MATERIAL_MAP.put("stone_advanced", ToolMaterials.STONE_ADVANCED_TM);
        MATERIAL_MAP.put("stone_enchanted", ToolMaterials.STONE_ENCHANTED_TM);
        MATERIAL_MAP.put("stone_blaze", ToolMaterials.STONE_BLAZE_TM);
        MATERIAL_MAP.put("stone_emerald", ToolMaterials.STONE_EMERALD_TM);
        MATERIAL_MAP.put("stone_amethyst", ToolMaterials.STONE_AMETHYST_TM);
        MATERIAL_MAP.put("stone_end", ToolMaterials.STONE_END_TM);
        MATERIAL_MAP.put("stone_iron", ToolMaterials.STONE_IRON_TM);
        MATERIAL_MAP.put("stone_gold", ToolMaterials.STONE_GOLD_TM);
        MATERIAL_MAP.put("stone_diamond", ToolMaterials.STONE_DIAMOND_TM);
        MATERIAL_MAP.put("stone_netherite", ToolMaterials.STONE_NETHERITE_TM);
        MATERIAL_MAP.put("stone_breeze", ToolMaterials.STONE_BREEZE_TM);
        MATERIAL_MAP.put("stone_aluminum", ToolMaterials.STONE_ALUMINUM_TM);
        MATERIAL_MAP.put("stone_electrum", ToolMaterials.STONE_ELECTRUM_TM);
        MATERIAL_MAP.put("stone_tin", ToolMaterials.STONE_TIN_TM);
        MATERIAL_MAP.put("stone_brass", ToolMaterials.STONE_BRASS_TM);
        MATERIAL_MAP.put("stone_bronze", ToolMaterials.STONE_BRONZE_TM);
        MATERIAL_MAP.put("stone_constantan", ToolMaterials.STONE_CONSTANTAN_TM);
        MATERIAL_MAP.put("stone_nickel", ToolMaterials.STONE_NICKEL_TM);
        MATERIAL_MAP.put("stone_invar", ToolMaterials.STONE_INVAR_TM);
        MATERIAL_MAP.put("stone_steel", ToolMaterials.STONE_STEEL_TM);
        MATERIAL_MAP.put("stone_lumium", ToolMaterials.STONE_LUMIUM_TM);
        MATERIAL_MAP.put("stone_iridium", ToolMaterials.STONE_IRIDIUM_TM);
        MATERIAL_MAP.put("stone_osmium", ToolMaterials.STONE_OSMIUM_TM);
        MATERIAL_MAP.put("stone_platinum", ToolMaterials.STONE_PLATINUM_TM);
        MATERIAL_MAP.put("stone_enderium", ToolMaterials.STONE_ENDERIUM_TM);
        MATERIAL_MAP.put("stone_uranium", ToolMaterials.STONE_URANIUM_TM);
        MATERIAL_MAP.put("stone_signalum", ToolMaterials.STONE_SIGNALUM_TM);
        MATERIAL_MAP.put("stone_lead", ToolMaterials.STONE_LEAD_TM);
        MATERIAL_MAP.put("stone_ruby", ToolMaterials.STONE_RUBY_TM);
        MATERIAL_MAP.put("stone_sapphire", ToolMaterials.STONE_SAPPHIRE_TM);
        MATERIAL_MAP.put("stone_topaz", ToolMaterials.STONE_TOPAZ_TM);
        MATERIAL_MAP.put("stone_peridot", ToolMaterials.STONE_PERIDOT_TM);
        MATERIAL_MAP.put("stone_cinnabar", ToolMaterials.STONE_CINNABAR_TM);
        MATERIAL_MAP.put("stone_fluorite", ToolMaterials.STONE_FLUORITE_TM);
        MATERIAL_MAP.put("stone_vibranium", ToolMaterials.STONE_VIBRANIUM_TM);
        MATERIAL_MAP.put("stone_unobtainium", ToolMaterials.STONE_UNOBTAINIUM_TM);
        MATERIAL_MAP.put("stone_allthemodium", ToolMaterials.STONE_ALLTHEMODIUM_TM);
        MATERIAL_MAP.put("stone_certusquartz", ToolMaterials.STONE_CERTUSQUARTZ_TM);
        MATERIAL_MAP.put("stone_quartz", ToolMaterials.STONE_QUARTZ_TM);
        MATERIAL_MAP.put("stone_cobalt", ToolMaterials.STONE_COBALT_TM);
        MATERIAL_MAP.put("stone_titanium", ToolMaterials.STONE_TITANIUM_TM);
        MATERIAL_MAP.put("stone_zinc", ToolMaterials.STONE_ZINC_TM);

        MATERIAL_MAP.put("iron_bone", ToolMaterials.IRON_BONE_TM);
        MATERIAL_MAP.put("iron_copper", ToolMaterials.IRON_COPPER_TM);
        MATERIAL_MAP.put("iron_advanced", ToolMaterials.IRON_ADVANCED_TM);
        MATERIAL_MAP.put("iron_enchanted", ToolMaterials.IRON_ENCHANTED_TM);
        MATERIAL_MAP.put("iron_blaze", ToolMaterials.IRON_BLAZE_TM);
        MATERIAL_MAP.put("iron_emerald", ToolMaterials.IRON_EMERALD_TM);
        MATERIAL_MAP.put("iron_amethyst", ToolMaterials.IRON_AMETHYST_TM);
        MATERIAL_MAP.put("iron_end", ToolMaterials.IRON_END_TM);
        MATERIAL_MAP.put("iron_iron", ToolMaterials.IRON_IRON_TM);
        MATERIAL_MAP.put("iron_gold", ToolMaterials.IRON_GOLD_TM);
        MATERIAL_MAP.put("iron_diamond", ToolMaterials.IRON_DIAMOND_TM);
        MATERIAL_MAP.put("iron_netherite", ToolMaterials.IRON_NETHERITE_TM);
        MATERIAL_MAP.put("iron_breeze", ToolMaterials.IRON_BREEZE_TM);
        MATERIAL_MAP.put("iron_aluminum", ToolMaterials.IRON_ALUMINUM_TM);
        MATERIAL_MAP.put("iron_electrum", ToolMaterials.IRON_ELECTRUM_TM);
        MATERIAL_MAP.put("iron_tin", ToolMaterials.IRON_TIN_TM);
        MATERIAL_MAP.put("iron_brass", ToolMaterials.IRON_BRASS_TM);
        MATERIAL_MAP.put("iron_bronze", ToolMaterials.IRON_BRONZE_TM);
        MATERIAL_MAP.put("iron_constantan", ToolMaterials.IRON_CONSTANTAN_TM);
        MATERIAL_MAP.put("iron_nickel", ToolMaterials.IRON_NICKEL_TM);
        MATERIAL_MAP.put("iron_invar", ToolMaterials.IRON_INVAR_TM);
        MATERIAL_MAP.put("iron_steel", ToolMaterials.IRON_STEEL_TM);
        MATERIAL_MAP.put("iron_lumium", ToolMaterials.IRON_LUMIUM_TM);
        MATERIAL_MAP.put("iron_iridium", ToolMaterials.IRON_IRIDIUM_TM);
        MATERIAL_MAP.put("iron_osmium", ToolMaterials.IRON_OSMIUM_TM);
        MATERIAL_MAP.put("iron_platinum", ToolMaterials.IRON_PLATINUM_TM);
        MATERIAL_MAP.put("iron_enderium", ToolMaterials.IRON_ENDERIUM_TM);
        MATERIAL_MAP.put("iron_uranium", ToolMaterials.IRON_URANIUM_TM);
        MATERIAL_MAP.put("iron_signalum", ToolMaterials.IRON_SIGNALUM_TM);
        MATERIAL_MAP.put("iron_lead", ToolMaterials.IRON_LEAD_TM);
        MATERIAL_MAP.put("iron_ruby", ToolMaterials.IRON_RUBY_TM);
        MATERIAL_MAP.put("iron_sapphire", ToolMaterials.IRON_SAPPHIRE_TM);
        MATERIAL_MAP.put("iron_topaz", ToolMaterials.IRON_TOPAZ_TM);
        MATERIAL_MAP.put("iron_peridot", ToolMaterials.IRON_PERIDOT_TM);
        MATERIAL_MAP.put("iron_cinnabar", ToolMaterials.IRON_CINNABAR_TM);
        MATERIAL_MAP.put("iron_fluorite", ToolMaterials.IRON_FLUORITE_TM);
        MATERIAL_MAP.put("iron_vibranium", ToolMaterials.IRON_VIBRANIUM_TM);
        MATERIAL_MAP.put("iron_unobtainium", ToolMaterials.IRON_UNOBTAINIUM_TM);
        MATERIAL_MAP.put("iron_allthemodium", ToolMaterials.IRON_ALLTHEMODIUM_TM);
        MATERIAL_MAP.put("iron_certusquartz", ToolMaterials.IRON_CERTUSQUARTZ_TM);
        MATERIAL_MAP.put("iron_quartz", ToolMaterials.IRON_QUARTZ_TM);
        MATERIAL_MAP.put("iron_cobalt", ToolMaterials.IRON_COBALT_TM);
        MATERIAL_MAP.put("iron_titanium", ToolMaterials.IRON_TITANIUM_TM);
        MATERIAL_MAP.put("iron_zinc", ToolMaterials.IRON_ZINC_TM);

        MATERIAL_MAP.put("gold_bone", ToolMaterials.GOLD_BONE_TM);
        MATERIAL_MAP.put("gold_copper", ToolMaterials.GOLD_COPPER_TM);
        MATERIAL_MAP.put("gold_advanced", ToolMaterials.GOLD_ADVANCED_TM);
        MATERIAL_MAP.put("gold_enchanted", ToolMaterials.GOLD_ENCHANTED_TM);
        MATERIAL_MAP.put("gold_blaze", ToolMaterials.GOLD_BLAZE_TM);
        MATERIAL_MAP.put("gold_emerald", ToolMaterials.GOLD_EMERALD_TM);
        MATERIAL_MAP.put("gold_amethyst", ToolMaterials.GOLD_AMETHYST_TM);
        MATERIAL_MAP.put("gold_end", ToolMaterials.GOLD_END_TM);
        MATERIAL_MAP.put("gold_iron", ToolMaterials.GOLD_IRON_TM);
        MATERIAL_MAP.put("gold_gold", ToolMaterials.GOLD_GOLD_TM);
        MATERIAL_MAP.put("gold_diamond", ToolMaterials.GOLD_DIAMOND_TM);
        MATERIAL_MAP.put("gold_netherite", ToolMaterials.GOLD_NETHERITE_TM);
        MATERIAL_MAP.put("gold_breeze", ToolMaterials.GOLD_BREEZE_TM);
        MATERIAL_MAP.put("gold_aluminum", ToolMaterials.GOLD_ALUMINUM_TM);
        MATERIAL_MAP.put("gold_electrum", ToolMaterials.GOLD_ELECTRUM_TM);
        MATERIAL_MAP.put("gold_tin", ToolMaterials.GOLD_TIN_TM);
        MATERIAL_MAP.put("gold_brass", ToolMaterials.GOLD_BRASS_TM);
        MATERIAL_MAP.put("gold_bronze", ToolMaterials.GOLD_BRONZE_TM);
        MATERIAL_MAP.put("gold_constantan", ToolMaterials.GOLD_CONSTANTAN_TM);
        MATERIAL_MAP.put("gold_nickel", ToolMaterials.GOLD_NICKEL_TM);
        MATERIAL_MAP.put("gold_invar", ToolMaterials.GOLD_INVAR_TM);
        MATERIAL_MAP.put("gold_steel", ToolMaterials.GOLD_STEEL_TM);
        MATERIAL_MAP.put("gold_lumium", ToolMaterials.GOLD_LUMIUM_TM);
        MATERIAL_MAP.put("gold_iridium", ToolMaterials.GOLD_IRIDIUM_TM);
        MATERIAL_MAP.put("gold_osmium", ToolMaterials.GOLD_OSMIUM_TM);
        MATERIAL_MAP.put("gold_platinum", ToolMaterials.GOLD_PLATINUM_TM);
        MATERIAL_MAP.put("gold_enderium", ToolMaterials.GOLD_ENDERIUM_TM);
        MATERIAL_MAP.put("gold_uranium", ToolMaterials.GOLD_URANIUM_TM);
        MATERIAL_MAP.put("gold_signalum", ToolMaterials.GOLD_SIGNALUM_TM);
        MATERIAL_MAP.put("gold_lead", ToolMaterials.GOLD_LEAD_TM);
        MATERIAL_MAP.put("gold_ruby", ToolMaterials.GOLD_RUBY_TM);
        MATERIAL_MAP.put("gold_sapphire", ToolMaterials.GOLD_SAPPHIRE_TM);
        MATERIAL_MAP.put("gold_topaz", ToolMaterials.GOLD_TOPAZ_TM);
        MATERIAL_MAP.put("gold_peridot", ToolMaterials.GOLD_PERIDOT_TM);
        MATERIAL_MAP.put("gold_cinnabar", ToolMaterials.GOLD_CINNABAR_TM);
        MATERIAL_MAP.put("gold_fluorite", ToolMaterials.GOLD_FLUORITE_TM);
        MATERIAL_MAP.put("gold_vibranium", ToolMaterials.GOLD_VIBRANIUM_TM);
        MATERIAL_MAP.put("gold_unobtainium", ToolMaterials.GOLD_UNOBTAINIUM_TM);
        MATERIAL_MAP.put("gold_allthemodium", ToolMaterials.GOLD_ALLTHEMODIUM_TM);
        MATERIAL_MAP.put("gold_certusquartz", ToolMaterials.GOLD_CERTUSQUARTZ_TM);
        MATERIAL_MAP.put("gold_quartz", ToolMaterials.GOLD_QUARTZ_TM);
        MATERIAL_MAP.put("gold_cobalt", ToolMaterials.GOLD_COBALT_TM);
        MATERIAL_MAP.put("gold_titanium", ToolMaterials.GOLD_TITANIUM_TM);
        MATERIAL_MAP.put("gold_zinc", ToolMaterials.GOLD_ZINC_TM);

        MATERIAL_MAP.put("diamond_bone", ToolMaterials.DIAMOND_BONE_TM);
        MATERIAL_MAP.put("diamond_copper", ToolMaterials.DIAMOND_COPPER_TM);
        MATERIAL_MAP.put("diamond_advanced", ToolMaterials.DIAMOND_ADVANCED_TM);
        MATERIAL_MAP.put("diamond_enchanted", ToolMaterials.DIAMOND_ENCHANTED_TM);
        MATERIAL_MAP.put("diamond_blaze", ToolMaterials.DIAMOND_BLAZE_TM);
        MATERIAL_MAP.put("diamond_emerald", ToolMaterials.DIAMOND_EMERALD_TM);
        MATERIAL_MAP.put("diamond_amethyst", ToolMaterials.DIAMOND_AMETHYST_TM);
        MATERIAL_MAP.put("diamond_end", ToolMaterials.DIAMOND_END_TM);
        MATERIAL_MAP.put("diamond_iron", ToolMaterials.DIAMOND_IRON_TM);
        MATERIAL_MAP.put("diamond_gold", ToolMaterials.DIAMOND_GOLD_TM);
        MATERIAL_MAP.put("diamond_diamond", ToolMaterials.DIAMOND_DIAMOND_TM);
        MATERIAL_MAP.put("diamond_netherite", ToolMaterials.DIAMOND_NETHERITE_TM);
        MATERIAL_MAP.put("diamond_breeze", ToolMaterials.DIAMOND_BREEZE_TM);
        MATERIAL_MAP.put("diamond_aluminum", ToolMaterials.DIAMOND_ALUMINUM_TM);
        MATERIAL_MAP.put("diamond_electrum", ToolMaterials.DIAMOND_ELECTRUM_TM);
        MATERIAL_MAP.put("diamond_tin", ToolMaterials.DIAMOND_TIN_TM);
        MATERIAL_MAP.put("diamond_brass", ToolMaterials.DIAMOND_BRASS_TM);
        MATERIAL_MAP.put("diamond_bronze", ToolMaterials.DIAMOND_BRONZE_TM);
        MATERIAL_MAP.put("diamond_constantan", ToolMaterials.DIAMOND_CONSTANTAN_TM);
        MATERIAL_MAP.put("diamond_nickel", ToolMaterials.DIAMOND_NICKEL_TM);
        MATERIAL_MAP.put("diamond_invar", ToolMaterials.DIAMOND_INVAR_TM);
        MATERIAL_MAP.put("diamond_steel", ToolMaterials.DIAMOND_STEEL_TM);
        MATERIAL_MAP.put("diamond_lumium", ToolMaterials.DIAMOND_LUMIUM_TM);
        MATERIAL_MAP.put("diamond_iridium", ToolMaterials.DIAMOND_IRIDIUM_TM);
        MATERIAL_MAP.put("diamond_osmium", ToolMaterials.DIAMOND_OSMIUM_TM);
        MATERIAL_MAP.put("diamond_platinum", ToolMaterials.DIAMOND_PLATINUM_TM);
        MATERIAL_MAP.put("diamond_enderium", ToolMaterials.DIAMOND_ENDERIUM_TM);
        MATERIAL_MAP.put("diamond_uranium", ToolMaterials.DIAMOND_URANIUM_TM);
        MATERIAL_MAP.put("diamond_signalum", ToolMaterials.DIAMOND_SIGNALUM_TM);
        MATERIAL_MAP.put("diamond_lead", ToolMaterials.DIAMOND_LEAD_TM);
        MATERIAL_MAP.put("diamond_ruby", ToolMaterials.DIAMOND_RUBY_TM);
        MATERIAL_MAP.put("diamond_sapphire", ToolMaterials.DIAMOND_SAPPHIRE_TM);
        MATERIAL_MAP.put("diamond_topaz", ToolMaterials.DIAMOND_TOPAZ_TM);
        MATERIAL_MAP.put("diamond_peridot", ToolMaterials.DIAMOND_PERIDOT_TM);
        MATERIAL_MAP.put("diamond_cinnabar", ToolMaterials.DIAMOND_CINNABAR_TM);
        MATERIAL_MAP.put("diamond_fluorite", ToolMaterials.DIAMOND_FLUORITE_TM);
        MATERIAL_MAP.put("diamond_vibranium", ToolMaterials.DIAMOND_VIBRANIUM_TM);
        MATERIAL_MAP.put("diamond_unobtainium", ToolMaterials.DIAMOND_UNOBTAINIUM_TM);
        MATERIAL_MAP.put("diamond_allthemodium", ToolMaterials.DIAMOND_ALLTHEMODIUM_TM);
        MATERIAL_MAP.put("diamond_certusquartz", ToolMaterials.DIAMOND_CERTUSQUARTZ_TM);
        MATERIAL_MAP.put("diamond_quartz", ToolMaterials.DIAMOND_QUARTZ_TM);
        MATERIAL_MAP.put("diamond_cobalt", ToolMaterials.DIAMOND_COBALT_TM);
        MATERIAL_MAP.put("diamond_titanium", ToolMaterials.DIAMOND_TITANIUM_TM);
        MATERIAL_MAP.put("diamond_zinc", ToolMaterials.DIAMOND_ZINC_TM);

        MATERIAL_MAP.put("netherite_bone", ToolMaterials.NETHERITE_BONE_TM);
        MATERIAL_MAP.put("netherite_copper", ToolMaterials.NETHERITE_COPPER_TM);
        MATERIAL_MAP.put("netherite_advanced", ToolMaterials.NETHERITE_ADVANCED_TM);
        MATERIAL_MAP.put("netherite_enchanted", ToolMaterials.NETHERITE_ENCHANTED_TM);
        MATERIAL_MAP.put("netherite_blaze", ToolMaterials.NETHERITE_BLAZE_TM);
        MATERIAL_MAP.put("netherite_emerald", ToolMaterials.NETHERITE_EMERALD_TM);
        MATERIAL_MAP.put("netherite_amethyst", ToolMaterials.NETHERITE_AMETHYST_TM);
        MATERIAL_MAP.put("netherite_end", ToolMaterials.NETHERITE_END_TM);
        MATERIAL_MAP.put("netherite_iron", ToolMaterials.NETHERITE_IRON_TM);
        MATERIAL_MAP.put("netherite_gold", ToolMaterials.NETHERITE_GOLD_TM);
        MATERIAL_MAP.put("netherite_diamond", ToolMaterials.NETHERITE_DIAMOND_TM);
        MATERIAL_MAP.put("netherite_netherite", ToolMaterials.NETHERITE_NETHERITE_TM);
        MATERIAL_MAP.put("netherite_breeze", ToolMaterials.NETHERITE_BREEZE_TM);
        MATERIAL_MAP.put("netherite_aluminum", ToolMaterials.NETHERITE_ALUMINUM_TM);
        MATERIAL_MAP.put("netherite_electrum", ToolMaterials.NETHERITE_ELECTRUM_TM);
        MATERIAL_MAP.put("netherite_tin", ToolMaterials.NETHERITE_TIN_TM);
        MATERIAL_MAP.put("netherite_brass", ToolMaterials.NETHERITE_BRASS_TM);
        MATERIAL_MAP.put("netherite_bronze", ToolMaterials.NETHERITE_BRONZE_TM);
        MATERIAL_MAP.put("netherite_constantan", ToolMaterials.NETHERITE_CONSTANTAN_TM);
        MATERIAL_MAP.put("netherite_nickel", ToolMaterials.NETHERITE_NICKEL_TM);
        MATERIAL_MAP.put("netherite_invar", ToolMaterials.NETHERITE_INVAR_TM);
        MATERIAL_MAP.put("netherite_steel", ToolMaterials.NETHERITE_STEEL_TM);
        MATERIAL_MAP.put("netherite_lumium", ToolMaterials.NETHERITE_LUMIUM_TM);
        MATERIAL_MAP.put("netherite_iridium", ToolMaterials.NETHERITE_IRIDIUM_TM);
        MATERIAL_MAP.put("netherite_osmium", ToolMaterials.NETHERITE_OSMIUM_TM);
        MATERIAL_MAP.put("netherite_platinum", ToolMaterials.NETHERITE_PLATINUM_TM);
        MATERIAL_MAP.put("netherite_enderium", ToolMaterials.NETHERITE_ENDERIUM_TM);
        MATERIAL_MAP.put("netherite_uranium", ToolMaterials.NETHERITE_URANIUM_TM);
        MATERIAL_MAP.put("netherite_signalum", ToolMaterials.NETHERITE_SIGNALUM_TM);
        MATERIAL_MAP.put("netherite_lead", ToolMaterials.NETHERITE_LEAD_TM);
        MATERIAL_MAP.put("netherite_ruby", ToolMaterials.NETHERITE_RUBY_TM);
        MATERIAL_MAP.put("netherite_sapphire", ToolMaterials.NETHERITE_SAPPHIRE_TM);
        MATERIAL_MAP.put("netherite_topaz", ToolMaterials.NETHERITE_TOPAZ_TM);
        MATERIAL_MAP.put("netherite_peridot", ToolMaterials.NETHERITE_PERIDOT_TM);
        MATERIAL_MAP.put("netherite_cinnabar", ToolMaterials.NETHERITE_CINNABAR_TM);
        MATERIAL_MAP.put("netherite_fluorite", ToolMaterials.NETHERITE_FLUORITE_TM);
        MATERIAL_MAP.put("netherite_vibranium", ToolMaterials.NETHERITE_VIBRANIUM_TM);
        MATERIAL_MAP.put("netherite_unobtainium", ToolMaterials.NETHERITE_UNOBTAINIUM_TM);
        MATERIAL_MAP.put("netherite_allthemodium", ToolMaterials.NETHERITE_ALLTHEMODIUM_TM);
        MATERIAL_MAP.put("netherite_certusquartz", ToolMaterials.NETHERITE_CERTUSQUARTZ_TM);
        MATERIAL_MAP.put("netherite_quartz", ToolMaterials.NETHERITE_QUARTZ_TM);
        MATERIAL_MAP.put("netherite_cobalt", ToolMaterials.NETHERITE_COBALT_TM);
        MATERIAL_MAP.put("netherite_titanium", ToolMaterials.NETHERITE_TITANIUM_TM);
        MATERIAL_MAP.put("netherite_zinc", ToolMaterials.NETHERITE_ZINC_TM);

    }

    public static ToolMaterial getTMfromStrings(String handleMaterial, String baseMaterial) {
        String key = baseMaterial + "_" + handleMaterial;
        return MATERIAL_MAP.get(key);
    }


    private static final Map<String, Float> SPEED_MAP = new HashMap<>();

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


    /**
     * Tests whether the material is a gemstone
     */
    public static boolean isGem(String material) {
        return switch (material) {
            case "diamond", "emerald", "amethyst", "quartz", "topaz", "peridot", "ruby", "sapphire", "certusquartz",
                 "fluorite", "cinnabar"
                    -> true;

            default -> false;
        };
    }


    /**
     * Tests whether the basic raw material of the material is neither a gem nor an ingot
     */
    public static boolean isSpecial(String material) {
        return switch (material) {
            case "advanced", "enchanted", "bone", "witherbone", "end", "blaze", "breeze"
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
            return Config.STICK_MATERIALS.get().contains(material) && ModTags.isTagNotEmpty(material);
        }
    }


    /**
     * Transforms compressed material names into the correct ones
     */
    public static String transformMaterialNames(String material) {
        if (material.equals("certusquartz")) material = "certus_quartz";
        if (material.equals("witherbone")) material = "wither_bone";

        return material;
    }
}
