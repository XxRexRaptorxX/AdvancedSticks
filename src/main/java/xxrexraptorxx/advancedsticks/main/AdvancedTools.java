package xxrexraptorxx.advancedsticks.main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.advancedsticks.registry.CreativeModeTabs;
import xxrexraptorxx.advancedsticks.registry.ModItems;
import xxrexraptorxx.advancedsticks.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/advanced-sticks">...</a>
 **/
@Mod(References.MODID)
public class AdvancedTools {

    public static final Logger LOGGER = LogManager.getLogger();


    public AdvancedTools(IEventBus bus, ModContainer container) {
        Config.init(container);
        ModItems.init(bus);
        CreativeModeTabs.init(bus);
    }
}