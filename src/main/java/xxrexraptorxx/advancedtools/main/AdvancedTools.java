package xxrexraptorxx.advancedtools.main;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import xxrexraptorxx.advancedtools.registry.CreativeModeTabs;
import xxrexraptorxx.advancedtools.registry.ModComponents;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModToolMaterials;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.magmacore.config.ConfigHelper;
import xxrexraptorxx.magmacore.main.ModRegistry;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/advanced-sticks">...</a>
 **/
@Mod(References.MODID)
public class AdvancedTools {

    public static final Logger LOGGER = LogManager.getLogger();


    public AdvancedTools(IEventBus bus, ModContainer container) {
        ModToolMaterials.registerToolMaterials();

        ModItems.init(bus);
        ModComponents.init(bus);
        CreativeModeTabs.init(bus);

        bus.addListener(AdvancedTools::packSetup);

        ConfigHelper.registerConfigs(container, References.MODID, true, Config.SERVER_CONFIG, Config.CLIENT_CONFIG);
        ModRegistry.register(References.MODID, References.NAME, References.URL);
    }


    public static void packSetup(@NotNull AddPackFindersEvent event) {
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/only_vanilla_materials"),
                PackType.SERVER_DATA,
                Component.literal("Only Vanilla Materials"),
                PackSource.DEFAULT,
                false,
                Pack.Position.TOP
        );
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/only_common_materials"),
                PackType.SERVER_DATA,
                Component.literal("Only Common Materials"),
                PackSource.DEFAULT,
                false,
                Pack.Position.TOP
        );
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/only_expanded_common_materials"),
                PackType.SERVER_DATA,
                Component.literal("Only Uncommon-, Common-modded & Vanilla Materials"),
                PackSource.DEFAULT,
                false,
                Pack.Position.TOP
        );
    }


    @Mod(value = References.MODID, dist = Dist.CLIENT)
    public static class AdvancedToolsClient {

        public AdvancedToolsClient(ModContainer container) {
            ConfigHelper.registerIngameConfig(container);
        }
    }
}