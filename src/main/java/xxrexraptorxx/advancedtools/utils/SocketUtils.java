package xxrexraptorxx.advancedtools.utils;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import xxrexraptorxx.advancedtools.items.UpgradeItem;
import xxrexraptorxx.advancedtools.main.AdvancedTools;
import xxrexraptorxx.advancedtools.registry.ModComponents;
import xxrexraptorxx.advancedtools.utils.enums.Upgrades;
import xxrexraptorxx.advancedtools.utils.sockets.ISocketTool;

import java.util.ArrayList;
import java.util.List;

public class SocketUtils {

    public static final String SEPARATOR = ";";
    public static final String EMPTY_SLOT = Items.AIR.toString();
    public static final String EMPTY_STACK = EMPTY_SLOT + SEPARATOR + "1";

    public static void setSockets(ItemStack stack, List<String> socketStrings) {
        stack.set(ModComponents.SOCKETS.value(), socketStrings);
    }


    public static List<String> getSockets(ItemStack stack) {
        return stack.get(ModComponents.SOCKETS.value());
    }


    // Format: "modid:itemname;count"
    public static String serializeItemStack(ItemStack stack) {
        if (stack.isEmpty()) return EMPTY_STACK;
        return BuiltInRegistries.ITEM.getKey(stack.getItem()) + SEPARATOR + stack.getCount();
    }


    public static ItemStack deserializeItemStack(String entry) {
        String[] parts = entry.split(SEPARATOR);
        if (parts.length != 2) return ItemStack.EMPTY;

        ResourceLocation id = ResourceLocation.parse(parts[0]);
        int count = Integer.parseInt(parts[1]);

        Item item = BuiltInRegistries.ITEM.getValue(id);
        if (item == null) return ItemStack.EMPTY;

        return new ItemStack(item, count);
    }


    public static List<String> toStringList(List<ItemStack> stacks) {
        return stacks.stream().map(SocketUtils::serializeItemStack).toList();
    }


    public static List<ItemStack> fromStringList(List<String> entries) {
        return entries.stream().map(SocketUtils::deserializeItemStack).toList();
    }


    public static boolean hasSockets(ItemStack stack) {
        return stack.has(ModComponents.SOCKETS.get());
    }


    public static boolean hasEmptySocket(ItemStack stack) {
        if (!hasSockets(stack)) return false;

        List<String> sockets = stack.get(ModComponents.SOCKETS.get());
        return sockets.stream().anyMatch(s -> s.startsWith(EMPTY_SLOT));
    }


    public static boolean allSocketsEmpty(ItemStack stack) {
        if (!hasSockets(stack)) return false;

        List<String> sockets = stack.get(ModComponents.SOCKETS.get());
        return sockets.stream().allMatch(s -> s.startsWith(EMPTY_SLOT));
    }


    public static boolean insertOrStackUpgrade(ItemStack tool, ItemStack upgrade) {
        if (!(tool.getItem() instanceof ISocketTool socketTool)) return false;
        if (!(upgrade.getItem() instanceof UpgradeItem upItem)) return false;

        AdvancedTools.LOGGER.info("Try to place a " + upItem + " into a " + tool.getItem());
        int maxSlots = socketTool.getSocketCount(tool);

        // 1) Read raw string list and make it mutable
        List<String> raw = new ArrayList<>(SocketUtils.getSockets(tool));
        // Pad with empty slots if needed
        String empty = SocketUtils.serializeItemStack(ItemStack.EMPTY); // "minecraft:air;1"
        while (raw.size() < maxSlots) {
            raw.add(empty);
        }
        if (raw.size() > maxSlots) {
            raw = new ArrayList<>(raw.subList(0, maxSlots));
        }

        // 2) Deserialize into a mutable list of ItemStacks
        List<ItemStack> stacks = new ArrayList<>(SocketUtils.fromStringList(raw));
        AdvancedTools.LOGGER.info("Old socket list: " + SocketUtils.toStringList(stacks));

        // 3) Try stacking into an existing socket
        int maxCount = Upgrades.fromItem(upItem).get().getMaxCount();
        for (int i = 0; i < stacks.size(); i++) {
            ItemStack s = stacks.get(i);
            if (s.getItem() == upgrade.getItem() && s.getCount() < maxCount) {
                s.grow(1);
                // write back
                SocketUtils.setSockets(tool, SocketUtils.toStringList(stacks));

                AdvancedTools.LOGGER.info("New socket list: " + SocketUtils.toStringList(stacks));
                return true;
            }
        }

        // 4) Otherwise insert into the first empty slot
        for (int i = 0; i < stacks.size(); i++) {
            ItemStack s = stacks.get(i);
            if (s.isEmpty() || s.getItem() == Items.AIR) {
                stacks.set(i, new ItemStack(upgrade.getItem(), 1));
                SocketUtils.setSockets(tool, SocketUtils.toStringList(stacks));

                AdvancedTools.LOGGER.info("New socket list: " + SocketUtils.toStringList(stacks));
                return true;
            }
        }

        AdvancedTools.LOGGER.info("No free sockets!");
        return false;
    }


