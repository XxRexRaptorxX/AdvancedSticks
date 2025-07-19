package xxrexraptorxx.advancedtools.utils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.magmacore.config.ConfigHelper;
import xxrexraptorxx.magmacore.config.ConfigListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Config {

    private static final ModConfigSpec.Builder SERVER_BUILDER = new ModConfigSpec.Builder();
    private static final ModConfigSpec.Builder CLIENT_BUILDER = new ModConfigSpec.Builder();

    public static ModConfigSpec SERVER_CONFIG;
    public static ModConfigSpec CLIENT_CONFIG;

    private static ModConfigSpec.BooleanValue SHOW_STICK_TYPE;
    private static ModConfigSpec.BooleanValue SHOW_MATERIAL_STATS;
    private static ModConfigSpec.BooleanValue JEI_DESCRIPTION;
    private static ModConfigSpec.BooleanValue HIDE_UPGRADE_SLOTS;

    private static ModConfigSpec.BooleanValue FORCE_ALL_MATERIALS;
    private static ModConfigSpec.BooleanValue DEBUG_MODE;
    private static ModConfigSpec.ConfigValue<List<? extends String>> HANDLE_MATERIALS;
    private static ModConfigSpec.ConfigValue<List<? extends String>> TOOL_HEAD_MATERIALS;
    private static ModConfigSpec.ConfigValue<List<? extends String>> DISABLED_MATERIAL_EFFECTS;

    //CLIENT
    static {
        ConfigHelper.setCategory(CLIENT_BUILDER, "general");
        SHOW_STICK_TYPE = CLIENT_BUILDER.comment("Shows you the stick type under the tool").define("show_stick_type", true);
        SHOW_MATERIAL_STATS = CLIENT_BUILDER.comment("Shows you the stats of the item as tooltips when you press 'SHIFT' over the tool").define("show_material_stats", true);
        JEI_DESCRIPTION = CLIENT_BUILDER.comment("Enables the description for the stats of the tools in your recipe viewer mod").define("jei_description", true);
        HIDE_UPGRADE_SLOTS = CLIENT_BUILDER.comment("If you activate this, the upgrade slots are only displayed in the tooltip when you press 'SHIFT'").define("hide_upgrade_slots", false);
        CLIENT_BUILDER.pop();

        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }


    //SERVER
    static {
        ConfigHelper.setCategory(SERVER_BUILDER, "general");
        DEBUG_MODE = SERVER_BUILDER.comment("Only useful for developers").define("debug_mode", false);
        SERVER_BUILDER.pop();

        ConfigHelper.setCategory(SERVER_BUILDER, "materials");
        FORCE_ALL_MATERIALS = SERVER_BUILDER.comment("Manually enable all material variants even if the base material is missing").define("force_all_materials", false);
        HANDLE_MATERIALS = SERVER_BUILDER.comment("Enabled handle materials").defineListAllowEmpty("handle_materials",
                Arrays.asList(ModItems.HANDLE_MATERIALS), () -> "material name",
                obj -> obj instanceof  String string && isValidEntry(string)
        );
        TOOL_HEAD_MATERIALS = SERVER_BUILDER.comment("Enabled tool head materials").defineListAllowEmpty("tool_head_materials",
                Arrays.asList(ModItems.TOOL_HEAD_MATERIALS), () -> "material name",
                obj -> obj instanceof  String string && isValidEntry(string)
        );
        DISABLED_MATERIAL_EFFECTS = SERVER_BUILDER.comment("List of materials where the effect should be disabled").defineListAllowEmpty("disabled_material_effects",
                List.of(), () -> "id:effect",
                obj -> obj instanceof  String string && isValidEffect(string)
        );;
        SERVER_BUILDER.pop();

        SERVER_CONFIG = SERVER_BUILDER.build();
    }


    public static boolean getShowStickType() { return SHOW_STICK_TYPE.get(); }
    public static boolean getShowMaterialStats() { return SHOW_MATERIAL_STATS.get(); }
    public static boolean getJEIDescription() { return JEI_DESCRIPTION.get(); }
    public static boolean getHideUpgradeSlots() { return HIDE_UPGRADE_SLOTS.get(); }
    public static boolean getForceAllMaterials() { return FORCE_ALL_MATERIALS.get(); }
    public static boolean getDebugMode() { return DEBUG_MODE.get(); }
    public static List<String> getHandleMaterials() { return (List<String>) HANDLE_MATERIALS.get(); }
    public static List<String> getToolHeadMaterials() { return (List<String>) TOOL_HEAD_MATERIALS.get(); }
    public static List<String> getDisabledMaterialEffects() { return (List<String>) DISABLED_MATERIAL_EFFECTS.get(); }


    public static boolean isValidEntry(String name) {
        return name != null && !name.contains(" ") && !name.contains("_") && !name.contains("-");
    }


    public static boolean isValidEffect(String effectString) {
        if (effectString == null || effectString.trim().isEmpty() || !effectString.contains(":")) {
            return false;
        }

        try {
            ResourceLocation location = ResourceLocation.parse(effectString.trim());
            return BuiltInRegistries.MOB_EFFECT.containsKey(location);

        } catch (Exception e) {
            return false;
        }
    }
}
