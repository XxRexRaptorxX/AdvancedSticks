package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, References.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (String head : ModItems.TOOL_HEAD_MATERIALS) {
            AdvancedTools.LOGGER.info("Generate block tags for " + head);

            TagKey<Block> needsTag = ModTags.createBlockTag("c", "needs_" + ToolUtils.transformMaterialNames(head) + "_tool");
            TagKey<Block> incorrectTag = ModTags.createBlockTag("c", "incorrect_for_" + ToolUtils.transformMaterialNames(head) + "_tool");

            tag(incorrectTag).remove(needsTag);
        }
    }
}