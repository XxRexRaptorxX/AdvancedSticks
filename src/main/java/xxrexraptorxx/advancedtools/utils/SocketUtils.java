package xxrexraptorxx.advancedtools.utils;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import xxrexraptorxx.advancedtools.registry.ModComponents;

import java.util.Set;
import java.util.stream.Collectors;

public class SocketUtils {

    public static ModComponents.SocketData getSocketData(ItemStack stack) {
        if (!stack.has(ModComponents.SOCKET_COMPONENT.get())) {
            return ModComponents.SocketData.EMPTY;
        }
        return stack.get(ModComponents.SOCKET_COMPONENT.get());
    }


    public static boolean hasEmptySockets(ItemStack stack) {
        return getSocketData(stack).equals(ModComponents.SocketData.EMPTY);
    }


    public static boolean hasSockets(ItemStack stack) {
        return stack.has(ModComponents.SOCKET_COMPONENT.get());
    }


    public static void applySocketEffects(ItemStack stack) {
        if (!stack.has(ModComponents.SOCKET_COMPONENT.get())) return;

        ModComponents.SocketData socketData = stack.get(ModComponents.SOCKET_COMPONENT.get());
        Set<Item> socketItems = socketData.sockets().stream()
                .map(ItemStack::getItem)
                .collect(Collectors.toSet());

        if (socketItems.contains(Items.EMERALD)) {
            stack.set(DataComponents.RARITY, Rarity.EPIC);

        } else if (socketItems.contains(Items.DIAMOND)) {
            stack.set(DataComponents.RARITY, Rarity.RARE);
        }


        if (socketItems.contains(Items.IRON_NUGGET)) {
            stack.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION));

        } else if (socketItems.contains(Items.REDSTONE)) {
            stack.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE));
        }


        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.ATTACK_KNOCKBACK, 1.0F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.ATTACK_KNOCKBACK, 2.0F);
        }


        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.LUCK, 1.0F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.LUCK, 2.0F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.ATTACK_DAMAGE, 4.0F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.ATTACK_DAMAGE, 8.0F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.ATTACK_SPEED, 0.1F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.ATTACK_SPEED, 0.2F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.BLOCK_BREAK_SPEED, 0.1F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.BLOCK_BREAK_SPEED, 0.2F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.MINING_EFFICIENCY, 0.1F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.MINING_EFFICIENCY, 0.2F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.SUBMERGED_MINING_SPEED, 0.1F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.SUBMERGED_MINING_SPEED, 0.2F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.BLOCK_INTERACTION_RANGE, 1.0F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.BLOCK_INTERACTION_RANGE, 2.0F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.ENTITY_INTERACTION_RANGE, 1.0F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.ENTITY_INTERACTION_RANGE, 2.0F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.SWEEPING_DAMAGE_RATIO, 0.3F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.SWEEPING_DAMAGE_RATIO, 0.5F);
        }

        if (socketItems.contains(Items.IRON_NUGGET)) {
            setAttributes(stack, Attributes.ARMOR, 1.0F);
        } else if (socketItems.contains(Items.REDSTONE)) {
            setAttributes(stack, Attributes.ARMOR, 2.0F);
        }
    }


    public static void setAttributes(ItemStack stack, Holder<Attribute> attribute, float amount) {
        final var modifiers = stack.getOrDefault(DataComponents.ATTRIBUTE_MODIFIERS, ItemAttributeModifiers.EMPTY);
        final var attackDamageModifier = new AttributeModifier(ResourceLocation.parse(attribute.getRegisteredName()), amount, AttributeModifier.Operation.ADD_VALUE);
        final var newModifiers = modifiers.withModifierAdded(attribute, attackDamageModifier, EquipmentSlotGroup.MAINHAND);

        stack.set(DataComponents.ATTRIBUTE_MODIFIERS, newModifiers);
    }


}
