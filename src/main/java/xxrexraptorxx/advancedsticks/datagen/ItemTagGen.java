package xxrexraptorxx.advancedsticks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.registry.ModItems;
import xxrexraptorxx.advancedsticks.registry.ModTags;
import xxrexraptorxx.advancedsticks.utils.ToolUtils;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> provider) {
        super(output, lookupProvider, provider, References.MODID);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (String handle : ModItems.HANDLE_MATERIALS) {

            if (!ToolUtils.isVanillaRod(handle)) {
                TagKey<Item> rodTag = ModTags.createItemTag("c", "rods/" + ToolUtils.transformMaterialNames(handle));
                TagKey<Item> stickTag = ModTags.createItemTag("c", "sticks/" + ToolUtils.transformMaterialNames(handle));

                tag(rodTag).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc("stick_" + handle))).addTags(stickTag);
                tag(stickTag).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc("stick_" + handle)));

                tag(ModTags.createItemTag("c", "rods")).addTags(rodTag);
                tag(ModTags.createItemTag("c", "sticks")).addTags(stickTag);
            }

            //tools
            for (String base : ModItems.BASE_MATERIALS) {
                tag(ItemTags.SWORDS).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_sword")));
                tag(ItemTags.PICKAXES).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_pickaxe")));
                tag(ItemTags.AXES).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_axe")));
                tag(ItemTags.SHOVELS).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_shovel")));
                tag(ItemTags.HOES).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_hoe")));
            }
        }

        //bows
        tag(Tags.Items.TOOLS_BOW).add(
                ModItems.IRON_BOW.get(),
                ModItems.GOLD_BOW.asItem(),
                ModItems.DIAMOND_BOW.asItem(),
                ModItems.NETHERITE_BOW.asItem()
        );
        tag(ItemTags.BOW_ENCHANTABLE).add(
                ModItems.IRON_BOW.get(),
                ModItems.GOLD_BOW.asItem(),
                ModItems.DIAMOND_BOW.asItem(),
                ModItems.NETHERITE_BOW.asItem()
        );
    }
}