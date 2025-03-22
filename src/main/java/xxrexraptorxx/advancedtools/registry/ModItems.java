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

    public static final String[] TOOL_TYPES = { "sword", "pickaxe", "axe", "shovel", "hoe" };

    public static final String[] BASE_MATERIALS = { "wood", "stone", "iron", "gold", "diamond", "netherite" };

    public static final String[] HANDLE_MATERIALS = {
            "witherbone", "obsidian", "carbon", "netherite", "blastproofalloy", "darksteel", "duratium", "graphite", "bedrock", "silicon",
            "steel", "antimony", "stone", "iron", "titanium", "iridium", "quartz", "nickel", "invar", "bone", "plastic", "energizedgold",
            "electrum", "anglesite", "lumium", "blaze", "allthemodium",  "bronze", "constantan", "brass", "gold", "topaz", "kanthal",
            "peridot", "yellorium", "cadmium", "advancedalloy", "solarium", "manganese", "cupronickel", "copper", "energizedcopper",
            "energeticalloy", "signalum", "horizonite", "cinnabar", "redstone", "infusedalloy", "ventium", "pyrope", "ruby",
            "plutonium", "tungsten", "amethyst", "ludicrite", "energite", "elementium", "magentite", "enchanted", "unobtainium", "fluix",
            "thorium", "zanite", "charoite", "atomicalloy", "ridiculite", "fluorite",  "falsite", "superconductor", "apatite",
            "certusquartzcrystal", "aquite", "benitoite", "reinforcedalloy", "opal", "breeze", "cyanite", "adamant",  "manasteel", "sapphire",
            "blutonium", "enderium", "diamond", "biosteel", "beryllium", "emerald", "terrasteel", "diopside", "insanite", "vibranium", "pulsatingalloy",
            "prismarine", "uranium", "vibrantalloy", "endsteel", "end", "osmium", "aluminum", "platinum", "cobalt", "lead", "stainlesssteel", "tin", "zinc",
            "blitz", "certusquartz", "blizz", "advanced", "netheriteiron", "netheritediamond", "netheriteemerald", "netheritegold",  "basalz"
            //"bloodiron", "enchantedbloodiron" TODO
    };


    static {
        for (String handle : HANDLE_MATERIALS) {
            if (!ToolUtils.isRod(handle))
                ITEMS.register("stick_" + handle, () -> new StickItem(new Item.Properties().setId(itemId("stick_" + handle))));

            for (String base : BASE_MATERIALS) {
                //AdvancedTools.LOGGER.info("Register tools with: " + handle + " handle + " + base + " head. " + ToolMaterials.getMaterial(handle, base));

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