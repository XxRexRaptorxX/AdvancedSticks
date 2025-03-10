package xxrexraptorxx.advancedsticks.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.registry.ModItems;

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

            if (!handle.equals("blaze") && !handle.equals("breeze") && !handle.equals("end")) {
                AdvancedSticks.LOGGER.info("Generate item model of " + handle);
                this.generateFlatItem(BuiltInRegistries.ITEM.getValue(getStickLoc(handle)), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
            }
            //tools
            for (String base : ModItems.BASE_MATERIALS) {
                AdvancedSticks.LOGGER.info("Generate tool item model of " + base + " head with " + handle + " handle");
                this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_" + base + "_sword")));
                this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_" + base + "_pickaxe")));
                this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_" + base + "_axe")));
                this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_" + base + "_shovel")));
                this.generateLayeredHandheldItem(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_" + base + "_hoe")));
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



    private static ResourceLocation getTextureLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "item/" + name);
    }

    private static ResourceLocation getStickLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_" + name);
    }

    private static ResourceLocation getItemLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, name);
    }

}