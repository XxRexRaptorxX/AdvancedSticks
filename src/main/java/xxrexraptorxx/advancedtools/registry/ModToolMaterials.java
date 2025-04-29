package xxrexraptorxx.advancedtools.registry;

import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.enums.Materials;

import java.util.HashMap;
import java.util.Map;

public class ModToolMaterials {

    /**            lvl|uses|speed|damage|enchant
     *    WOOD       0, 59,   2.0,  0.0,  15
     *    STONE      1, 131,  4.0,  1.0,  5
     *    IRON       2, 250,  6.0,  2.0,  14
     *    DIAMOND    3, 1561, 8.0,  3.0,  10
     *    GOLD       0, 32,   12.0, 0.0,  22
     *    NETHERITE  4, 2031, 9.0,  4.0,  15
     */
    private static final int   WOOD_BASE_USES = 59;
    private static final float WOOD_BASE_SPEED = 2.0f;
    private static final float WOOD_BASE_DMG = 0.0f;
    private static final int   WOOD_BASE_ENCH = 15;

    private static final int   STONE_BASE_USES = 131 - WOOD_BASE_USES;
    private static final float STONE_BASE_SPEED = 4.0f - WOOD_BASE_SPEED;
    private static final float STONE_BASE_DMG = 1.0f;
    private static final int   STONE_BASE_ENCH = 5;

    private static final int   IRON_BASE_USES = 250 - WOOD_BASE_USES;
    private static final float IRON_BASE_SPEED = 6.0f - WOOD_BASE_SPEED;
    private static final float IRON_BASE_DMG = 2.0f;
    private static final int   IRON_BASE_ENCH = 14;

    private static final int   GOLD_BASE_USES = 32;
    private static final float GOLD_BASE_SPEED = 12.0f - WOOD_BASE_SPEED;
    private static final float GOLD_BASE_DMG = 0.0f;
    private static final int   GOLD_BASE_ENCH = 22;

    private static final int   DIAMOND_BASE_USES = 1561 - WOOD_BASE_USES;
    private static final float DIAMOND_BASE_SPEED = 8.0f - WOOD_BASE_SPEED;
    private static final float DIAMOND_BASE_DMG = 3.0f;
    private static final int   DIAMOND_BASE_ENCH = 10;

    private static final int   NETHERITE_BASE_USES = 2031 - WOOD_BASE_USES;
    private static final float NETHERITE_BASE_SPEED = 9.0f - WOOD_BASE_SPEED;
    private static final float NETHERITE_BASE_DMG = 4.0f;
    private static final int   NETHERITE_BASE_ENCH = 15;


    /** SPEED **/
    public static final float WOOD_SWORD_SPEED = 1.6f;
    public static final float WOOD_PICKAXE_SPEED = 1.2f;
    public static final float WOOD_AXE_SPEED = 0.8f;
    public static final float WOOD_SHOVEL_SPEED = 1;
    public static final float WOOD_HOE_SPEED = 1;

    public static final float STONE_SWORD_SPEED = 1.6f;
    public static final float STONE_PICKAXE_SPEED = 1.2f;
    public static final float STONE_AXE_SPEED = 0.8f;
    public static final float STONE_SHOVEL_SPEED = 1;
    public static final float STONE_HOE_SPEED = 2;

    public static final float IRON_SWORD_SPEED = 1.6f;
    public static final float IRON_PICKAXE_SPEED = 1.2f;
    public static final float IRON_AXE_SPEED = 0.9f;
    public static final float IRON_SHOVEL_SPEED = 1;
    public static final float IRON_HOE_SPEED = 3;

    public static final float GOLD_SWORD_SPEED = 1.6f;
    public static final float GOLD_PICKAXE_SPEED = 1.2f;
    public static final float GOLD_AXE_SPEED = 1;
    public static final float GOLD_SHOVEL_SPEED = 1;
    public static final float GOLD_HOE_SPEED = 1;

    public static final float DIAMOND_SWORD_SPEED = 1.6f;
    public static final float DIAMOND_PICKAXE_SPEED = 1.2f;
    public static final float DIAMOND_AXE_SPEED = 1;
    public static final float DIAMOND_SHOVEL_SPEED = 1;
    public static final float DIAMOND_HOE_SPEED = 4;

    public static final float NETHERITE_SWORD_SPEED = 1.6f;
    public static final float NETHERITE_PICKAXE_SPEED = 1.2f;
    public static final float NETHERITE_AXE_SPEED = 1;
    public static final float NETHERITE_SHOVEL_SPEED = 1;
    public static final float NETHERITE_HOE_SPEED = 4;


    public static final Map<String, ToolMaterial> TOOL_MATERIALS = new HashMap<>();
    public static final Map<String, Float> SPEED_MAP = new HashMap<>();


