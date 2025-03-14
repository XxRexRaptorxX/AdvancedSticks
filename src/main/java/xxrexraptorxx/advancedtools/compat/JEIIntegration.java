package xxrexraptorxx.advancedtools.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import xxrexraptorxx.advancedtools.datagen.ItemModelGen;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.Config;
import xxrexraptorxx.advancedtools.utils.ToolMaterialStatTypes;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

@JeiPlugin
public class JEIIntegration implements IModPlugin {

    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(References.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registry) {
        IIngredientManager ingredientManager = registry.getIngredientManager();
        String textSeparator = ": ";
        String lineSeperator = "\n";

        if (Config.JEI_DESCRIPTION.get()) {
            for (String handle : ModItems.HANDLE_MATERIALS) {
                for (String base : ModItems.BASE_MATERIALS) {
                    ToolMaterial material = ToolUtils.getTMfromStrings(handle, base);

                    MutableComponent description = Component.literal("Material Stats").append(textSeparator).withStyle(ChatFormatting.DARK_GRAY);
                    description.append(
                            Component.literal(base + " - " + handle).append(lineSeperator + lineSeperator).withStyle(ChatFormatting.WHITE)
                    );

                    description.append(
                            Component.translatable("message." + References.MODID + ".mining_level.jei_desc")
                                    .append(textSeparator)
                                    .withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.UNDERLINE)
                    );
                    description.append(
                            Component.literal("      " + ToolUtils.getMiningLevel(material.incorrectBlocksForDrops())).withStyle(getToolStatsFormatting(material, ToolMaterialStatTypes.MINING_LEVEL))
                    );


                    description.append(Component.literal(lineSeperator));
                    description.append(
                            Component.translatable("message." + References.MODID + ".durability.jei_desc")
                                    .append(textSeparator).withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.UNDERLINE)
                    );

                    description.append(
                            Component.literal("         " + material.durability()).withStyle(getToolStatsFormatting(material, ToolMaterialStatTypes.DURABILITY))
                    );


                    description.append(Component.literal(lineSeperator));
                    description.append(
                            Component.translatable("message." + References.MODID + ".mining_speed.jei_desc")
                                    .append(textSeparator).withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.UNDERLINE)
                    );

                    description.append(
                            Component.literal("      " + material.speed()).withStyle(getToolStatsFormatting(material, ToolMaterialStatTypes.MINING_SPEED))
                    );

                    description.append(Component.literal(lineSeperator));
                    description.append(
                            Component.translatable("message." + References.MODID + ".damage.jei_desc")
                                    .append(textSeparator).withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.UNDERLINE)
                    );

                    description.append(
                            Component.literal("            " + material.attackDamageBonus()).withStyle(getToolStatsFormatting(material, ToolMaterialStatTypes.DAMAGE))
                    );


                    description.append(Component.literal(lineSeperator));
                    description.append(
                            Component.translatable("message." + References.MODID + ".enchantability.jei_desc")
                                    .append(textSeparator).withStyle(ChatFormatting.DARK_GRAY, ChatFormatting.UNDERLINE)
                    );

                    description.append(
                            Component.literal("    " + material.enchantmentValue()).withStyle(getToolStatsFormatting(material, ToolMaterialStatTypes.ENCHANTABILITY))
                    );
                    registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_sword"))), VanillaTypes.ITEM_STACK, description);
                    registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_pickaxe"))), VanillaTypes.ITEM_STACK, description);
                    registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_axe"))), VanillaTypes.ITEM_STACK, description);
                    registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_shovel"))), VanillaTypes.ITEM_STACK, description);
                    registry.addIngredientInfo(new ItemStack(BuiltInRegistries.ITEM.getValue(ItemModelGen.getItemLoc(handle + "_stick_" + base + "_hoe"))), VanillaTypes.ITEM_STACK, description);
                }
            }
        }
   }


   private static ChatFormatting getToolStatsFormatting(ToolMaterial material, ToolMaterialStatTypes type) {
        ChatFormatting bad = ChatFormatting.RED;
        ChatFormatting okay = ChatFormatting.GOLD;
        ChatFormatting normal = ChatFormatting.WHITE;
        ChatFormatting good = ChatFormatting.YELLOW;
        ChatFormatting top = ChatFormatting.GREEN;

        switch (type) {
            case MINING_LEVEL:
                if (ToolUtils.getMiningLevel(material.incorrectBlocksForDrops()) <= 0) return bad;
                if (ToolUtils.getMiningLevel(material.incorrectBlocksForDrops()) == 1) return okay;
                if (ToolUtils.getMiningLevel(material.incorrectBlocksForDrops()) == 2) return normal;
                if (ToolUtils.getMiningLevel(material.incorrectBlocksForDrops()) == 3) return good;
                return top;

            case DURABILITY:
                if (material.durability() < 200) return bad;
                if (material.durability() < 600) return okay;
                if (material.durability() < 2000) return normal;
                if (material.durability() < 3000) return good;
                return top;

            case DAMAGE:
                if (material.attackDamageBonus() < 1.5) return bad;
                if (material.attackDamageBonus() < 2.5) return okay;
                if (material.attackDamageBonus() < 3.5) return normal;
                if (material.attackDamageBonus() < 4.5) return good;
                return top;

            case MINING_SPEED:
                if (material.speed() < 2.5) return bad;
                if (material.speed() < 4.0) return okay;
                if (material.speed() < 5.5) return normal;
                if (material.speed() < 7.0) return good;
                return top;

            case ENCHANTABILITY:
                if (material.enchantmentValue() < 8) return bad;
                if (material.enchantmentValue() < 15) return okay;
                if (material.enchantmentValue() < 25) return normal;
                if (material.enchantmentValue() < 32) return good;
                return top;

            case ATTACK_SPEED:
                AdvancedTools.LOGGER.error("Not yet implemented!");
                return normal;
        }

        AdvancedTools.LOGGER.error("Error with material: " + material);
        return normal;
   }


}