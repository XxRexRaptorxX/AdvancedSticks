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
import xxrexraptorxx.advancedtools.items.UpgradeItem;
import xxrexraptorxx.advancedtools.registry.ModComponents;
import xxrexraptorxx.advancedtools.utils.enums.Upgrades;
import xxrexraptorxx.advancedtools.utils.sockets.ISocketTool;

import java.util.*;
import java.util.stream.Collectors;

public class SocketUtils {

    /**
     * Reads the SocketData (or returns EMPTY if not present).
     */
    public static ModComponents.SocketData getSocketData(ItemStack stack) {
        int maxSlots = 0;
        if (stack.getItem() instanceof ISocketTool tool) {
            maxSlots = tool.getSocketCount(stack);
        }

        // raw data (might contain old zeros)
        var raw = stack.has(ModComponents.SOCKET_COMPONENT.get())
                ? stack.get(ModComponents.SOCKET_COMPONENT.get()).sockets()
                : Collections.<ItemStack>emptyList();

        // 1) Clean any zero-count or truly empty stacks → AIR(1)
        List<ItemStack> cleaned = raw.stream()
                .map(s -> (s.isEmpty() || s.getCount() <= 0)
                        ? new ItemStack(Items.AIR, 1)
                        : s.copy()) // copy to avoid mutating original
                .collect(Collectors.toList());

        // 2) Pad up to maxSlots with AIR(1)
        while (cleaned.size() < maxSlots) {
            cleaned.add(new ItemStack(Items.AIR, 1));
        }
        // 3) If someone somehow wrote *too many*, truncate
        if (cleaned.size() > maxSlots) {
            cleaned = cleaned.subList(0, maxSlots);
        }

        return new ModComponents.SocketData(List.copyOf(cleaned));
    }


    /**
     * Writes the SocketData back onto the ItemStack.
     */
    public static void setSocketData(ItemStack stack, ModComponents.SocketData data) {
        stack.set(ModComponents.SOCKET_COMPONENT.get(), data);
    }


    /**
     * Tries to insert an upgrade into a socket or stack it onto an existing one.
     * Operates purely via NBT-DataComponent (no custom network codec needed).
     *
     * @param stack   The tool ItemStack.
     * @param upgrade The upgrade ItemStack (should be an instance of UpgradeItem).
     * @return true if any changes were made.
     */
    public static boolean addUpgrade(ItemStack stack, ItemStack upgrade) {
        //check tool and upgrade types
        if (!(stack.getItem() instanceof ISocketTool) || !(upgrade.getItem() instanceof UpgradeItem)) {
            return false;
        }

        ModComponents.SocketData data = getSocketData(stack);
        List<ItemStack> sockets = new ArrayList<>(data.sockets());

        //try stacking into an existing socket of the same type
        for (int i = 0; i < sockets.size(); i++) {
            ItemStack s = sockets.get(i);

            if (!s.isEmpty() && s.getItem() == upgrade.getItem()) {
                int current = s.getCount();
                int max = Upgrades.fromItem(upgrade.getItem()).get().getMaxCount();

                if (current < max) {
                    s.grow(1);
                    //write back
                    setSocketData(stack, new ModComponents.SocketData(List.copyOf(sockets)));
                    return true;

                } else {
                    //already at max stack
                    return false;
                }
            }
        }

        //insert into first empty slot
        int maxSlots = ISocketTool.getSocketCount(stack.getItem());
        // Ensure our list has exactly maxSlots entries
        while (sockets.size() < maxSlots) {
            sockets.add(ItemStack.EMPTY);
        }

        for (int i = 0; i < maxSlots; i++) {
            if (sockets.get(i).isEmpty()) {
                //create a new stack of size 1
                ItemStack newStack = new ItemStack(upgrade.getItem(), 1);
                sockets.set(i, newStack);
                setSocketData(stack, new ModComponents.SocketData(List.copyOf(sockets)));
                return true;
            }
        }

        //no empty socket found or nothing changed
        return false;
    }


    /**
     * Completely removes an upgrade from a socket.
     * @return true if a slot was cleared.
     */
    public static boolean removeUpgrade(ItemStack stack, ItemStack upgrade) {
        if (stack.getItem() instanceof ISocketTool) {
            ModComponents.SocketData data = getSocketData(stack);
            List<ItemStack> sockets = new ArrayList<>(data.sockets());

            for (int i = 0; i < sockets.size(); i++) {
                ItemStack s = sockets.get(i);

                if (!s.isEmpty() && s.getItem() == upgrade.getItem()) {
                    sockets.set(i, ItemStack.EMPTY);
                    setSocketData(stack, new ModComponents.SocketData(List.copyOf(sockets)));

                    return true;
                }
            }
        }

        return false;
    }


    /**
     * Checks if the item has at least one socket.
     */
    public static boolean hasSockets(ItemStack stack) {
        return stack.has(ModComponents.SOCKET_COMPONENT.get());
    }


    /**
     * Checks if the item has at least one empty socket.
     */
    public static boolean hasNoUpgrades(ItemStack stack) {
        return getSocketData(stack).equals(ModComponents.SocketData.EMPTY);
    }



    /**
     * Checks if the item has at least one free socket.
     */
    public static boolean hasEmptySocket(ItemStack stack) {
        return getSocketData(stack).sockets().stream().anyMatch(ItemStack::isEmpty);
    }


    /**
     * Optionally returns the index of the socket that contains the given upgrade.
     */
    public static Optional<Integer> getUpgradeSlotIndex(ItemStack stack, ItemStack upgrade) {
        List<ItemStack> sockets = getSocketData(stack).sockets();

        for (int i = 0; i < sockets.size(); i++) {
            if (!sockets.get(i).isEmpty() && sockets.get(i).getItem() == upgrade.getItem()) {

                return Optional.of(i);
            }
        }

        return Optional.empty();
    }


    public static boolean tryApplyUpgradeFromInventory(ItemStack tool, ItemStack upgrade) {
        if (tool.isEmpty() || upgrade.isEmpty()) return false;

        // Try to add the upgrade to the tool
        boolean success = addUpgrade(tool, upgrade);

        if (success) {
            upgrade.shrink(1);
            return true;
        }

        return false;
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
