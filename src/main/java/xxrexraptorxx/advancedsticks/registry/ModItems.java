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
import xxrexraptorxx.advancedsticks.utils.ToolMaterials;

public class ModItems {

    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final DeferredItem<StickItem> BONE_STICK = ITEMS.register("stick_bone", () -> new StickItem(new Item.Properties().setId(itemId("stick_bone"))));
    public static final DeferredItem<StickItem> IRON_STICK = ITEMS.register("stick_iron", () -> new StickItem(new Item.Properties().setId(itemId("stick_iron"))));
    public static final DeferredItem<StickItem> GOLD_STICK = ITEMS.register("stick_gold", () -> new StickItem(new Item.Properties().setId(itemId("stick_gold"))));
    public static final DeferredItem<StickItem> COPPER_STICK = ITEMS.register("stick_copper", () -> new StickItem(new Item.Properties().setId(itemId("stick_copper"))));
    public static final DeferredItem<StickItem> EMERALD_STICK = ITEMS.register("stick_emerald", () -> new StickItem(new Item.Properties().setId(itemId("stick_emerald"))));
    public static final DeferredItem<StickItem> AMETHYST_STICK = ITEMS.register("stick_amethyst", () -> new StickItem(new Item.Properties().setId(itemId("stick_amethyst"))));
    public static final DeferredItem<StickItem> DIAMOND_STICK = ITEMS.register("stick_diamond", () -> new StickItem(new Item.Properties().setId(itemId("stick_diamond"))));
    public static final DeferredItem<StickItem> NETHERITE_STICK = ITEMS.register("stick_netherite", () -> new StickItem(new Item.Properties().setId(itemId("stick_netherite"))));
    public static final DeferredItem<StickItem> ENCHANTED_STICK = ITEMS.register("stick_enchanted", () -> new StickItem(new Item.Properties().setId(itemId("stick_enchanted"))));
    public static final DeferredItem<StickItem> ADVANCED_STICK = ITEMS.register("stick_advanced", () -> new StickItem(new Item.Properties().setId(itemId("stick_advanced"))));

    /*
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_AIR = ITEMS.register("elemental_stick_air", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_FIRE = ITEMS.register("elemental_stick_fire", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_EARTH = ITEMS.register("elemental_stick_earth", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_WATER = ITEMS.register("elemental_stick_water", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_LIGHT = ITEMS.register("elemental_stick_light", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_DARKNESS = ITEMS.register("elemental_stick_darkness", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_NATURE = ITEMS.register("elemental_stick_nature", ItemBasic::new);
    public static final DeferredItem<ItemBasic> ELEMENTAL_STICK_DIMENSION = ITEMS.register("elemental_stick_dimension", ItemBasic::new);
    */

