package xxrexraptorxx.advancedsticks.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import xxrexraptorxx.advancedsticks.main.References;

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

}
