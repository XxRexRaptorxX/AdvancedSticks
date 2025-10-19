package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import xxrexraptorxx.advancedtools.items.UpgradeItem;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.magmacore.content.ItemHelper;
import xxrexraptorxx.magmacore.content.TagHelper;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, References.MODID);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // RODS
        for (String handle : ModItems.HANDLE_MATERIALS) {
            AdvancedTools.LOGGER.info("Generate item tags for " + handle);

            Item rodItem = BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, "stick_" + handle));
            if (rodItem == Items.AIR) AdvancedTools.LOGGER.error("Invalid item!!! [" + handle + "]");

            TagKey<Item> rodTag = TagHelper.createCItemTag("rods/" + ToolUtils.transformMaterialNames(handle));
            TagKey<Item> stickTag = TagHelper.createCItemTag("sticks/" + ToolUtils.transformMaterialNames(handle));
            TagKey<Item> toolTag = TagHelper.createItemTag(References.MODID, ToolUtils.transformMaterialNames(handle) + "_tools");

            if (rodItem != Items.AIR) {
                tag(rodTag).add(rodItem).addOptionalTag(stickTag);
                tag(stickTag).add(rodItem);
            }

            tag(TagHelper.createCItemTag("rods")).addOptionalTags(rodTag);
            tag(TagHelper.createCItemTag("sticks")).addOptionalTags(stickTag);

            if (handle.contains("gold")) {
                tag(ItemTags.PIGLIN_LOVED).add(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, "stick_" + handle)));

            } else if (handle.contains("soularium")) {
                tag(ItemTags.PIGLIN_REPELLENTS).add(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, "stick_" + handle)));
            }

            // TOOLS
            for (String otherHandle : ModItems.HANDLE_MATERIALS) {
                for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                    for (String tool : ModItems.TOOL_TYPES) {
                        if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {

                            ResourceLocation loc = ItemHelper.getLocation(References.MODID, otherHandle + FormattingUtils.AT_INFIX + head + "_" + tool);
                            Item item = BuiltInRegistries.ITEM.getValue(loc);

                            if (item != Items.AIR) {
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

                                    } else if (head.contains("soularium") || handle.contains("soularium")) {
                                        tag(ItemTags.PIGLIN_REPELLENTS).add(item);
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

                TagKey<Item> craftingMaterialTag = TagHelper.createCItemTag(ToolUtils.transformMaterialNames(head) + "_tool_materials");

                for (TagKey<Item> key : ModTags.getPossibleTagsForMaterial(head)) {
                    tag(craftingMaterialTag).addOptionalTag(key);
                }
            }
        }


        // VANILLA
        TagKey<Item> woodStick = TagHelper.createCItemTag("sticks/wood");
        tag(woodStick).add(Items.STICK);
        tag(TagHelper.createCItemTag("sticks")).addTags(woodStick);

        TagKey<Item> endRod = TagHelper.createCItemTag("rods/end");
        tag(endRod).add(Blocks.END_ROD.asItem());
        tag(TagHelper.createCItemTag("rods")).addTags(endRod);

        // BOWS
        tag(Tags.Items.TOOLS_BOW).add(ModItems.IRON_BOW.get(), ModItems.GOLD_BOW.asItem(), ModItems.DIAMOND_BOW.asItem(), ModItems.NETHERITE_BOW.asItem());
        tag(ItemTags.BOW_ENCHANTABLE).add(ModItems.IRON_BOW.get(), ModItems.GOLD_BOW.asItem(), ModItems.DIAMOND_BOW.asItem(), ModItems.NETHERITE_BOW.asItem());

        // UPGRADES
        tag(TagHelper.createItemTag(References.MODID, "rarity_upgrade_materials")).addTags(Tags.Items.GEMS_EMERALD);
        tag(TagHelper.createItemTag(References.MODID, "netherite_upgrade_materials")).addTags(Tags.Items.INGOTS_NETHERITE);
        tag(TagHelper.createItemTag(References.MODID, "obsidian_upgrade_materials")).addTags(Tags.Items.OBSIDIANS);
        tag(TagHelper.createItemTag(References.MODID, "knockback_upgrade_materials")).add(Items.TNT);
        tag(TagHelper.createItemTag(References.MODID, "damage_upgrade_materials")).add(Blocks.QUARTZ_BLOCK.asItem())
                .addOptionalTags(TagHelper.createCItemTag("storage_blocks/quartz"));
        tag(TagHelper.createItemTag(References.MODID, "speed_upgrade_materials")).addTags(Tags.Items.STORAGE_BLOCKS_REDSTONE);
        tag(TagHelper.createItemTag(References.MODID, "luck_upgrade_materials")).add(Blocks.AMETHYST_BLOCK.asItem())
                .addOptionalTags(TagHelper.createCItemTag("storage_blocks/amethyst"));
        tag(TagHelper.createItemTag(References.MODID, "efficiency_upgrade_materials")).addTags(Tags.Items.STORAGE_BLOCKS_LAPIS);
        tag(TagHelper.createItemTag(References.MODID, "underwater_upgrade_materials")).addTags(Tags.Items.GEMS_PRISMARINE);
        tag(TagHelper.createItemTag(References.MODID, "attack_range_upgrade_materials")).addTags(Tags.Items.RODS_BLAZE);
        tag(TagHelper.createItemTag(References.MODID, "mining_range_upgrade_materials")).addTags(Tags.Items.RODS_BREEZE);
        tag(TagHelper.createItemTag(References.MODID, "sweeping_upgrade_materials")).add(Items.PHANTOM_MEMBRANE);
        tag(TagHelper.createItemTag(References.MODID, "protection_upgrade_materials")).addTags(Tags.Items.STORAGE_BLOCKS_IRON);

        for (Item item : BuiltInRegistries.ITEM.stream().toList()) {
            if (item instanceof UpgradeItem) {

                tag(TagHelper.createItemTag(References.MODID, "upgrades")).add(item);
            }
        }
    }
}
