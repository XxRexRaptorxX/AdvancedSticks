package xxrexraptorxx.advancedtools.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.registry.ModToolMaterials;
import xxrexraptorxx.advancedtools.utils.enums.Materials;
import xxrexraptorxx.advancedtools.utils.enums.ToolMaterialStatTypes;
import xxrexraptorxx.magmacore.utils.FormattingHelper;

public class FormattingUtils {

    public static final String AT_INFIX = "_stick_";


    public static Component getHandleEffectNamesFromMaterial(String material) {
        if (ToolUtils.getHandleMaterialRandomEffect(material) != null) {
            MobEffect effect = ToolUtils.getHandleMaterialRandomEffect(material).getEffect().value();
            return FormattingHelper.setModLangComponent("message", References.MODID, "random").append(" " + effect.getDisplayName().getString()).withStyle(getMobEffectFormatting(effect));

        } else if (ToolUtils.getHandleMaterialEffect(material) != null) {
            MobEffect effect = ToolUtils.getHandleMaterialEffect(material).getEffect().value();
            return Component.literal(effect.getDisplayName().getString()).withStyle(getMobEffectFormatting(effect));
        }

        return Component.literal("      /").withStyle(ChatFormatting.RED);
    }


    public static Component getHeadEffectNamesFromMaterial(String material) {
        if (ToolUtils.getHeadMaterialRandomEffect(material) != null) {
            MobEffect effect = ToolUtils.getHeadMaterialRandomEffect(material).getEffect().value();
            return FormattingHelper.setModLangComponent("message", References.MODID, "random").append(" " + effect.getDisplayName().getString()).withStyle(getMobEffectFormatting(effect));

        } else if (ToolUtils.getHeadMaterialEffect(material) != null) {
            MobEffect effect = ToolUtils.getHeadMaterialEffect(material).getEffect().value();
            return Component.literal(effect.getDisplayName().getString()).withStyle(getMobEffectFormatting(effect));
        }

        return Component.literal("        /").withStyle(ChatFormatting.RED);
    }


    /**
     *  Converts the mining block tags to the old mining level format
     */
    public static int getMiningLevel(ToolMaterial material) {
        Materials headMaterial = Materials.fromName(ModToolMaterials.getHeadFromToolMaterial(material)).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + material.toString()));

        TagKey<Block> tag = headMaterial.getIncorrectForMaterialKey();

        if (tag.equals(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)) {
            return 4;

        } else if (tag.equals(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)) {
            return 3;

        } else if (tag.equals(BlockTags.INCORRECT_FOR_IRON_TOOL)) {
            return 2;

        } else if (tag.equals(BlockTags.INCORRECT_FOR_STONE_TOOL)) {
            return 1;

        } else if (tag.equals(BlockTags.INCORRECT_FOR_WOODEN_TOOL) || tag.equals(BlockTags.INCORRECT_FOR_GOLD_TOOL)) {
            return 0;

        } else {
            AdvancedTools.LOGGER.error("Unknown 'harvest'- block tag: " + tag.location());
            return 2;
        }
    }


    /**
     *   Gives the color for the tool material stats depending on the strength
     */
    public static ChatFormatting getToolStatsFormatting(ToolMaterial material, ToolMaterialStatTypes type) {
        ChatFormatting bad = ChatFormatting.DARK_RED;
        ChatFormatting okay = ChatFormatting.RED;
        ChatFormatting normal = ChatFormatting.YELLOW;
        ChatFormatting good = ChatFormatting.GREEN;
        ChatFormatting top = ChatFormatting.DARK_GREEN;

        switch (type) {
            case MINING_LEVEL:
                if (getMiningLevel(material) <= 0) return bad;
                if (getMiningLevel(material) == 1) return okay;
                if (getMiningLevel(material) == 2) return normal;
                if (getMiningLevel(material) == 3) return good;
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
                if (material.attackDamageBonus() < 4) return normal;
                if (material.attackDamageBonus() < 5.5) return good;
                return top;

            case MINING_SPEED:
                if (material.speed() < 2.5) return bad;
                if (material.speed() < 4.0) return okay;
                if (material.speed() < 7.0) return normal;
                if (material.speed() < 10.0) return good;
                return top;

            case ENCHANTABILITY:
                if (material.enchantmentValue() < 8) return bad;
                if (material.enchantmentValue() < 15) return okay;
                if (material.enchantmentValue() < 25) return normal;
                if (material.enchantmentValue() < 32) return good;
                return top;

            case SOCKETS:
                Materials headMaterial = Materials.fromName(ModToolMaterials.getHeadFromToolMaterial(material)).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + material.toString()));
                Materials handleMaterial = Materials.fromName(ModToolMaterials.getHandleFromToolMaterial(material)).orElseThrow(() -> new IllegalArgumentException("Unknown material: " + material.toString()));

                if (handleMaterial.getUpgradeSlots() + headMaterial.getUpgradeSlots() < 2) return bad;
                if (handleMaterial.getUpgradeSlots() + headMaterial.getUpgradeSlots() < 3) return okay;
                if (handleMaterial.getUpgradeSlots() + headMaterial.getUpgradeSlots() < 4) return normal;
                if (handleMaterial.getUpgradeSlots() + headMaterial.getUpgradeSlots() < 6) return good;
                return top;

            case ATTACK_SPEED:
                AdvancedTools.LOGGER.error("Not yet implemented!");
                return normal;
        }

        AdvancedTools.LOGGER.error("Error with material: " + material);
        return normal;
    }


    private static ChatFormatting getMobEffectFormatting(MobEffect effect) {
        if (effect.getCategory().equals(MobEffectCategory.HARMFUL)) {
            return ChatFormatting.DARK_RED;

        } else if (effect.getCategory().equals(MobEffectCategory.BENEFICIAL)) {
            return ChatFormatting.GREEN;

        } else {
            return ChatFormatting.YELLOW;
        }
    }

}