    public static void registerToolMaterials() {
        // Vanilla
        TOOL_MATERIALS.put("wood_wood", ToolMaterial.WOOD);
        TOOL_MATERIALS.put("stone_wood", ToolMaterial.STONE);
        TOOL_MATERIALS.put("iron_wood", ToolMaterial.IRON);
        TOOL_MATERIALS.put("gold_wood", ToolMaterial.GOLD);
        TOOL_MATERIALS.put("diamond_wood", ToolMaterial.DIAMOND);
        TOOL_MATERIALS.put("netherite_wood", ToolMaterial.NETHERITE);

        // Modded
        for (String handle : ModItems.HANDLE_MATERIALS) {
            for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                Materials handleMaterial = Materials.fromName(handle).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + handle));
                Materials baseMaterial = Materials.fromName(base).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + base));

                addMaterial(
                        baseMaterial.getRegistryName(), handleMaterial.getRegistryName(),
                        baseMaterial.getUses(), handleMaterial.getUses(),
                        baseMaterial.getSpeed(), handleMaterial.getSpeed(),
                        baseMaterial.getDamage(), handleMaterial.getDamage(),
                        baseMaterial.getEnchantability(), handleMaterial.getEnchantability()
                );
            }
        }
    }


    /**
     *  Generate the ToolMaterials for each material
     */
    private static void addMaterial(String baseName, String handleName, int baseUses, int handleUses, float baseSpeed, float handleSpeed, float baseDamage, float handleDamage, int baseEnchantability, int handleEnchantability) {
        String materialName = baseName + "_" + handleName;
        ToolMaterial material = new ToolMaterial(ModTags.createBlockTag("c", "incorrect_for_" + ToolUtils.transformMaterialNames(baseName) + "_tool"),
                baseUses * 3 + handleUses * 2,
                baseSpeed * 3 + handleSpeed * 2,
                baseDamage * 3 + handleDamage * 2,
                baseEnchantability * 3 + handleEnchantability * 2,
                ModTags.createItemTag("c", ToolUtils.transformMaterialNames(baseName) + "_tool_materials"));
        TOOL_MATERIALS.put(materialName, material);
    }


    public static ToolMaterial getMaterial(String name) {
        return TOOL_MATERIALS.get(name);
    }


    public static ToolMaterial getMaterial(String handleMaterial, String baseMaterial) {
        String toolMaterial = baseMaterial + "_" + handleMaterial;

        return TOOL_MATERIALS.get(toolMaterial);
    }


    static {
        SPEED_MAP.put("wood_sword", ModToolMaterials.WOOD_SWORD_SPEED);
        SPEED_MAP.put("wood_pickaxe", ModToolMaterials.WOOD_PICKAXE_SPEED);
        SPEED_MAP.put("wood_axe", ModToolMaterials.WOOD_AXE_SPEED);
        SPEED_MAP.put("wood_shovel", ModToolMaterials.WOOD_SHOVEL_SPEED);
        SPEED_MAP.put("wood_hoe", ModToolMaterials.WOOD_HOE_SPEED);

        SPEED_MAP.put("stone_sword", ModToolMaterials.STONE_SWORD_SPEED);
        SPEED_MAP.put("stone_pickaxe", ModToolMaterials.STONE_PICKAXE_SPEED);
        SPEED_MAP.put("stone_axe", ModToolMaterials.STONE_AXE_SPEED);
        SPEED_MAP.put("stone_shovel", ModToolMaterials.STONE_SHOVEL_SPEED);
        SPEED_MAP.put("stone_hoe", ModToolMaterials.STONE_HOE_SPEED);

        SPEED_MAP.put("iron_sword", ModToolMaterials.IRON_SWORD_SPEED);
        SPEED_MAP.put("iron_pickaxe", ModToolMaterials.IRON_PICKAXE_SPEED);
        SPEED_MAP.put("iron_axe", ModToolMaterials.IRON_AXE_SPEED);
        SPEED_MAP.put("iron_shovel", ModToolMaterials.IRON_SHOVEL_SPEED);
        SPEED_MAP.put("iron_hoe", ModToolMaterials.IRON_HOE_SPEED);

        SPEED_MAP.put("gold_sword", ModToolMaterials.GOLD_SWORD_SPEED);
        SPEED_MAP.put("gold_pickaxe", ModToolMaterials.GOLD_PICKAXE_SPEED);
        SPEED_MAP.put("gold_axe", ModToolMaterials.GOLD_AXE_SPEED);
        SPEED_MAP.put("gold_shovel", ModToolMaterials.GOLD_SHOVEL_SPEED);
        SPEED_MAP.put("gold_hoe", ModToolMaterials.GOLD_HOE_SPEED);

        SPEED_MAP.put("diamond_sword", ModToolMaterials.DIAMOND_SWORD_SPEED);
        SPEED_MAP.put("diamond_pickaxe", ModToolMaterials.DIAMOND_PICKAXE_SPEED);
        SPEED_MAP.put("diamond_axe", ModToolMaterials.DIAMOND_AXE_SPEED);
        SPEED_MAP.put("diamond_shovel", ModToolMaterials.DIAMOND_SHOVEL_SPEED);
        SPEED_MAP.put("diamond_hoe", ModToolMaterials.DIAMOND_HOE_SPEED);

        SPEED_MAP.put("netherite_sword", ModToolMaterials.NETHERITE_SWORD_SPEED);
        SPEED_MAP.put("netherite_pickaxe", ModToolMaterials.NETHERITE_PICKAXE_SPEED);
        SPEED_MAP.put("netherite_axe", ModToolMaterials.NETHERITE_AXE_SPEED);
        SPEED_MAP.put("netherite_shovel", ModToolMaterials.NETHERITE_SHOVEL_SPEED);
        SPEED_MAP.put("netherite_hoe", ModToolMaterials.NETHERITE_HOE_SPEED);
    }


    public static float getSpeed(String baseMaterial, String toolType) {
        String key = baseMaterial.toLowerCase() + "_" + toolType.toLowerCase();
        Float speed = SPEED_MAP.get(key);

        if (speed == null) {
            AdvancedTools.LOGGER.error("No speed value set for " + key);
        }
        return 1.0f;
    }
}