    // public static void applySocketEffects(ItemStack stack) {
    // if (!stack.has(ModComponents.SOCKET_COMPONENT.get())) return;

    // ModComponents.SocketData socketData = stack.get(ModComponents.SOCKET_COMPONENT.get());
    // Set<Item> socketItems = socketData.sockets().stream()
    // .map(ItemStack::getItem)
    // .collect(Collectors.toSet());

    // if (socketItems.contains(Items.EMERALD)) {
    // stack.set(DataComponents.RARITY, Rarity.EPIC);

    // } else if (socketItems.contains(Items.DIAMOND)) {
    // stack.set(DataComponents.RARITY, Rarity.RARE);
    // }


    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // stack.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION));

    // } else if (socketItems.contains(Items.REDSTONE)) {
    // stack.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_FIRE));
    // }


    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.ATTACK_KNOCKBACK, 1.0F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.ATTACK_KNOCKBACK, 2.0F);
    // }


    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.LUCK, 1.0F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.LUCK, 2.0F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.ATTACK_DAMAGE, 4.0F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.ATTACK_DAMAGE, 8.0F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.ATTACK_SPEED, 0.1F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.ATTACK_SPEED, 0.2F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.BLOCK_BREAK_SPEED, 0.1F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.BLOCK_BREAK_SPEED, 0.2F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.MINING_EFFICIENCY, 0.1F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.MINING_EFFICIENCY, 0.2F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.SUBMERGED_MINING_SPEED, 0.1F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.SUBMERGED_MINING_SPEED, 0.2F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.BLOCK_INTERACTION_RANGE, 1.0F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.BLOCK_INTERACTION_RANGE, 2.0F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.ENTITY_INTERACTION_RANGE, 1.0F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.ENTITY_INTERACTION_RANGE, 2.0F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.SWEEPING_DAMAGE_RATIO, 0.3F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.SWEEPING_DAMAGE_RATIO, 0.5F);
    // }

    // if (socketItems.contains(Items.IRON_NUGGET)) {
    // setAttributes(stack, Attributes.ARMOR, 1.0F);
    // } else if (socketItems.contains(Items.REDSTONE)) {
    // setAttributes(stack, Attributes.ARMOR, 2.0F);
    // }
    // }


    public static void setAttributes(ItemStack stack, Holder<Attribute> attribute, float amount) {
        final var modifiers = stack.getOrDefault(DataComponents.ATTRIBUTE_MODIFIERS, ItemAttributeModifiers.EMPTY);
        final var attackDamageModifier = new AttributeModifier(ResourceLocation.parse(attribute.getRegisteredName()), amount, AttributeModifier.Operation.ADD_VALUE);
        final var newModifiers = modifiers.withModifierAdded(attribute, attackDamageModifier, EquipmentSlotGroup.MAINHAND);

        stack.set(DataComponents.ATTRIBUTE_MODIFIERS, newModifiers);
    }


}
