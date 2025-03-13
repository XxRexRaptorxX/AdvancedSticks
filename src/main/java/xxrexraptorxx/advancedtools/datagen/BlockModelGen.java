package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.blockstates.BlockStateGenerator;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.resources.ResourceLocation;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BlockModelGen extends BlockModelGenerators {

    public BlockModelGen(Consumer<BlockStateGenerator> blockstateOutput, ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(blockstateOutput, itemModelOutput, modelOutput);
    }

    @Override
    public void run() {
    }

}