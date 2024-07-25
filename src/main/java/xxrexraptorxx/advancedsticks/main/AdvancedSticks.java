package xxrexraptorxx.advancedsticks.main;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.advancedsticks.registry.CreativeModeTabs;
import xxrexraptorxx.advancedsticks.registry.ModItems;
import xxrexraptorxx.advancedsticks.utils.Config;
import xxrexraptorxx.advancedsticks.utils.ModItemProperties;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/advanced-sticks">...</a>
 **/
@Mod(References.MODID)
public class AdvancedSticks {

    public static final Logger LOGGER = LogManager.getLogger();


    public AdvancedSticks(IEventBus bus, ModContainer container) {
        Config.init(container);
        ModItems.init(bus);
        CreativeModeTabs.init(bus);
    }


    @EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ModItemProperties.addItemProperties();
        }
    }

}