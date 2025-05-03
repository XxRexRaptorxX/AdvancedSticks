package xxrexraptorxx.advancedtools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.AndCondition;
import net.neoforged.neoforge.common.conditions.NotCondition;
import net.neoforged.neoforge.common.conditions.TagEmptyCondition;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeGen extends RecipeProvider {

    public RecipeGen(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        for (String handle : ModItems.HANDLE_MATERIALS) {

            TagKey<Item> rodTag = ModTags.createItemTag("c", "rods/" + ToolUtils.transformMaterialNames(handle));
            AdvancedTools.LOGGER.info("Generate Recipes with " + handle + "-handle of tag [" + rodTag.location() + "]");

            for (String tool : ModItems.TOOL_TYPES) {
                if (!handle.equals("wood")) {
                    AdvancedTools.LOGGER.info("Try smithing for [" + handle + "_stick_netherite_" + tool + "]");

                    netheriteSmithing(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_diamond_" + tool)), BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_netherite_" + tool)), handle);
                }
            }

            //TOOLS
            for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {

                    TagKey<Item> craftingMaterialTag = ModTags.createItemTag("c", ToolUtils.transformMaterialNames(head) + "_tool_materials");
                    AdvancedTools.LOGGER.info("Generate Recipes with " + head + "-head of tag [" + craftingMaterialTag.location() + "]");

                    swordRecipe(rodTag, craftingMaterialTag, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_sword")));
                    axeRecipe(rodTag, craftingMaterialTag, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_axe")));
                    pickaxeRecipe(rodTag, craftingMaterialTag, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_pickaxe")));
                    shovelRecipe(rodTag, craftingMaterialTag, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_shovel")));
                    hoeRecipe(rodTag, craftingMaterialTag, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_hoe")));
                }
            }
        }
    }


    public void swordRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output.withConditions(new AndCondition(List.of(new NotCondition(new TagEmptyCondition<>(handle)), new NotCondition(new TagEmptyCondition<>(material))))));
    }


    public void pickaxeRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output.withConditions(new AndCondition(List.of(new NotCondition(new TagEmptyCondition<>(handle)), new NotCondition(new TagEmptyCondition<>(material))))));
    }


    public void axeRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("XX")
                .pattern("#X")
                .pattern("# ")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output.withConditions(new AndCondition(List.of(new NotCondition(new TagEmptyCondition<>(handle)), new NotCondition(new TagEmptyCondition<>(material))))));
    }


    public void shovelRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output.withConditions(new AndCondition(List.of(new NotCondition(new TagEmptyCondition<>(handle)), new NotCondition(new TagEmptyCondition<>(material))))));
    }


    public void hoeRecipe(TagKey<Item> handle, TagKey<Item> material, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handle)
                .define('X', material)
                .pattern("XX")
                .pattern("# ")
                .pattern("# ")
                .unlockedBy("has_" + material.location().getPath(), has(material))
                .save(output.withConditions(new AndCondition(List.of(new NotCondition(new TagEmptyCondition<>(handle)), new NotCondition(new TagEmptyCondition<>(material))))));
    }


    @Deprecated
    public void toolRecyclingRecipes() {
        for (String handle : ModItems.HANDLE_MATERIALS) {
            for (String tool : ModItems.TOOL_TYPES) {

                Item result = BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_iron_" + tool));
                AdvancedTools.LOGGER.info("Generate smelting recipes for " + getItemName(result));

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(result), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 200)
                        .unlockedBy(getHasName(result), has(result)).save(output, References.MODID + ":" + "smelting/" + handle + "_stick_iron_" + tool);

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(result), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 100)
                        .unlockedBy(getHasName(result), has(result)).save(output, References.MODID + ":" + "blasting/" + handle + "_stick_iron_" + tool);

                result = BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_gold_" + tool));
                AdvancedTools.LOGGER.info("Generate smelting recipes for " + getItemName(result));

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(result), RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1F, 200)
                        .unlockedBy(getHasName(result), has(result)).save(output, References.MODID + ":" + "smelting/" + handle + "_stick_gold_" + tool);

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(result), RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1F, 100)
                        .unlockedBy(getHasName(result), has(result)).save(output, References.MODID + ":" + "blasting/" + handle + "_stick_gold_" + tool);
            }
        }
    }


    //private void netheriteSmithingANCompat(String handle, String tool) {
    //    Item result = BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_netherite_" + tool));
    //    Item input = BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_netherite_" + tool));
    //
    //    AdvancedTools.LOGGER.info("Generate AdvancedNetherite smithing recipe for " + getItemName(result));
    //
    //        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
    //                    Ingredient.of(input), tag(ModTags.createItemTag("advancednetherite", "upgrade_to_netherite_iron")), RecipeCategory.COMBAT, result)
    //            .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
    //            .save(output, References.MODID + ":compat/advanced_netherite/" + getItemName(result));
    //}


    private void netheriteSmithing(Item item, Item result, String conditionalMaterial) {
        AdvancedTools.LOGGER.info("Generate smithing recipe for " + getItemName(result) + " from " + item);

        TagKey<Item> rodTag = ModTags.createItemTag("c", "rods/" + ToolUtils.transformMaterialNames(conditionalMaterial));
        TagKey<Item> craftingMaterialTag = ModTags.createItemTag("c", ToolUtils.transformMaterialNames(conditionalMaterial) + "_tool_materials");

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(item), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, result)
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(output.withConditions(new AndCondition(List.of(new NotCondition(new TagEmptyCondition<>(rodTag)),
                        new NotCondition(new TagEmptyCondition<>(craftingMaterialTag))))), References.MODID + ":smithing/" + getItemName(result));
    }


    private static ResourceLocation getItemLoc(String name){
        return ResourceLocation.fromNamespaceAndPath(References.MODID, name);
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