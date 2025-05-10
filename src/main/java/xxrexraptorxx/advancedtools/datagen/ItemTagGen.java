package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import xxrexraptorxx.advancedtools.items.UpgradeItem;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.enums.Upgrades;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> provider) {
        super(output, lookupProvider, provider, References.MODID);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //RODS
        for (String handle : ModItems.HANDLE_MATERIALS) {
            AdvancedTools.LOGGER.info("Generate item tags for " + handle);

            Item rodItem = BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc("stick_" + handle));
            if (rodItem == Items.AIR) AdvancedTools.LOGGER.error("Invalid item!!! [" + handle + "]");

            TagKey<Item> rodTag = ModTags.createCItemTag("rods/" + ToolUtils.transformMaterialNames(handle));
            TagKey<Item> stickTag = ModTags.createCItemTag("sticks/" + ToolUtils.transformMaterialNames(handle));
            TagKey<Item> toolTag = ModTags.createItemTag(References.MODID, ToolUtils.transformMaterialNames(handle) + "_tools");

            if (rodItem != Items.AIR) {
                tag(rodTag).add(rodItem).addOptionalTag(stickTag);
                tag(stickTag).add(rodItem);
            }

            tag(ModTags.createCItemTag("rods")).addOptionalTags(rodTag);
            tag(ModTags.createCItemTag("sticks")).addOptionalTags(stickTag);

            if (handle.contains("gold")) {
                tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc("stick_" + handle)));
            }

            //TOOLS
            for (String otherHandle : ModItems.HANDLE_MATERIALS) {
                for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                    for (String tool : ModItems.TOOL_TYPES) {
                        if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {

                            ResourceLocation loc = ItemModelGen.getItemLoc(otherHandle + FormattingUtils.AT_INFIX + head + "_" + tool);
                            Item item = BuiltInRegistries.ITEM.getValue(loc);

                            if (item != Items.AIR) {
                                // Nur Items hinzufügen, wenn:
                                // - handle == aktueller handle
                                // - oder head == aktueller handle
                                if (otherHandle.equals(handle) || head.equals(handle)) {
                                    tag(toolTag).add(item);

                                    switch (tool) {
                                        case "sword" -> tag(ItemTags.SWORDS).add(item);
                                        case "pickaxe" -> tag(ItemTags.PICKAXES).add(item);
                                        case "axe" -> tag(ItemTags.AXES).add(item);
                                        case "shovel" -> tag(ItemTags.SHOVELS).add(item);
                                        case "hoe" -> tag(ItemTags.HOES).add(item);
                                    }

                                    if (head.contains("gold") || handle.contains("gold")) {
                                        tag(ItemTags.PIGLIN_LOVED).add(item);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        for (String head : ModItems.TOOL_HEAD_MATERIALS) {
            if (!Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head)) {
                AdvancedTools.LOGGER.info("Generate crafting materials tag for " + head);

                TagKey<Item> craftingMaterialTag = ModTags.createCItemTag(ToolUtils.transformMaterialNames(head) + "_tool_materials");

                for (TagKey<Item> key : ModTags.getPossibleTagsForMaterial(head)) {
                    tag(craftingMaterialTag).addOptionalTag(key);
                }
            }
        }


        //VANILLA
        TagKey<Item> woodStick = ModTags.createCItemTag("sticks/wood");
        tag(woodStick).add(Items.STICK);
        tag(ModTags.createCItemTag("sticks")).addTags(woodStick);

        TagKey<Item> endRod = ModTags.createCItemTag("rods/end");
        tag(endRod).add(Blocks.END_ROD.asItem());
        tag(ModTags.createCItemTag( "rods")).addTags(endRod);

        //BOWS
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

        //UPGRADES
        tag(ModTags.createModItemTag("rarity_upgrade_materials")).addTags(Tags.Items.GEMS_EMERALD);
        tag(ModTags.createModItemTag("netherite_upgrade_materials")).addTags(Tags.Items.INGOTS_NETHERITE);
        tag(ModTags.createModItemTag("obsidian_upgrade_materials")).addTags(Tags.Items.OBSIDIANS);
        tag(ModTags.createModItemTag("knockback_upgrade_materials")).add(Items.TNT);
        tag(ModTags.createModItemTag("damage_upgrade_materials")).add(Blocks.QUARTZ_BLOCK.asItem()).addOptionalTags(ModTags.createCItemTag("storage_blocks/quartz"));
        tag(ModTags.createModItemTag("speed_upgrade_materials")).addTags(Tags.Items.STORAGE_BLOCKS_REDSTONE);
        tag(ModTags.createModItemTag("luck_upgrade_materials")).add(Blocks.AMETHYST_BLOCK.asItem()).addOptionalTags(ModTags.createCItemTag("storage_blocks/amethyst"));
        tag(ModTags.createModItemTag("efficiency_upgrade_materials")).addTags(Tags.Items.STORAGE_BLOCKS_LAPIS);
        tag(ModTags.createModItemTag("underwater_upgrade_materials")).addTags(Tags.Items.GEMS_PRISMARINE);
        tag(ModTags.createModItemTag("attackrange_upgrade_materials")).addTags(Tags.Items.RODS_BLAZE);
        tag(ModTags.createModItemTag("miningrange_upgrade_materials")).addTags(Tags.Items.RODS_BREEZE);
        tag(ModTags.createModItemTag("sweeping_upgrade_materials")).add(Items.PHANTOM_MEMBRANE);
        tag(ModTags.createModItemTag("protection_upgrade_materials")).addTags(Tags.Items.STORAGE_BLOCKS_IRON);

        for (Item item : BuiltInRegistries.ITEM.stream().toList()) {
            if (item instanceof UpgradeItem) {

                tag(ModTags.createModItemTag("upgrades")).add(item);
            }
        }

    }
}