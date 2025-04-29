package xxrexraptorxx.advancedtools.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.FormattingUtils;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

@JeiPlugin
public class JEIIntegration implements IModPlugin {

    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(References.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }


    @Override
    public void registerRecipes(@NotNull IRecipeRegistration registry) {
        if (Config.JEI_DESCRIPTION.get()) {
            for (String handle : ModItems.HANDLE_MATERIALS) {
                for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                    for (String tool : ModItems.TOOL_TYPES) {
                        registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + FormattingUtils.AT_INFIX + base + "_" + tool))), VanillaTypes.ITEM_STACK, ToolUtils.getToolStatDescription(handle, base));
                    }
                }
            }

            //VANILLA
            for (String base : ModItems.TOOL_HEAD_MATERIALS) {
                if (base.equals("wood") || base.equals("gold")) {
                    base = base + "en";
                }

                for (String tool : ModItems.TOOL_TYPES) {
                    registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.withDefaultNamespace(base + "_" + tool))), VanillaTypes.ITEM_STACK, ToolUtils.getToolStatDescription("wood", base));
                }
            }
        }
   }





}