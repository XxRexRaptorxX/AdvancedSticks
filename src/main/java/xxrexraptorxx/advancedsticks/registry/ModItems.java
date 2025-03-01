package xxrexraptorxx.advancedsticks.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.advancedsticks.items.CustomBowItem;
import xxrexraptorxx.advancedsticks.items.StickItem;
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
    public static final DeferredItem<SwordItem> BONE_STICK_WOOD_SWORD = ITEMS.registerItem("bone_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_BONE_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BONE_STICK_WOOD_PICKAXE = ITEMS.registerItem("bone_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_BONE_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BONE_STICK_WOOD_AXE = ITEMS.registerItem("bone_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_BONE_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BONE_STICK_WOOD_SHOVEL = ITEMS.registerItem("bone_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_BONE_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BONE_STICK_WOOD_HOE = ITEMS.registerItem("bone_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_BONE_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> IRON_STICK_WOOD_SWORD = ITEMS.registerItem("iron_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_IRON_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> IRON_STICK_WOOD_PICKAXE = ITEMS.registerItem("iron_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_IRON_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> IRON_STICK_WOOD_AXE = ITEMS.registerItem("iron_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_IRON_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> IRON_STICK_WOOD_SHOVEL = ITEMS.registerItem("iron_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_IRON_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> IRON_STICK_WOOD_HOE = ITEMS.registerItem("iron_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_IRON_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> COPPER_STICK_WOOD_SWORD = ITEMS.registerItem("copper_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_COPPER_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> COPPER_STICK_WOOD_PICKAXE = ITEMS.registerItem("copper_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_COPPER_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> COPPER_STICK_WOOD_AXE = ITEMS.registerItem("copper_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_COPPER_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> COPPER_STICK_WOOD_SHOVEL = ITEMS.registerItem("copper_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_COPPER_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> COPPER_STICK_WOOD_HOE = ITEMS.registerItem("copper_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_COPPER_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> GOLD_STICK_WOOD_SWORD = ITEMS.registerItem("gold_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_GOLD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> GOLD_STICK_WOOD_PICKAXE = ITEMS.registerItem("gold_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_GOLD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> GOLD_STICK_WOOD_AXE = ITEMS.registerItem("gold_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_GOLD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> GOLD_STICK_WOOD_SHOVEL = ITEMS.registerItem("gold_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_GOLD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> GOLD_STICK_WOOD_HOE = ITEMS.registerItem("gold_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_GOLD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> DIAMOND_STICK_WOOD_SWORD = ITEMS.registerItem("diamond_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_DIAMOND_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> DIAMOND_STICK_WOOD_PICKAXE = ITEMS.registerItem("diamond_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_DIAMOND_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> DIAMOND_STICK_WOOD_AXE = ITEMS.registerItem("diamond_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_DIAMOND_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> DIAMOND_STICK_WOOD_SHOVEL = ITEMS.registerItem("diamond_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> DIAMOND_STICK_WOOD_HOE = ITEMS.registerItem("diamond_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_DIAMOND_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> EMERALD_STICK_WOOD_SWORD = ITEMS.registerItem("emerald_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_EMERALD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> EMERALD_STICK_WOOD_PICKAXE = ITEMS.registerItem("emerald_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_EMERALD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> EMERALD_STICK_WOOD_AXE = ITEMS.registerItem("emerald_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_EMERALD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> EMERALD_STICK_WOOD_SHOVEL = ITEMS.registerItem("emerald_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> EMERALD_STICK_WOOD_HOE = ITEMS.registerItem("emerald_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_EMERALD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> AMETHYST_STICK_WOOD_SWORD = ITEMS.registerItem("amethyst_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_AMETHYST_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> AMETHYST_STICK_WOOD_PICKAXE = ITEMS.registerItem("amethyst_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_AMETHYST_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> AMETHYST_STICK_WOOD_AXE = ITEMS.registerItem("amethyst_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_AMETHYST_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> AMETHYST_STICK_WOOD_SHOVEL = ITEMS.registerItem("amethyst_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> AMETHYST_STICK_WOOD_HOE = ITEMS.registerItem("amethyst_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_AMETHYST_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> NETHERITE_STICK_WOOD_SWORD = ITEMS.registerItem("netherite_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_NETHERITE_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> NETHERITE_STICK_WOOD_PICKAXE = ITEMS.registerItem("netherite_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_NETHERITE_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> NETHERITE_STICK_WOOD_AXE = ITEMS.registerItem("netherite_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_NETHERITE_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> NETHERITE_STICK_WOOD_SHOVEL = ITEMS.registerItem("netherite_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> NETHERITE_STICK_WOOD_HOE = ITEMS.registerItem("netherite_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_NETHERITE_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ADVANCED_STICK_WOOD_SWORD = ITEMS.registerItem("advanced_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_ADVANCED_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ADVANCED_STICK_WOOD_PICKAXE = ITEMS.registerItem("advanced_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_ADVANCED_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ADVANCED_STICK_WOOD_AXE = ITEMS.registerItem("advanced_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_ADVANCED_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ADVANCED_STICK_WOOD_SHOVEL = ITEMS.registerItem("advanced_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ADVANCED_STICK_WOOD_HOE = ITEMS.registerItem("advanced_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_ADVANCED_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> BLAZE_STICK_WOOD_SWORD = ITEMS.registerItem("blazerod_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_BLAZEROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BLAZE_STICK_WOOD_PICKAXE = ITEMS.registerItem("blazerod_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BLAZE_STICK_WOOD_AXE = ITEMS.registerItem("blazerod_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BLAZE_STICK_WOOD_SHOVEL = ITEMS.registerItem("blazerod_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BLAZE_STICK_WOOD_HOE = ITEMS.registerItem("blazerod_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_BLAZEROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> END_STICK_WOOD_SWORD = ITEMS.registerItem("endrod_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_ENDROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> END_STICK_WOOD_PICKAXE = ITEMS.registerItem("endrod_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_ENDROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> END_STICK_WOOD_AXE = ITEMS.registerItem("endrod_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_ENDROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> END_STICK_WOOD_SHOVEL = ITEMS.registerItem("endrod_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> END_STICK_WOOD_HOE = ITEMS.registerItem("endrod_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_ENDROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ENCHANTED_STICK_WOOD_SWORD = ITEMS.registerItem("enchanted_stick_wood_sword", props -> new SwordItem(ToolMaterials.WOOD_ENCHANTED_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ENCHANTED_STICK_WOOD_PICKAXE = ITEMS.registerItem("enchanted_stick_wood_pickaxe", props -> new PickaxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ENCHANTED_STICK_WOOD_AXE = ITEMS.registerItem("enchanted_stick_wood_axe", props -> new AxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ENCHANTED_STICK_WOOD_SHOVEL = ITEMS.registerItem("enchanted_stick_wood_shovel", props -> new ShovelItem(ToolMaterials.WOOD_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ENCHANTED_STICK_WOOD_HOE = ITEMS.registerItem("enchanted_stick_wood_hoe", props -> new HoeItem(ToolMaterials.WOOD_ENCHANTED_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, props));

    /** Stone **/
    public static final DeferredItem<SwordItem> BONE_STICK_STONE_SWORD = ITEMS.registerItem("bone_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_BONE_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BONE_STICK_STONE_PICKAXE = ITEMS.registerItem("bone_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_BONE_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BONE_STICK_STONE_AXE = ITEMS.registerItem("bone_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_BONE_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BONE_STICK_STONE_SHOVEL = ITEMS.registerItem("bone_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_BONE_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BONE_STICK_STONE_HOE = ITEMS.registerItem("bone_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_BONE_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> IRON_STICK_STONE_SWORD = ITEMS.registerItem("iron_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_IRON_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> IRON_STICK_STONE_PICKAXE = ITEMS.registerItem("iron_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_IRON_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> IRON_STICK_STONE_AXE = ITEMS.registerItem("iron_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_IRON_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> IRON_STICK_STONE_SHOVEL = ITEMS.registerItem("iron_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_IRON_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> IRON_STICK_STONE_HOE = ITEMS.registerItem("iron_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_IRON_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> COPPER_STICK_STONE_SWORD = ITEMS.registerItem("copper_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_COPPER_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> COPPER_STICK_STONE_PICKAXE = ITEMS.registerItem("copper_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_COPPER_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> COPPER_STICK_STONE_AXE = ITEMS.registerItem("copper_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_COPPER_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> COPPER_STICK_STONE_SHOVEL = ITEMS.registerItem("copper_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_COPPER_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> COPPER_STICK_STONE_HOE = ITEMS.registerItem("copper_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_COPPER_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> GOLD_STICK_STONE_SWORD = ITEMS.registerItem("gold_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_GOLD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> GOLD_STICK_STONE_PICKAXE = ITEMS.registerItem("gold_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_GOLD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> GOLD_STICK_STONE_AXE = ITEMS.registerItem("gold_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_GOLD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> GOLD_STICK_STONE_SHOVEL = ITEMS.registerItem("gold_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_GOLD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> GOLD_STICK_STONE_HOE = ITEMS.registerItem("gold_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_GOLD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> DIAMOND_STICK_STONE_SWORD = ITEMS.registerItem("diamond_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_DIAMOND_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> DIAMOND_STICK_STONE_PICKAXE = ITEMS.registerItem("diamond_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_DIAMOND_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> DIAMOND_STICK_STONE_AXE = ITEMS.registerItem("diamond_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_DIAMOND_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> DIAMOND_STICK_STONE_SHOVEL = ITEMS.registerItem("diamond_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> DIAMOND_STICK_STONE_HOE = ITEMS.registerItem("diamond_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_DIAMOND_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> EMERALD_STICK_STONE_SWORD = ITEMS.registerItem("emerald_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_EMERALD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> EMERALD_STICK_STONE_PICKAXE = ITEMS.registerItem("emerald_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_EMERALD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> EMERALD_STICK_STONE_AXE = ITEMS.registerItem("emerald_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_EMERALD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> EMERALD_STICK_STONE_SHOVEL = ITEMS.registerItem("emerald_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> EMERALD_STICK_STONE_HOE = ITEMS.registerItem("emerald_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_EMERALD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> AMETHYST_STICK_STONE_SWORD = ITEMS.registerItem("amethyst_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_AMETHYST_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> AMETHYST_STICK_STONE_PICKAXE = ITEMS.registerItem("amethyst_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_AMETHYST_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> AMETHYST_STICK_STONE_AXE = ITEMS.registerItem("amethyst_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_AMETHYST_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> AMETHYST_STICK_STONE_SHOVEL = ITEMS.registerItem("amethyst_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> AMETHYST_STICK_STONE_HOE = ITEMS.registerItem("amethyst_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_AMETHYST_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> NETHERITE_STICK_STONE_SWORD = ITEMS.registerItem("netherite_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_NETHERITE_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> NETHERITE_STICK_STONE_PICKAXE = ITEMS.registerItem("netherite_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_NETHERITE_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> NETHERITE_STICK_STONE_AXE = ITEMS.registerItem("netherite_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_NETHERITE_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> NETHERITE_STICK_STONE_SHOVEL = ITEMS.registerItem("netherite_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> NETHERITE_STICK_STONE_HOE = ITEMS.registerItem("netherite_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_NETHERITE_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ADVANCED_STICK_STONE_SWORD = ITEMS.registerItem("advanced_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_ADVANCED_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ADVANCED_STICK_STONE_PICKAXE = ITEMS.registerItem("advanced_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_ADVANCED_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ADVANCED_STICK_STONE_AXE = ITEMS.registerItem("advanced_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_ADVANCED_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ADVANCED_STICK_STONE_SHOVEL = ITEMS.registerItem("advanced_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ADVANCED_STICK_STONE_HOE = ITEMS.registerItem("advanced_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_ADVANCED_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> BLAZE_STICK_STONE_SWORD = ITEMS.registerItem("blazerod_stone_sword", props -> new SwordItem(ToolMaterials.STONE_BLAZEROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BLAZE_STICK_STONE_PICKAXE = ITEMS.registerItem("blazerod_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_BLAZEROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BLAZE_STICK_STONE_AXE = ITEMS.registerItem("blazerod_stone_axe", props -> new AxeItem(ToolMaterials.STONE_BLAZEROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BLAZE_STICK_STONE_SHOVEL = ITEMS.registerItem("blazerod_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BLAZE_STICK_STONE_HOE = ITEMS.registerItem("blazerod_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_BLAZEROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> END_STICK_STONE_SWORD = ITEMS.registerItem("endrod_stone_sword", props -> new SwordItem(ToolMaterials.STONE_ENDROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> END_STICK_STONE_PICKAXE = ITEMS.registerItem("endrod_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_ENDROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> END_STICK_STONE_AXE = ITEMS.registerItem("endrod_stone_axe", props -> new AxeItem(ToolMaterials.STONE_ENDROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> END_STICK_STONE_SHOVEL = ITEMS.registerItem("endrod_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> END_STICK_STONE_HOE = ITEMS.registerItem("endrod_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_ENDROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ENCHANTED_STICK_STONE_SWORD = ITEMS.registerItem("enchanted_stick_stone_sword", props -> new SwordItem(ToolMaterials.STONE_ENCHANTED_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ENCHANTED_STICK_STONE_PICKAXE = ITEMS.registerItem("enchanted_stick_stone_pickaxe", props -> new PickaxeItem(ToolMaterials.STONE_ENCHANTED_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ENCHANTED_STICK_STONE_AXE = ITEMS.registerItem("enchanted_stick_stone_axe", props -> new AxeItem(ToolMaterials.STONE_ENCHANTED_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ENCHANTED_STICK_STONE_SHOVEL = ITEMS.registerItem("enchanted_stick_stone_shovel", props -> new ShovelItem(ToolMaterials.STONE_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ENCHANTED_STICK_STONE_HOE = ITEMS.registerItem("enchanted_stick_stone_hoe", props -> new HoeItem(ToolMaterials.STONE_ENCHANTED_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, props));

    /** Iron **/
    public static final DeferredItem<SwordItem> BONE_STICK_IRON_SWORD = ITEMS.registerItem("bone_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_BONE_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BONE_STICK_IRON_PICKAXE = ITEMS.registerItem("bone_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_BONE_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BONE_STICK_IRON_AXE = ITEMS.registerItem("bone_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_BONE_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BONE_STICK_IRON_SHOVEL = ITEMS.registerItem("bone_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_BONE_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BONE_STICK_IRON_HOE = ITEMS.registerItem("bone_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_BONE_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> IRON_STICK_IRON_SWORD = ITEMS.registerItem("iron_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_IRON_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> IRON_STICK_IRON_PICKAXE = ITEMS.registerItem("iron_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_IRON_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> IRON_STICK_IRON_AXE = ITEMS.registerItem("iron_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_IRON_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> IRON_STICK_IRON_SHOVEL = ITEMS.registerItem("iron_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_IRON_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> IRON_STICK_IRON_HOE = ITEMS.registerItem("iron_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_IRON_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> COPPER_STICK_IRON_SWORD = ITEMS.registerItem("copper_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_COPPER_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> COPPER_STICK_IRON_PICKAXE = ITEMS.registerItem("copper_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_COPPER_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> COPPER_STICK_IRON_AXE = ITEMS.registerItem("copper_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_COPPER_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> COPPER_STICK_IRON_SHOVEL = ITEMS.registerItem("copper_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_COPPER_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> COPPER_STICK_IRON_HOE = ITEMS.registerItem("copper_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_COPPER_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> GOLD_STICK_IRON_SWORD = ITEMS.registerItem("gold_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_GOLD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> GOLD_STICK_IRON_PICKAXE = ITEMS.registerItem("gold_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_GOLD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> GOLD_STICK_IRON_AXE = ITEMS.registerItem("gold_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_GOLD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> GOLD_STICK_IRON_SHOVEL = ITEMS.registerItem("gold_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_GOLD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> GOLD_STICK_IRON_HOE = ITEMS.registerItem("gold_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_GOLD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> DIAMOND_STICK_IRON_SWORD = ITEMS.registerItem("diamond_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_DIAMOND_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> DIAMOND_STICK_IRON_PICKAXE = ITEMS.registerItem("diamond_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_DIAMOND_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> DIAMOND_STICK_IRON_AXE = ITEMS.registerItem("diamond_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_DIAMOND_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> DIAMOND_STICK_IRON_SHOVEL = ITEMS.registerItem("diamond_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> DIAMOND_STICK_IRON_HOE = ITEMS.registerItem("diamond_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_DIAMOND_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> EMERALD_STICK_IRON_SWORD = ITEMS.registerItem("emerald_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_EMERALD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> EMERALD_STICK_IRON_PICKAXE = ITEMS.registerItem("emerald_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_EMERALD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> EMERALD_STICK_IRON_AXE = ITEMS.registerItem("emerald_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_EMERALD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> EMERALD_STICK_IRON_SHOVEL = ITEMS.registerItem("emerald_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> EMERALD_STICK_IRON_HOE = ITEMS.registerItem("emerald_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_EMERALD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> AMETHYST_STICK_IRON_SWORD = ITEMS.registerItem("amethyst_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_AMETHYST_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> AMETHYST_STICK_IRON_PICKAXE = ITEMS.registerItem("amethyst_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_AMETHYST_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> AMETHYST_STICK_IRON_AXE = ITEMS.registerItem("amethyst_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_AMETHYST_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> AMETHYST_STICK_IRON_SHOVEL = ITEMS.registerItem("amethyst_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> AMETHYST_STICK_IRON_HOE = ITEMS.registerItem("amethyst_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_AMETHYST_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> NETHERITE_STICK_IRON_SWORD = ITEMS.registerItem("netherite_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_NETHERITE_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> NETHERITE_STICK_IRON_PICKAXE = ITEMS.registerItem("netherite_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_NETHERITE_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> NETHERITE_STICK_IRON_AXE = ITEMS.registerItem("netherite_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_NETHERITE_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> NETHERITE_STICK_IRON_SHOVEL = ITEMS.registerItem("netherite_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> NETHERITE_STICK_IRON_HOE = ITEMS.registerItem("netherite_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_NETHERITE_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ADVANCED_STICK_IRON_SWORD = ITEMS.registerItem("advanced_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_ADVANCED_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ADVANCED_STICK_IRON_PICKAXE = ITEMS.registerItem("advanced_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_ADVANCED_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ADVANCED_STICK_IRON_AXE = ITEMS.registerItem("advanced_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_ADVANCED_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ADVANCED_STICK_IRON_SHOVEL = ITEMS.registerItem("advanced_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ADVANCED_STICK_IRON_HOE = ITEMS.registerItem("advanced_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_ADVANCED_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> BLAZE_STICK_IRON_SWORD = ITEMS.registerItem("blazerod_iron_sword", props -> new SwordItem(ToolMaterials.IRON_BLAZEROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BLAZE_STICK_IRON_PICKAXE = ITEMS.registerItem("blazerod_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_BLAZEROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BLAZE_STICK_IRON_AXE = ITEMS.registerItem("blazerod_iron_axe", props -> new AxeItem(ToolMaterials.IRON_BLAZEROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BLAZE_STICK_IRON_SHOVEL = ITEMS.registerItem("blazerod_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BLAZE_STICK_IRON_HOE = ITEMS.registerItem("blazerod_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_BLAZEROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> END_STICK_IRON_SWORD = ITEMS.registerItem("endrod_iron_sword", props -> new SwordItem(ToolMaterials.IRON_ENDROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> END_STICK_IRON_PICKAXE = ITEMS.registerItem("endrod_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_ENDROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> END_STICK_IRON_AXE = ITEMS.registerItem("endrod_iron_axe", props -> new AxeItem(ToolMaterials.IRON_ENDROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> END_STICK_IRON_SHOVEL = ITEMS.registerItem("endrod_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> END_STICK_IRON_HOE = ITEMS.registerItem("endrod_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_ENDROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ENCHANTED_STICK_IRON_SWORD = ITEMS.registerItem("enchanted_stick_iron_sword", props -> new SwordItem(ToolMaterials.IRON_ENCHANTED_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ENCHANTED_STICK_IRON_PICKAXE = ITEMS.registerItem("enchanted_stick_iron_pickaxe", props -> new PickaxeItem(ToolMaterials.IRON_ENCHANTED_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ENCHANTED_STICK_IRON_AXE = ITEMS.registerItem("enchanted_stick_iron_axe", props -> new AxeItem(ToolMaterials.IRON_ENCHANTED_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ENCHANTED_STICK_IRON_SHOVEL = ITEMS.registerItem("enchanted_stick_iron_shovel", props -> new ShovelItem(ToolMaterials.IRON_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ENCHANTED_STICK_IRON_HOE = ITEMS.registerItem("enchanted_stick_iron_hoe", props -> new HoeItem(ToolMaterials.IRON_ENCHANTED_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, props));

    /** Gold **/
    public static final DeferredItem<SwordItem> BONE_STICK_GOLD_SWORD = ITEMS.registerItem("bone_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_BONE_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BONE_STICK_GOLD_PICKAXE = ITEMS.registerItem("bone_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_BONE_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BONE_STICK_GOLD_AXE = ITEMS.registerItem("bone_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_BONE_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BONE_STICK_GOLD_SHOVEL = ITEMS.registerItem("bone_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_BONE_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BONE_STICK_GOLD_HOE = ITEMS.registerItem("bone_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_BONE_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> IRON_STICK_GOLD_SWORD = ITEMS.registerItem("iron_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_IRON_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> IRON_STICK_GOLD_PICKAXE = ITEMS.registerItem("iron_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_IRON_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> IRON_STICK_GOLD_AXE = ITEMS.registerItem("iron_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_IRON_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> IRON_STICK_GOLD_SHOVEL = ITEMS.registerItem("iron_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_IRON_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> IRON_STICK_GOLD_HOE = ITEMS.registerItem("iron_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_IRON_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> COPPER_STICK_GOLD_SWORD = ITEMS.registerItem("copper_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_COPPER_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> COPPER_STICK_GOLD_PICKAXE = ITEMS.registerItem("copper_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_COPPER_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> COPPER_STICK_GOLD_AXE = ITEMS.registerItem("copper_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_COPPER_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> COPPER_STICK_GOLD_SHOVEL = ITEMS.registerItem("copper_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_COPPER_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> COPPER_STICK_GOLD_HOE = ITEMS.registerItem("copper_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_COPPER_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> GOLD_STICK_GOLD_SWORD = ITEMS.registerItem("gold_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_GOLD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> GOLD_STICK_GOLD_PICKAXE = ITEMS.registerItem("gold_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_GOLD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> GOLD_STICK_GOLD_AXE = ITEMS.registerItem("gold_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_GOLD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> GOLD_STICK_GOLD_SHOVEL = ITEMS.registerItem("gold_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_GOLD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> GOLD_STICK_GOLD_HOE = ITEMS.registerItem("gold_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_GOLD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> DIAMOND_STICK_GOLD_SWORD = ITEMS.registerItem("diamond_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_DIAMOND_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> DIAMOND_STICK_GOLD_PICKAXE = ITEMS.registerItem("diamond_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_DIAMOND_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> DIAMOND_STICK_GOLD_AXE = ITEMS.registerItem("diamond_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_DIAMOND_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> DIAMOND_STICK_GOLD_SHOVEL = ITEMS.registerItem("diamond_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> DIAMOND_STICK_GOLD_HOE = ITEMS.registerItem("diamond_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_DIAMOND_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> EMERALD_STICK_GOLD_SWORD = ITEMS.registerItem("emerald_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_EMERALD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> EMERALD_STICK_GOLD_PICKAXE = ITEMS.registerItem("emerald_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_EMERALD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> EMERALD_STICK_GOLD_AXE = ITEMS.registerItem("emerald_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_EMERALD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> EMERALD_STICK_GOLD_SHOVEL = ITEMS.registerItem("emerald_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> EMERALD_STICK_GOLD_HOE = ITEMS.registerItem("emerald_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_EMERALD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> AMETHYST_STICK_GOLD_SWORD = ITEMS.registerItem("amethyst_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_AMETHYST_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> AMETHYST_STICK_GOLD_PICKAXE = ITEMS.registerItem("amethyst_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_AMETHYST_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> AMETHYST_STICK_GOLD_AXE = ITEMS.registerItem("amethyst_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_AMETHYST_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> AMETHYST_STICK_GOLD_SHOVEL = ITEMS.registerItem("amethyst_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> AMETHYST_STICK_GOLD_HOE = ITEMS.registerItem("amethyst_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_AMETHYST_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> NETHERITE_STICK_GOLD_SWORD = ITEMS.registerItem("netherite_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_NETHERITE_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> NETHERITE_STICK_GOLD_PICKAXE = ITEMS.registerItem("netherite_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_NETHERITE_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> NETHERITE_STICK_GOLD_AXE = ITEMS.registerItem("netherite_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_NETHERITE_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> NETHERITE_STICK_GOLD_SHOVEL = ITEMS.registerItem("netherite_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> NETHERITE_STICK_GOLD_HOE = ITEMS.registerItem("netherite_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_NETHERITE_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ADVANCED_STICK_GOLD_SWORD = ITEMS.registerItem("advanced_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_ADVANCED_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ADVANCED_STICK_GOLD_PICKAXE = ITEMS.registerItem("advanced_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_ADVANCED_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ADVANCED_STICK_GOLD_AXE = ITEMS.registerItem("advanced_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_ADVANCED_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ADVANCED_STICK_GOLD_SHOVEL = ITEMS.registerItem("advanced_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ADVANCED_STICK_GOLD_HOE = ITEMS.registerItem("advanced_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_ADVANCED_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> BLAZE_STICK_GOLD_SWORD = ITEMS.registerItem("blazerod_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_BLAZEROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BLAZE_STICK_GOLD_PICKAXE = ITEMS.registerItem("blazerod_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BLAZE_STICK_GOLD_AXE = ITEMS.registerItem("blazerod_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BLAZE_STICK_GOLD_SHOVEL = ITEMS.registerItem("blazerod_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BLAZE_STICK_GOLD_HOE = ITEMS.registerItem("blazerod_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_BLAZEROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> END_STICK_GOLD_SWORD = ITEMS.registerItem("endrod_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_ENDROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> END_STICK_GOLD_PICKAXE = ITEMS.registerItem("endrod_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_ENDROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> END_STICK_GOLD_AXE = ITEMS.registerItem("endrod_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_ENDROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> END_STICK_GOLD_SHOVEL = ITEMS.registerItem("endrod_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> END_STICK_GOLD_HOE = ITEMS.registerItem("endrod_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_ENDROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ENCHANTED_STICK_GOLD_SWORD = ITEMS.registerItem("enchanted_stick_gold_sword", props -> new SwordItem(ToolMaterials.GOLD_ENCHANTED_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ENCHANTED_STICK_GOLD_PICKAXE = ITEMS.registerItem("enchanted_stick_gold_pickaxe", props -> new PickaxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ENCHANTED_STICK_GOLD_AXE = ITEMS.registerItem("enchanted_stick_gold_axe", props -> new AxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ENCHANTED_STICK_GOLD_SHOVEL = ITEMS.registerItem("enchanted_stick_gold_shovel", props -> new ShovelItem(ToolMaterials.GOLD_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ENCHANTED_STICK_GOLD_HOE = ITEMS.registerItem("enchanted_stick_gold_hoe", props -> new HoeItem(ToolMaterials.GOLD_ENCHANTED_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, props));

    /** Diamond **/
    public static final DeferredItem<SwordItem> BONE_STICK_DIAMOND_SWORD = ITEMS.registerItem("bone_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_BONE_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BONE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("bone_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_BONE_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BONE_STICK_DIAMOND_AXE = ITEMS.registerItem("bone_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_BONE_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BONE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("bone_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_BONE_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BONE_STICK_DIAMOND_HOE = ITEMS.registerItem("bone_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_BONE_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> IRON_STICK_DIAMOND_SWORD = ITEMS.registerItem("iron_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_IRON_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> IRON_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("iron_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_IRON_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> IRON_STICK_DIAMOND_AXE = ITEMS.registerItem("iron_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_IRON_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> IRON_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("iron_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_IRON_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> IRON_STICK_DIAMOND_HOE = ITEMS.registerItem("iron_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_IRON_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> COPPER_STICK_DIAMOND_SWORD = ITEMS.registerItem("copper_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_COPPER_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> COPPER_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("copper_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_COPPER_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> COPPER_STICK_DIAMOND_AXE = ITEMS.registerItem("copper_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_COPPER_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> COPPER_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("copper_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_COPPER_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> COPPER_STICK_DIAMOND_HOE = ITEMS.registerItem("copper_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_COPPER_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> GOLD_STICK_DIAMOND_SWORD = ITEMS.registerItem("gold_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_GOLD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> GOLD_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("gold_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_GOLD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> GOLD_STICK_DIAMOND_AXE = ITEMS.registerItem("gold_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_GOLD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> GOLD_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("gold_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_GOLD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> GOLD_STICK_DIAMOND_HOE = ITEMS.registerItem("gold_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_GOLD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> DIAMOND_STICK_DIAMOND_SWORD = ITEMS.registerItem("diamond_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_DIAMOND_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> DIAMOND_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("diamond_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> DIAMOND_STICK_DIAMOND_AXE = ITEMS.registerItem("diamond_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> DIAMOND_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("diamond_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> DIAMOND_STICK_DIAMOND_HOE = ITEMS.registerItem("diamond_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> EMERALD_STICK_DIAMOND_SWORD = ITEMS.registerItem("emerald_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_EMERALD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> EMERALD_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("emerald_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> EMERALD_STICK_DIAMOND_AXE = ITEMS.registerItem("emerald_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> EMERALD_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("emerald_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> EMERALD_STICK_DIAMOND_HOE = ITEMS.registerItem("emerald_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_EMERALD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> AMETHYST_STICK_DIAMOND_SWORD = ITEMS.registerItem("amethyst_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_AMETHYST_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> AMETHYST_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("amethyst_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> AMETHYST_STICK_DIAMOND_AXE = ITEMS.registerItem("amethyst_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> AMETHYST_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("amethyst_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> AMETHYST_STICK_DIAMOND_HOE = ITEMS.registerItem("amethyst_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> NETHERITE_STICK_DIAMOND_SWORD = ITEMS.registerItem("netherite_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_NETHERITE_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> NETHERITE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("netherite_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> NETHERITE_STICK_DIAMOND_AXE = ITEMS.registerItem("netherite_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> NETHERITE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("netherite_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> NETHERITE_STICK_DIAMOND_HOE = ITEMS.registerItem("netherite_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ADVANCED_STICK_DIAMOND_SWORD = ITEMS.registerItem("advanced_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_ADVANCED_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ADVANCED_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("advanced_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ADVANCED_STICK_DIAMOND_AXE = ITEMS.registerItem("advanced_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ADVANCED_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("advanced_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ADVANCED_STICK_DIAMOND_HOE = ITEMS.registerItem("advanced_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> BLAZE_STICK_DIAMOND_SWORD = ITEMS.registerItem("blazerod_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BLAZE_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("blazerod_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BLAZE_STICK_DIAMOND_AXE = ITEMS.registerItem("blazerod_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BLAZE_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("blazerod_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BLAZE_STICK_DIAMOND_HOE = ITEMS.registerItem("blazerod_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> END_STICK_DIAMOND_SWORD = ITEMS.registerItem("endrod_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_ENDROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> END_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("endrod_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> END_STICK_DIAMOND_AXE = ITEMS.registerItem("endrod_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> END_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("endrod_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> END_STICK_DIAMOND_HOE = ITEMS.registerItem("endrod_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_ENDROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ENCHANTED_STICK_DIAMOND_SWORD = ITEMS.registerItem("enchanted_stick_diamond_sword", props -> new SwordItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ENCHANTED_STICK_DIAMOND_PICKAXE = ITEMS.registerItem("enchanted_stick_diamond_pickaxe", props -> new PickaxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ENCHANTED_STICK_DIAMOND_AXE = ITEMS.registerItem("enchanted_stick_diamond_axe", props -> new AxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ENCHANTED_STICK_DIAMOND_SHOVEL = ITEMS.registerItem("enchanted_stick_diamond_shovel", props -> new ShovelItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ENCHANTED_STICK_DIAMOND_HOE = ITEMS.registerItem("enchanted_stick_diamond_hoe", props -> new HoeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, props));

    /** Netherit **/
    public static final DeferredItem<SwordItem> BONE_STICK_NETHERITE_SWORD = ITEMS.registerItem("bone_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_BONE_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BONE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("bone_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_BONE_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BONE_STICK_NETHERITE_AXE = ITEMS.registerItem("bone_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_BONE_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BONE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("bone_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_BONE_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BONE_STICK_NETHERITE_HOE = ITEMS.registerItem("bone_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_BONE_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> IRON_STICK_NETHERITE_SWORD = ITEMS.registerItem("iron_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_IRON_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> IRON_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("iron_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_IRON_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> IRON_STICK_NETHERITE_AXE = ITEMS.registerItem("iron_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_IRON_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> IRON_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("iron_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_IRON_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> IRON_STICK_NETHERITE_HOE = ITEMS.registerItem("iron_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_IRON_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> COPPER_STICK_NETHERITE_SWORD = ITEMS.registerItem("copper_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_COPPER_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> COPPER_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("copper_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_COPPER_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> COPPER_STICK_NETHERITE_AXE = ITEMS.registerItem("copper_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_COPPER_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> COPPER_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("copper_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_COPPER_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> COPPER_STICK_NETHERITE_HOE = ITEMS.registerItem("copper_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_COPPER_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> GOLD_STICK_NETHERITE_SWORD = ITEMS.registerItem("gold_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_GOLD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> GOLD_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("gold_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_GOLD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> GOLD_STICK_NETHERITE_AXE = ITEMS.registerItem("gold_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_GOLD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> GOLD_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("gold_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_GOLD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> GOLD_STICK_NETHERITE_HOE = ITEMS.registerItem("gold_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_GOLD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> DIAMOND_STICK_NETHERITE_SWORD = ITEMS.registerItem("diamond_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_DIAMOND_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> DIAMOND_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("diamond_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> DIAMOND_STICK_NETHERITE_AXE = ITEMS.registerItem("diamond_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> DIAMOND_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("diamond_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> DIAMOND_STICK_NETHERITE_HOE = ITEMS.registerItem("diamond_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> EMERALD_STICK_NETHERITE_SWORD = ITEMS.registerItem("emerald_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_EMERALD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> EMERALD_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("emerald_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> EMERALD_STICK_NETHERITE_AXE = ITEMS.registerItem("emerald_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> EMERALD_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("emerald_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> EMERALD_STICK_NETHERITE_HOE = ITEMS.registerItem("emerald_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_EMERALD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> AMETHYST_STICK_NETHERITE_SWORD = ITEMS.registerItem("amethyst_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_AMETHYST_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> AMETHYST_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("amethyst_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> AMETHYST_STICK_NETHERITE_AXE = ITEMS.registerItem("amethyst_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> AMETHYST_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("amethyst_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> AMETHYST_STICK_NETHERITE_HOE = ITEMS.registerItem("amethyst_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> NETHERITE_STICK_NETHERITE_SWORD = ITEMS.registerItem("netherite_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_NETHERITE_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> NETHERITE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("netherite_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> NETHERITE_STICK_NETHERITE_AXE = ITEMS.registerItem("netherite_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> NETHERITE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("netherite_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> NETHERITE_STICK_NETHERITE_HOE = ITEMS.registerItem("netherite_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ADVANCED_STICK_NETHERITE_SWORD = ITEMS.registerItem("advanced_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_ADVANCED_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ADVANCED_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("advanced_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ADVANCED_STICK_NETHERITE_AXE = ITEMS.registerItem("advanced_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ADVANCED_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("advanced_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ADVANCED_STICK_NETHERITE_HOE = ITEMS.registerItem("advanced_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> BLAZE_STICK_NETHERITE_SWORD = ITEMS.registerItem("blazerod_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> BLAZE_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("blazerod_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> BLAZE_STICK_NETHERITE_AXE = ITEMS.registerItem("blazerod_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> BLAZE_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("blazerod_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> BLAZE_STICK_NETHERITE_HOE = ITEMS.registerItem("blazerod_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> END_STICK_NETHERITE_SWORD = ITEMS.registerItem("endrod_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_ENDROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> END_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("endrod_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> END_STICK_NETHERITE_AXE = ITEMS.registerItem("endrod_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> END_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("endrod_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> END_STICK_NETHERITE_HOE = ITEMS.registerItem("endrod_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_ENDROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<SwordItem> ENCHANTED_STICK_NETHERITE_SWORD = ITEMS.registerItem("enchanted_stick_netherite_sword", props -> new SwordItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, props));
    public static final DeferredItem<PickaxeItem> ENCHANTED_STICK_NETHERITE_PICKAXE = ITEMS.registerItem("enchanted_stick_netherite_pickaxe", props -> new PickaxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, props));
    public static final DeferredItem<AxeItem> ENCHANTED_STICK_NETHERITE_AXE = ITEMS.registerItem("enchanted_stick_netherite_axe", props -> new AxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, props));
    public static final DeferredItem<ShovelItem> ENCHANTED_STICK_NETHERITE_SHOVEL = ITEMS.registerItem("enchanted_stick_netherite_shovel", props -> new ShovelItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, props));
    public static final DeferredItem<HoeItem> ENCHANTED_STICK_NETHERITE_HOE = ITEMS.registerItem("enchanted_stick_netherite_hoe", props -> new HoeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, props));

    public static final DeferredItem<CustomBowItem> IRON_BOW = ITEMS.register("iron_bow", () -> new CustomBowItem(new Item.Properties().durability(500).setId(itemId("iron_bow"))));
    public static final DeferredItem<CustomBowItem> GOLD_BOW = ITEMS.register("gold_bow", () -> new CustomBowItem(new Item.Properties().durability(250).setId(itemId("gold_bow"))));
    public static final DeferredItem<CustomBowItem> DIAMOND_BOW = ITEMS.register("diamond_bow", () -> new CustomBowItem(new Item.Properties().durability(1560).setId(itemId("diamond_bow"))));
    public static final DeferredItem<CustomBowItem> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new CustomBowItem(new Item.Properties().durability(2030).setId(itemId("netherite_bow"))));

    
    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }
}