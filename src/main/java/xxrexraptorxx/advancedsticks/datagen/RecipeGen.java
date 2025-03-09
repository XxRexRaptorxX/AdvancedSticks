package xxrexraptorxx.advancedsticks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import xxrexraptorxx.advancedsticks.main.References;
import xxrexraptorxx.advancedsticks.registry.ModTags;

import java.util.concurrent.CompletableFuture;

public class RecipeGen extends RecipeProvider {

    public RecipeGen(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {

        generateToolRecipes(ModTags.BONE_STICKS);
        generateToolRecipes(ModTags.IRON_STICKS);
        generateToolRecipes(ModTags.GOLD_STICKS);
        generateToolRecipes(ModTags.COPPER_STICKS);
        generateToolRecipes(ModTags.EMERALD_STICKS);
        generateToolRecipes(ModTags.AMETHYST_STICKS);
        generateToolRecipes(ModTags.DIAMOND_STICKS);
        generateToolRecipes(ModTags.NETHERITE_STICKS);
        generateToolRecipes(ModTags.ENCHANTED_STICKS);
        generateToolRecipes(ModTags.ADVANCED_STICKS);
        generateToolRecipes(ModTags.END_STICKS);
        generateToolRecipes(ModTags.BLAZE_STICKS);
        generateToolRecipes(ModTags.BREEZE_STICKS);
        //generateToolRecipes(ModTags.WITHER_STICKS);
    }

    public void generateToolRecipes(TagKey<Item> handle) {
        swordRecipe(handle, ItemTags.WOODEN_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_wood_sword")));
        axeRecipe(handle, ItemTags.WOODEN_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_wood_axe")));
        pickaxeRecipe(handle, ItemTags.WOODEN_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_wood_pickaxe")));
        shovelRecipe(handle, ItemTags.WOODEN_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_wood_shovel")));
        hoeRecipe(handle, ItemTags.WOODEN_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_wood_hoe")));

        swordRecipe(handle, ItemTags.STONE_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_stone_sword")));
        axeRecipe(handle, ItemTags.STONE_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_stone_axe")));
        pickaxeRecipe(handle, ItemTags.STONE_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_stone_pickaxe")));
        shovelRecipe(handle, ItemTags.STONE_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_stone_shovel")));
        hoeRecipe(handle, ItemTags.STONE_TOOL_MATERIALS, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_stone_hoe")));

        swordRecipe(handle, Tags.Items.INGOTS_IRON, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_iron_sword")));
        axeRecipe(handle, Tags.Items.INGOTS_IRON, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_iron_axe")));
        pickaxeRecipe(handle, Tags.Items.INGOTS_IRON, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_iron_pickaxe")));
        shovelRecipe(handle, Tags.Items.INGOTS_IRON, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_iron_shovel")));
        hoeRecipe(handle, Tags.Items.INGOTS_IRON, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_iron_hoe")));

        swordRecipe(handle, Tags.Items.INGOTS_GOLD, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_gold_sword")));
        axeRecipe(handle, Tags.Items.INGOTS_GOLD, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_gold_axe")));
        pickaxeRecipe(handle, Tags.Items.INGOTS_GOLD, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_gold_pickaxe")));
        shovelRecipe(handle, Tags.Items.INGOTS_GOLD, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_gold_shovel")));
        hoeRecipe(handle, Tags.Items.INGOTS_GOLD, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_gold_hoe")));

        swordRecipe(handle, Tags.Items.GEMS_DIAMOND, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_sword")));
        axeRecipe(handle, Tags.Items.GEMS_DIAMOND, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_axe")));
        pickaxeRecipe(handle, Tags.Items.GEMS_DIAMOND, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_pickaxe")));
        shovelRecipe(handle, Tags.Items.GEMS_DIAMOND, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_shovel")));
        hoeRecipe(handle, Tags.Items.GEMS_DIAMOND, BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_hoe")));

        netheriteSmithing(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_sword")), BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_netherite_sword")));
        netheriteSmithing(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_axe")), BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_netherite_axe")));
        netheriteSmithing(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_pickaxe")), BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_netherite_pickaxe")));
        netheriteSmithing(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_shovel")), BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_netherite_shovel")));
        netheriteSmithing(BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_diamond_hoe")), BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, getStickName(handle) + "_netherite_hoe")));
    }



    public void swordRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        shaped(RecipeCategory.COMBAT, result)
                .define('#', handle)
                .define('X', material)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output);
    }


    public void pickaxeRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output);
    }


    public void axeRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("XX")
                .pattern("#X")
                .pattern("# ")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output);
    }


    public void shovelRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output);
    }


    public void hoeRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("XX")
                .pattern("# ")
                .pattern("# ")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output);
    }


    public void netheriteSmithing(Item item, Item result) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(item), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, result)
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(output, References.MODID + ":" + getItemName(result) + "_smithing");
    }


    private String getStickName(TagKey<Item> handle) {
        String stick = handle.location().getPath().replace("rods/", "");

        if (stick.contains("end") || stick.contains("breeze") || stick.contains("blaze")) {
            return stick + "rod";

        } else {
            return stick + "_stick";
        }
    }


    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new RecipeGen(provider, output);
        }

        @Override
        public String getName() {
            return References.MODID + "_recipes";
        }
    }
}