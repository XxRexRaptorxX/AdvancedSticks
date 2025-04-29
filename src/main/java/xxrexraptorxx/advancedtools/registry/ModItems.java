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
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
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

    public static final String[] VANILLA_MATERIALS = { "wood", "stone", "iron", "gold", "diamond", "netherite" };

    public static final String[] TOOL_HEAD_MATERIALS = {
            "wood", "stone", "iron", "gold", "diamond", "netherite", "obsidian", "bedrock", "steel", "titanium", "quartz", "nickel", "invar", "bone", "electrum",
            "lumium", "bronze", "constantan", "glowstone", "brass", "peridot", "copper", "signalum", "cinnabar", "redstone", "ruby", "amethyst", "fluorite",
            "sapphire", "enderium", "emerald", "prismarine", "uranium", "osmium", "aluminum", "platinum", "silver", "cobalt", "lead", "tin", "zinc"
    };

    public static final String[] HANDLE_MATERIALS = {
            "witherbone", "obsidian", "highcarbonblacksteel", "blacksteel", "carbon", "netherite", "blastproofalloy", "darksteel", "weaksteel", "graphite",
            "bedrock", "compressediron", "pigiron", "silicon", "steel", "antimony", "iron", "wroughtiron", "titanium", "stone", "iridium", "quartz",
            "sterlingsilver", "nickel", "invar", "bone", "plastic", "energizedgold", "electrum", "anglesite", "lumium", "blaze", "allthemodium", "bronze",
            "constantan", "glowstone", "brass", "gold", "topaz", "pyrite", "kanthal", "peridot", "yellorium", "cadmium", "advancedalloy", "soularium", "solarium",
            "manganese", "cupronickel", "copper", "energizedcopper", "rosegold", "energeticalloy", "signalum", "horizonite", "cinnabar", "redstone", "infusedalloy",
            "ventium", "pyrope", "weakredsteel", "highcarbonredsteel", "redsteel", "inanite", "ruby", "plutonium", "tungsten", "duratium", "blackbronze", "amethyst",
            "ludicrite", "energite", "elementium", "magentite", "enchanted", "unobtainium", "fluix", "thorium", "zanite", "charoite", "atomicalloy", "pinkslime",
            "ridiculite", "fluorite", "falsite", "superconductor", "apatite", "certusquartzcrystal", "cyanite", "benitoite", "reinforcedalloy", "opal", "breeze",
            "aquite", "adamant", "manasteel", "sapphire", "blutonium", "highcarbonbluesteel", "bluesteel", "weakbluesteel", "highcarbonsteel", "enderium",
            "diamond", "biosteel", "beryllium", "emerald", "terrasteel", "diopside", "endercrystal", "insanite", "vibranium", "pulsatingalloy", "bismuthbronze",
            "bismuth", "prismarine", "uranium", "vibrantalloy", "endsteel", "end", "osmium", "aluminum", "platinum", "silver", "cobalt", "lead", "stainlesssteel",
            "tin", "zinc", "blitz", "certusquartz", "blizz", "advanced", "netheriteiron", "netheritediamond", "netheriteemerald", "netheritegold", "basalz",
            //TODO: "bloodiron", "enchantedbloodiron"
    };


    static {
        for (String handle : HANDLE_MATERIALS) {
            if (!ToolUtils.isRod(handle))
                ITEMS.register("stick_" + handle, () -> new RodItem(new Item.Properties().setId(itemId("stick_" + handle))));

            for (String base : TOOL_HEAD_MATERIALS) {
                //AdvancedTools.LOGGER.info("Register tools with: " + handle + " handle + " + base + " head. " + ToolMaterials.getMaterial(handle, base));

                ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + base + "_sword", props -> new CustomSwordItem(ModToolMaterials.getMaterial(handle, base),
                        3, -4.0f + ModToolMaterials.getSpeed(base, "sword"), props));

                ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + base + "_pickaxe", props -> new CustomPickaxeItem(ModToolMaterials.getMaterial(handle, base),
                        1, -4.0f + ModToolMaterials.getSpeed(base, "pickaxe"), props));

                ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + base + "_axe", props -> new CustomAxeItem(ModToolMaterials.getMaterial(handle, base),
                        6, -4.0f + ModToolMaterials.getSpeed(base, "axe"), props));

                ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + base + "_shovel", props -> new CustomShovelItem(ModToolMaterials.getMaterial(handle, base),
                        1.5f, -4.0f + ModToolMaterials.getSpeed(base, "shovel"), props));

                ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + base + "_hoe", props -> new CustomHoeItem(ModToolMaterials.getMaterial(handle, base),
                        0, -4.0f + ModToolMaterials.getSpeed(base, "hoe"), props));
            }
        }
    }


    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }

}