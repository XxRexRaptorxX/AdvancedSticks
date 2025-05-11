package xxrexraptorxx.advancedtools.utils;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.config.ModConfigEvent;
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
    public static ModConfigSpec.BooleanValue HIDE_UPGADE_SLOTS;
    public static ModConfigSpec.ConfigValue<List<String>> HANDLE_MATERIALS;
    public static ModConfigSpec.ConfigValue<List<String>> TOOL_HEAD_MATERIALS;
    public static ModConfigSpec.ConfigValue<List<String>> DISABLED_MATERIAL_EFFECTS;
    public static ModConfigSpec.BooleanValue JEI_DESCRIPTION;
    public static ModConfigSpec.BooleanValue DEBUG_MODE;

    private static boolean update_checker = true;
    private static boolean show_stick_type = true;
    private static boolean show_material_stats = true;
    private static boolean patreon_rewards = true;
    private static boolean force_all_materials = false;
    private static boolean hide_upgade_slots = false;
    private static List<String> handle_materials =  new ArrayList <>(Arrays.asList(ModItems.HANDLE_MATERIALS));
    private static List<String> tool_head_materials =  new ArrayList <>(Arrays.asList(ModItems.TOOL_HEAD_MATERIALS));
    private static List<String> disabled_material_effects =  new ArrayList <>();
    private static boolean debug_mode = false;
    private static boolean jei_description = true;

    public static boolean update_checker() { return update_checker; }
    public static boolean show_stick_type() { return show_stick_type; }
    public static boolean show_material_stats() { return show_material_stats; }
    public static boolean patreon_rewards() { return patreon_rewards; }
    public static boolean force_all_materials() { return force_all_materials; }
    public static boolean hide_upgade_slots() { return hide_upgade_slots; }
    public static List<String> handle_materials() { return handle_materials; }
    public static List<String> tool_head_materials() { return tool_head_materials; }
    public static List<String> disabled_material_effects() { return disabled_material_effects; }
    public static boolean jei_description() { return jei_description; }
    public static boolean debug_mode() { return debug_mode; }


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
        SHOW_MATERIAL_STATS = builder.comment("Shows you the stats of the item as tooltips when you press 'SHIFT' over the tool").define("show_material_stats", true);
        JEI_DESCRIPTION = builder.comment("Enables the description for the stats of the tools in JEI or REI").define("jei_description", true);
        builder.pop();

        builder.comment("Materials").push(CATEGORY_MATERIALS);
        HIDE_UPGADE_SLOTS = builder.comment("If you activate this, the upgrade slots are only displayed in the tooltip when you press 'SHIFT'").define("hide_upgrade_slots", false);
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
        HANDLE_MATERIALS = builder.comment("Here you can specify which handle materials should be enabled. (The rods and tools only appear if the basic material is also available in the game)").define("handle_materials",
                new ArrayList<>(Arrays.asList(ModItems.HANDLE_MATERIALS)));
        TOOL_HEAD_MATERIALS = builder.comment("Here you can specify which tool head materials should be enabled. (The tools only appear if the basic material is also available in the game)").define("tool_head_materials",
                new ArrayList<>(Arrays.asList(ModItems.TOOL_HEAD_MATERIALS)));
        FORCE_ALL_MATERIALS = builder.comment("Normally the item variants of a material are only displayed if the basic material is also available in the game (e.g. through other mods), but here you can also activate all of them manually").define("force_all_materials", false);
        DISABLED_MATERIAL_EFFECTS = builder.comment("Here you can specify which materials should their effects be disabled.").define("disabled_material_effects",
                new ArrayList<>());
        builder.pop();

        SERVER_CONFIG = builder.build();
    }


    @SubscribeEvent
    public static void onConfigLoading(final ModConfigEvent.Loading event) {
        if (event.getConfig().getSpec() == CLIENT_CONFIG) {
            update_checker = UPDATE_CHECKER.get();
            show_stick_type = SHOW_STICK_TYPE.get();
            show_material_stats = SHOW_MATERIAL_STATS.get();
            hide_upgade_slots = HIDE_UPGADE_SLOTS.get();
            jei_description = JEI_DESCRIPTION.get();

        } else if (event.getConfig().getSpec() == SERVER_CONFIG) {

            patreon_rewards = PATREON_REWARDS.get();
            force_all_materials = FORCE_ALL_MATERIALS.get();
            handle_materials = HANDLE_MATERIALS.get();
            tool_head_materials = TOOL_HEAD_MATERIALS.get();
            disabled_material_effects = DISABLED_MATERIAL_EFFECTS.get();
            debug_mode = DEBUG_MODE.get();
        }
    }
}