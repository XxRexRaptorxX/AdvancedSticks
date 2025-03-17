package xxrexraptorxx.advancedtools.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Optional;

public class ModTags {


    public static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }


    /**
     * Tests whether an item tag is empty and checks against Config.FORCE_ALL_MATERIALS in the output
     */
    public static boolean isTagNotEmpty(String material) {
        if (Minecraft.getInstance().level != null) {

            HolderLookup.Provider lookupProvider = Minecraft.getInstance().level.registryAccess();
            TagKey<Item> tagKey = TagKey.create(BuiltInRegistries.ITEM.key(), getTagLocationFromMaterial(material));
            Optional<? extends HolderLookup<Item>> lookup = lookupProvider.lookup(BuiltInRegistries.ITEM.key());

            boolean flag = lookup.map(l -> !l.get(tagKey).isEmpty()).orElse(false);

            return Config.FORCE_ALL_MATERIALS.get() || flag;

        } else {
            return false;
        }
    }


    /**
     * Outputs the resource location of material item tags
     */
    public static ResourceLocation getTagLocationFromMaterial(String material) {
        ToolUtils.transformMaterialNames(material);

        if (ToolUtils.isSpecial(material)) {
            if (material.equals("wither_bone")) return ResourceLocation.fromNamespaceAndPath("c", "bones/wither");
            if (material.equals("bone")) return ResourceLocation.fromNamespaceAndPath("c", "bones");

                return ResourceLocation.fromNamespaceAndPath("c", "rods/" + material); //returns the standard rod tags for materials that do not have normal base materials
        }

        if (ToolUtils.isGem(material)) {
            return ResourceLocation.fromNamespaceAndPath("c", "gems/" + material);

        } else {
            return ResourceLocation.fromNamespaceAndPath("c", "ingots/" + material);
        }
    }

}