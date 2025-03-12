package xxrexraptorxx.advancedsticks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import xxrexraptorxx.advancedsticks.main.References;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, References.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}