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

import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {

    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    @Override
    public void run() {
        //bows
        this.generateBow(ModItems.IRON_BOW.get());
        this.generateBow(ModItems.GOLD_BOW.get());
        this.generateBow(ModItems.DIAMOND_BOW.get());
        this.generateBow(ModItems.NETHERITE_BOW.get());

        //rods
        for (String handle : ModItems.HANDLE_MATERIALS) {

            if (!ToolUtils.isRod(handle)) {
                AdvancedTools.LOGGER.info("Generate item model of " + handle);
                this.generateFlatItem(BuiltInRegistries.ITEM.getValue(getStickLoc(handle)), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
            }
            //tools
            for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                for (String tool : ModItems.TOOL_TYPES) {
                    AdvancedTools.LOGGER.info("Generate " + tool + " item model of " + base + " head with " + handle + " handle");
                    this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + base + "_" + tool)));
                }
            }
        }
    }


    ModelTemplate TWO_LAYERED_HANDHELD_ITEM = ModelTemplates.createItem("handheld", TextureSlot.LAYER0, TextureSlot.LAYER1);


    public void generateLayeredHandheldItem(Item item) {
        String name = BuiltInRegistries.ITEM.getKey(item).getPath();
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

        this.itemModelOutput.accept(item, ItemModelUtils.plainModel(TWO_LAYERED_HANDHELD_ITEM.create(ResourceLocation.fromNamespaceAndPath(
                References.MODID, "item/" + name), TextureMapping.layered(getTextureLoc(stickType), getTextureLoc(toolType)), this.modelOutput)));
    }



    public static ResourceLocation getTextureLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + name);
    }

    public static ResourceLocation getStickLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_" + name);
    }

    public static ResourceLocation getItemLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, name);
    }

}