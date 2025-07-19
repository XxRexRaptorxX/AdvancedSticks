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
import net.neoforged.neoforge.common.conditions.*;
import org.jetbrains.annotations.NotNull;
import xxrexraptorxx.advancedtools.items.UpgradeItem;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.registry.ModTags;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.advancedtools.utils.enums.Upgrades;
import xxrexraptorxx.magmacore.content.ItemHelper;
import xxrexraptorxx.magmacore.content.TagHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeGen extends RecipeProvider {

    public RecipeGen(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {
        //RODS
        for (String handle : ModItems.HANDLE_MATERIALS) {

            TagKey<Item> rodTag = TagHelper.createItemTag("c", "rods/" + ToolUtils.transformMaterialNames(handle));
            AdvancedTools.LOGGER.info("Generate Recipes with " + handle + "-handle of tag [" + rodTag.location() + "]");

            //TOOLS
            for (String tool : ModItems.TOOL_TYPES) {
                if (!handle.equals("wood")) {
                    AdvancedTools.LOGGER.info("Try smithing for [" + handle + "_stick_netherite_" + tool + "]");

                    netheriteSmithing(BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_diamond_" + tool)), BuiltInRegistries.ITEM.getValue(getItemLoc(handle + "_stick_netherite_" + tool)), handle);
                }
            }

            for (String head : ModItems.TOOL_HEAD_MATERIALS) {
                if (!(Arrays.asList(ModItems.VANILLA_HEAD_MATERIALS).contains(head) && handle.equals("wood"))) {

                    TagKey<Item> craftingMaterialTag = TagHelper.createItemTag("c", ToolUtils.transformMaterialNames(head) + "_tool_materials");
                    AdvancedTools.LOGGER.info("Generate Recipes with " + head + "-head of tag [" + craftingMaterialTag.location() + "]");

                    swordRecipe(rodTag, craftingMaterialTag, head, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_sword")));
                    axeRecipe(rodTag, craftingMaterialTag, head, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_axe")));
                    pickaxeRecipe(rodTag, craftingMaterialTag, head, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_pickaxe")));
                    shovelRecipe(rodTag, craftingMaterialTag, head, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_shovel")));
                    hoeRecipe(rodTag, craftingMaterialTag, head, BuiltInRegistries.ITEM.getValue(getItemLoc(handle + FormattingUtils.AT_INFIX + head + "_hoe")));
                }
            }
        }

        //UPGRADES
        for (Item item : BuiltInRegistries.ITEM.stream().toList()) {
            if (item instanceof UpgradeItem upgradeItem && item != ModItems.EMPTY_UPGRADE.get()) {
                upgradeRecipe(upgradeItem);
            }
        }
    }


    public void swordRecipe(TagKey<Item> handleTag, TagKey<Item> headTag, String headMaterial, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handleTag)
                .define('X', headTag)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + headTag.location().getPath(), has(headTag))
                .save(output.withConditions(createTagNotEmptyConditions(headTag, headMaterial, handleTag)));
    }


    public void pickaxeRecipe(TagKey<Item> handleTag, TagKey<Item> headTag, String headMaterial, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handleTag)
                .define('X', headTag)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_" + headTag.location().getPath(), has(headTag))
                .save(output.withConditions(createTagNotEmptyConditions(headTag, headMaterial, handleTag)));
    }


    public void axeRecipe(TagKey<Item> handleTag, TagKey<Item> headTag, String headMaterial, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handleTag)
                .define('X', headTag)
                .pattern("XX")
                .pattern("#X")
                .pattern("# ")
                .unlockedBy("has_" + headTag.location().getPath(), has(headTag))
                .save(output.withConditions(createTagNotEmptyConditions(headTag, headMaterial, handleTag)));
    }


    public void shovelRecipe(TagKey<Item> handleTag, TagKey<Item> headTag, String headMaterial, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handleTag)
                .define('X', headTag)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_" + headTag.location().getPath(), has(headTag))
                .save(output.withConditions(createTagNotEmptyConditions(headTag, headMaterial, handleTag)));
    }


    public void hoeRecipe(TagKey<Item> handleTag, TagKey<Item> headTag, String headMaterial, Item result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));

        shaped(RecipeCategory.TOOLS, result)
                .define('#', handleTag)
                .define('X', headTag)
                .pattern("XX")
                .pattern("# ")
                .pattern("# ")
                .unlockedBy("has_" + headTag.location().getPath(), has(headTag))
                .save(output.withConditions(createTagNotEmptyConditions(headTag, headMaterial, handleTag)));
    }


    public void upgradeRecipe(UpgradeItem result) {
        AdvancedTools.LOGGER.info("Generate crafting recipe for " + getItemName(result));
        TagKey<Item> craftingTag = Upgrades.fromItem(result).get().getCraftingTag();

        shapeless(RecipeCategory.MISC, result)
                .group(References.MODID + "_upgrades")
                .requires(ModItems.EMPTY_UPGRADE)
                .requires(craftingTag)
                .unlockedBy(getHasName(ModItems.EMPTY_UPGRADE), has(ModItems.EMPTY_UPGRADE))
                .save(output.withConditions(new NotCondition(new TagEmptyCondition<>(craftingTag))), References.MODID + ":" + "upgrades/" + getItemName(result));
    }


    @Deprecated
    public void toolRecyclingRecipes() {
        for (String handle : ModItems.HANDLE_MATERIALS) {
            for (String tool : ModItems.TOOL_TYPES) {

                Item result = BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID, handle + "_stick_iron_" + tool));
                AdvancedTools.LOGGER.info("Generate smelting recipes for " + getItemName(result));

                SimpleCookingRecipeBuilder.smelting(Ingredient.of(result), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 200)
                        .unlockedBy(getHasName(result), has(result)).save(output, References.MODID + ":" + "smelting/" + handle + "_stick_iron_" + tool);

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(result), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 100)
                        .unlockedBy(getHasName(result), has(result)).save(output, References.MODID + ":" + "blasting/" + handle + "_stick_iron_" + tool);

                result = BuiltInRegistries.ITEM.getValue(ItemHelper.getLocation(References.MODID,handle + "_stick_gold_" + tool));
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

        TagKey<Item> rodTag = TagHelper.createCItemTag("rods/" + ToolUtils.transformMaterialNames(conditionalMaterial));
        TagKey<Item> craftingMaterialTag = TagHelper.createCItemTag(ToolUtils.transformMaterialNames(conditionalMaterial) + "_tool_materials");

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


    private @NotNull ICondition createTagNotEmptyConditions(TagKey<Item> mainTag, String baseMaterialName, @Nullable TagKey<Item> optionalTag) {
        List<ICondition> andConditions = new ArrayList<>();

        andConditions.add(new NotCondition(new TagEmptyCondition<>(mainTag)));

        if (optionalTag != null) {
            andConditions.add(new NotCondition(new TagEmptyCondition<>(optionalTag)));
        }

        List<TagKey<Item>> materialTags = ModTags.getPossibleTagsForMaterial(baseMaterialName);
        List<ICondition> materialTagConditions = new ArrayList<>();
        for (TagKey<Item> tag : materialTags) {
            materialTagConditions.add(new NotCondition(new TagEmptyCondition<>(tag)));
        }

        if (!materialTagConditions.isEmpty()) {
            andConditions.add(new OrCondition(materialTagConditions));
        }

        return new AndCondition(andConditions);
    }

}