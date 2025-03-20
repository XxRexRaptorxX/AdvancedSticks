package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> provider) {
        super(output, lookupProvider, provider, References.MODID);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //rods
        for (String handle : ModItems.HANDLE_MATERIALS) {
            AdvancedTools.LOGGER.info("Generate item tags for " + handle);

            Item rodItem = BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc("stick_" + handle));
            if (rodItem == Items.AIR) AdvancedTools.LOGGER.error("Invalid item!!! [" + handle + "]");

            TagKey<Item> rodTag = ModTags.createItemTag("c", "rods/" + ToolUtils.transformMaterialNames(handle));
            TagKey<Item> stickTag = ModTags.createItemTag("c", "sticks/" + ToolUtils.transformMaterialNames(handle));

            if (rodItem != Items.AIR) {
                tag(rodTag).add(rodItem).addOptionalTag(stickTag);
                tag(stickTag).add(rodItem);
            }

            tag(ModTags.createItemTag("c", "rods")).addOptionalTags(rodTag);
            tag(ModTags.createItemTag("c", "sticks")).addOptionalTags(stickTag);

            if (handle.contains("gold")) {
                tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc("stick_" + handle)));
            }

            //tools
            for (String base : ModItems.BASE_MATERIALS) {
                tag(ItemTags.SWORDS).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_sword")));
                tag(ItemTags.PICKAXES).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_pickaxe")));
                tag(ItemTags.AXES).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_axe")));
                tag(ItemTags.SHOVELS).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_shovel")));
                tag(ItemTags.HOES).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_hoe")));


                if (base.contains("gold") || handle.contains("gold")) {
                    tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_sword")));
                    tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_pickaxe")));
                    tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_axe")));
                    tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_shovel")));
                    tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_hoe")));
                }
            }

        }

        //vanilla
        TagKey<Item> woodStick = ModTags.createItemTag("c", "sticks/wood");
        tag(woodStick).add(Items.STICK);
        tag(ModTags.createItemTag("c", "sticks")).addTags(woodStick);

        TagKey<Item> endRod = ModTags.createItemTag("c", "rods/end");
        tag(endRod).add(Blocks.END_ROD.asItem());
        tag(ModTags.createItemTag("c", "rods")).addTags(endRod);

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