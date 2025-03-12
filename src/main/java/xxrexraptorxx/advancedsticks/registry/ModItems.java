package xxrexraptorxx.advancedsticks.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.advancedsticks.items.*;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

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
            "bone", "iron", "iridium", "netherite", "steel", "titanium", "invar", "end", "nickel", "quartz", "osmium", "aluminum",
            "platinum", "topaz", "peridot", "gold", "brass", "bronze", "blaze", "allthemodium",  "constantan", "breeze", "lead",
            "cobalt", "tin", "zinc", "certusquartz", "electrum", "lumium", "signalum", "copper", "cinnabar", "ruby", "fluorite", "unobtainium",
            "enchanted", "amethyst", "sapphire", "enderium", "diamond", "emerald", "vibranium", "uranium", "advanced"
    };


    static {
        for (String handle : HANDLE_MATERIALS) {
            if (!ToolUtils.isVanillaRod(handle))
                ITEMS.register("stick_" + handle, () -> new StickItem(new Item.Properties().setId(itemId("stick_" + handle))));

            for (String base : BASE_MATERIALS) {
                //AdvancedSticks.LOGGER.info("Register tools with: " + handle + " handle + " + base + " head. " + ToolUtils.getTMfromStrings(handle, base));

                ITEMS.registerItem(handle + "_stick_" + base + "_sword", props -> new CustomSwordItem(ToolUtils.getTMfromStrings(handle, base), 3, -4.0f + ToolUtils.getSpeed(base, "sword"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_pickaxe", props -> new CustomPickaxeItem(ToolUtils.getTMfromStrings(handle, base), 1, -4.0f + ToolUtils.getSpeed(base, "pickaxe"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_axe", props -> new CustomAxeItem(ToolUtils.getTMfromStrings(handle, base), 6, -4.0f + ToolUtils.getSpeed(base, "axe"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_shovel", props -> new CustomShovelItem(ToolUtils.getTMfromStrings(handle, base), 1.5f, -4.0f + ToolUtils.getSpeed(base, "shovel"), props));
                ITEMS.registerItem(handle + "_stick_" + base + "_hoe", props -> new CustomHoeItem(ToolUtils.getTMfromStrings(handle, base), 0, -4.0f + ToolUtils.getSpeed(base, "hoe"), props));
            }
        }
    }


    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }
}