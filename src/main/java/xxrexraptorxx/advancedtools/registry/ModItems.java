package xxrexraptorxx.advancedtools.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.advancedtools.items.*;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.ToolMaterials;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

public class ModItems {

    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final DeferredItem<CustomBowItem> IRON_BOW = ITEMS.register("iron_bow", () -> new CustomBowItem(new Item.Properties().durability(500).setId(itemId("iron_bow"))));
    public static final DeferredItem<CustomBowItem> GOLD_BOW = ITEMS.register("gold_bow", () -> new CustomBowItem(new Item.Properties().durability(250).setId(itemId("gold_bow"))));
    public static final DeferredItem<CustomBowItem> DIAMOND_BOW = ITEMS.register("diamond_bow", () -> new CustomBowItem(new Item.Properties().durability(1560).setId(itemId("diamond_bow"))));
    public static final DeferredItem<CustomBowItem> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new CustomBowItem(new Item.Properties().durability(2030).setId(itemId("netherite_bow"))));


    public static final String[] BASE_MATERIALS = { "wood", "stone", "iron", "gold", "diamond", "netherite" };

    public static final String[] HANDLE_MATERIALS = {
            "netherite", "steel", "iron", "titanium", "iridium", "bone", "invar", "end", "nickel", "quartz", "osmium", "aluminum",
            "platinum", "lead", "cobalt", "tin", "zinc", "certusquartz", "breeze", "electrum", "lumium", "constantan", "topaz",
            "peridot", "brass", "bronze", "gold", "blaze", "allthemodium", "signalum", "copper", "cinnabar", "ruby", "fluorite",
            "unobtainium", "enchanted", "amethyst", "sapphire", "enderium", "diamond", "emerald", "vibranium", "uranium", "advanced",

            "adamant", "advancedalloy", "antimony", "apatite", "aquite", "atomicalloy", "basalz", "bedrock", "beryllium", "biosteel",
            "blastproofalloy", "blitz", "blizz", "cadmium", "wither", "thorium", "carbon", "certusquartzcrystal", "charoite", "cupronickel",
            "darksteel", "duratium", "diopside", "elementium", "endsteel", "energeticalloy", "energite", "energizedcopper", "energizedgold",
            "falsite", "fluix", "hdpe", "horizonite", "infusedalloy", "kanthal", "manasteel", "manganese", "obsidian", "plutonium",
            "prismarine", "pulsatingalloy", "pyrope", "redstone", "reinforcedalloy", "silicon", "solarium", "stainlesssteel", "terrasteel",
            "superconductor", "tungsten", "ventium", "vibrantalloy", "zanite", "opal", "anglesite", "benitoite", "bloodiron", "bluronium",
            "cyanite", "enchantedbloodiron", "graphite", "insanite", "ludicrite", "magentite", "netheritediamond", "netheriteemerald",
            "netheritegold", "netheriteiron", "ridiculite", "yellorium"
    };


    static {
        for (String handle : HANDLE_MATERIALS) {
            if (!ToolUtils.isVanillaRod(handle))
                ITEMS.register("stick_" + handle, () -> new StickItem(new Item.Properties().setId(itemId("stick_" + handle))));

            for (String base : BASE_MATERIALS) {
                //AdvancedSticks.LOGGER.info("Register tools with: " + handle + " handle + " + base + " head. " + ToolUtils.getTMfromStrings(handle, base));

                ITEMS.registerItem(handle + "_stick_" + base + "_sword", props -> new CustomSwordItem(ToolMaterials.getMaterial(handle, base), 3, -4.0f + ToolMaterials.getSpeed(base, "sword"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.getMaterial(handle, base), 1, -4.0f + ToolMaterials.getSpeed(base, "pickaxe"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_axe", props -> new CustomAxeItem(ToolMaterials.getMaterial(handle, base), 6, -4.0f + ToolMaterials.getSpeed(base, "axe"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_shovel", props -> new CustomShovelItem(ToolMaterials.getMaterial(handle, base), 1.5f, -4.0f + ToolMaterials.getSpeed(base, "shovel"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_hoe", props -> new CustomHoeItem(ToolMaterials.getMaterial(handle, base), 0, -4.0f + ToolMaterials.getSpeed(base, "hoe"), props));
            }
        }
    }


    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }
}