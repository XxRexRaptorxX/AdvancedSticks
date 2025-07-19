package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.magmacore.content.ItemHelper;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {

    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    @Override
    public void run() {
        //BOWS
        this.generateBow(ModItems.IRON_BOW.get());
        this.generateBow(ModItems.GOLD_BOW.get());
        this.generateBow(ModItems.DIAMOND_BOW.get());
        this.generateBow(ModItems.NETHERITE_BOW.get());

        //UPGRADES
        this.generateFlatItem(ModItems.EMPTY_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RARITY_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.NETHERITE_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.OBSIDIAN_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.KNOCKBACK_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.DAMAGE_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SPEED_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.LUCK_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.EFFICIENCY_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.UNDERWATER_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.ATTACKRANGE_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MININGRANGE_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SWEEPING_UPGRADE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PROTECTION_UPGRADE.get(), ModelTemplates.FLAT_ITEM);

        //RODS
        for (String handle : ModItems.HANDLE_MATERIALS) {

            if (!ToolUtils.isRod(handle)) {
                AdvancedTools.LOGGER.info("Generate item model of " + handle);

                this.generateFlatItem(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, "stick_" + handle)), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
            }

            //TOOLS
            for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                for (String tool : ModItems.TOOL_TYPES) {

                    if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {
                        AdvancedTools.LOGGER.info("Generate " + tool + " item model of " + head + " head with " + handle + " handle");

                        this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, handle + FormattingUtils.AT_INFIX + head + "_" + tool)));
                    }
                }
            }
        }
    }


    ModelTemplate TWO_LAYERED_HANDHELD_ITEM = ModelTemplates.createItem("handheld", TextureSlot.LAYER0, TextureSlot.LAYER1);


    public void generateLayeredHandheldItem(Item item) {
        String name = ItemHelper.getPath(item);
        String[] parts = name.split("_");
        String stickType;
        String toolType;

        if (parts.length == 4) {
            // Format: stickMaterial_STICK_toolMaterial_toolType
            stickType = parts[0];
            toolType = parts[2] + "_" + parts[3] + "_overlay";

            // Append suffix to stickType based on the tool type (fourth part)
            if (parts[3].equals("shovel")) {
                stickType += "_shovel_base";
            } else if (parts[3].equals("sword")) {
                stickType += "_sword_base";
            } else if (parts[3].equals("axe")) {
                stickType += "_axe_base";
            } else {
                stickType += "_tool_base";
            }

        } else {
            throw new IllegalArgumentException("Invalid input format: " + name);
        }

        this.itemModelOutput.accept(item, ItemModelUtils.plainModel(TWO_LAYERED_HANDHELD_ITEM.create(ItemHelper.getLocation(References.MODID, "item/" + name), TextureMapping.layered(getTextureLoc(stickType), getTextureLoc(toolType)), this.modelOutput)));
    }



    public static ResourceLocation getTextureLoc(String name){
        return ItemHelper.getLocation(References.MODID, "item/" + name);
    }

}