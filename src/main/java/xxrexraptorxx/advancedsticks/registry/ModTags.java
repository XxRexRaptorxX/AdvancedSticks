package xxrexraptorxx.advancedsticks.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static final TagKey<Item> BONE_STICKS = createItemTag("c", "rods/bone");
    public static final TagKey<Item> IRON_STICKS = createItemTag("c", "rods/iron");
    public static final TagKey<Item> GOLD_STICKS = createItemTag("c", "rods/gold");
    public static final TagKey<Item> COPPER_STICKS = createItemTag("c", "rods/copper");
    public static final TagKey<Item> EMERALD_STICKS = createItemTag("c", "rods/emerald");
    public static final TagKey<Item> AMETHYST_STICKS = createItemTag("c", "rods/amethyst");
    public static final TagKey<Item> DIAMOND_STICKS = createItemTag("c", "rods/diamond");
    public static final TagKey<Item> NETHERITE_STICKS = createItemTag("c", "rods/netherite");
    public static final TagKey<Item> ENCHANTED_STICKS = createItemTag("c", "rods/enchanted");
    public static final TagKey<Item> ADVANCED_STICKS = createItemTag("c", "rods/advanced");
    public static final TagKey<Item> END_STICKS = createItemTag("c", "rods/end");
    public static final TagKey<Item> BLAZE_STICKS = createItemTag("c", "rods/blaze");
    public static final TagKey<Item> BREEZE_STICKS = createItemTag("c", "rods/breeze");
    public static final TagKey<Item> WITHER_STICKS = createItemTag("c", "rods/wither_bone");


    private static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }

}