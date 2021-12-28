package xxrexraptorxx.advancedsticks.main;

import net.minecraft.world.item.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.advancedsticks.items.ItemBasic;
import xxrexraptorxx.advancedsticks.utils.CreativeTab;
import xxrexraptorxx.advancedsticks.utils.ToolMaterials;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    public static final RegistryObject<ItemBasic> BONE_STICK = ITEMS.register("stick_bone", ItemBasic::new);
    public static final RegistryObject<ItemBasic> IRON_STICK = ITEMS.register("stick_iron", ItemBasic::new);
    public static final RegistryObject<ItemBasic> GOLD_STICK = ITEMS.register("stick_gold", ItemBasic::new);
    public static final RegistryObject<ItemBasic> COPPER_STICK = ITEMS.register("stick_copper", ItemBasic::new);
    public static final RegistryObject<ItemBasic> EMERALD_STICK = ITEMS.register("stick_emerald", ItemBasic::new);
    public static final RegistryObject<ItemBasic> AMETHYST_STICK = ITEMS.register("stick_amethyst", ItemBasic::new);
    public static final RegistryObject<ItemBasic> DIAMOND_STICK = ITEMS.register("stick_diamond", ItemBasic::new);
    public static final RegistryObject<ItemBasic> NETHERITE_STICK = ITEMS.register("stick_netherite", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ENCHANTED_STICK = ITEMS.register("stick_enchanted", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ADVANCED_STICK = ITEMS.register("stick_advanced", ItemBasic::new);

    /*
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_AIR = ITEMS.register("elemental_stick_air", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_FIRE = ITEMS.register("elemental_stick_fire", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_EARTH = ITEMS.register("elemental_stick_earth", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_WATER = ITEMS.register("elemental_stick_water", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_LIGHT = ITEMS.register("elemental_stick_light", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_DARKNESS = ITEMS.register("elemental_stick_darkness", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_NATURE = ITEMS.register("elemental_stick_nature", ItemBasic::new);
    public static final RegistryObject<ItemBasic> ELEMENTAL_STICK_DIMENSION = ITEMS.register("elemental_stick_dimension", ItemBasic::new);
    */

    /** WOOD **/
    public static final RegistryObject<SwordItem> BONE_STICK_WOOD_SWORD = ITEMS.register("bone_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_BONE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BONE_STICK_WOOD_PICKAXE = ITEMS.register("bone_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_BONE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BONE_STICK_WOOD_AXE = ITEMS.register("bone_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_BONE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BONE_STICK_WOOD_SHOVEL = ITEMS.register("bone_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_BONE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BONE_STICK_WOOD_HOE = ITEMS.register("bone_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_BONE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> IRON_STICK_WOOD_SWORD = ITEMS.register("iron_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_IRON_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_STICK_WOOD_PICKAXE = ITEMS.register("iron_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_IRON_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> IRON_STICK_WOOD_AXE = ITEMS.register("iron_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_IRON_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> IRON_STICK_WOOD_SHOVEL = ITEMS.register("iron_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_IRON_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> IRON_STICK_WOOD_HOE = ITEMS.register("iron_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_IRON_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> COPPER_STICK_WOOD_SWORD = ITEMS.register("copper_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_COPPER_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_STICK_WOOD_PICKAXE = ITEMS.register("copper_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_COPPER_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> COPPER_STICK_WOOD_AXE = ITEMS.register("copper_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_COPPER_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> COPPER_STICK_WOOD_SHOVEL = ITEMS.register("copper_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_COPPER_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> COPPER_STICK_WOOD_HOE = ITEMS.register("copper_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_COPPER_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> GOLD_STICK_WOOD_SWORD = ITEMS.register("gold_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_GOLD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_STICK_WOOD_PICKAXE = ITEMS.register("gold_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_GOLD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> GOLD_STICK_WOOD_AXE = ITEMS.register("gold_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_GOLD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_STICK_WOOD_SHOVEL = ITEMS.register("gold_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_GOLD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> GOLD_STICK_WOOD_HOE = ITEMS.register("gold_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_GOLD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> DIAMOND_STICK_WOOD_SWORD = ITEMS.register("diamond_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_DIAMOND_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_STICK_WOOD_PICKAXE = ITEMS.register("diamond_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_DIAMOND_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_STICK_WOOD_AXE = ITEMS.register("diamond_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_DIAMOND_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_STICK_WOOD_SHOVEL = ITEMS.register("diamond_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_DIAMOND_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_STICK_WOOD_HOE = ITEMS.register("diamond_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_DIAMOND_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> EMERALD_STICK_WOOD_SWORD = ITEMS.register("emerald_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_EMERALD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_STICK_WOOD_PICKAXE = ITEMS.register("emerald_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_EMERALD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_STICK_WOOD_AXE = ITEMS.register("emerald_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_EMERALD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_STICK_WOOD_SHOVEL = ITEMS.register("emerald_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_EMERALD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_STICK_WOOD_HOE = ITEMS.register("emerald_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_EMERALD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_STICK_WOOD_SWORD = ITEMS.register("amethyst_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_AMETHYST_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_STICK_WOOD_PICKAXE = ITEMS.register("amethyst_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_AMETHYST_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_STICK_WOOD_AXE = ITEMS.register("amethyst_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_AMETHYST_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_STICK_WOOD_SHOVEL = ITEMS.register("amethyst_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_AMETHYST_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_STICK_WOOD_HOE = ITEMS.register("amethyst_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_AMETHYST_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_STICK_WOOD_SWORD = ITEMS.register("netherite_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_NETHERITE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_STICK_WOOD_PICKAXE = ITEMS.register("netherite_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_NETHERITE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_STICK_WOOD_AXE = ITEMS.register("netherite_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_NETHERITE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_STICK_WOOD_SHOVEL = ITEMS.register("netherite_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_NETHERITE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_STICK_WOOD_HOE = ITEMS.register("netherite_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_NETHERITE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ADVANCED_STICK_WOOD_SWORD = ITEMS.register("advanced_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_ADVANCED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_STICK_WOOD_PICKAXE = ITEMS.register("advanced_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_ADVANCED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_STICK_WOOD_AXE = ITEMS.register("advanced_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_ADVANCED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_STICK_WOOD_SHOVEL = ITEMS.register("advanced_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_ADVANCED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_STICK_WOOD_HOE = ITEMS.register("advanced_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_ADVANCED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> BLAZE_STICK_WOOD_SWORD = ITEMS.register("blazerod_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_BLAZEROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BLAZE_STICK_WOOD_PICKAXE = ITEMS.register("blazerod_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BLAZE_STICK_WOOD_AXE = ITEMS.register("blazerod_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BLAZE_STICK_WOOD_SHOVEL = ITEMS.register("blazerod_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_BLAZEROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BLAZE_STICK_WOOD_HOE = ITEMS.register("blazerod_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_BLAZEROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> END_STICK_WOOD_SWORD = ITEMS.register("endrod_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_ENDROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> END_STICK_WOOD_PICKAXE = ITEMS.register("endrod_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_ENDROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> END_STICK_WOOD_AXE = ITEMS.register("endrod_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_ENDROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> END_STICK_WOOD_SHOVEL = ITEMS.register("endrod_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_ENDROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> END_STICK_WOOD_HOE = ITEMS.register("endrod_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_ENDROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ENCHANTED_STICK_WOOD_SWORD = ITEMS.register("enchanted_stick_wood_sword", () -> new SwordItem(ToolMaterials.WOOD_ENCHANTED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ENCHANTED_STICK_WOOD_PICKAXE = ITEMS.register("enchanted_stick_wood_pickaxe", () -> new PickaxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ENCHANTED_STICK_WOOD_AXE = ITEMS.register("enchanted_stick_wood_axe", () -> new AxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ENCHANTED_STICK_WOOD_SHOVEL = ITEMS.register("enchanted_stick_wood_shovel", () -> new ShovelItem(ToolMaterials.WOOD_ENCHANTED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ENCHANTED_STICK_WOOD_HOE = ITEMS.register("enchanted_stick_wood_hoe", () -> new HoeItem(ToolMaterials.WOOD_ENCHANTED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    /** STONE **/
    public static final RegistryObject<SwordItem> BONE_STICK_STONE_SWORD = ITEMS.register("bone_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_BONE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BONE_STICK_STONE_PICKAXE = ITEMS.register("bone_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_BONE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BONE_STICK_STONE_AXE = ITEMS.register("bone_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_BONE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BONE_STICK_STONE_SHOVEL = ITEMS.register("bone_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_BONE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BONE_STICK_STONE_HOE = ITEMS.register("bone_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_BONE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> IRON_STICK_STONE_SWORD = ITEMS.register("iron_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_IRON_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_STICK_STONE_PICKAXE = ITEMS.register("iron_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_IRON_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> IRON_STICK_STONE_AXE = ITEMS.register("iron_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_IRON_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> IRON_STICK_STONE_SHOVEL = ITEMS.register("iron_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_IRON_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> IRON_STICK_STONE_HOE = ITEMS.register("iron_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_IRON_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> COPPER_STICK_STONE_SWORD = ITEMS.register("copper_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_COPPER_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_STICK_STONE_PICKAXE = ITEMS.register("copper_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_COPPER_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> COPPER_STICK_STONE_AXE = ITEMS.register("copper_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_COPPER_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> COPPER_STICK_STONE_SHOVEL = ITEMS.register("copper_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_COPPER_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> COPPER_STICK_STONE_HOE = ITEMS.register("copper_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_COPPER_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> GOLD_STICK_STONE_SWORD = ITEMS.register("gold_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_GOLD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_STICK_STONE_PICKAXE = ITEMS.register("gold_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_GOLD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> GOLD_STICK_STONE_AXE = ITEMS.register("gold_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_GOLD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_STICK_STONE_SHOVEL = ITEMS.register("gold_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_GOLD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> GOLD_STICK_STONE_HOE = ITEMS.register("gold_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_GOLD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> DIAMOND_STICK_STONE_SWORD = ITEMS.register("diamond_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_DIAMOND_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_STICK_STONE_PICKAXE = ITEMS.register("diamond_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_DIAMOND_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_STICK_STONE_AXE = ITEMS.register("diamond_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_DIAMOND_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_STICK_STONE_SHOVEL = ITEMS.register("diamond_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_DIAMOND_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_STICK_STONE_HOE = ITEMS.register("diamond_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_DIAMOND_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> EMERALD_STICK_STONE_SWORD = ITEMS.register("emerald_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_EMERALD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_STICK_STONE_PICKAXE = ITEMS.register("emerald_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_EMERALD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_STICK_STONE_AXE = ITEMS.register("emerald_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_EMERALD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_STICK_STONE_SHOVEL = ITEMS.register("emerald_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_EMERALD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_STICK_STONE_HOE = ITEMS.register("emerald_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_EMERALD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_STICK_STONE_SWORD = ITEMS.register("amethyst_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_AMETHYST_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_STICK_STONE_PICKAXE = ITEMS.register("amethyst_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_AMETHYST_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_STICK_STONE_AXE = ITEMS.register("amethyst_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_AMETHYST_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_STICK_STONE_SHOVEL = ITEMS.register("amethyst_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_AMETHYST_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_STICK_STONE_HOE = ITEMS.register("amethyst_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_AMETHYST_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_STICK_STONE_SWORD = ITEMS.register("netherite_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_NETHERITE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_STICK_STONE_PICKAXE = ITEMS.register("netherite_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_NETHERITE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_STICK_STONE_AXE = ITEMS.register("netherite_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_NETHERITE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_STICK_STONE_SHOVEL = ITEMS.register("netherite_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_NETHERITE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_STICK_STONE_HOE = ITEMS.register("netherite_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_NETHERITE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ADVANCED_STICK_STONE_SWORD = ITEMS.register("advanced_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_ADVANCED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_STICK_STONE_PICKAXE = ITEMS.register("advanced_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_ADVANCED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_STICK_STONE_AXE = ITEMS.register("advanced_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_ADVANCED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_STICK_STONE_SHOVEL = ITEMS.register("advanced_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_ADVANCED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_STICK_STONE_HOE = ITEMS.register("advanced_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_ADVANCED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> BLAZE_STICK_STONE_SWORD = ITEMS.register("blazerod_stone_sword", () -> new SwordItem(ToolMaterials.STONE_BLAZEROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BLAZE_STICK_STONE_PICKAXE = ITEMS.register("blazerod_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_BLAZEROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BLAZE_STICK_STONE_AXE = ITEMS.register("blazerod_stone_axe", () -> new AxeItem(ToolMaterials.STONE_BLAZEROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BLAZE_STICK_STONE_SHOVEL = ITEMS.register("blazerod_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_BLAZEROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BLAZE_STICK_STONE_HOE = ITEMS.register("blazerod_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_BLAZEROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> END_STICK_STONE_SWORD = ITEMS.register("endrod_stone_sword", () -> new SwordItem(ToolMaterials.STONE_ENDROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> END_STICK_STONE_PICKAXE = ITEMS.register("endrod_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_ENDROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> END_STICK_STONE_AXE = ITEMS.register("endrod_stone_axe", () -> new AxeItem(ToolMaterials.STONE_ENDROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> END_STICK_STONE_SHOVEL = ITEMS.register("endrod_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_ENDROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> END_STICK_STONE_HOE = ITEMS.register("endrod_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_ENDROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ENCHANTED_STICK_STONE_SWORD = ITEMS.register("enchanted_stick_stone_sword", () -> new SwordItem(ToolMaterials.STONE_ENCHANTED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ENCHANTED_STICK_STONE_PICKAXE = ITEMS.register("enchanted_stick_stone_pickaxe", () -> new PickaxeItem(ToolMaterials.STONE_ENCHANTED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ENCHANTED_STICK_STONE_AXE = ITEMS.register("enchanted_stick_stone_axe", () -> new AxeItem(ToolMaterials.STONE_ENCHANTED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ENCHANTED_STICK_STONE_SHOVEL = ITEMS.register("enchanted_stick_stone_shovel", () -> new ShovelItem(ToolMaterials.STONE_ENCHANTED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ENCHANTED_STICK_STONE_HOE = ITEMS.register("enchanted_stick_stone_hoe", () -> new HoeItem(ToolMaterials.STONE_ENCHANTED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    /** IRON **/
    public static final RegistryObject<SwordItem> BONE_STICK_IRON_SWORD = ITEMS.register("bone_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_BONE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BONE_STICK_IRON_PICKAXE = ITEMS.register("bone_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_BONE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BONE_STICK_IRON_AXE = ITEMS.register("bone_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_BONE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BONE_STICK_IRON_SHOVEL = ITEMS.register("bone_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_BONE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BONE_STICK_IRON_HOE = ITEMS.register("bone_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_BONE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> IRON_STICK_IRON_SWORD = ITEMS.register("iron_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_IRON_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_STICK_IRON_PICKAXE = ITEMS.register("iron_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_IRON_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> IRON_STICK_IRON_AXE = ITEMS.register("iron_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_IRON_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> IRON_STICK_IRON_SHOVEL = ITEMS.register("iron_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_IRON_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> IRON_STICK_IRON_HOE = ITEMS.register("iron_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_IRON_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> COPPER_STICK_IRON_SWORD = ITEMS.register("copper_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_COPPER_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_STICK_IRON_PICKAXE = ITEMS.register("copper_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_COPPER_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> COPPER_STICK_IRON_AXE = ITEMS.register("copper_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_COPPER_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> COPPER_STICK_IRON_SHOVEL = ITEMS.register("copper_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_COPPER_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> COPPER_STICK_IRON_HOE = ITEMS.register("copper_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_COPPER_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> GOLD_STICK_IRON_SWORD = ITEMS.register("gold_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_GOLD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_STICK_IRON_PICKAXE = ITEMS.register("gold_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_GOLD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> GOLD_STICK_IRON_AXE = ITEMS.register("gold_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_GOLD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_STICK_IRON_SHOVEL = ITEMS.register("gold_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_GOLD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> GOLD_STICK_IRON_HOE = ITEMS.register("gold_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_GOLD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> DIAMOND_STICK_IRON_SWORD = ITEMS.register("diamond_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_DIAMOND_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_STICK_IRON_PICKAXE = ITEMS.register("diamond_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_DIAMOND_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_STICK_IRON_AXE = ITEMS.register("diamond_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_DIAMOND_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_STICK_IRON_SHOVEL = ITEMS.register("diamond_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_DIAMOND_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_STICK_IRON_HOE = ITEMS.register("diamond_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_DIAMOND_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> EMERALD_STICK_IRON_SWORD = ITEMS.register("emerald_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_EMERALD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_STICK_IRON_PICKAXE = ITEMS.register("emerald_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_EMERALD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_STICK_IRON_AXE = ITEMS.register("emerald_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_EMERALD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_STICK_IRON_SHOVEL = ITEMS.register("emerald_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_EMERALD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_STICK_IRON_HOE = ITEMS.register("emerald_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_EMERALD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_STICK_IRON_SWORD = ITEMS.register("amethyst_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_AMETHYST_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_STICK_IRON_PICKAXE = ITEMS.register("amethyst_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_AMETHYST_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_STICK_IRON_AXE = ITEMS.register("amethyst_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_AMETHYST_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_STICK_IRON_SHOVEL = ITEMS.register("amethyst_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_AMETHYST_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_STICK_IRON_HOE = ITEMS.register("amethyst_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_AMETHYST_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_STICK_IRON_SWORD = ITEMS.register("netherite_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_NETHERITE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_STICK_IRON_PICKAXE = ITEMS.register("netherite_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_NETHERITE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_STICK_IRON_AXE = ITEMS.register("netherite_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_NETHERITE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_STICK_IRON_SHOVEL = ITEMS.register("netherite_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_NETHERITE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_STICK_IRON_HOE = ITEMS.register("netherite_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_NETHERITE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ADVANCED_STICK_IRON_SWORD = ITEMS.register("advanced_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_ADVANCED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_STICK_IRON_PICKAXE = ITEMS.register("advanced_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_ADVANCED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_STICK_IRON_AXE = ITEMS.register("advanced_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_ADVANCED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_STICK_IRON_SHOVEL = ITEMS.register("advanced_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_ADVANCED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_STICK_IRON_HOE = ITEMS.register("advanced_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_ADVANCED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> BLAZE_STICK_IRON_SWORD = ITEMS.register("blazerod_iron_sword", () -> new SwordItem(ToolMaterials.IRON_BLAZEROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BLAZE_STICK_IRON_PICKAXE = ITEMS.register("blazerod_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_BLAZEROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BLAZE_STICK_IRON_AXE = ITEMS.register("blazerod_iron_axe", () -> new AxeItem(ToolMaterials.IRON_BLAZEROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BLAZE_STICK_IRON_SHOVEL = ITEMS.register("blazerod_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_BLAZEROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BLAZE_STICK_IRON_HOE = ITEMS.register("blazerod_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_BLAZEROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> END_STICK_IRON_SWORD = ITEMS.register("endrod_iron_sword", () -> new SwordItem(ToolMaterials.IRON_ENDROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> END_STICK_IRON_PICKAXE = ITEMS.register("endrod_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_ENDROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> END_STICK_IRON_AXE = ITEMS.register("endrod_iron_axe", () -> new AxeItem(ToolMaterials.IRON_ENDROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> END_STICK_IRON_SHOVEL = ITEMS.register("endrod_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_ENDROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> END_STICK_IRON_HOE = ITEMS.register("endrod_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_ENDROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ENCHANTED_STICK_IRON_SWORD = ITEMS.register("enchanted_stick_iron_sword", () -> new SwordItem(ToolMaterials.IRON_ENCHANTED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ENCHANTED_STICK_IRON_PICKAXE = ITEMS.register("enchanted_stick_iron_pickaxe", () -> new PickaxeItem(ToolMaterials.IRON_ENCHANTED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ENCHANTED_STICK_IRON_AXE = ITEMS.register("enchanted_stick_iron_axe", () -> new AxeItem(ToolMaterials.IRON_ENCHANTED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ENCHANTED_STICK_IRON_SHOVEL = ITEMS.register("enchanted_stick_iron_shovel", () -> new ShovelItem(ToolMaterials.IRON_ENCHANTED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ENCHANTED_STICK_IRON_HOE = ITEMS.register("enchanted_stick_iron_hoe", () -> new HoeItem(ToolMaterials.IRON_ENCHANTED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    /** GOLD **/
    public static final RegistryObject<SwordItem> BONE_STICK_GOLD_SWORD = ITEMS.register("bone_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_BONE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BONE_STICK_GOLD_PICKAXE = ITEMS.register("bone_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_BONE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BONE_STICK_GOLD_AXE = ITEMS.register("bone_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_BONE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BONE_STICK_GOLD_SHOVEL = ITEMS.register("bone_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_BONE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BONE_STICK_GOLD_HOE = ITEMS.register("bone_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_BONE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> IRON_STICK_GOLD_SWORD = ITEMS.register("iron_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_IRON_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_STICK_GOLD_PICKAXE = ITEMS.register("iron_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_IRON_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> IRON_STICK_GOLD_AXE = ITEMS.register("iron_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_IRON_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> IRON_STICK_GOLD_SHOVEL = ITEMS.register("iron_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_IRON_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> IRON_STICK_GOLD_HOE = ITEMS.register("iron_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_IRON_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> COPPER_STICK_GOLD_SWORD = ITEMS.register("copper_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_COPPER_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_STICK_GOLD_PICKAXE = ITEMS.register("copper_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_COPPER_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> COPPER_STICK_GOLD_AXE = ITEMS.register("copper_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_COPPER_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> COPPER_STICK_GOLD_SHOVEL = ITEMS.register("copper_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_COPPER_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> COPPER_STICK_GOLD_HOE = ITEMS.register("copper_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_COPPER_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> GOLD_STICK_GOLD_SWORD = ITEMS.register("gold_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_GOLD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_STICK_GOLD_PICKAXE = ITEMS.register("gold_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_GOLD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> GOLD_STICK_GOLD_AXE = ITEMS.register("gold_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_GOLD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_STICK_GOLD_SHOVEL = ITEMS.register("gold_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_GOLD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> GOLD_STICK_GOLD_HOE = ITEMS.register("gold_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_GOLD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> DIAMOND_STICK_GOLD_SWORD = ITEMS.register("diamond_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_DIAMOND_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_STICK_GOLD_PICKAXE = ITEMS.register("diamond_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_DIAMOND_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_STICK_GOLD_AXE = ITEMS.register("diamond_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_DIAMOND_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_STICK_GOLD_SHOVEL = ITEMS.register("diamond_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_DIAMOND_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_STICK_GOLD_HOE = ITEMS.register("diamond_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_DIAMOND_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> EMERALD_STICK_GOLD_SWORD = ITEMS.register("emerald_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_EMERALD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_STICK_GOLD_PICKAXE = ITEMS.register("emerald_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_EMERALD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_STICK_GOLD_AXE = ITEMS.register("emerald_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_EMERALD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_STICK_GOLD_SHOVEL = ITEMS.register("emerald_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_EMERALD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_STICK_GOLD_HOE = ITEMS.register("emerald_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_EMERALD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_STICK_GOLD_SWORD = ITEMS.register("amethyst_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_AMETHYST_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_STICK_GOLD_PICKAXE = ITEMS.register("amethyst_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_AMETHYST_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_STICK_GOLD_AXE = ITEMS.register("amethyst_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_AMETHYST_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_STICK_GOLD_SHOVEL = ITEMS.register("amethyst_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_AMETHYST_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_STICK_GOLD_HOE = ITEMS.register("amethyst_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_AMETHYST_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_STICK_GOLD_SWORD = ITEMS.register("netherite_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_NETHERITE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_STICK_GOLD_PICKAXE = ITEMS.register("netherite_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_NETHERITE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_STICK_GOLD_AXE = ITEMS.register("netherite_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_NETHERITE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_STICK_GOLD_SHOVEL = ITEMS.register("netherite_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_NETHERITE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_STICK_GOLD_HOE = ITEMS.register("netherite_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_NETHERITE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ADVANCED_STICK_GOLD_SWORD = ITEMS.register("advanced_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_ADVANCED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_STICK_GOLD_PICKAXE = ITEMS.register("advanced_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_ADVANCED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_STICK_GOLD_AXE = ITEMS.register("advanced_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_ADVANCED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_STICK_GOLD_SHOVEL = ITEMS.register("advanced_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_ADVANCED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_STICK_GOLD_HOE = ITEMS.register("advanced_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_ADVANCED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> BLAZE_STICK_GOLD_SWORD = ITEMS.register("blazerod_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_BLAZEROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BLAZE_STICK_GOLD_PICKAXE = ITEMS.register("blazerod_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BLAZE_STICK_GOLD_AXE = ITEMS.register("blazerod_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BLAZE_STICK_GOLD_SHOVEL = ITEMS.register("blazerod_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_BLAZEROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BLAZE_STICK_GOLD_HOE = ITEMS.register("blazerod_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_BLAZEROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> END_STICK_GOLD_SWORD = ITEMS.register("endrod_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_ENDROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> END_STICK_GOLD_PICKAXE = ITEMS.register("endrod_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_ENDROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> END_STICK_GOLD_AXE = ITEMS.register("endrod_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_ENDROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> END_STICK_GOLD_SHOVEL = ITEMS.register("endrod_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_ENDROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> END_STICK_GOLD_HOE = ITEMS.register("endrod_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_ENDROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ENCHANTED_STICK_GOLD_SWORD = ITEMS.register("enchanted_stick_gold_sword", () -> new SwordItem(ToolMaterials.GOLD_ENCHANTED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ENCHANTED_STICK_GOLD_PICKAXE = ITEMS.register("enchanted_stick_gold_pickaxe", () -> new PickaxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ENCHANTED_STICK_GOLD_AXE = ITEMS.register("enchanted_stick_gold_axe", () -> new AxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ENCHANTED_STICK_GOLD_SHOVEL = ITEMS.register("enchanted_stick_gold_shovel", () -> new ShovelItem(ToolMaterials.GOLD_ENCHANTED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ENCHANTED_STICK_GOLD_HOE = ITEMS.register("enchanted_stick_gold_hoe", () -> new HoeItem(ToolMaterials.GOLD_ENCHANTED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    /** DIAMOND **/
    public static final RegistryObject<SwordItem> BONE_STICK_DIAMOND_SWORD = ITEMS.register("bone_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_BONE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BONE_STICK_DIAMOND_PICKAXE = ITEMS.register("bone_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_BONE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BONE_STICK_DIAMOND_AXE = ITEMS.register("bone_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_BONE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BONE_STICK_DIAMOND_SHOVEL = ITEMS.register("bone_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_BONE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BONE_STICK_DIAMOND_HOE = ITEMS.register("bone_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_BONE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> IRON_STICK_DIAMOND_SWORD = ITEMS.register("iron_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_IRON_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_STICK_DIAMOND_PICKAXE = ITEMS.register("iron_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_IRON_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> IRON_STICK_DIAMOND_AXE = ITEMS.register("iron_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_IRON_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> IRON_STICK_DIAMOND_SHOVEL = ITEMS.register("iron_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_IRON_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> IRON_STICK_DIAMOND_HOE = ITEMS.register("iron_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_IRON_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> COPPER_STICK_DIAMOND_SWORD = ITEMS.register("copper_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_COPPER_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_STICK_DIAMOND_PICKAXE = ITEMS.register("copper_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_COPPER_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> COPPER_STICK_DIAMOND_AXE = ITEMS.register("copper_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_COPPER_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> COPPER_STICK_DIAMOND_SHOVEL = ITEMS.register("copper_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_COPPER_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> COPPER_STICK_DIAMOND_HOE = ITEMS.register("copper_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_COPPER_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> GOLD_STICK_DIAMOND_SWORD = ITEMS.register("gold_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_GOLD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_STICK_DIAMOND_PICKAXE = ITEMS.register("gold_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_GOLD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> GOLD_STICK_DIAMOND_AXE = ITEMS.register("gold_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_GOLD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_STICK_DIAMOND_SHOVEL = ITEMS.register("gold_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_GOLD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> GOLD_STICK_DIAMOND_HOE = ITEMS.register("gold_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_GOLD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> DIAMOND_STICK_DIAMOND_SWORD = ITEMS.register("diamond_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_DIAMOND_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_STICK_DIAMOND_PICKAXE = ITEMS.register("diamond_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_STICK_DIAMOND_AXE = ITEMS.register("diamond_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_STICK_DIAMOND_SHOVEL = ITEMS.register("diamond_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_STICK_DIAMOND_HOE = ITEMS.register("diamond_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> EMERALD_STICK_DIAMOND_SWORD = ITEMS.register("emerald_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_EMERALD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_STICK_DIAMOND_PICKAXE = ITEMS.register("emerald_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_STICK_DIAMOND_AXE = ITEMS.register("emerald_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_STICK_DIAMOND_SHOVEL = ITEMS.register("emerald_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_EMERALD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_STICK_DIAMOND_HOE = ITEMS.register("emerald_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_EMERALD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_STICK_DIAMOND_SWORD = ITEMS.register("amethyst_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_AMETHYST_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_STICK_DIAMOND_PICKAXE = ITEMS.register("amethyst_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_STICK_DIAMOND_AXE = ITEMS.register("amethyst_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_STICK_DIAMOND_SHOVEL = ITEMS.register("amethyst_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_STICK_DIAMOND_HOE = ITEMS.register("amethyst_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_STICK_DIAMOND_SWORD = ITEMS.register("netherite_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_NETHERITE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_STICK_DIAMOND_PICKAXE = ITEMS.register("netherite_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_STICK_DIAMOND_AXE = ITEMS.register("netherite_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_STICK_DIAMOND_SHOVEL = ITEMS.register("netherite_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_STICK_DIAMOND_HOE = ITEMS.register("netherite_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ADVANCED_STICK_DIAMOND_SWORD = ITEMS.register("advanced_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_ADVANCED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_STICK_DIAMOND_PICKAXE = ITEMS.register("advanced_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_STICK_DIAMOND_AXE = ITEMS.register("advanced_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_STICK_DIAMOND_SHOVEL = ITEMS.register("advanced_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_STICK_DIAMOND_HOE = ITEMS.register("advanced_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> BLAZE_STICK_DIAMOND_SWORD = ITEMS.register("blazerod_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BLAZE_STICK_DIAMOND_PICKAXE = ITEMS.register("blazerod_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BLAZE_STICK_DIAMOND_AXE = ITEMS.register("blazerod_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BLAZE_STICK_DIAMOND_SHOVEL = ITEMS.register("blazerod_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BLAZE_STICK_DIAMOND_HOE = ITEMS.register("blazerod_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> END_STICK_DIAMOND_SWORD = ITEMS.register("endrod_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_ENDROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> END_STICK_DIAMOND_PICKAXE = ITEMS.register("endrod_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> END_STICK_DIAMOND_AXE = ITEMS.register("endrod_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> END_STICK_DIAMOND_SHOVEL = ITEMS.register("endrod_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_ENDROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> END_STICK_DIAMOND_HOE = ITEMS.register("endrod_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_ENDROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ENCHANTED_STICK_DIAMOND_SWORD = ITEMS.register("enchanted_stick_diamond_sword", () -> new SwordItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ENCHANTED_STICK_DIAMOND_PICKAXE = ITEMS.register("enchanted_stick_diamond_pickaxe", () -> new PickaxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ENCHANTED_STICK_DIAMOND_AXE = ITEMS.register("enchanted_stick_diamond_axe", () -> new AxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ENCHANTED_STICK_DIAMOND_SHOVEL = ITEMS.register("enchanted_stick_diamond_shovel", () -> new ShovelItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ENCHANTED_STICK_DIAMOND_HOE = ITEMS.register("enchanted_stick_diamond_hoe", () -> new HoeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));


    /** NETHERITE **/
    public static final RegistryObject<SwordItem> BONE_STICK_NETHERITE_SWORD = ITEMS.register("bone_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_BONE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BONE_STICK_NETHERITE_PICKAXE = ITEMS.register("bone_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_BONE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BONE_STICK_NETHERITE_AXE = ITEMS.register("bone_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_BONE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BONE_STICK_NETHERITE_SHOVEL = ITEMS.register("bone_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_BONE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BONE_STICK_NETHERITE_HOE = ITEMS.register("bone_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_BONE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> IRON_STICK_NETHERITE_SWORD = ITEMS.register("iron_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_IRON_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_STICK_NETHERITE_PICKAXE = ITEMS.register("iron_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_IRON_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> IRON_STICK_NETHERITE_AXE = ITEMS.register("iron_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_IRON_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> IRON_STICK_NETHERITE_SHOVEL = ITEMS.register("iron_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_IRON_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> IRON_STICK_NETHERITE_HOE = ITEMS.register("iron_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_IRON_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> COPPER_STICK_NETHERITE_SWORD = ITEMS.register("copper_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_COPPER_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_STICK_NETHERITE_PICKAXE = ITEMS.register("copper_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_COPPER_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> COPPER_STICK_NETHERITE_AXE = ITEMS.register("copper_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_COPPER_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> COPPER_STICK_NETHERITE_SHOVEL = ITEMS.register("copper_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_COPPER_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> COPPER_STICK_NETHERITE_HOE = ITEMS.register("copper_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_COPPER_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> GOLD_STICK_NETHERITE_SWORD = ITEMS.register("gold_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_GOLD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_STICK_NETHERITE_PICKAXE = ITEMS.register("gold_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_GOLD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> GOLD_STICK_NETHERITE_AXE = ITEMS.register("gold_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_GOLD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_STICK_NETHERITE_SHOVEL = ITEMS.register("gold_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_GOLD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> GOLD_STICK_NETHERITE_HOE = ITEMS.register("gold_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_GOLD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> DIAMOND_STICK_NETHERITE_SWORD = ITEMS.register("diamond_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_DIAMOND_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_STICK_NETHERITE_PICKAXE = ITEMS.register("diamond_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_STICK_NETHERITE_AXE = ITEMS.register("diamond_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_STICK_NETHERITE_SHOVEL = ITEMS.register("diamond_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_STICK_NETHERITE_HOE = ITEMS.register("diamond_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> EMERALD_STICK_NETHERITE_SWORD = ITEMS.register("emerald_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_EMERALD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_STICK_NETHERITE_PICKAXE = ITEMS.register("emerald_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_STICK_NETHERITE_AXE = ITEMS.register("emerald_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_STICK_NETHERITE_SHOVEL = ITEMS.register("emerald_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_EMERALD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_STICK_NETHERITE_HOE = ITEMS.register("emerald_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_EMERALD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_STICK_NETHERITE_SWORD = ITEMS.register("amethyst_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_AMETHYST_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_STICK_NETHERITE_PICKAXE = ITEMS.register("amethyst_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_STICK_NETHERITE_AXE = ITEMS.register("amethyst_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_STICK_NETHERITE_SHOVEL = ITEMS.register("amethyst_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_STICK_NETHERITE_HOE = ITEMS.register("amethyst_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> NETHERITE_STICK_NETHERITE_SWORD = ITEMS.register("netherite_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_NETHERITE_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_STICK_NETHERITE_PICKAXE = ITEMS.register("netherite_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_STICK_NETHERITE_AXE = ITEMS.register("netherite_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_STICK_NETHERITE_SHOVEL = ITEMS.register("netherite_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_STICK_NETHERITE_HOE = ITEMS.register("netherite_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ADVANCED_STICK_NETHERITE_SWORD = ITEMS.register("advanced_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_ADVANCED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ADVANCED_STICK_NETHERITE_PICKAXE = ITEMS.register("advanced_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ADVANCED_STICK_NETHERITE_AXE = ITEMS.register("advanced_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ADVANCED_STICK_NETHERITE_SHOVEL = ITEMS.register("advanced_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ADVANCED_STICK_NETHERITE_HOE = ITEMS.register("advanced_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> BLAZE_STICK_NETHERITE_SWORD = ITEMS.register("blazerod_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> BLAZE_STICK_NETHERITE_PICKAXE = ITEMS.register("blazerod_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> BLAZE_STICK_NETHERITE_AXE = ITEMS.register("blazerod_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> BLAZE_STICK_NETHERITE_SHOVEL = ITEMS.register("blazerod_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> BLAZE_STICK_NETHERITE_HOE = ITEMS.register("blazerod_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> END_STICK_NETHERITE_SWORD = ITEMS.register("endrod_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_ENDROD_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> END_STICK_NETHERITE_PICKAXE = ITEMS.register("endrod_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> END_STICK_NETHERITE_AXE = ITEMS.register("endrod_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> END_STICK_NETHERITE_SHOVEL = ITEMS.register("endrod_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_ENDROD_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> END_STICK_NETHERITE_HOE = ITEMS.register("endrod_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_ENDROD_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

    public static final RegistryObject<SwordItem> ENCHANTED_STICK_NETHERITE_SWORD = ITEMS.register("enchanted_stick_netherite_sword", () -> new SwordItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 3, -2.4f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<PickaxeItem> ENCHANTED_STICK_NETHERITE_PICKAXE = ITEMS.register("enchanted_stick_netherite_pickaxe", () -> new PickaxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1, -2.8f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<AxeItem> ENCHANTED_STICK_NETHERITE_AXE = ITEMS.register("enchanted_stick_netherite_axe", () -> new AxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 6, -3.2f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<ShovelItem> ENCHANTED_STICK_NETHERITE_SHOVEL = ITEMS.register("enchanted_stick_netherite_shovel", () -> new ShovelItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1.5f, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));
    public static final RegistryObject<HoeItem> ENCHANTED_STICK_NETHERITE_HOE = ITEMS.register("enchanted_stick_netherite_hoe", () -> new HoeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 0, -3f, new Item.Properties().tab(CreativeTab.MOD_TAB)));

}