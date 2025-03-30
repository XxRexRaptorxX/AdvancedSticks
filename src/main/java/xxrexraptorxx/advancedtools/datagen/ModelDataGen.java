package xxrexraptorxx.advancedtools.datagen;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.renderer.block.model.BlockModelDefinition;
import net.minecraft.client.renderer.item.ClientItem;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.core.Holder;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import xxrexraptorxx.advancedtools.main.References;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

//code from TofuCraftReloaded (https://github.com/baguchi/TofuCraftReload-Recode/blob/1.21.x/src/main/java/baguchi/tofucraft/data/generator/TofuModelData.java)
public class ModelDataGen extends ModelProvider {

    private final PackOutput.PathProvider blockStatePathProvider;
    private final PackOutput.PathProvider itemInfoPathProvider;
    private final PackOutput.PathProvider modelPathProvider;

    public ModelDataGen(PackOutput packOutput) {
        super(packOutput, References.MODID);
        this.blockStatePathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "blockstates");
        this.itemInfoPathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "items");
        this.modelPathProvider = packOutput.createPathProvider(PackOutput.Target.RESOURCE_PACK, "models");
    }

    public CompletableFuture<?> run(CachedOutput output) {
        ItemInfoCollector itemModelOutput = new ItemInfoCollector(this::getKnownItems) {
            @Override
            public void finalizeAndValidate() { //todo temporary
                try {
                    super.finalizeAndValidate();
                } catch (IllegalStateException ignore) {

                }
            }
        };
        BlockModelDefinitionGeneratorCollector blockModelOutput = new BlockModelDefinitionGeneratorCollector(this::getKnownBlocks) {
            @Override
            public void validate() { //todo temporary
                try {
                    super.validate();
                } catch (IllegalStateException ignore) {

                }
            }
        };
        SimpleModelCollector modelOutput = new SimpleModelCollector();
        this.registerModels(new BlockModelGen(blockModelOutput, itemModelOutput, modelOutput), new ItemModelGen(itemModelOutput, modelOutput));
        blockModelOutput.validate();
        itemModelOutput.finalizeAndValidate();
        return CompletableFuture.allOf(blockModelOutput.save(output, this.blockStatePathProvider), modelOutput.save(output, this.modelPathProvider), itemModelOutput.save(output, this.itemInfoPathProvider));
    }

    @OnlyIn(Dist.CLIENT)
    static class ItemInfoCollector implements ItemModelOutput {
        private final Map<Item, ClientItem> itemInfos;
        private final Map<Item, Item> copies;
        private final Supplier<Stream<? extends Holder<Item>>> knownItems;

        public ItemInfoCollector(Supplier<Stream<? extends Holder<Item>>> knownItems) {
            this.itemInfos = new HashMap();
            this.copies = new HashMap();
            this.knownItems = knownItems;
        }


        public void accept(Item item, ItemModel.Unbaked model) {
            this.register(item, new ClientItem(model, ClientItem.Properties.DEFAULT));
        }

        public void register(Item item, ClientItem clientItem) {
            ClientItem clientitem = (ClientItem) this.itemInfos.put(item, clientItem);
            if (clientitem != null) {
                throw new IllegalStateException("Duplicate item model definition for " + String.valueOf(item));
            }
        }

        public void copy(Item item, Item item2) {
            this.copies.put(item2, item);
        }

        public void finalizeAndValidate() {
            (this.knownItems.get()).map(Holder::value).forEach((p_388426_) -> {
                if (!this.copies.containsKey(p_388426_) && p_388426_ instanceof BlockItem blockitem) {
                    if (!this.itemInfos.containsKey(blockitem)) {
                        ResourceLocation resourcelocation = ModelLocationUtils.getModelLocation(blockitem.getBlock());
                        this.accept(blockitem, ItemModelUtils.plainModel(resourcelocation));
                    }
                }

            });
            this.copies.forEach((item, item2) -> {
                ClientItem clientitem = (ClientItem) this.itemInfos.get(item2);
                if (clientitem == null) {
                    String var10002 = String.valueOf(item2);
                    throw new IllegalStateException("Missing donor: " + var10002 + " -> " + String.valueOf(item));
                } else {
                    this.register(item, clientitem);
                }
            });
            List<ResourceLocation> list = (this.knownItems.get()).filter((p_388636_) -> !this.itemInfos.containsKey(p_388636_.value())).map((p_388278_) -> ((ResourceKey) p_388278_.unwrapKey().orElseThrow()).location()).toList();
            if (!list.isEmpty()) {
                throw new IllegalStateException("Missing item model definitions for: " + String.valueOf(list));
            }
        }

        public CompletableFuture<?> save(CachedOutput output, PackOutput.PathProvider provider) {
            return DataProvider.saveAll(output, ClientItem.CODEC, (p_388594_) -> provider.json(p_388594_.builtInRegistryHolder().key().location()), this.itemInfos);
        }
    }

    @OnlyIn(Dist.CLIENT)
    static class SimpleModelCollector implements BiConsumer<ResourceLocation, ModelInstance> {
        private final Map<ResourceLocation, ModelInstance> models = new HashMap();

        SimpleModelCollector() {
        }

        public void accept(ResourceLocation location, ModelInstance instance) {
            Supplier<JsonElement> supplier = (Supplier) this.models.put(location, instance);
            if (supplier != null) {
                throw new IllegalStateException("Duplicate model definition for " + String.valueOf(location));
            }
        }

        public CompletableFuture<?> save(CachedOutput output, PackOutput.PathProvider provider) {
            Objects.requireNonNull(provider);
            return saveAll(output, provider::json, this.models);
        }

        static <T> CompletableFuture<?> saveAll(CachedOutput output, Function<T, Path> pathFunction, Map<T, ? extends Supplier<JsonElement>> supplier) {
            return DataProvider.saveAll(output, Supplier::get, pathFunction, supplier);
        }
    }

    @OnlyIn(Dist.CLIENT)
    static class BlockModelDefinitionGeneratorCollector implements Consumer<BlockModelDefinitionGenerator> {
        private final Map<Block, BlockModelDefinitionGenerator> generators;
        private final Supplier<Stream<? extends Holder<Block>>> knownBlocks;

        public BlockModelDefinitionGeneratorCollector(Supplier<Stream<? extends Holder<Block>>> knownBlocks) {
            this.generators = new HashMap();
            this.knownBlocks = knownBlocks;
        }


        public void accept(BlockModelDefinitionGenerator generator) {
            Block block = generator.block();
            BlockModelDefinitionGenerator blockmodeldefinitiongenerator = this.generators.put(block, generator);
            if (blockmodeldefinitiongenerator != null) {
                throw new IllegalStateException("Duplicate blockstate definition for " + block);
            }
        }

        public void validate() {
            Stream<? extends Holder<Block>> stream = knownBlocks.get();
            List<ResourceLocation> list = stream.filter(p_386843_ -> !this.generators.containsKey(p_386843_.value()))
                    .map(p_386823_ -> p_386823_.unwrapKey().orElseThrow().location())
                    .toList();
            if (!list.isEmpty()) {
                throw new IllegalStateException("Missing blockstate definitions for: " + list);
            }
        }

        public CompletableFuture<?> save(CachedOutput output, PackOutput.PathProvider provider) {
            Map<Block, BlockModelDefinition> map = Maps.transformValues(this.generators, BlockModelDefinitionGenerator::create);
            Function<Block, Path> function = p_387598_ -> provider.json(p_387598_.builtInRegistryHolder().key().location());
            return DataProvider.saveAll(output, BlockModelDefinition.CODEC, function, map);
        }
    }
}