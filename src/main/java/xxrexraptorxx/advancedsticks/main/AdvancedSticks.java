package xxrexraptorxx.advancedsticks.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.advancedsticks.utils.Config;

@Mod(References.MODID)
public class AdvancedSticks {

    public static final Logger LOGGER = LogManager.getLogger();

    public AdvancedSticks() {
        Config.init();
        ModItems.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}