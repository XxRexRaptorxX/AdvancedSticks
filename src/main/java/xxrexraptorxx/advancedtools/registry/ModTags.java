package xxrexraptorxx.advancedtools.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.magmacore.content.TagHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ModTags {

    /**
     * Tests whether an item tag is not empty and has at least one existing item registered. Supports multiple tags for a single material.
     */
    public static boolean isTagValidAndHasMatchingItems(String material) {
        if (Minecraft.getInstance().level != null) {
            HolderLookup.Provider lookupProvider = Minecraft.getInstance().level.registryAccess();
            // Get all possible tags for this material
            List<TagKey<Item>> tagKeys = getPossibleTagsForMaterial(material);

            if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Searching for items of material [" + ToolUtils.transformMaterialNames(material) + "] in multiple possible tags");

            // Iterate through all possible tags
            for (TagKey<Item> tagKey : tagKeys) {
                Optional<? extends HolderLookup<Item>> lookup = lookupProvider.lookup(BuiltInRegistries.ITEM.key());

                if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Checking tag [" + tagKey.location() + "]");

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
                            if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Entry found: " + itemName);

                            // Check if entry is registered as item ingame
                            if (BuiltInRegistries.ITEM.containsKey(itemName)) {
                                if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Item is registered!");
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }


    @Deprecated
    public static boolean isTagContainedInAnother(TagKey<Block> innerTag, TagKey<Block> outerTag) {
        if (Config.getDebugMode()) AdvancedTools.LOGGER.info("Compare if block tag [" + innerTag.location() + "] is in [" + outerTag.location() + "]");

        if (Minecraft.getInstance().level != null) {
            HolderLookup<Block> blockLookup = Minecraft.getInstance().level.registryAccess().lookupOrThrow(Registries.BLOCK);

            HolderSet.Named<Block> innerSet = blockLookup.getOrThrow(innerTag);
            HolderSet.Named<Block> outerSet = blockLookup.getOrThrow(outerTag);

            return innerSet.stream().anyMatch(outerSet::contains);

        } else {
            return false;
        }
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
                tags.add(TagHelper.createCItemTag("bones/wither"));
            } else if (material.equals("bone")) {
                tags.add(TagHelper.createCItemTag("bones/regular"));
            } else if (material.equals("carbon")) {
                tags.add(TagHelper.createCItemTag("plates/carbon"));
                tags.add(TagHelper.createCItemTag("ingots/carbon"));
            } else if (material.equals("plastic")) {
                tags.add(TagHelper.createCItemTag("pellets/plastic"));
                tags.add(TagHelper.createCItemTag("plastic_sheets"));
                tags.add(TagHelper.createCItemTag("plastic"));
            } else if (material.equals("silicon")) {
                tags.add(TagHelper.createCItemTag("silicon"));
                tags.add(TagHelper.createCItemTag("ingots/silicon"));
            } else if (material.equals("bedrock")) {
                tags.add(TagHelper.createCItemTag("ingots/bedrock"));
                tags.add(TagHelper.createCItemTag("ingots/bedrock_alloy"));
                tags.add(TagHelper.createCItemTag("ingots/refined_bedrock"));
            } else if (material.equals("redstone")) {
                tags.add(TagHelper.createCItemTag("ingots/redstone"));
                tags.add(TagHelper.createCItemTag("ingots/refined_redstone"));
                tags.add(TagHelper.createCItemTag("ingots/redstone_alloy"));
            } else if (material.equals("glowstone")) {
                tags.add(TagHelper.createCItemTag("ingots/glowstone"));
                tags.add(TagHelper.createCItemTag("ingots/refined_glowstone"));
                tags.add(TagHelper.createCItemTag("ingots/glowstone_alloy"));
            } else if (material.equals("obsidian")) {
                tags.add(TagHelper.createCItemTag("ingots/obsidian"));
                tags.add(TagHelper.createCItemTag("ingots/obsidian_alloy"));
                tags.add(TagHelper.createCItemTag("ingots/refined_obsidian"));
            } else if (material.equals("superconductor")) {
                tags.add(TagHelper.createCItemTag("ingots/superconductor"));
                tags.add(TagHelper.createCItemTag("ingots/superconductor_alloy"));
            } else if (material.equals("wood") || material.equals("wooden")) {
                tags.add(TagHelper.createCItemTag("wooden_tool_materials"));
            } else if (material.equals("stone")) {
                tags.add(TagHelper.createCItemTag("stone_tool_materials"));
            } else {
                // Standard rod tags for materials that do not have normal base materials (e.g. enchanted_stick or basalz_rod)
                tags.add(TagHelper.createCItemTag("rods/" + material));
            }

        } else {
            // Add standard material tags
            if (ToolUtils.isGem(material)) {
                tags.add(TagHelper.createCItemTag("gems/" + material));
            } else {
                tags.add(TagHelper.createCItemTag("ingots/" + material));
            }

        }

        return tags;
    }

}
