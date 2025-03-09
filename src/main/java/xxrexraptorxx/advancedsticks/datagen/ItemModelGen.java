package xxrexraptorxx.advancedsticks.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.registry.ModItems;

import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {

    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    @Override
    public void run() {
        //rods
        this.generateFlatItem(ModItems.BONE_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.IRON_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.GOLD_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.COPPER_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.EMERALD_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.AMETHYST_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.DIAMOND_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.NETHERITE_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.ENCHANTED_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        this.generateFlatItem(ModItems.ADVANCED_STICK.get(), ModelTemplates.FLAT_HANDHELD_ROD_ITEM);
        //bows
        this.generateBow(ModItems.IRON_BOW.get());
        this.generateBow(ModItems.GOLD_BOW.get());
        this.generateBow(ModItems.DIAMOND_BOW.get());
        this.generateBow(ModItems.NETHERITE_BOW.get());
        //tools
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BONE_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.IRON_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.COPPER_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.GOLD_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.DIAMOND_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.EMERALD_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.AMETHYST_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.NETHERITE_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ADVANCED_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BLAZE_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.END_STICK_NETHERITE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.ENCHANTED_STICK_NETHERITE_PICKAXE.get());

        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_WOOD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_WOOD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_WOOD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_WOOD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_WOOD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_STONE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_STONE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_STONE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_STONE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_STONE_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_IRON_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_IRON_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_IRON_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_IRON_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_IRON_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_GOLD_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_GOLD_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_GOLD_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_GOLD_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_GOLD_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_DIAMOND_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_DIAMOND_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_DIAMOND_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_DIAMOND_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_DIAMOND_PICKAXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_NETHERITE_AXE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_NETHERITE_SWORD.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_NETHERITE_SHOVEL.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_NETHERITE_HOE.get());
        this.generateLayeredHandheldItem(ModItems.BREEZE_STICK_NETHERITE_PICKAXE.get());
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

        } else if (parts.length == 3) {
            // Format: stickMaterial_toolMaterial_toolType
            stickType = parts[0].replace("rod", "");
            toolType = parts[1] + "_" + parts[2] + "_overlay";

            // Append suffix to stickType based on the tool type (third part)
            if (parts[2].equals("shovel")) {
                stickType += "_shovel_base";
            } else if (parts[2].equals("sword")) {
                stickType += "_sword_base";
            } else if (parts[2].equals("axe")) {
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

}