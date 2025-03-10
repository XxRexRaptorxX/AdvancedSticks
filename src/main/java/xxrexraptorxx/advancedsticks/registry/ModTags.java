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

    public static final TagKey<Item> ALUMINUM_STICKS = createItemTag("c", "rods/aluminum");
    public static final TagKey<Item> ELECTRUM_STICKS = createItemTag("c", "rods/electrum");
    public static final TagKey<Item> TIN_STICKS = createItemTag("c", "rods/tin");
    public static final TagKey<Item> BRASS_STICKS = createItemTag("c", "rods/brass");
    public static final TagKey<Item> BRONZE_STICKS = createItemTag("c", "rods/bronze");
    public static final TagKey<Item> CONSTANTAN_STICKS = createItemTag("c", "rods/constantan");
    public static final TagKey<Item> NICKEL_STICKS = createItemTag("c", "rods/nickel");
    public static final TagKey<Item> INVAR_STICKS = createItemTag("c", "rods/invar");
    public static final TagKey<Item> STEEL_STICKS = createItemTag("c", "rods/steel");
    public static final TagKey<Item> LUMIUM_STICKS = createItemTag("c", "rods/lumium");
    public static final TagKey<Item> IRIDIUM_STICKS = createItemTag("c", "rods/iridium");
    public static final TagKey<Item> OSMIUM_STICKS = createItemTag("c", "rods/osmium");
    public static final TagKey<Item> PLATINUM_STICKS = createItemTag("c", "rods/platinum");
    public static final TagKey<Item> ENDERIUM_STICKS = createItemTag("c", "rods/enderium");
    public static final TagKey<Item> URANIUM_STICKS = createItemTag("c", "rods/uranium");
    public static final TagKey<Item> SIGNALUM_STICKS = createItemTag("c", "rods/signalum");
    public static final TagKey<Item> LEAD_STICKS = createItemTag("c", "rods/lead");
    public static final TagKey<Item> RUBY_STICKS = createItemTag("c", "rods/ruby");
    public static final TagKey<Item> SAPPHIRE_STICKS = createItemTag("c", "rods/sapphire");
    public static final TagKey<Item> TOPAZ_STICKS = createItemTag("c", "rods/topaz");
    public static final TagKey<Item> PERIDOT_STICKS = createItemTag("c", "rods/peridot");
    public static final TagKey<Item> CINNABAR_STICKS = createItemTag("c", "rods/cinnabar");
    public static final TagKey<Item> FLUORITE_STICKS = createItemTag("c", "rods/fluorite");
    public static final TagKey<Item> VIBRANIUM_STICKS = createItemTag("c", "rods/vibranium");
    public static final TagKey<Item> UNOBTAINIUM_STICKS = createItemTag("c", "rods/unobtainium");
    public static final TagKey<Item> QUARTZ_STICKS = createItemTag("c", "rods/quartz");
    public static final TagKey<Item> CERTUS_QUARTZ_STICKS = createItemTag("c", "rods/certus_quartz");
    public static final TagKey<Item> ALLTHEMODIUM_STICKS = createItemTag("c", "rods/allthemodium");
    public static final TagKey<Item> COBALT_STICKS = createItemTag("c", "rods/cobalt");
    public static final TagKey<Item> TITANIUM_STICKS = createItemTag("c", "rods/titanium");


    private static TagKey<Item> createItemTag(String id, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(id, name));
    }

}