package xxrexraptorxx.advancedsticks.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.advancedsticks.utils.Config;
import xxrexraptorxx.advancedsticks.utils.ModItemProperties;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/advanced-sticks
 **/
@Mod(References.MODID)
public class AdvancedSticks {

    public static final Logger LOGGER = LogManager.getLogger();

    public AdvancedSticks() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Config.init();
        ModItems.init();

        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ModItemProperties.addItemProperties();
    }
}