package xxrexraptorxx.advancedtools.datagen;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import xxrexraptorxx.advancedtools.main.References;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ModelDataGen::new);
        event.createBlockAndItemTags(BlockTagGen::new, ItemTagGen::new);
        event.createProvider(RecipeGen.Runner::new);
    }
}