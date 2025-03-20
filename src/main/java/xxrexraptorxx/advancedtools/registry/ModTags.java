package xxrexraptorxx.advancedtools.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Optional;

public class ModTags {


    public static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }


    /**
     * Tests whether an item tag is not empty
     */
    public static boolean isTagNotEmpty(String material) {
        if (Minecraft.getInstance().level != null) {

            HolderLookup.Provider lookupProvider = Minecraft.getInstance().level.registryAccess();
            TagKey<Item> tagKey = TagKey.create(BuiltInRegistries.ITEM.key(), getTagLocationFromMaterial(material));
            Optional<? extends HolderLookup<Item>> lookup = lookupProvider.lookup(BuiltInRegistries.ITEM.key());

            return lookup.map(l -> !l.get(tagKey).isEmpty()).orElse(false);

        } else {
            return false;
        }
    }


    /**
     * Tests whether an item tag is not empty and hast an existing item registered
     */
    public static boolean isTagValidAndHasMatchingItems(String material) {
        if (Minecraft.getInstance().level != null) {
            HolderLookup.Provider lookupProvider = Minecraft.getInstance().level.registryAccess();
            TagKey<Item> tagKey = TagKey.create(BuiltInRegistries.ITEM.key(), getTagLocationFromMaterial(material));
            Optional<? extends HolderLookup<Item>> lookup = lookupProvider.lookup(BuiltInRegistries.ITEM.key());

            if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Search for items of material [" + ToolUtils.transformMaterialNames(material) + "] in item tag [" + tagKey.location() + "]");

            // check if tag exists and has entries
            if (lookup.isPresent()) {
                HolderLookup<Item> holderLookup = lookup.get();

                // check if tag is not empty
                Optional<HolderSet.Named<Item>> tagEntries = holderLookup.get(tagKey);
                if (tagEntries.isPresent() && tagEntries.get().isBound()) {
                    //check entries
                    for (Holder<Item> itemHolder : tagEntries.get()) {
                        //get resource location of items
                        ResourceLocation itemName = BuiltInRegistries.ITEM.getKey(itemHolder.value());
                        if (Config.DEBUG_MODE.get()) AdvancedTools.LOGGER.info("Entry found: " + itemName);

                        //check if entry is registered as item ingame
                        if (!BuiltInRegistries.ITEM.containsKey(itemName)) {
                            return false;

                        } else {
                            AdvancedTools.LOGGER.info("Item is registered!");
                            return true;
                        }
                    }
                }
            }
        }
        return false; // Tag existiert nicht oder hat keine Einträge
    }


    /**
     * Outputs the resource location of material item tags
     */
    @Deprecated //Does not work as well as expected with materials that could be addressed by several tags and with modified tags
    public static ResourceLocation getTagLocationFromMaterial(String material) {
        material = ToolUtils.transformMaterialNames(material);

        if (ToolUtils.isSpecial(material)) {
            if (material.equals("wither_bone")) return ResourceLocation.fromNamespaceAndPath("c", "bones/wither");
            if (material.equals("bone")) return ResourceLocation.fromNamespaceAndPath("c", "bones/regular");
            if (material.equals("carbon")) return ResourceLocation.fromNamespaceAndPath("c", "plates/carbon");
            if (material.equals("plastic")) return ResourceLocation.fromNamespaceAndPath("c", "pellets/plastic");
            if (material.equals("silicon")) return ResourceLocation.fromNamespaceAndPath("c", "silicon");

                return ResourceLocation.fromNamespaceAndPath("c", "rods/" + material); //returns the standard rod tags for materials that do not have normal base materials
        }

        if (ToolUtils.isGem(material)) {
            return ResourceLocation.fromNamespaceAndPath("c", "gems/" + material);

        } else {
            return ResourceLocation.fromNamespaceAndPath("c", "ingots/" + material);
        }
    }

}