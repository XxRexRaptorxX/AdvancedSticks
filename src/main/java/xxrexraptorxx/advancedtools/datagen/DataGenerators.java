package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import xxrexraptorxx.advancedtools.main.References;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = References.MODID)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        BlockTagsProvider blocktags = new BlockTagGen(packOutput, lookupProvider);
        generator.addProvider(true, blocktags);
        generator.addProvider(true, new ItemTagGen(packOutput, lookupProvider));
        generator.addProvider(true, new ModelDataGen(packOutput));
        generator.addProvider(true, new RecipeGen.Runner(packOutput, lookupProvider));
    }
}
