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

import java.util.Arrays;

public class ModItems {

    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final DeferredItem<CustomBowItem> IRON_BOW = ITEMS.register("iron_bow", () -> new CustomBowItem(new Item.Properties().durability(500).setId(itemId("iron_bow"))));
    public static final DeferredItem<CustomBowItem> GOLD_BOW = ITEMS.register("gold_bow", () -> new CustomBowItem(new Item.Properties().durability(250).setId(itemId("gold_bow"))));
    public static final DeferredItem<CustomBowItem> DIAMOND_BOW = ITEMS.register("diamond_bow", () -> new CustomBowItem(new Item.Properties().durability(1560).setId(itemId("diamond_bow"))));
    public static final DeferredItem<CustomBowItem> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new CustomBowItem(new Item.Properties().durability(2030).setId(itemId("netherite_bow"))));

    public static final DeferredItem<Item> EMPTY_SOCKET = ITEMS.register("empty_socket", () -> new Item(new Item.Properties().setId(itemId("empty_socket"))));
    public static final DeferredItem<UpgradeItem> EMPTY_UPGRADE = ITEMS.register("empty_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("empty_upgrade"))));
    public static final DeferredItem<UpgradeItem> RARITY_UPGRADE = ITEMS.register("rarity_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("rarity_upgrade"))));
    public static final DeferredItem<UpgradeItem> NETHERITE_UPGRADE = ITEMS.register("netherite_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("netherite_upgrade"))));
    public static final DeferredItem<UpgradeItem> OBSIDIAN_UPGRADE = ITEMS.register("obsidian_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("obsidian_upgrade"))));
    public static final DeferredItem<UpgradeItem> KNOCKBACK_UPGRADE = ITEMS.register("knockback_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("knockback_upgrade"))));
    public static final DeferredItem<UpgradeItem> DAMAGE_UPGRADE = ITEMS.register("damage_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("damage_upgrade"))));
    public static final DeferredItem<UpgradeItem> SPEED_UPGRADE = ITEMS.register("speed_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("speed_upgrade"))));
    public static final DeferredItem<UpgradeItem> LUCK_UPGRADE = ITEMS.register("luck_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("luck_upgrade"))));
    public static final DeferredItem<UpgradeItem> EFFICIENCY_UPGRADE = ITEMS.register("efficiency_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("efficiency_upgrade"))));
    public static final DeferredItem<UpgradeItem> UNDERWATER_UPGRADE = ITEMS.register("underwater_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("underwater_upgrade"))));
    public static final DeferredItem<UpgradeItem> ATTACKRANGE_UPGRADE = ITEMS.register("attackrange_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("attackrange_upgrade"))));
    public static final DeferredItem<UpgradeItem> MININGRANGE_UPGRADE = ITEMS.register("miningrange_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("miningrange_upgrade"))));
    public static final DeferredItem<UpgradeItem> SWEEPING_UPGRADE = ITEMS.register("sweeping_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("sweeping_upgrade"))));
    public static final DeferredItem<UpgradeItem> PROTECTION_UPGRADE = ITEMS.register("protection_upgrade", () -> new UpgradeItem(new Item.Properties().setId(itemId("protection_upgrade"))));

    public static final String[] TOOL_TYPES = { "sword", "pickaxe", "axe", "shovel", "hoe" };

    public static final String[] VANILLA_HEAD_MATERIALS = { "wood", "stone", "iron", "gold", "diamond", "netherite" };

    public static final String[] TOOL_HEAD_MATERIALS = {
            "wood", "stone", "iron", "gold", "diamond", "netherite", "obsidian", "bedrock", "steel", "titanium", "quartz", "nickel", "invar", "bone", "electrum",
            "lumium", "bronze", "constantan", "glowstone", "brass", "peridot", "copper", "signalum", "cinnabar", "redstone", "ruby", "amethyst", "fluorite",
            "sapphire", "enderium", "emerald", "prismarine", "uranium", "osmium", "aluminum", "platinum", "silver", "cobalt", "lead", "tin", "zinc"
    };

    public static final String[] HANDLE_MATERIALS = {
            "witherbone", "obsidian", "highcarbonblacksteel", "blacksteel", "carbon", "netherite", "blastproofalloy", "darksteel", "weaksteel", "graphite",
            "bedrock", "compressediron", "pigiron", "silicon", "steel", "antimony", "iron", "wroughtiron", "titanium", "stone", "iridium", "quartz",
            "sterlingsilver", "nickel", "invar", "bone", "plastic", "energizedgold", "electrum", "anglesite", "lumium", "blaze", "allthemodium", "bronze",
            "constantan", "glowstone", "brass", "gold", "topaz", "pyrite", "kanthal", "peridot", "yellorium", "cadmium", "wood", "advancedalloy", "soularium",
            "solarium", "manganese", "cupronickel", "copper", "energizedcopper", "rosegold", "energeticalloy", "signalum", "horizonite", "cinnabar", "redstone",
            "infusedalloy", "ventium", "pyrope", "weakredsteel", "highcarbonredsteel", "redsteel", "inanite", "ruby", "plutonium", "tungsten", "duratium", "blackbronze",
            "amethyst", "ludicrite", "energite", "elementium", "magentite", "enchanted", "unobtainium", "fluix", "thorium", "zanite", "charoite", "atomicalloy",
            "pinkslime", "ridiculite", "fluorite", "falsite", "superconductor", "apatite", "certusquartzcrystal", "cyanite", "benitoite", "reinforcedalloy", "opal",
            "breeze", "aquite", "adamant", "manasteel", "sapphire", "blutonium", "highcarbonbluesteel", "bluesteel", "weakbluesteel", "highcarbonsteel", "enderium",
            "diamond", "biosteel", "beryllium", "emerald", "terrasteel", "diopside", "endercrystal", "insanite", "vibranium", "pulsatingalloy", "bismuthbronze",
            "bismuth", "prismarine", "uranium", "vibrantalloy", "endsteel", "end", "osmium", "aluminum", "platinum", "silver", "cobalt", "lead", "stainlesssteel",
            "tin", "zinc", "blitz", "certusquartz", "blizz", "advanced", "netheriteiron", "netheritediamond", "netheriteemerald", "netheritegold", "basalz"
            //TODO: "bloodiron", "enchantedbloodiron"
    };


    static {
        for (String handle : HANDLE_MATERIALS) {
            if (!ToolUtils.isRod(handle)) {

                ITEMS.register("stick_" + handle, () -> new RodItem(new Item.Properties().setId(itemId("stick_" + handle))));
            }

            for (String head : TOOL_HEAD_MATERIALS) {
                if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {
                    //AdvancedTools.LOGGER.info("Register tools with: " + handle + " handle + " + head + " head. " + ToolMaterials.getMaterial(handle, head));

                    ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + head + "_sword", props -> new CustomSwordItem(ModToolMaterials.getMaterial(handle, head),
                            3, -4.0f + ModToolMaterials.getSpeed(head, "sword"), props.component(ModComponents.SOCKET_COMPONENT.get(), ModComponents.SocketData.EMPTY)));

                    ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + head + "_pickaxe", props -> new CustomPickaxeItem(ModToolMaterials.getMaterial(handle, head),
                            1, -4.0f + ModToolMaterials.getSpeed(head, "pickaxe"), props.component(ModComponents.SOCKET_COMPONENT.get(), ModComponents.SocketData.EMPTY)));

                    ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + head + "_axe", props -> new CustomAxeItem(ModToolMaterials.getMaterial(handle, head),
                            6, -4.0f + ModToolMaterials.getSpeed(head, "axe"), props.component(ModComponents.SOCKET_COMPONENT.get(), ModComponents.SocketData.EMPTY)));

                    ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + head + "_shovel", props -> new CustomShovelItem(ModToolMaterials.getMaterial(handle, head),
                            1.5f, -4.0f + ModToolMaterials.getSpeed(head, "shovel"), props.component(ModComponents.SOCKET_COMPONENT.get(), ModComponents.SocketData.EMPTY)));

                    ITEMS.registerItem(handle + FormattingUtils.AT_INFIX + head + "_hoe", props -> new CustomHoeItem(ModToolMaterials.getMaterial(handle, head),
                            0, -4.0f + ModToolMaterials.getSpeed(head, "hoe"), props.component(ModComponents.SOCKET_COMPONENT.get(), ModComponents.SocketData.EMPTY)));
                }
            }
        }
    }


    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }


    public static ResourceLocation getItemLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, name);
    }

}