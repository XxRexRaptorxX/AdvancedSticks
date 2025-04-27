package xxrexraptorxx.advancedtools.compat;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiInfoRecipe;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.List;

@EmiEntrypoint
public class EMIIntegration implements EmiPlugin {

    @Override
    public void register(EmiRegistry registry) {
        if (Config.JEI_DESCRIPTION.get()) {
            for (String handle : ModItems.HANDLE_MATERIALS) {
                for (String base : ModItems.TOOL_HEAD_MATERIALS) {;
                    for (String tool : ModItems.TOOL_TYPES) {
                        ItemStack stack = new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_" + tool)));

                        ResourceLocation recipeId = ItemModelGen.getItemLoc("info/" + handle + "_" + base + "_" + tool);
                        registry.addRecipe(new EmiInfoRecipe(List.of(EmiStack.of(stack)), List.of(ToolUtils.getToolStatDescription(handle, base)), recipeId));
                    }
                }
            }

            //VANILLA
            for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                for (String tool : ModItems.TOOL_TYPES) {

                    if (base.equals("wood") || base.equals("gold")) {
                        base = base + "en";
                    }
                    ResourceLocation recipeId = ItemModelGen.getItemLoc("info/" + base + "_" + tool);
                    ItemStack stack = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.withDefaultNamespace(base + "_" + tool)));

                    registry.addRecipe(new EmiInfoRecipe(List.of(EmiStack.of(stack)), List.of(ToolUtils.getToolStatDescription("wood", base)), recipeId));
                }
            }
        }
   }





}