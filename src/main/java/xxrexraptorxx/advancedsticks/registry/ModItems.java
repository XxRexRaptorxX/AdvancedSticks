package xxrexraptorxx.advancedsticks.registry;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.advancedsticks.items.*;
import xxrexraptorxx.advancedsticks.main.References;
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
    public static final RegistryObject<CustomSwordItem> BONE_STICK_WOOD_SWORD = ITEMS.register("bone_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_BONE_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BONE_STICK_WOOD_PICKAXE = ITEMS.register("bone_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_BONE_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BONE_STICK_WOOD_AXE = ITEMS.register("bone_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_BONE_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BONE_STICK_WOOD_SHOVEL = ITEMS.register("bone_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_BONE_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BONE_STICK_WOOD_HOE = ITEMS.register("bone_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_BONE_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> IRON_STICK_WOOD_SWORD = ITEMS.register("iron_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_IRON_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> IRON_STICK_WOOD_PICKAXE = ITEMS.register("iron_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_IRON_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> IRON_STICK_WOOD_AXE = ITEMS.register("iron_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_IRON_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> IRON_STICK_WOOD_SHOVEL = ITEMS.register("iron_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_IRON_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> IRON_STICK_WOOD_HOE = ITEMS.register("iron_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_IRON_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> COPPER_STICK_WOOD_SWORD = ITEMS.register("copper_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_COPPER_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> COPPER_STICK_WOOD_PICKAXE = ITEMS.register("copper_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_COPPER_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> COPPER_STICK_WOOD_AXE = ITEMS.register("copper_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_COPPER_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> COPPER_STICK_WOOD_SHOVEL = ITEMS.register("copper_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_COPPER_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> COPPER_STICK_WOOD_HOE = ITEMS.register("copper_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_COPPER_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> GOLD_STICK_WOOD_SWORD = ITEMS.register("gold_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_GOLD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> GOLD_STICK_WOOD_PICKAXE = ITEMS.register("gold_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_GOLD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> GOLD_STICK_WOOD_AXE = ITEMS.register("gold_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_GOLD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> GOLD_STICK_WOOD_SHOVEL = ITEMS.register("gold_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_GOLD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> GOLD_STICK_WOOD_HOE = ITEMS.register("gold_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_GOLD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> DIAMOND_STICK_WOOD_SWORD = ITEMS.register("diamond_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_DIAMOND_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> DIAMOND_STICK_WOOD_PICKAXE = ITEMS.register("diamond_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_DIAMOND_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> DIAMOND_STICK_WOOD_AXE = ITEMS.register("diamond_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_DIAMOND_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> DIAMOND_STICK_WOOD_SHOVEL = ITEMS.register("diamond_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> DIAMOND_STICK_WOOD_HOE = ITEMS.register("diamond_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_DIAMOND_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> EMERALD_STICK_WOOD_SWORD = ITEMS.register("emerald_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_EMERALD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> EMERALD_STICK_WOOD_PICKAXE = ITEMS.register("emerald_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_EMERALD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> EMERALD_STICK_WOOD_AXE = ITEMS.register("emerald_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_EMERALD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> EMERALD_STICK_WOOD_SHOVEL = ITEMS.register("emerald_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> EMERALD_STICK_WOOD_HOE = ITEMS.register("emerald_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_EMERALD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> AMETHYST_STICK_WOOD_SWORD = ITEMS.register("amethyst_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_AMETHYST_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> AMETHYST_STICK_WOOD_PICKAXE = ITEMS.register("amethyst_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_AMETHYST_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> AMETHYST_STICK_WOOD_AXE = ITEMS.register("amethyst_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_AMETHYST_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> AMETHYST_STICK_WOOD_SHOVEL = ITEMS.register("amethyst_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> AMETHYST_STICK_WOOD_HOE = ITEMS.register("amethyst_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_AMETHYST_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> NETHERITE_STICK_WOOD_SWORD = ITEMS.register("netherite_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_NETHERITE_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> NETHERITE_STICK_WOOD_PICKAXE = ITEMS.register("netherite_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_NETHERITE_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> NETHERITE_STICK_WOOD_AXE = ITEMS.register("netherite_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_NETHERITE_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> NETHERITE_STICK_WOOD_SHOVEL = ITEMS.register("netherite_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> NETHERITE_STICK_WOOD_HOE = ITEMS.register("netherite_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_NETHERITE_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ADVANCED_STICK_WOOD_SWORD = ITEMS.register("advanced_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_ADVANCED_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ADVANCED_STICK_WOOD_PICKAXE = ITEMS.register("advanced_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_ADVANCED_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ADVANCED_STICK_WOOD_AXE = ITEMS.register("advanced_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_ADVANCED_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ADVANCED_STICK_WOOD_SHOVEL = ITEMS.register("advanced_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ADVANCED_STICK_WOOD_HOE = ITEMS.register("advanced_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_ADVANCED_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> BLAZE_STICK_WOOD_SWORD = ITEMS.register("blazerod_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_BLAZEROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BLAZE_STICK_WOOD_PICKAXE = ITEMS.register("blazerod_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BLAZE_STICK_WOOD_AXE = ITEMS.register("blazerod_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_BLAZEROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BLAZE_STICK_WOOD_SHOVEL = ITEMS.register("blazerod_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BLAZE_STICK_WOOD_HOE = ITEMS.register("blazerod_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_BLAZEROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> END_STICK_WOOD_SWORD = ITEMS.register("endrod_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_ENDROD_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> END_STICK_WOOD_PICKAXE = ITEMS.register("endrod_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_ENDROD_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> END_STICK_WOOD_AXE = ITEMS.register("endrod_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_ENDROD_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> END_STICK_WOOD_SHOVEL = ITEMS.register("endrod_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> END_STICK_WOOD_HOE = ITEMS.register("endrod_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_ENDROD_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ENCHANTED_STICK_WOOD_SWORD = ITEMS.register("enchanted_stick_wood_sword", () -> new CustomSwordItem(ToolMaterials.WOOD_ENCHANTED_TM, 3, -4.0f + ToolMaterials.WOOD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ENCHANTED_STICK_WOOD_PICKAXE = ITEMS.register("enchanted_stick_wood_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 1, -4.0f + ToolMaterials.WOOD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ENCHANTED_STICK_WOOD_AXE = ITEMS.register("enchanted_stick_wood_axe", () -> new CustomAxeItem(ToolMaterials.WOOD_ENCHANTED_TM, 6, -4.0f + ToolMaterials.WOOD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ENCHANTED_STICK_WOOD_SHOVEL = ITEMS.register("enchanted_stick_wood_shovel", () -> new CustomShovelItem(ToolMaterials.WOOD_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.WOOD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ENCHANTED_STICK_WOOD_HOE = ITEMS.register("enchanted_stick_wood_hoe", () -> new CustomHoeItem(ToolMaterials.WOOD_ENCHANTED_TM, 0, -4.0f + ToolMaterials.WOOD_HOE_SPEED, new Item.Properties()));

            /** Stone **/
    public static final RegistryObject<CustomSwordItem> BONE_STICK_STONE_SWORD = ITEMS.register("bone_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_BONE_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BONE_STICK_STONE_PICKAXE = ITEMS.register("bone_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_BONE_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BONE_STICK_STONE_AXE = ITEMS.register("bone_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_BONE_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BONE_STICK_STONE_SHOVEL = ITEMS.register("bone_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_BONE_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BONE_STICK_STONE_HOE = ITEMS.register("bone_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_BONE_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> IRON_STICK_STONE_SWORD = ITEMS.register("iron_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_IRON_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> IRON_STICK_STONE_PICKAXE = ITEMS.register("iron_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_IRON_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> IRON_STICK_STONE_AXE = ITEMS.register("iron_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_IRON_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> IRON_STICK_STONE_SHOVEL = ITEMS.register("iron_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_IRON_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> IRON_STICK_STONE_HOE = ITEMS.register("iron_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_IRON_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> COPPER_STICK_STONE_SWORD = ITEMS.register("copper_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_COPPER_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> COPPER_STICK_STONE_PICKAXE = ITEMS.register("copper_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_COPPER_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> COPPER_STICK_STONE_AXE = ITEMS.register("copper_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_COPPER_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> COPPER_STICK_STONE_SHOVEL = ITEMS.register("copper_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_COPPER_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> COPPER_STICK_STONE_HOE = ITEMS.register("copper_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_COPPER_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> GOLD_STICK_STONE_SWORD = ITEMS.register("gold_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_GOLD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> GOLD_STICK_STONE_PICKAXE = ITEMS.register("gold_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_GOLD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> GOLD_STICK_STONE_AXE = ITEMS.register("gold_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_GOLD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> GOLD_STICK_STONE_SHOVEL = ITEMS.register("gold_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_GOLD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> GOLD_STICK_STONE_HOE = ITEMS.register("gold_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_GOLD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> DIAMOND_STICK_STONE_SWORD = ITEMS.register("diamond_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_DIAMOND_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> DIAMOND_STICK_STONE_PICKAXE = ITEMS.register("diamond_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_DIAMOND_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> DIAMOND_STICK_STONE_AXE = ITEMS.register("diamond_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_DIAMOND_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> DIAMOND_STICK_STONE_SHOVEL = ITEMS.register("diamond_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> DIAMOND_STICK_STONE_HOE = ITEMS.register("diamond_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_DIAMOND_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> EMERALD_STICK_STONE_SWORD = ITEMS.register("emerald_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_EMERALD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> EMERALD_STICK_STONE_PICKAXE = ITEMS.register("emerald_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_EMERALD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> EMERALD_STICK_STONE_AXE = ITEMS.register("emerald_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_EMERALD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> EMERALD_STICK_STONE_SHOVEL = ITEMS.register("emerald_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> EMERALD_STICK_STONE_HOE = ITEMS.register("emerald_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_EMERALD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> AMETHYST_STICK_STONE_SWORD = ITEMS.register("amethyst_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_AMETHYST_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> AMETHYST_STICK_STONE_PICKAXE = ITEMS.register("amethyst_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_AMETHYST_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> AMETHYST_STICK_STONE_AXE = ITEMS.register("amethyst_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_AMETHYST_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> AMETHYST_STICK_STONE_SHOVEL = ITEMS.register("amethyst_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> AMETHYST_STICK_STONE_HOE = ITEMS.register("amethyst_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_AMETHYST_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> NETHERITE_STICK_STONE_SWORD = ITEMS.register("netherite_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_NETHERITE_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> NETHERITE_STICK_STONE_PICKAXE = ITEMS.register("netherite_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_NETHERITE_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> NETHERITE_STICK_STONE_AXE = ITEMS.register("netherite_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_NETHERITE_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> NETHERITE_STICK_STONE_SHOVEL = ITEMS.register("netherite_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> NETHERITE_STICK_STONE_HOE = ITEMS.register("netherite_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_NETHERITE_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ADVANCED_STICK_STONE_SWORD = ITEMS.register("advanced_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_ADVANCED_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ADVANCED_STICK_STONE_PICKAXE = ITEMS.register("advanced_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_ADVANCED_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ADVANCED_STICK_STONE_AXE = ITEMS.register("advanced_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_ADVANCED_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ADVANCED_STICK_STONE_SHOVEL = ITEMS.register("advanced_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ADVANCED_STICK_STONE_HOE = ITEMS.register("advanced_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_ADVANCED_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> BLAZE_STICK_STONE_SWORD = ITEMS.register("blazerod_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_BLAZEROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BLAZE_STICK_STONE_PICKAXE = ITEMS.register("blazerod_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_BLAZEROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BLAZE_STICK_STONE_AXE = ITEMS.register("blazerod_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_BLAZEROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BLAZE_STICK_STONE_SHOVEL = ITEMS.register("blazerod_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BLAZE_STICK_STONE_HOE = ITEMS.register("blazerod_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_BLAZEROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> END_STICK_STONE_SWORD = ITEMS.register("endrod_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_ENDROD_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> END_STICK_STONE_PICKAXE = ITEMS.register("endrod_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_ENDROD_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> END_STICK_STONE_AXE = ITEMS.register("endrod_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_ENDROD_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> END_STICK_STONE_SHOVEL = ITEMS.register("endrod_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> END_STICK_STONE_HOE = ITEMS.register("endrod_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_ENDROD_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ENCHANTED_STICK_STONE_SWORD = ITEMS.register("enchanted_stick_stone_sword", () -> new CustomSwordItem(ToolMaterials.STONE_ENCHANTED_TM, 3, -4.0f + ToolMaterials.STONE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ENCHANTED_STICK_STONE_PICKAXE = ITEMS.register("enchanted_stick_stone_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.STONE_ENCHANTED_TM, 1, -4.0f + ToolMaterials.STONE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ENCHANTED_STICK_STONE_AXE = ITEMS.register("enchanted_stick_stone_axe", () -> new CustomAxeItem(ToolMaterials.STONE_ENCHANTED_TM, 6, -4.0f + ToolMaterials.STONE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ENCHANTED_STICK_STONE_SHOVEL = ITEMS.register("enchanted_stick_stone_shovel", () -> new CustomShovelItem(ToolMaterials.STONE_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.STONE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ENCHANTED_STICK_STONE_HOE = ITEMS.register("enchanted_stick_stone_hoe", () -> new CustomHoeItem(ToolMaterials.STONE_ENCHANTED_TM, 0, -4.0f + ToolMaterials.STONE_HOE_SPEED, new Item.Properties()));

           /** Iron **/
    public static final RegistryObject<CustomSwordItem> BONE_STICK_IRON_SWORD = ITEMS.register("bone_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_BONE_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BONE_STICK_IRON_PICKAXE = ITEMS.register("bone_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_BONE_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BONE_STICK_IRON_AXE = ITEMS.register("bone_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_BONE_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BONE_STICK_IRON_SHOVEL = ITEMS.register("bone_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_BONE_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BONE_STICK_IRON_HOE = ITEMS.register("bone_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_BONE_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> IRON_STICK_IRON_SWORD = ITEMS.register("iron_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_IRON_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> IRON_STICK_IRON_PICKAXE = ITEMS.register("iron_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_IRON_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> IRON_STICK_IRON_AXE = ITEMS.register("iron_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_IRON_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> IRON_STICK_IRON_SHOVEL = ITEMS.register("iron_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_IRON_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> IRON_STICK_IRON_HOE = ITEMS.register("iron_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_IRON_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> COPPER_STICK_IRON_SWORD = ITEMS.register("copper_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_COPPER_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> COPPER_STICK_IRON_PICKAXE = ITEMS.register("copper_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_COPPER_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> COPPER_STICK_IRON_AXE = ITEMS.register("copper_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_COPPER_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> COPPER_STICK_IRON_SHOVEL = ITEMS.register("copper_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_COPPER_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> COPPER_STICK_IRON_HOE = ITEMS.register("copper_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_COPPER_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> GOLD_STICK_IRON_SWORD = ITEMS.register("gold_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_GOLD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> GOLD_STICK_IRON_PICKAXE = ITEMS.register("gold_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_GOLD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> GOLD_STICK_IRON_AXE = ITEMS.register("gold_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_GOLD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> GOLD_STICK_IRON_SHOVEL = ITEMS.register("gold_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_GOLD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> GOLD_STICK_IRON_HOE = ITEMS.register("gold_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_GOLD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> DIAMOND_STICK_IRON_SWORD = ITEMS.register("diamond_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_DIAMOND_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> DIAMOND_STICK_IRON_PICKAXE = ITEMS.register("diamond_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_DIAMOND_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> DIAMOND_STICK_IRON_AXE = ITEMS.register("diamond_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_DIAMOND_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> DIAMOND_STICK_IRON_SHOVEL = ITEMS.register("diamond_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> DIAMOND_STICK_IRON_HOE = ITEMS.register("diamond_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_DIAMOND_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> EMERALD_STICK_IRON_SWORD = ITEMS.register("emerald_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_EMERALD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> EMERALD_STICK_IRON_PICKAXE = ITEMS.register("emerald_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_EMERALD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> EMERALD_STICK_IRON_AXE = ITEMS.register("emerald_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_EMERALD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> EMERALD_STICK_IRON_SHOVEL = ITEMS.register("emerald_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> EMERALD_STICK_IRON_HOE = ITEMS.register("emerald_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_EMERALD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> AMETHYST_STICK_IRON_SWORD = ITEMS.register("amethyst_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_AMETHYST_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> AMETHYST_STICK_IRON_PICKAXE = ITEMS.register("amethyst_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_AMETHYST_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> AMETHYST_STICK_IRON_AXE = ITEMS.register("amethyst_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_AMETHYST_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> AMETHYST_STICK_IRON_SHOVEL = ITEMS.register("amethyst_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> AMETHYST_STICK_IRON_HOE = ITEMS.register("amethyst_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_AMETHYST_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> NETHERITE_STICK_IRON_SWORD = ITEMS.register("netherite_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_NETHERITE_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> NETHERITE_STICK_IRON_PICKAXE = ITEMS.register("netherite_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_NETHERITE_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> NETHERITE_STICK_IRON_AXE = ITEMS.register("netherite_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_NETHERITE_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> NETHERITE_STICK_IRON_SHOVEL = ITEMS.register("netherite_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> NETHERITE_STICK_IRON_HOE = ITEMS.register("netherite_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_NETHERITE_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ADVANCED_STICK_IRON_SWORD = ITEMS.register("advanced_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_ADVANCED_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ADVANCED_STICK_IRON_PICKAXE = ITEMS.register("advanced_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_ADVANCED_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ADVANCED_STICK_IRON_AXE = ITEMS.register("advanced_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_ADVANCED_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ADVANCED_STICK_IRON_SHOVEL = ITEMS.register("advanced_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ADVANCED_STICK_IRON_HOE = ITEMS.register("advanced_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_ADVANCED_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> BLAZE_STICK_IRON_SWORD = ITEMS.register("blazerod_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_BLAZEROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BLAZE_STICK_IRON_PICKAXE = ITEMS.register("blazerod_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_BLAZEROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BLAZE_STICK_IRON_AXE = ITEMS.register("blazerod_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_BLAZEROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BLAZE_STICK_IRON_SHOVEL = ITEMS.register("blazerod_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BLAZE_STICK_IRON_HOE = ITEMS.register("blazerod_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_BLAZEROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> END_STICK_IRON_SWORD = ITEMS.register("endrod_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_ENDROD_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> END_STICK_IRON_PICKAXE = ITEMS.register("endrod_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_ENDROD_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> END_STICK_IRON_AXE = ITEMS.register("endrod_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_ENDROD_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> END_STICK_IRON_SHOVEL = ITEMS.register("endrod_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> END_STICK_IRON_HOE = ITEMS.register("endrod_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_ENDROD_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ENCHANTED_STICK_IRON_SWORD = ITEMS.register("enchanted_stick_iron_sword", () -> new CustomSwordItem(ToolMaterials.IRON_ENCHANTED_TM, 3, -4.0f + ToolMaterials.IRON_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ENCHANTED_STICK_IRON_PICKAXE = ITEMS.register("enchanted_stick_iron_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.IRON_ENCHANTED_TM, 1, -4.0f + ToolMaterials.IRON_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ENCHANTED_STICK_IRON_AXE = ITEMS.register("enchanted_stick_iron_axe", () -> new CustomAxeItem(ToolMaterials.IRON_ENCHANTED_TM, 6, -4.0f + ToolMaterials.IRON_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ENCHANTED_STICK_IRON_SHOVEL = ITEMS.register("enchanted_stick_iron_shovel", () -> new CustomShovelItem(ToolMaterials.IRON_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.IRON_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ENCHANTED_STICK_IRON_HOE = ITEMS.register("enchanted_stick_iron_hoe", () -> new CustomHoeItem(ToolMaterials.IRON_ENCHANTED_TM, 0, -4.0f + ToolMaterials.IRON_HOE_SPEED, new Item.Properties()));

            /** Gold **/
    public static final RegistryObject<CustomSwordItem> BONE_STICK_GOLD_SWORD = ITEMS.register("bone_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_BONE_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BONE_STICK_GOLD_PICKAXE = ITEMS.register("bone_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_BONE_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BONE_STICK_GOLD_AXE = ITEMS.register("bone_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_BONE_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BONE_STICK_GOLD_SHOVEL = ITEMS.register("bone_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_BONE_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BONE_STICK_GOLD_HOE = ITEMS.register("bone_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_BONE_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> IRON_STICK_GOLD_SWORD = ITEMS.register("iron_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_IRON_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> IRON_STICK_GOLD_PICKAXE = ITEMS.register("iron_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_IRON_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> IRON_STICK_GOLD_AXE = ITEMS.register("iron_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_IRON_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> IRON_STICK_GOLD_SHOVEL = ITEMS.register("iron_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_IRON_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> IRON_STICK_GOLD_HOE = ITEMS.register("iron_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_IRON_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> COPPER_STICK_GOLD_SWORD = ITEMS.register("copper_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_COPPER_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> COPPER_STICK_GOLD_PICKAXE = ITEMS.register("copper_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_COPPER_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> COPPER_STICK_GOLD_AXE = ITEMS.register("copper_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_COPPER_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> COPPER_STICK_GOLD_SHOVEL = ITEMS.register("copper_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_COPPER_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> COPPER_STICK_GOLD_HOE = ITEMS.register("copper_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_COPPER_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> GOLD_STICK_GOLD_SWORD = ITEMS.register("gold_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_GOLD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> GOLD_STICK_GOLD_PICKAXE = ITEMS.register("gold_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_GOLD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> GOLD_STICK_GOLD_AXE = ITEMS.register("gold_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_GOLD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> GOLD_STICK_GOLD_SHOVEL = ITEMS.register("gold_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_GOLD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> GOLD_STICK_GOLD_HOE = ITEMS.register("gold_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_GOLD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> DIAMOND_STICK_GOLD_SWORD = ITEMS.register("diamond_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_DIAMOND_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> DIAMOND_STICK_GOLD_PICKAXE = ITEMS.register("diamond_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_DIAMOND_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> DIAMOND_STICK_GOLD_AXE = ITEMS.register("diamond_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_DIAMOND_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> DIAMOND_STICK_GOLD_SHOVEL = ITEMS.register("diamond_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> DIAMOND_STICK_GOLD_HOE = ITEMS.register("diamond_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_DIAMOND_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> EMERALD_STICK_GOLD_SWORD = ITEMS.register("emerald_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_EMERALD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> EMERALD_STICK_GOLD_PICKAXE = ITEMS.register("emerald_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_EMERALD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> EMERALD_STICK_GOLD_AXE = ITEMS.register("emerald_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_EMERALD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> EMERALD_STICK_GOLD_SHOVEL = ITEMS.register("emerald_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> EMERALD_STICK_GOLD_HOE = ITEMS.register("emerald_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_EMERALD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> AMETHYST_STICK_GOLD_SWORD = ITEMS.register("amethyst_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_AMETHYST_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> AMETHYST_STICK_GOLD_PICKAXE = ITEMS.register("amethyst_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_AMETHYST_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> AMETHYST_STICK_GOLD_AXE = ITEMS.register("amethyst_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_AMETHYST_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> AMETHYST_STICK_GOLD_SHOVEL = ITEMS.register("amethyst_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> AMETHYST_STICK_GOLD_HOE = ITEMS.register("amethyst_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_AMETHYST_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> NETHERITE_STICK_GOLD_SWORD = ITEMS.register("netherite_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_NETHERITE_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> NETHERITE_STICK_GOLD_PICKAXE = ITEMS.register("netherite_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_NETHERITE_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> NETHERITE_STICK_GOLD_AXE = ITEMS.register("netherite_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_NETHERITE_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> NETHERITE_STICK_GOLD_SHOVEL = ITEMS.register("netherite_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> NETHERITE_STICK_GOLD_HOE = ITEMS.register("netherite_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_NETHERITE_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ADVANCED_STICK_GOLD_SWORD = ITEMS.register("advanced_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_ADVANCED_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ADVANCED_STICK_GOLD_PICKAXE = ITEMS.register("advanced_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_ADVANCED_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ADVANCED_STICK_GOLD_AXE = ITEMS.register("advanced_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_ADVANCED_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ADVANCED_STICK_GOLD_SHOVEL = ITEMS.register("advanced_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ADVANCED_STICK_GOLD_HOE = ITEMS.register("advanced_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_ADVANCED_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> BLAZE_STICK_GOLD_SWORD = ITEMS.register("blazerod_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_BLAZEROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BLAZE_STICK_GOLD_PICKAXE = ITEMS.register("blazerod_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BLAZE_STICK_GOLD_AXE = ITEMS.register("blazerod_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_BLAZEROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BLAZE_STICK_GOLD_SHOVEL = ITEMS.register("blazerod_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BLAZE_STICK_GOLD_HOE = ITEMS.register("blazerod_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_BLAZEROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> END_STICK_GOLD_SWORD = ITEMS.register("endrod_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_ENDROD_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> END_STICK_GOLD_PICKAXE = ITEMS.register("endrod_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_ENDROD_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> END_STICK_GOLD_AXE = ITEMS.register("endrod_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_ENDROD_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> END_STICK_GOLD_SHOVEL = ITEMS.register("endrod_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> END_STICK_GOLD_HOE = ITEMS.register("endrod_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_ENDROD_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ENCHANTED_STICK_GOLD_SWORD = ITEMS.register("enchanted_stick_gold_sword", () -> new CustomSwordItem(ToolMaterials.GOLD_ENCHANTED_TM, 3, -4.0f + ToolMaterials.GOLD_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ENCHANTED_STICK_GOLD_PICKAXE = ITEMS.register("enchanted_stick_gold_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 1, -4.0f + ToolMaterials.GOLD_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ENCHANTED_STICK_GOLD_AXE = ITEMS.register("enchanted_stick_gold_axe", () -> new CustomAxeItem(ToolMaterials.GOLD_ENCHANTED_TM, 6, -4.0f + ToolMaterials.GOLD_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ENCHANTED_STICK_GOLD_SHOVEL = ITEMS.register("enchanted_stick_gold_shovel", () -> new CustomShovelItem(ToolMaterials.GOLD_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.GOLD_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ENCHANTED_STICK_GOLD_HOE = ITEMS.register("enchanted_stick_gold_hoe", () -> new CustomHoeItem(ToolMaterials.GOLD_ENCHANTED_TM, 0, -4.0f + ToolMaterials.GOLD_HOE_SPEED, new Item.Properties()));

            /** Diamond **/
    public static final RegistryObject<CustomSwordItem> BONE_STICK_DIAMOND_SWORD = ITEMS.register("bone_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_BONE_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BONE_STICK_DIAMOND_PICKAXE = ITEMS.register("bone_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_BONE_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BONE_STICK_DIAMOND_AXE = ITEMS.register("bone_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_BONE_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BONE_STICK_DIAMOND_SHOVEL = ITEMS.register("bone_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_BONE_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BONE_STICK_DIAMOND_HOE = ITEMS.register("bone_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_BONE_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> IRON_STICK_DIAMOND_SWORD = ITEMS.register("iron_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_IRON_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> IRON_STICK_DIAMOND_PICKAXE = ITEMS.register("iron_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_IRON_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> IRON_STICK_DIAMOND_AXE = ITEMS.register("iron_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_IRON_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> IRON_STICK_DIAMOND_SHOVEL = ITEMS.register("iron_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_IRON_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> IRON_STICK_DIAMOND_HOE = ITEMS.register("iron_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_IRON_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> COPPER_STICK_DIAMOND_SWORD = ITEMS.register("copper_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_COPPER_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> COPPER_STICK_DIAMOND_PICKAXE = ITEMS.register("copper_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_COPPER_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> COPPER_STICK_DIAMOND_AXE = ITEMS.register("copper_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_COPPER_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> COPPER_STICK_DIAMOND_SHOVEL = ITEMS.register("copper_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_COPPER_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> COPPER_STICK_DIAMOND_HOE = ITEMS.register("copper_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_COPPER_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> GOLD_STICK_DIAMOND_SWORD = ITEMS.register("gold_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_GOLD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> GOLD_STICK_DIAMOND_PICKAXE = ITEMS.register("gold_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_GOLD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> GOLD_STICK_DIAMOND_AXE = ITEMS.register("gold_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_GOLD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> GOLD_STICK_DIAMOND_SHOVEL = ITEMS.register("gold_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_GOLD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> GOLD_STICK_DIAMOND_HOE = ITEMS.register("gold_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_GOLD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> DIAMOND_STICK_DIAMOND_SWORD = ITEMS.register("diamond_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_DIAMOND_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> DIAMOND_STICK_DIAMOND_PICKAXE = ITEMS.register("diamond_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> DIAMOND_STICK_DIAMOND_AXE = ITEMS.register("diamond_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> DIAMOND_STICK_DIAMOND_SHOVEL = ITEMS.register("diamond_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> DIAMOND_STICK_DIAMOND_HOE = ITEMS.register("diamond_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_DIAMOND_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> EMERALD_STICK_DIAMOND_SWORD = ITEMS.register("emerald_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_EMERALD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> EMERALD_STICK_DIAMOND_PICKAXE = ITEMS.register("emerald_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> EMERALD_STICK_DIAMOND_AXE = ITEMS.register("emerald_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_EMERALD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> EMERALD_STICK_DIAMOND_SHOVEL = ITEMS.register("emerald_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> EMERALD_STICK_DIAMOND_HOE = ITEMS.register("emerald_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_EMERALD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> AMETHYST_STICK_DIAMOND_SWORD = ITEMS.register("amethyst_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_AMETHYST_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> AMETHYST_STICK_DIAMOND_PICKAXE = ITEMS.register("amethyst_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> AMETHYST_STICK_DIAMOND_AXE = ITEMS.register("amethyst_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> AMETHYST_STICK_DIAMOND_SHOVEL = ITEMS.register("amethyst_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> AMETHYST_STICK_DIAMOND_HOE = ITEMS.register("amethyst_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_AMETHYST_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> NETHERITE_STICK_DIAMOND_SWORD = ITEMS.register("netherite_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_NETHERITE_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> NETHERITE_STICK_DIAMOND_PICKAXE = ITEMS.register("netherite_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> NETHERITE_STICK_DIAMOND_AXE = ITEMS.register("netherite_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> NETHERITE_STICK_DIAMOND_SHOVEL = ITEMS.register("netherite_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> NETHERITE_STICK_DIAMOND_HOE = ITEMS.register("netherite_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_NETHERITE_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ADVANCED_STICK_DIAMOND_SWORD = ITEMS.register("advanced_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_ADVANCED_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ADVANCED_STICK_DIAMOND_PICKAXE = ITEMS.register("advanced_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ADVANCED_STICK_DIAMOND_AXE = ITEMS.register("advanced_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ADVANCED_STICK_DIAMOND_SHOVEL = ITEMS.register("advanced_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ADVANCED_STICK_DIAMOND_HOE = ITEMS.register("advanced_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_ADVANCED_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> BLAZE_STICK_DIAMOND_SWORD = ITEMS.register("blazerod_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BLAZE_STICK_DIAMOND_PICKAXE = ITEMS.register("blazerod_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BLAZE_STICK_DIAMOND_AXE = ITEMS.register("blazerod_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BLAZE_STICK_DIAMOND_SHOVEL = ITEMS.register("blazerod_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BLAZE_STICK_DIAMOND_HOE = ITEMS.register("blazerod_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_BLAZEROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> END_STICK_DIAMOND_SWORD = ITEMS.register("endrod_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_ENDROD_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> END_STICK_DIAMOND_PICKAXE = ITEMS.register("endrod_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> END_STICK_DIAMOND_AXE = ITEMS.register("endrod_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_ENDROD_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> END_STICK_DIAMOND_SHOVEL = ITEMS.register("endrod_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> END_STICK_DIAMOND_HOE = ITEMS.register("endrod_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_ENDROD_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ENCHANTED_STICK_DIAMOND_SWORD = ITEMS.register("enchanted_stick_diamond_sword", () -> new CustomSwordItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 3, -4.0f + ToolMaterials.DIAMOND_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ENCHANTED_STICK_DIAMOND_PICKAXE = ITEMS.register("enchanted_stick_diamond_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1, -4.0f + ToolMaterials.DIAMOND_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ENCHANTED_STICK_DIAMOND_AXE = ITEMS.register("enchanted_stick_diamond_axe", () -> new CustomAxeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 6, -4.0f + ToolMaterials.DIAMOND_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ENCHANTED_STICK_DIAMOND_SHOVEL = ITEMS.register("enchanted_stick_diamond_shovel", () -> new CustomShovelItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.DIAMOND_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ENCHANTED_STICK_DIAMOND_HOE = ITEMS.register("enchanted_stick_diamond_hoe", () -> new CustomHoeItem(ToolMaterials.DIAMOND_ENCHANTED_TM, 0, -4.0f + ToolMaterials.DIAMOND_HOE_SPEED, new Item.Properties()));

            /** Netherite **/
    public static final RegistryObject<CustomSwordItem> BONE_STICK_NETHERITE_SWORD = ITEMS.register("bone_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_BONE_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BONE_STICK_NETHERITE_PICKAXE = ITEMS.register("bone_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_BONE_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BONE_STICK_NETHERITE_AXE = ITEMS.register("bone_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_BONE_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BONE_STICK_NETHERITE_SHOVEL = ITEMS.register("bone_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_BONE_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BONE_STICK_NETHERITE_HOE = ITEMS.register("bone_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_BONE_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> IRON_STICK_NETHERITE_SWORD = ITEMS.register("iron_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_IRON_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> IRON_STICK_NETHERITE_PICKAXE = ITEMS.register("iron_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_IRON_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> IRON_STICK_NETHERITE_AXE = ITEMS.register("iron_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_IRON_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> IRON_STICK_NETHERITE_SHOVEL = ITEMS.register("iron_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_IRON_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> IRON_STICK_NETHERITE_HOE = ITEMS.register("iron_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_IRON_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> COPPER_STICK_NETHERITE_SWORD = ITEMS.register("copper_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_COPPER_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> COPPER_STICK_NETHERITE_PICKAXE = ITEMS.register("copper_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_COPPER_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> COPPER_STICK_NETHERITE_AXE = ITEMS.register("copper_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_COPPER_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> COPPER_STICK_NETHERITE_SHOVEL = ITEMS.register("copper_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_COPPER_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> COPPER_STICK_NETHERITE_HOE = ITEMS.register("copper_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_COPPER_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> GOLD_STICK_NETHERITE_SWORD = ITEMS.register("gold_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_GOLD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> GOLD_STICK_NETHERITE_PICKAXE = ITEMS.register("gold_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_GOLD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> GOLD_STICK_NETHERITE_AXE = ITEMS.register("gold_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_GOLD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> GOLD_STICK_NETHERITE_SHOVEL = ITEMS.register("gold_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_GOLD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> GOLD_STICK_NETHERITE_HOE = ITEMS.register("gold_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_GOLD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> DIAMOND_STICK_NETHERITE_SWORD = ITEMS.register("diamond_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_DIAMOND_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> DIAMOND_STICK_NETHERITE_PICKAXE = ITEMS.register("diamond_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> DIAMOND_STICK_NETHERITE_AXE = ITEMS.register("diamond_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> DIAMOND_STICK_NETHERITE_SHOVEL = ITEMS.register("diamond_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_DIAMOND_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> DIAMOND_STICK_NETHERITE_HOE = ITEMS.register("diamond_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_DIAMOND_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> EMERALD_STICK_NETHERITE_SWORD = ITEMS.register("emerald_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_EMERALD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> EMERALD_STICK_NETHERITE_PICKAXE = ITEMS.register("emerald_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> EMERALD_STICK_NETHERITE_AXE = ITEMS.register("emerald_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_EMERALD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> EMERALD_STICK_NETHERITE_SHOVEL = ITEMS.register("emerald_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_EMERALD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> EMERALD_STICK_NETHERITE_HOE = ITEMS.register("emerald_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_EMERALD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> AMETHYST_STICK_NETHERITE_SWORD = ITEMS.register("amethyst_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_AMETHYST_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> AMETHYST_STICK_NETHERITE_PICKAXE = ITEMS.register("amethyst_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> AMETHYST_STICK_NETHERITE_AXE = ITEMS.register("amethyst_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> AMETHYST_STICK_NETHERITE_SHOVEL = ITEMS.register("amethyst_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_AMETHYST_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> AMETHYST_STICK_NETHERITE_HOE = ITEMS.register("amethyst_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_AMETHYST_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> NETHERITE_STICK_NETHERITE_SWORD = ITEMS.register("netherite_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_NETHERITE_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> NETHERITE_STICK_NETHERITE_PICKAXE = ITEMS.register("netherite_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> NETHERITE_STICK_NETHERITE_AXE = ITEMS.register("netherite_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> NETHERITE_STICK_NETHERITE_SHOVEL = ITEMS.register("netherite_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_NETHERITE_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> NETHERITE_STICK_NETHERITE_HOE = ITEMS.register("netherite_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_NETHERITE_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ADVANCED_STICK_NETHERITE_SWORD = ITEMS.register("advanced_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_ADVANCED_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ADVANCED_STICK_NETHERITE_PICKAXE = ITEMS.register("advanced_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ADVANCED_STICK_NETHERITE_AXE = ITEMS.register("advanced_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ADVANCED_STICK_NETHERITE_SHOVEL = ITEMS.register("advanced_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_ADVANCED_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ADVANCED_STICK_NETHERITE_HOE = ITEMS.register("advanced_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_ADVANCED_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> BLAZE_STICK_NETHERITE_SWORD = ITEMS.register("blazerod_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> BLAZE_STICK_NETHERITE_PICKAXE = ITEMS.register("blazerod_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> BLAZE_STICK_NETHERITE_AXE = ITEMS.register("blazerod_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> BLAZE_STICK_NETHERITE_SHOVEL = ITEMS.register("blazerod_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> BLAZE_STICK_NETHERITE_HOE = ITEMS.register("blazerod_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_BLAZEROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> END_STICK_NETHERITE_SWORD = ITEMS.register("endrod_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_ENDROD_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> END_STICK_NETHERITE_PICKAXE = ITEMS.register("endrod_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> END_STICK_NETHERITE_AXE = ITEMS.register("endrod_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_ENDROD_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> END_STICK_NETHERITE_SHOVEL = ITEMS.register("endrod_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_ENDROD_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> END_STICK_NETHERITE_HOE = ITEMS.register("endrod_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_ENDROD_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<CustomSwordItem> ENCHANTED_STICK_NETHERITE_SWORD = ITEMS.register("enchanted_stick_netherite_sword", () -> new CustomSwordItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 3, -4.0f + ToolMaterials.NETHERITE_SWORD_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomPickaxeItem> ENCHANTED_STICK_NETHERITE_PICKAXE = ITEMS.register("enchanted_stick_netherite_pickaxe", () -> new CustomPickaxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1, -4.0f + ToolMaterials.NETHERITE_PICKAXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomAxeItem> ENCHANTED_STICK_NETHERITE_AXE = ITEMS.register("enchanted_stick_netherite_axe", () -> new CustomAxeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 6, -4.0f + ToolMaterials.NETHERITE_AXE_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomShovelItem> ENCHANTED_STICK_NETHERITE_SHOVEL = ITEMS.register("enchanted_stick_netherite_shovel", () -> new CustomShovelItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 1.5f, -4.0f + ToolMaterials.NETHERITE_SHOVEL_SPEED, new Item.Properties()));
    public static final RegistryObject<CustomHoeItem> ENCHANTED_STICK_NETHERITE_HOE = ITEMS.register("enchanted_stick_netherite_hoe", () -> new CustomHoeItem(ToolMaterials.NETHERITE_ENCHANTED_TM, 0, -4.0f + ToolMaterials.NETHERITE_HOE_SPEED, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow", () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> GOLD_BOW = ITEMS.register("gold_bow", () -> new BowItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow", () -> new BowItem(new Item.Properties().durability(1560)));
    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", () -> new BowItem(new Item.Properties().durability(2030)));
}