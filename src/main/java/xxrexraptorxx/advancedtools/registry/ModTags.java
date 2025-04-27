package xxrexraptorxx.advancedtools.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ModTags {


    public static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }


    public static TagKey<Block> createBlockTag(String id, String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }


    /**
     * Tests whether an item tag is not empty and has at least one existing item registered.
     * Supports multiple tags for a single material.
     */
    public static boolean isTagValidAndHasMatchingItems(String material) {
        if (Minecraft.getInstance().level != null) {
            HolderLookup.Provider lookupProvider = Minecraft.getInstance().level.registryAccess();
            // Get all possible tags for this material
            List<TagKey<Item>> tagKeys = getPossibleTagsForMaterial(material);

            if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Searching for items of material [" + ToolUtils.transformMaterialNames(material) + "] in multiple possible tags");

            // Iterate through all possible tags
            for (TagKey<Item> tagKey : tagKeys) {
                Optional<? extends HolderLookup<Item>> lookup = lookupProvider.lookup(BuiltInRegistries.ITEM.key());

                if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Checking tag [" + tagKey.location() + "]");

                // Check if tag exists and has entries
                if (lookup.isPresent()) {
                    HolderLookup<Item> holderLookup = lookup.get();

                    // Check if tag is not empty
                    Optional<HolderSet.Named<Item>> tagEntries = holderLookup.get(tagKey);
                    if (tagEntries.isPresent() && tagEntries.get().isBound()) {
                        // Check entries
                        for (Holder<Item> itemHolder : tagEntries.get()) {
                            // Get resource location of items
                            ResourceLocation itemName = BuiltInRegistries.ITEM.getKey(itemHolder.value());
                            if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Entry found: " + itemName);

                            // Check if entry is registered as item ingame
                            if (BuiltInRegistries.ITEM.containsKey(itemName)) {
                                if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Item is registered!");
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


    /**
     * Returns a list of possible item tags for a material
     */
    public static List<TagKey<Item>> getPossibleTagsForMaterial(String material) {
        List<TagKey<Item>> tags = new ArrayList<>();
        material = ToolUtils.transformMaterialNames(material);

        // Add special material tags
        if (ToolUtils.isSpecial(material)) {
            if (material.equals("wither_bone")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "bones/wither")));
            } else if (material.equals("bone")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "bones/regular")));
            } else if (material.equals("carbon")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "plates/carbon")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/carbon")));
            } else if (material.equals("plastic")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "pellets/plastic")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "plastic_sheets")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "plastic")));
            } else if (material.equals("silicon")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "silicon")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/silicon")));
            } else if (material.equals("bedrock")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/bedrock")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/refined_bedrock")));
            } else if (material.equals("redstone")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/redstone")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/refined_redstone")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/redstone_alloy")));
            } else if (material.equals("glowstone")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/glowstone")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/refined_glowstone")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/glowstone_alloy")));
            } else if (material.equals("obsidian")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/obsidian")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/refined_obsidian")));
            } else if (material.equals("superconductor")) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/superconductor")));
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/superconductor_alloy")));
            } else {
                // Standard rod tags for materials that do not have normal base materials (e.g. enchanted_stick or basalz_rod)
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "rods/" + material)));
            }

        } else {
            // Add standard material tags
            if (ToolUtils.isGem(material)) {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "gems/" + material)));
            } else {
                tags.add(TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath("c", "ingots/" + material)));
            }

        }

        return tags;
    }

}