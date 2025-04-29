package xxrexraptorxx.advancedtools.registry;

import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.enums.Materials;

import java.util.HashMap;
import java.util.Map;

public class ModToolMaterials {

    public static final Map<String, ToolMaterial> TOOL_MATERIALS = new HashMap<>();
    public static final Map<String, Float> SPEED_MAP = new HashMap<>();
    public static final float SWORD_ATK_SPEED_RESET   = -4.0f +  0.6f;
    public static final float PICKAXE_ATK_SPEED_RESET = -4.0f +  0.2f;
    public static final float AXE_ATK_SPEED_RESET     = -4.0f + -0.2f;
    public static final float SHOVEL_ATK_SPEED_RESET  = -4.0f +  0.0f;
    public static final float HOE_ATK_SPEED_RESET     = -4.0f +  0.0f;

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


    /**
     *  Register tool attack speed
     */
    static {
        // UNUSED FOR NOW
        //for (String handle : ModItems.HANDLE_MATERIALS) {
        //    for (String base : ModItems.TOOL_HEAD_MATERIALS) {
        //        for (String tool : ModItems.TOOL_TYPES) {
        //            Materials handleMaterial = Materials.fromName(handle).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + handle));
        //            Materials baseMaterial = Materials.fromName(base).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + base));
        //
        //            SPEED_MAP.put(handle + FormattingUtils.AT_INFIX +  base + "_" + tool, baseMaterial.getAttackSpeed() * 3 + handleMaterial.getAttackSpeed() * 2);
        //        }
        //    }
        //}

        SPEED_MAP.put("wood_sword", WOOD_SWORD_SPEED);
        SPEED_MAP.put("wood_pickaxe", WOOD_PICKAXE_SPEED);
        SPEED_MAP.put("wood_axe", WOOD_AXE_SPEED);
        SPEED_MAP.put("wood_shovel", WOOD_SHOVEL_SPEED);
        SPEED_MAP.put("wood_hoe", WOOD_HOE_SPEED);

        SPEED_MAP.put("stone_sword", STONE_SWORD_SPEED);
        SPEED_MAP.put("stone_pickaxe", STONE_PICKAXE_SPEED);
        SPEED_MAP.put("stone_axe", STONE_AXE_SPEED);
        SPEED_MAP.put("stone_shovel", STONE_SHOVEL_SPEED);
        SPEED_MAP.put("stone_hoe", STONE_HOE_SPEED);

        SPEED_MAP.put("iron_sword", IRON_SWORD_SPEED);
        SPEED_MAP.put("iron_pickaxe", IRON_PICKAXE_SPEED);
        SPEED_MAP.put("iron_axe", IRON_AXE_SPEED);
        SPEED_MAP.put("iron_shovel", IRON_SHOVEL_SPEED);
        SPEED_MAP.put("iron_hoe", IRON_HOE_SPEED);

        SPEED_MAP.put("gold_sword", GOLD_SWORD_SPEED);
        SPEED_MAP.put("gold_pickaxe", GOLD_PICKAXE_SPEED);
        SPEED_MAP.put("gold_axe", GOLD_AXE_SPEED);
        SPEED_MAP.put("gold_shovel", GOLD_SHOVEL_SPEED);
        SPEED_MAP.put("gold_hoe", GOLD_HOE_SPEED);

        SPEED_MAP.put("diamond_sword", DIAMOND_SWORD_SPEED);
        SPEED_MAP.put("diamond_pickaxe", DIAMOND_PICKAXE_SPEED);
        SPEED_MAP.put("diamond_axe", DIAMOND_AXE_SPEED);
        SPEED_MAP.put("diamond_shovel", DIAMOND_SHOVEL_SPEED);
        SPEED_MAP.put("diamond_hoe", DIAMOND_HOE_SPEED);

        SPEED_MAP.put("netherite_sword", NETHERITE_SWORD_SPEED);
        SPEED_MAP.put("netherite_pickaxe", NETHERITE_PICKAXE_SPEED);
        SPEED_MAP.put("netherite_axe", NETHERITE_AXE_SPEED);
        SPEED_MAP.put("netherite_shovel", NETHERITE_SHOVEL_SPEED);
        SPEED_MAP.put("netherite_hoe", NETHERITE_HOE_SPEED);
    }


    //UNUSED FOR NOW!
    @Deprecated
    public static float getSpeed(String handleMaterial, String baseMaterial, String toolType) {
        String key = handleMaterial.toLowerCase() + FormattingUtils.AT_INFIX + baseMaterial.toLowerCase() + "_" + toolType.toLowerCase();
        Float speed = SPEED_MAP.get(key);

        if (speed == null) {
            AdvancedTools.LOGGER.error("No speed value set for " + key);
        }

        return SPEED_MAP.getOrDefault(key, 2.0f);
    }


    public static float getSpeed(String baseMaterial, String toolType) {
        String key = baseMaterial.toLowerCase() + "_" + toolType.toLowerCase();
        Float speed = SPEED_MAP.get(key);

        if (speed == null) {
            String lowerKey = key.toLowerCase();
            if (lowerKey.contains("sword")) {
                return IRON_SWORD_SPEED;
            } else if (lowerKey.contains("pickaxe")) {
                return IRON_PICKAXE_SPEED;
            } else if (lowerKey.contains("hoe")) {
                return IRON_HOE_SPEED;
            } else if (lowerKey.contains("axe")) {
                return IRON_AXE_SPEED;
            } else if (lowerKey.contains("shovel")) {
                return IRON_SHOVEL_SPEED;
            } else {
                AdvancedTools.LOGGER.error("No speed value set for " + key);
                return 2.0f;
            }
        }

        return speed;
    }
}