    /** WOOD **/
    public static final DeferredItem<CustomSwordItem> BONE_STICK_WOOD_SWORD = ITEMS.registerItem("bone_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_BONE_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BONE_STICK_WOOD_PICKAXE = ITEMS.registerItem("bone_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_BONE_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BONE_STICK_WOOD_AXE = ITEMS.registerItem("bone_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_BONE_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BONE_STICK_WOOD_SHOVEL = ITEMS.registerItem("bone_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_BONE_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BONE_STICK_WOOD_HOE = ITEMS.registerItem("bone_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_BONE_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> IRON_STICK_WOOD_SWORD = ITEMS.registerItem("iron_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_IRON_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> IRON_STICK_WOOD_PICKAXE = ITEMS.registerItem("iron_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_IRON_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> IRON_STICK_WOOD_AXE = ITEMS.registerItem("iron_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_IRON_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> IRON_STICK_WOOD_SHOVEL = ITEMS.registerItem("iron_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_IRON_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> IRON_STICK_WOOD_HOE = ITEMS.registerItem("iron_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_IRON_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> COPPER_STICK_WOOD_SWORD = ITEMS.registerItem("copper_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_COPPER_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> COPPER_STICK_WOOD_PICKAXE = ITEMS.registerItem("copper_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_COPPER_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> COPPER_STICK_WOOD_AXE = ITEMS.registerItem("copper_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_COPPER_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> COPPER_STICK_WOOD_SHOVEL = ITEMS.registerItem("copper_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_COPPER_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> COPPER_STICK_WOOD_HOE = ITEMS.registerItem("copper_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_COPPER_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> GOLD_STICK_WOOD_SWORD = ITEMS.registerItem("gold_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_GOLD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> GOLD_STICK_WOOD_PICKAXE = ITEMS.registerItem("gold_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_GOLD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> GOLD_STICK_WOOD_AXE = ITEMS.registerItem("gold_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_GOLD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> GOLD_STICK_WOOD_SHOVEL = ITEMS.registerItem("gold_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_GOLD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> GOLD_STICK_WOOD_HOE = ITEMS.registerItem("gold_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_GOLD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> DIAMOND_STICK_WOOD_SWORD = ITEMS.registerItem("diamond_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_DIAMOND_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> DIAMOND_STICK_WOOD_PICKAXE = ITEMS.registerItem("diamond_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_DIAMOND_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> DIAMOND_STICK_WOOD_AXE = ITEMS.registerItem("diamond_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_DIAMOND_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> DIAMOND_STICK_WOOD_SHOVEL = ITEMS.registerItem("diamond_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> DIAMOND_STICK_WOOD_HOE = ITEMS.registerItem("diamond_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_DIAMOND_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> EMERALD_STICK_WOOD_SWORD = ITEMS.registerItem("emerald_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_EMERALD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> EMERALD_STICK_WOOD_PICKAXE = ITEMS.registerItem("emerald_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_EMERALD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> EMERALD_STICK_WOOD_AXE = ITEMS.registerItem("emerald_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_EMERALD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> EMERALD_STICK_WOOD_SHOVEL = ITEMS.registerItem("emerald_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> EMERALD_STICK_WOOD_HOE = ITEMS.registerItem("emerald_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_EMERALD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> AMETHYST_STICK_WOOD_SWORD = ITEMS.registerItem("amethyst_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_AMETHYST_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> AMETHYST_STICK_WOOD_PICKAXE = ITEMS.registerItem("amethyst_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_AMETHYST_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> AMETHYST_STICK_WOOD_AXE = ITEMS.registerItem("amethyst_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_AMETHYST_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> AMETHYST_STICK_WOOD_SHOVEL = ITEMS.registerItem("amethyst_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> AMETHYST_STICK_WOOD_HOE = ITEMS.registerItem("amethyst_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_AMETHYST_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> NETHERITE_STICK_WOOD_SWORD = ITEMS.registerItem("netherite_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_NETHERITE_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> NETHERITE_STICK_WOOD_PICKAXE = ITEMS.registerItem("netherite_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_NETHERITE_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> NETHERITE_STICK_WOOD_AXE = ITEMS.registerItem("netherite_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_NETHERITE_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> NETHERITE_STICK_WOOD_SHOVEL = ITEMS.registerItem("netherite_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> NETHERITE_STICK_WOOD_HOE = ITEMS.registerItem("netherite_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_NETHERITE_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ADVANCED_STICK_WOOD_SWORD = ITEMS.registerItem("advanced_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_ADVANCED_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ADVANCED_STICK_WOOD_PICKAXE = ITEMS.registerItem("advanced_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_ADVANCED_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ADVANCED_STICK_WOOD_AXE = ITEMS.registerItem("advanced_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_ADVANCED_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ADVANCED_STICK_WOOD_SHOVEL = ITEMS.registerItem("advanced_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ADVANCED_STICK_WOOD_HOE = ITEMS.registerItem("advanced_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_ADVANCED_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BLAZE_STICK_WOOD_SWORD = ITEMS.registerItem("blazerod_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_BLAZEROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BLAZE_STICK_WOOD_PICKAXE = ITEMS.registerItem("blazerod_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BLAZE_STICK_WOOD_AXE = ITEMS.registerItem("blazerod_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BLAZE_STICK_WOOD_SHOVEL = ITEMS.registerItem("blazerod_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BLAZE_STICK_WOOD_HOE = ITEMS.registerItem("blazerod_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_BLAZEROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BREEZE_STICK_WOOD_SWORD = ITEMS.registerItem("breezerod_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_BREEZEROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BREEZE_STICK_WOOD_PICKAXE = ITEMS.registerItem("breezerod_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_BREEZEROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BREEZE_STICK_WOOD_AXE = ITEMS.registerItem("breezerod_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_BREEZEROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BREEZE_STICK_WOOD_SHOVEL = ITEMS.registerItem("breezerod_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_BREEZEROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BREEZE_STICK_WOOD_HOE = ITEMS.registerItem("breezerod_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_BREEZEROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> END_STICK_WOOD_SWORD = ITEMS.registerItem("endrod_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_ENDROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> END_STICK_WOOD_PICKAXE = ITEMS.registerItem("endrod_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_ENDROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> END_STICK_WOOD_AXE = ITEMS.registerItem("endrod_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_ENDROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> END_STICK_WOOD_SHOVEL = ITEMS.registerItem("endrod_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> END_STICK_WOOD_HOE = ITEMS.registerItem("endrod_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_ENDROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ENCHANTED_STICK_WOOD_SWORD = ITEMS.registerItem("enchanted_stick_wood_sword", props -> new CustomSwordItem(ToolMaterials.WOOD_ENCHANTED_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ENCHANTED_STICK_WOOD_PICKAXE = ITEMS.registerItem("enchanted_stick_wood_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ENCHANTED_STICK_WOOD_AXE = ITEMS.registerItem("enchanted_stick_wood_axe", props -> new CustomAxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ENCHANTED_STICK_WOOD_SHOVEL = ITEMS.registerItem("enchanted_stick_wood_shovel", props -> new CustomShovelItem(ToolMaterials.WOOD_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ENCHANTED_STICK_WOOD_HOE = ITEMS.registerItem("enchanted_stick_wood_hoe", props -> new CustomHoeItem(ToolMaterials.WOOD_ENCHANTED_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    /** Stone **/
    public static final DeferredItem<CustomSwordItem> BONE_STICK_STONE_SWORD = ITEMS.registerItem("bone_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_BONE_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BONE_STICK_STONE_PICKAXE = ITEMS.registerItem("bone_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_BONE_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BONE_STICK_STONE_AXE = ITEMS.registerItem("bone_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_BONE_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BONE_STICK_STONE_SHOVEL = ITEMS.registerItem("bone_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_BONE_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BONE_STICK_STONE_HOE = ITEMS.registerItem("bone_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_BONE_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> IRON_STICK_STONE_SWORD = ITEMS.registerItem("iron_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_IRON_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> IRON_STICK_STONE_PICKAXE = ITEMS.registerItem("iron_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_IRON_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> IRON_STICK_STONE_AXE = ITEMS.registerItem("iron_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_IRON_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> IRON_STICK_STONE_SHOVEL = ITEMS.registerItem("iron_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_IRON_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> IRON_STICK_STONE_HOE = ITEMS.registerItem("iron_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_IRON_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> COPPER_STICK_STONE_SWORD = ITEMS.registerItem("copper_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_COPPER_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> COPPER_STICK_STONE_PICKAXE = ITEMS.registerItem("copper_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_COPPER_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> COPPER_STICK_STONE_AXE = ITEMS.registerItem("copper_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_COPPER_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> COPPER_STICK_STONE_SHOVEL = ITEMS.registerItem("copper_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_COPPER_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> COPPER_STICK_STONE_HOE = ITEMS.registerItem("copper_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_COPPER_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> GOLD_STICK_STONE_SWORD = ITEMS.registerItem("gold_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_GOLD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> GOLD_STICK_STONE_PICKAXE = ITEMS.registerItem("gold_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_GOLD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> GOLD_STICK_STONE_AXE = ITEMS.registerItem("gold_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_GOLD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> GOLD_STICK_STONE_SHOVEL = ITEMS.registerItem("gold_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_GOLD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> GOLD_STICK_STONE_HOE = ITEMS.registerItem("gold_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_GOLD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> DIAMOND_STICK_STONE_SWORD = ITEMS.registerItem("diamond_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_DIAMOND_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> DIAMOND_STICK_STONE_PICKAXE = ITEMS.registerItem("diamond_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_DIAMOND_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> DIAMOND_STICK_STONE_AXE = ITEMS.registerItem("diamond_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_DIAMOND_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> DIAMOND_STICK_STONE_SHOVEL = ITEMS.registerItem("diamond_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> DIAMOND_STICK_STONE_HOE = ITEMS.registerItem("diamond_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_DIAMOND_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> EMERALD_STICK_STONE_SWORD = ITEMS.registerItem("emerald_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_EMERALD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> EMERALD_STICK_STONE_PICKAXE = ITEMS.registerItem("emerald_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_EMERALD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> EMERALD_STICK_STONE_AXE = ITEMS.registerItem("emerald_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_EMERALD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> EMERALD_STICK_STONE_SHOVEL = ITEMS.registerItem("emerald_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> EMERALD_STICK_STONE_HOE = ITEMS.registerItem("emerald_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_EMERALD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> AMETHYST_STICK_STONE_SWORD = ITEMS.registerItem("amethyst_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_AMETHYST_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> AMETHYST_STICK_STONE_PICKAXE = ITEMS.registerItem("amethyst_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_AMETHYST_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> AMETHYST_STICK_STONE_AXE = ITEMS.registerItem("amethyst_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_AMETHYST_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> AMETHYST_STICK_STONE_SHOVEL = ITEMS.registerItem("amethyst_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> AMETHYST_STICK_STONE_HOE = ITEMS.registerItem("amethyst_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_AMETHYST_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> NETHERITE_STICK_STONE_SWORD = ITEMS.registerItem("netherite_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_NETHERITE_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> NETHERITE_STICK_STONE_PICKAXE = ITEMS.registerItem("netherite_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_NETHERITE_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> NETHERITE_STICK_STONE_AXE = ITEMS.registerItem("netherite_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_NETHERITE_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> NETHERITE_STICK_STONE_SHOVEL = ITEMS.registerItem("netherite_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> NETHERITE_STICK_STONE_HOE = ITEMS.registerItem("netherite_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_NETHERITE_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ADVANCED_STICK_STONE_SWORD = ITEMS.registerItem("advanced_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_ADVANCED_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ADVANCED_STICK_STONE_PICKAXE = ITEMS.registerItem("advanced_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_ADVANCED_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ADVANCED_STICK_STONE_AXE = ITEMS.registerItem("advanced_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_ADVANCED_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ADVANCED_STICK_STONE_SHOVEL = ITEMS.registerItem("advanced_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ADVANCED_STICK_STONE_HOE = ITEMS.registerItem("advanced_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_ADVANCED_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BLAZE_STICK_STONE_SWORD = ITEMS.registerItem("blazerod_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_BLAZEROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BLAZE_STICK_STONE_PICKAXE = ITEMS.registerItem("blazerod_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_BLAZEROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BLAZE_STICK_STONE_AXE = ITEMS.registerItem("blazerod_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_BLAZEROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BLAZE_STICK_STONE_SHOVEL = ITEMS.registerItem("blazerod_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BLAZE_STICK_STONE_HOE = ITEMS.registerItem("blazerod_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_BLAZEROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BREEZE_STICK_STONE_SWORD = ITEMS.registerItem("breezerod_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_BREEZEROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BREEZE_STICK_STONE_PICKAXE = ITEMS.registerItem("breezerod_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_BREEZEROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BREEZE_STICK_STONE_AXE = ITEMS.registerItem("breezerod_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_BREEZEROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BREEZE_STICK_STONE_SHOVEL = ITEMS.registerItem("breezerod_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_BREEZEROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BREEZE_STICK_STONE_HOE = ITEMS.registerItem("breezerod_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_BREEZEROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> END_STICK_STONE_SWORD = ITEMS.registerItem("endrod_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_ENDROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> END_STICK_STONE_PICKAXE = ITEMS.registerItem("endrod_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_ENDROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> END_STICK_STONE_AXE = ITEMS.registerItem("endrod_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_ENDROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> END_STICK_STONE_SHOVEL = ITEMS.registerItem("endrod_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> END_STICK_STONE_HOE = ITEMS.registerItem("endrod_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_ENDROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ENCHANTED_STICK_STONE_SWORD = ITEMS.registerItem("enchanted_stick_stone_sword", props -> new CustomSwordItem(ToolMaterials.STONE_ENCHANTED_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ENCHANTED_STICK_STONE_PICKAXE = ITEMS.registerItem("enchanted_stick_stone_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.STONE_ENCHANTED_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ENCHANTED_STICK_STONE_AXE = ITEMS.registerItem("enchanted_stick_stone_axe", props -> new CustomAxeItem(ToolMaterials.STONE_ENCHANTED_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ENCHANTED_STICK_STONE_SHOVEL = ITEMS.registerItem("enchanted_stick_stone_shovel", props -> new CustomShovelItem(ToolMaterials.STONE_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ENCHANTED_STICK_STONE_HOE = ITEMS.registerItem("enchanted_stick_stone_hoe", props -> new CustomHoeItem(ToolMaterials.STONE_ENCHANTED_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    /** Iron **/
    public static final DeferredItem<CustomSwordItem> BONE_STICK_IRON_SWORD = ITEMS.registerItem("bone_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_BONE_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BONE_STICK_IRON_PICKAXE = ITEMS.registerItem("bone_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_BONE_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BONE_STICK_IRON_AXE = ITEMS.registerItem("bone_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_BONE_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BONE_STICK_IRON_SHOVEL = ITEMS.registerItem("bone_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_BONE_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BONE_STICK_IRON_HOE = ITEMS.registerItem("bone_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_BONE_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> IRON_STICK_IRON_SWORD = ITEMS.registerItem("iron_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_IRON_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> IRON_STICK_IRON_PICKAXE = ITEMS.registerItem("iron_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_IRON_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> IRON_STICK_IRON_AXE = ITEMS.registerItem("iron_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_IRON_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> IRON_STICK_IRON_SHOVEL = ITEMS.registerItem("iron_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_IRON_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> IRON_STICK_IRON_HOE = ITEMS.registerItem("iron_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_IRON_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> COPPER_STICK_IRON_SWORD = ITEMS.registerItem("copper_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_COPPER_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> COPPER_STICK_IRON_PICKAXE = ITEMS.registerItem("copper_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_COPPER_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> COPPER_STICK_IRON_AXE = ITEMS.registerItem("copper_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_COPPER_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> COPPER_STICK_IRON_SHOVEL = ITEMS.registerItem("copper_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_COPPER_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> COPPER_STICK_IRON_HOE = ITEMS.registerItem("copper_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_COPPER_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> GOLD_STICK_IRON_SWORD = ITEMS.registerItem("gold_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_GOLD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> GOLD_STICK_IRON_PICKAXE = ITEMS.registerItem("gold_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_GOLD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> GOLD_STICK_IRON_AXE = ITEMS.registerItem("gold_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_GOLD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> GOLD_STICK_IRON_SHOVEL = ITEMS.registerItem("gold_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_GOLD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> GOLD_STICK_IRON_HOE = ITEMS.registerItem("gold_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_GOLD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> DIAMOND_STICK_IRON_SWORD = ITEMS.registerItem("diamond_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_DIAMOND_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> DIAMOND_STICK_IRON_PICKAXE = ITEMS.registerItem("diamond_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_DIAMOND_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> DIAMOND_STICK_IRON_AXE = ITEMS.registerItem("diamond_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_DIAMOND_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> DIAMOND_STICK_IRON_SHOVEL = ITEMS.registerItem("diamond_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> DIAMOND_STICK_IRON_HOE = ITEMS.registerItem("diamond_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_DIAMOND_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> EMERALD_STICK_IRON_SWORD = ITEMS.registerItem("emerald_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_EMERALD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> EMERALD_STICK_IRON_PICKAXE = ITEMS.registerItem("emerald_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_EMERALD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> EMERALD_STICK_IRON_AXE = ITEMS.registerItem("emerald_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_EMERALD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> EMERALD_STICK_IRON_SHOVEL = ITEMS.registerItem("emerald_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> EMERALD_STICK_IRON_HOE = ITEMS.registerItem("emerald_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_EMERALD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> AMETHYST_STICK_IRON_SWORD = ITEMS.registerItem("amethyst_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_AMETHYST_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> AMETHYST_STICK_IRON_PICKAXE = ITEMS.registerItem("amethyst_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_AMETHYST_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> AMETHYST_STICK_IRON_AXE = ITEMS.registerItem("amethyst_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_AMETHYST_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> AMETHYST_STICK_IRON_SHOVEL = ITEMS.registerItem("amethyst_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> AMETHYST_STICK_IRON_HOE = ITEMS.registerItem("amethyst_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_AMETHYST_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> NETHERITE_STICK_IRON_SWORD = ITEMS.registerItem("netherite_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_NETHERITE_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> NETHERITE_STICK_IRON_PICKAXE = ITEMS.registerItem("netherite_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_NETHERITE_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> NETHERITE_STICK_IRON_AXE = ITEMS.registerItem("netherite_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_NETHERITE_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> NETHERITE_STICK_IRON_SHOVEL = ITEMS.registerItem("netherite_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> NETHERITE_STICK_IRON_HOE = ITEMS.registerItem("netherite_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_NETHERITE_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ADVANCED_STICK_IRON_SWORD = ITEMS.registerItem("advanced_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_ADVANCED_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ADVANCED_STICK_IRON_PICKAXE = ITEMS.registerItem("advanced_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_ADVANCED_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ADVANCED_STICK_IRON_AXE = ITEMS.registerItem("advanced_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_ADVANCED_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ADVANCED_STICK_IRON_SHOVEL = ITEMS.registerItem("advanced_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ADVANCED_STICK_IRON_HOE = ITEMS.registerItem("advanced_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_ADVANCED_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BLAZE_STICK_IRON_SWORD = ITEMS.registerItem("blazerod_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_BLAZEROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BLAZE_STICK_IRON_PICKAXE = ITEMS.registerItem("blazerod_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_BLAZEROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BLAZE_STICK_IRON_AXE = ITEMS.registerItem("blazerod_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_BLAZEROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BLAZE_STICK_IRON_SHOVEL = ITEMS.registerItem("blazerod_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BLAZE_STICK_IRON_HOE = ITEMS.registerItem("blazerod_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_BLAZEROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BREEZE_STICK_IRON_SWORD = ITEMS.registerItem("breezerod_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_BREEZEROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BREEZE_STICK_IRON_PICKAXE = ITEMS.registerItem("breezerod_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_BREEZEROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BREEZE_STICK_IRON_AXE = ITEMS.registerItem("breezerod_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_BREEZEROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BREEZE_STICK_IRON_SHOVEL = ITEMS.registerItem("breezerod_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_BREEZEROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BREEZE_STICK_IRON_HOE = ITEMS.registerItem("breezerod_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_BREEZEROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> END_STICK_IRON_SWORD = ITEMS.registerItem("endrod_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_ENDROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> END_STICK_IRON_PICKAXE = ITEMS.registerItem("endrod_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_ENDROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> END_STICK_IRON_AXE = ITEMS.registerItem("endrod_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_ENDROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> END_STICK_IRON_SHOVEL = ITEMS.registerItem("endrod_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> END_STICK_IRON_HOE = ITEMS.registerItem("endrod_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_ENDROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ENCHANTED_STICK_IRON_SWORD = ITEMS.registerItem("enchanted_stick_iron_sword", props -> new CustomSwordItem(ToolMaterials.IRON_ENCHANTED_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ENCHANTED_STICK_IRON_PICKAXE = ITEMS.registerItem("enchanted_stick_iron_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.IRON_ENCHANTED_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ENCHANTED_STICK_IRON_AXE = ITEMS.registerItem("enchanted_stick_iron_axe", props -> new CustomAxeItem(ToolMaterials.IRON_ENCHANTED_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ENCHANTED_STICK_IRON_SHOVEL = ITEMS.registerItem("enchanted_stick_iron_shovel", props -> new CustomShovelItem(ToolMaterials.IRON_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ENCHANTED_STICK_IRON_HOE = ITEMS.registerItem("enchanted_stick_iron_hoe", props -> new CustomHoeItem(ToolMaterials.IRON_ENCHANTED_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    /** Gold **/
    public static final DeferredItem<CustomSwordItem> BONE_STICK_GOLD_SWORD = ITEMS.registerItem("bone_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_BONE_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BONE_STICK_GOLD_PICKAXE = ITEMS.registerItem("bone_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_BONE_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BONE_STICK_GOLD_AXE = ITEMS.registerItem("bone_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_BONE_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BONE_STICK_GOLD_SHOVEL = ITEMS.registerItem("bone_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_BONE_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BONE_STICK_GOLD_HOE = ITEMS.registerItem("bone_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_BONE_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> IRON_STICK_GOLD_SWORD = ITEMS.registerItem("iron_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_IRON_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> IRON_STICK_GOLD_PICKAXE = ITEMS.registerItem("iron_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_IRON_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> IRON_STICK_GOLD_AXE = ITEMS.registerItem("iron_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_IRON_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> IRON_STICK_GOLD_SHOVEL = ITEMS.registerItem("iron_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_IRON_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> IRON_STICK_GOLD_HOE = ITEMS.registerItem("iron_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_IRON_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> COPPER_STICK_GOLD_SWORD = ITEMS.registerItem("copper_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_COPPER_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> COPPER_STICK_GOLD_PICKAXE = ITEMS.registerItem("copper_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_COPPER_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> COPPER_STICK_GOLD_AXE = ITEMS.registerItem("copper_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_COPPER_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> COPPER_STICK_GOLD_SHOVEL = ITEMS.registerItem("copper_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_COPPER_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> COPPER_STICK_GOLD_HOE = ITEMS.registerItem("copper_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_COPPER_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> GOLD_STICK_GOLD_SWORD = ITEMS.registerItem("gold_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_GOLD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> GOLD_STICK_GOLD_PICKAXE = ITEMS.registerItem("gold_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_GOLD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> GOLD_STICK_GOLD_AXE = ITEMS.registerItem("gold_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_GOLD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> GOLD_STICK_GOLD_SHOVEL = ITEMS.registerItem("gold_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_GOLD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> GOLD_STICK_GOLD_HOE = ITEMS.registerItem("gold_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_GOLD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> DIAMOND_STICK_GOLD_SWORD = ITEMS.registerItem("diamond_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_DIAMOND_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> DIAMOND_STICK_GOLD_PICKAXE = ITEMS.registerItem("diamond_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_DIAMOND_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> DIAMOND_STICK_GOLD_AXE = ITEMS.registerItem("diamond_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_DIAMOND_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> DIAMOND_STICK_GOLD_SHOVEL = ITEMS.registerItem("diamond_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> DIAMOND_STICK_GOLD_HOE = ITEMS.registerItem("diamond_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_DIAMOND_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> EMERALD_STICK_GOLD_SWORD = ITEMS.registerItem("emerald_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_EMERALD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> EMERALD_STICK_GOLD_PICKAXE = ITEMS.registerItem("emerald_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_EMERALD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> EMERALD_STICK_GOLD_AXE = ITEMS.registerItem("emerald_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_EMERALD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> EMERALD_STICK_GOLD_SHOVEL = ITEMS.registerItem("emerald_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> EMERALD_STICK_GOLD_HOE = ITEMS.registerItem("emerald_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_EMERALD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> AMETHYST_STICK_GOLD_SWORD = ITEMS.registerItem("amethyst_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_AMETHYST_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> AMETHYST_STICK_GOLD_PICKAXE = ITEMS.registerItem("amethyst_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_AMETHYST_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> AMETHYST_STICK_GOLD_AXE = ITEMS.registerItem("amethyst_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_AMETHYST_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> AMETHYST_STICK_GOLD_SHOVEL = ITEMS.registerItem("amethyst_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> AMETHYST_STICK_GOLD_HOE = ITEMS.registerItem("amethyst_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_AMETHYST_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> NETHERITE_STICK_GOLD_SWORD = ITEMS.registerItem("netherite_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_NETHERITE_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> NETHERITE_STICK_GOLD_PICKAXE = ITEMS.registerItem("netherite_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_NETHERITE_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> NETHERITE_STICK_GOLD_AXE = ITEMS.registerItem("netherite_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_NETHERITE_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> NETHERITE_STICK_GOLD_SHOVEL = ITEMS.registerItem("netherite_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> NETHERITE_STICK_GOLD_HOE = ITEMS.registerItem("netherite_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_NETHERITE_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ADVANCED_STICK_GOLD_SWORD = ITEMS.registerItem("advanced_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_ADVANCED_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ADVANCED_STICK_GOLD_PICKAXE = ITEMS.registerItem("advanced_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_ADVANCED_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ADVANCED_STICK_GOLD_AXE = ITEMS.registerItem("advanced_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_ADVANCED_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ADVANCED_STICK_GOLD_SHOVEL = ITEMS.registerItem("advanced_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ADVANCED_STICK_GOLD_HOE = ITEMS.registerItem("advanced_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_ADVANCED_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BLAZE_STICK_GOLD_SWORD = ITEMS.registerItem("blazerod_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_BLAZEROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BLAZE_STICK_GOLD_PICKAXE = ITEMS.registerItem("blazerod_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BLAZE_STICK_GOLD_AXE = ITEMS.registerItem("blazerod_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BLAZE_STICK_GOLD_SHOVEL = ITEMS.registerItem("blazerod_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BLAZE_STICK_GOLD_HOE = ITEMS.registerItem("blazerod_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_BLAZEROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BREEZE_STICK_GOLD_SWORD = ITEMS.registerItem("breezerod_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_BREEZEROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BREEZE_STICK_GOLD_PICKAXE = ITEMS.registerItem("breezerod_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_BREEZEROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BREEZE_STICK_GOLD_AXE = ITEMS.registerItem("breezerod_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_BREEZEROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BREEZE_STICK_GOLD_SHOVEL = ITEMS.registerItem("breezerod_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_BREEZEROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BREEZE_STICK_GOLD_HOE = ITEMS.registerItem("breezerod_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_BREEZEROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));


    public static final DeferredItem<CustomSwordItem> END_STICK_GOLD_SWORD = ITEMS.registerItem("endrod_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_ENDROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> END_STICK_GOLD_PICKAXE = ITEMS.registerItem("endrod_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_ENDROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> END_STICK_GOLD_AXE = ITEMS.registerItem("endrod_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_ENDROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> END_STICK_GOLD_SHOVEL = ITEMS.registerItem("endrod_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> END_STICK_GOLD_HOE = ITEMS.registerItem("endrod_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_ENDROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ENCHANTED_STICK_GOLD_SWORD = ITEMS.registerItem("enchanted_stick_gold_sword", props -> new CustomSwordItem(ToolMaterials.GOLD_ENCHANTED_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ENCHANTED_STICK_GOLD_PICKAXE = ITEMS.registerItem("enchanted_stick_gold_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ENCHANTED_STICK_GOLD_AXE = ITEMS.registerItem("enchanted_stick_gold_axe", props -> new CustomAxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ENCHANTED_STICK_GOLD_SHOVEL = ITEMS.registerItem("enchanted_stick_gold_shovel", props -> new CustomShovelItem(ToolMaterials.GOLD_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ENCHANTED_STICK_GOLD_HOE = ITEMS.registerItem("enchanted_stick_gold_hoe", props -> new CustomHoeItem(ToolMaterials.GOLD_ENCHANTED_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    /** Diamond **/
    public static final DeferredItem<CustomSwordItem> BONE_STICK_DIAMOND_SWORD = ITEMS.registerItem("bone_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_BONE_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BONE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("bone_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_BONE_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BONE_STICK_DIAMOND_AXE = ITEMS.registerItem("bone_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_BONE_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BONE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("bone_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_BONE_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BONE_STICK_DIAMOND_HOE = ITEMS.registerItem("bone_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_BONE_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> IRON_STICK_DIAMOND_SWORD = ITEMS.registerItem("iron_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_IRON_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> IRON_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("iron_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_IRON_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> IRON_STICK_DIAMOND_AXE = ITEMS.registerItem("iron_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_IRON_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> IRON_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("iron_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_IRON_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> IRON_STICK_DIAMOND_HOE = ITEMS.registerItem("iron_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_IRON_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> COPPER_STICK_DIAMOND_SWORD = ITEMS.registerItem("copper_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_COPPER_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> COPPER_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("copper_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_COPPER_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> COPPER_STICK_DIAMOND_AXE = ITEMS.registerItem("copper_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_COPPER_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> COPPER_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("copper_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_COPPER_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> COPPER_STICK_DIAMOND_HOE = ITEMS.registerItem("copper_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_COPPER_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> GOLD_STICK_DIAMOND_SWORD = ITEMS.registerItem("gold_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_GOLD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> GOLD_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("gold_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_GOLD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> GOLD_STICK_DIAMOND_AXE = ITEMS.registerItem("gold_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_GOLD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> GOLD_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("gold_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_GOLD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> GOLD_STICK_DIAMOND_HOE = ITEMS.registerItem("gold_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_GOLD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> DIAMOND_STICK_DIAMOND_SWORD = ITEMS.registerItem("diamond_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_DIAMOND_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> DIAMOND_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("diamond_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> DIAMOND_STICK_DIAMOND_AXE = ITEMS.registerItem("diamond_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> DIAMOND_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("diamond_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> DIAMOND_STICK_DIAMOND_HOE = ITEMS.registerItem("diamond_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> EMERALD_STICK_DIAMOND_SWORD = ITEMS.registerItem("emerald_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_EMERALD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> EMERALD_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("emerald_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> EMERALD_STICK_DIAMOND_AXE = ITEMS.registerItem("emerald_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> EMERALD_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("emerald_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> EMERALD_STICK_DIAMOND_HOE = ITEMS.registerItem("emerald_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_EMERALD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> AMETHYST_STICK_DIAMOND_SWORD = ITEMS.registerItem("amethyst_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_AMETHYST_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> AMETHYST_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("amethyst_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> AMETHYST_STICK_DIAMOND_AXE = ITEMS.registerItem("amethyst_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> AMETHYST_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("amethyst_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> AMETHYST_STICK_DIAMOND_HOE = ITEMS.registerItem("amethyst_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> NETHERITE_STICK_DIAMOND_SWORD = ITEMS.registerItem("netherite_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_NETHERITE_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> NETHERITE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("netherite_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> NETHERITE_STICK_DIAMOND_AXE = ITEMS.registerItem("netherite_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> NETHERITE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("netherite_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> NETHERITE_STICK_DIAMOND_HOE = ITEMS.registerItem("netherite_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ADVANCED_STICK_DIAMOND_SWORD = ITEMS.registerItem("advanced_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_ADVANCED_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ADVANCED_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("advanced_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ADVANCED_STICK_DIAMOND_AXE = ITEMS.registerItem("advanced_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ADVANCED_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("advanced_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ADVANCED_STICK_DIAMOND_HOE = ITEMS.registerItem("advanced_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BLAZE_STICK_DIAMOND_SWORD = ITEMS.registerItem("blazerod_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BLAZE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("blazerod_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BLAZE_STICK_DIAMOND_AXE = ITEMS.registerItem("blazerod_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BLAZE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("blazerod_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BLAZE_STICK_DIAMOND_HOE = ITEMS.registerItem("blazerod_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BREEZE_STICK_DIAMOND_SWORD = ITEMS.registerItem("breezerod_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_BREEZEROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BREEZE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("breezerod_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_BREEZEROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BREEZE_STICK_DIAMOND_AXE = ITEMS.registerItem("breezerod_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_BREEZEROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BREEZE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("breezerod_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_BREEZEROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BREEZE_STICK_DIAMOND_HOE = ITEMS.registerItem("breezerod_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_BREEZEROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> END_STICK_DIAMOND_SWORD = ITEMS.registerItem("endrod_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_ENDROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> END_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("endrod_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> END_STICK_DIAMOND_AXE = ITEMS.registerItem("endrod_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> END_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("endrod_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> END_STICK_DIAMOND_HOE = ITEMS.registerItem("endrod_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_ENDROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ENCHANTED_STICK_DIAMOND_SWORD = ITEMS.registerItem("enchanted_stick_diamond_sword", props -> new CustomSwordItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ENCHANTED_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("enchanted_stick_diamond_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ENCHANTED_STICK_DIAMOND_AXE = ITEMS.registerItem("enchanted_stick_diamond_axe", props -> new CustomAxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ENCHANTED_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("enchanted_stick_diamond_shovel", props -> new CustomShovelItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ENCHANTED_STICK_DIAMOND_HOE = ITEMS.registerItem("enchanted_stick_diamond_hoe", props -> new CustomHoeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    /** Netherit **/
    public static final DeferredItem<CustomSwordItem> BONE_STICK_NETHERITE_SWORD = ITEMS.registerItem("bone_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_BONE_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BONE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("bone_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_BONE_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BONE_STICK_NETHERITE_AXE = ITEMS.registerItem("bone_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_BONE_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BONE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("bone_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_BONE_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BONE_STICK_NETHERITE_HOE = ITEMS.registerItem("bone_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_BONE_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> IRON_STICK_NETHERITE_SWORD = ITEMS.registerItem("iron_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_IRON_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> IRON_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("iron_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_IRON_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> IRON_STICK_NETHERITE_AXE = ITEMS.registerItem("iron_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_IRON_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> IRON_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("iron_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_IRON_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> IRON_STICK_NETHERITE_HOE = ITEMS.registerItem("iron_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_IRON_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> COPPER_STICK_NETHERITE_SWORD = ITEMS.registerItem("copper_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_COPPER_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> COPPER_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("copper_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_COPPER_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> COPPER_STICK_NETHERITE_AXE = ITEMS.registerItem("copper_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_COPPER_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> COPPER_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("copper_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_COPPER_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> COPPER_STICK_NETHERITE_HOE = ITEMS.registerItem("copper_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_COPPER_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> GOLD_STICK_NETHERITE_SWORD = ITEMS.registerItem("gold_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_GOLD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> GOLD_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("gold_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_GOLD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> GOLD_STICK_NETHERITE_AXE = ITEMS.registerItem("gold_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_GOLD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> GOLD_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("gold_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_GOLD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> GOLD_STICK_NETHERITE_HOE = ITEMS.registerItem("gold_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_GOLD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> DIAMOND_STICK_NETHERITE_SWORD = ITEMS.registerItem("diamond_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_DIAMOND_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> DIAMOND_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("diamond_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> DIAMOND_STICK_NETHERITE_AXE = ITEMS.registerItem("diamond_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> DIAMOND_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("diamond_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> DIAMOND_STICK_NETHERITE_HOE = ITEMS.registerItem("diamond_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> EMERALD_STICK_NETHERITE_SWORD = ITEMS.registerItem("emerald_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_EMERALD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> EMERALD_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("emerald_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> EMERALD_STICK_NETHERITE_AXE = ITEMS.registerItem("emerald_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> EMERALD_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("emerald_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> EMERALD_STICK_NETHERITE_HOE = ITEMS.registerItem("emerald_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_EMERALD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> AMETHYST_STICK_NETHERITE_SWORD = ITEMS.registerItem("amethyst_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_AMETHYST_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> AMETHYST_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("amethyst_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> AMETHYST_STICK_NETHERITE_AXE = ITEMS.registerItem("amethyst_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> AMETHYST_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("amethyst_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> AMETHYST_STICK_NETHERITE_HOE = ITEMS.registerItem("amethyst_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> NETHERITE_STICK_NETHERITE_SWORD = ITEMS.registerItem("netherite_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_NETHERITE_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> NETHERITE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("netherite_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> NETHERITE_STICK_NETHERITE_AXE = ITEMS.registerItem("netherite_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> NETHERITE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("netherite_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> NETHERITE_STICK_NETHERITE_HOE = ITEMS.registerItem("netherite_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ADVANCED_STICK_NETHERITE_SWORD = ITEMS.registerItem("advanced_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_ADVANCED_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ADVANCED_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("advanced_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ADVANCED_STICK_NETHERITE_AXE = ITEMS.registerItem("advanced_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ADVANCED_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("advanced_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ADVANCED_STICK_NETHERITE_HOE = ITEMS.registerItem("advanced_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BLAZE_STICK_NETHERITE_SWORD = ITEMS.registerItem("blazerod_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BLAZE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("blazerod_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BLAZE_STICK_NETHERITE_AXE = ITEMS.registerItem("blazerod_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BLAZE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("blazerod_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BLAZE_STICK_NETHERITE_HOE = ITEMS.registerItem("blazerod_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> BREEZE_STICK_NETHERITE_SWORD = ITEMS.registerItem("breezerod_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_BREEZEROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> BREEZE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("breezerod_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_BREEZEROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> BREEZE_STICK_NETHERITE_AXE = ITEMS.registerItem("breezerod_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_BREEZEROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> BREEZE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("breezerod_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_BREEZEROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> BREEZE_STICK_NETHERITE_HOE = ITEMS.registerItem("breezerod_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_BREEZEROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> END_STICK_NETHERITE_SWORD = ITEMS.registerItem("endrod_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_ENDROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> END_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("endrod_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> END_STICK_NETHERITE_AXE = ITEMS.registerItem("endrod_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> END_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("endrod_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> END_STICK_NETHERITE_HOE = ITEMS.registerItem("endrod_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_ENDROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomSwordItem> ENCHANTED_STICK_NETHERITE_SWORD = ITEMS.registerItem("enchanted_stick_netherite_sword", props -> new CustomSwordItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<CustomPickaxeItem> ENCHANTED_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("enchanted_stick_netherite_pickaxe", props -> new CustomPickaxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<CustomAxeItem> ENCHANTED_STICK_NETHERITE_AXE = ITEMS.registerItem("enchanted_stick_netherite_axe", props -> new CustomAxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<CustomShovelItem> ENCHANTED_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("enchanted_stick_netherite_shovel", props -> new CustomShovelItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<CustomHoeItem> ENCHANTED_STICK_NETHERITE_HOE = ITEMS.registerItem("enchanted_stick_netherite_hoe", props -> new CustomHoeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomBowItem> IRON_BOW = ITEMS.register("iron_bow", () -> new CustomBowItem(new Item.Properties().durability(500).setId(itemId("iron_bow"))));
    public static final DeferredItem<CustomBowItem> GOLD_BOW = ITEMS.register("gold_bow", () -> new CustomBowItem(new Item.Properties().durability(250).setId(itemId("gold_bow"))));
    public static final DeferredItem<CustomBowItem> DIAMOND_BOW = ITEMS.register("diamond_bow", () -> new CustomBowItem(new Item.Properties().durability(1560).setId(itemId("diamond_bow"))));
    public static final DeferredItem<CustomBowItem> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new CustomBowItem(new Item.Properties().durability(2030).setId(itemId("netherite_bow"))));

    
    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }
}