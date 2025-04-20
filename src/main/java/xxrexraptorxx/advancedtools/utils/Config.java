package xxrexraptorxx.advancedtools.utils;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;
import xxrexraptorxx.advancedtools.registry.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_MATERIALS = "materials";

    public static ModConfigSpec SERVER_CONFIG;
    public static ModConfigSpec CLIENT_CONFIG;

    public static ModConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ModConfigSpec.BooleanValue SHOW_STICK_TYPE;
    public static ModConfigSpec.BooleanValue SHOW_MATERIAL_STATS;
    public static ModConfigSpec.BooleanValue PATREON_REWARDS;
    public static ModConfigSpec.BooleanValue FORCE_ALL_MATERIALS;
    public static ModConfigSpec.ConfigValue<List<String>> STICK_MATERIALS;
    public static ModConfigSpec.ConfigValue<List<String>> DISABLED_MATERIAL_EFFECTS;
    public static ModConfigSpec.BooleanValue JEI_DESCRIPTION;
    public static ModConfigSpec.BooleanValue DEBUG_MODE;


    public static void init(ModContainer container) {
        initServer();
        initClient();

        container.registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        container.registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }


    public static void initClient() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        SHOW_STICK_TYPE = builder.comment("Shows you the stick type under the tool").define("show_stick_type", true);
        SHOW_MATERIAL_STATS = builder.comment("Shows you the stats of the item as tooltips when you press 'shift' over the tool").define("show_material_stats", true);
        JEI_DESCRIPTION = builder.comment("Enables the description for the stats of the tools in JEI or REI").define("jei_description", true);
        builder.pop();

        CLIENT_CONFIG = builder.build();
    }


    public static void initServer() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons").define("patreon_rewards", true);
        DEBUG_MODE = builder.comment("Only useful for developers").define("debug_mode", false);
        builder.pop();

        builder.comment("Materials").push(CATEGORY_MATERIALS);
        STICK_MATERIALS = builder.comment("Here you can specify which stick materials should be enabled. (The sticks and tools only appear if the basic material is also available in the game)").define("stick_materials",
                new ArrayList<>(Arrays.asList(ModItems.HANDLE_MATERIALS)));
        FORCE_ALL_MATERIALS = builder.comment("Normally the item variants of a material are only displayed if the basic material is also available in the game (e.g. through other mods), but here you can also activate all of them manually").define("force_all_materials", false);
        DISABLED_MATERIAL_EFFECTS = builder.comment("Here you can specify which materials should their effects be disabled.").define("disabled_material_effects",
                new ArrayList<>());
        builder.pop();

        SERVER_CONFIG = builder.build();
    }

}