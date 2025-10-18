package xxrexraptorxx.advancedtools.utils.enums;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import xxrexraptorxx.advancedtools.items.UpgradeItem;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.magmacore.content.TagHelper;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Upgrades {

    EMPTY_UPGRADE(0, null, null, null),
    RARITY_UPGRADE(3, TagHelper.createItemTag(References.MODID, "rarity_upgrade_materials"), null, DataComponents.RARITY),
    NETHERITE_UPGRADE(1, TagHelper.createItemTag(References.MODID, "netherite_upgrade_materials"), null, DataComponents.DAMAGE_RESISTANT),
    OBSIDIAN_UPGRADE(1, TagHelper.createItemTag(References.MODID, "obsidian_upgrade_materials"), null, DataComponents.DAMAGE_RESISTANT),
    KNOCKBACK_UPGRADE(10, TagHelper.createItemTag(References.MODID, "knockback_upgrade_materials"), Attributes.ATTACK_KNOCKBACK, null),
    DAMAGE_UPGRADE(10, TagHelper.createItemTag(References.MODID, "damage_upgrade_materials"), Attributes.LUCK, null),
    SPEED_UPGRADE(10, TagHelper.createItemTag(References.MODID, "speed_upgrade_materials"), Attributes.ATTACK_DAMAGE, null),
    LUCK_UPGRADE(10, TagHelper.createItemTag(References.MODID, "luck_upgrade_materials"), Attributes.ATTACK_SPEED, null),
    EFFICIENCY_UPGRADE(10, TagHelper.createItemTag(References.MODID, "efficiency_upgrade_materials"), Attributes.BLOCK_BREAK_SPEED, null),
    UNDERWATER_UPGRADE(10, TagHelper.createItemTag(References.MODID, "underwater_upgrade_materials"), Attributes.MINING_EFFICIENCY, null),
    ATTACKRANGE_UPGRADE(10, TagHelper.createItemTag(References.MODID, "attack_range_upgrade_materials"), Attributes.SUBMERGED_MINING_SPEED, null),
    MININGRANGE_UPGRADE(10, TagHelper.createItemTag(References.MODID, "mining_range_upgrade_materials"), Attributes.BLOCK_INTERACTION_RANGE, null),
    SWEEPING_UPGRADE(10, TagHelper.createItemTag(References.MODID, "sweeping_upgrade_materials"), Attributes.ENTITY_INTERACTION_RANGE, null),
    PROTECTION_UPGRADE(5, TagHelper.createItemTag(References.MODID, "protection_upgrade_materials"), Attributes.SWEEPING_DAMAGE_RATIO, null);

    private static final Map<ResourceLocation, Upgrades> ITEM_TO_UPGRADE;
    private final int maxCount;
    private final TagKey<Item> craftingTag;
    private final Holder<Attribute> attribute;
    private final DataComponentType<?> component;


    Upgrades(int maxCount, TagKey<Item> craftingTag, Holder<Attribute> attribute, DataComponentType<?> component) {
        this.maxCount = maxCount;
        this.craftingTag = craftingTag;
        this.attribute = attribute;
        this.component = component;
    }


    public int getMaxCount() {
        return maxCount;
    }


    public TagKey<Item> getCraftingTag() {
        return craftingTag;
    }


    public Holder<Attribute> getAttribute() {
        return attribute;
    }


    public DataComponentType<?> getComponent() {
        return component;
    }


    public String getName() {
        return name().toLowerCase();
    }


    static {
        ITEM_TO_UPGRADE = Arrays.stream(values())
                .collect(Collectors.toMap(u -> ResourceLocation.fromNamespaceAndPath(References.MODID, u.name().toLowerCase()), Function.identity()));
    }


    public static Optional<Upgrades> fromItem(Item item) {
        if (!(item instanceof UpgradeItem)) {
            return Optional.empty();
        }
        ResourceLocation key = BuiltInRegistries.ITEM.getKey(item);
        return Optional.ofNullable(ITEM_TO_UPGRADE.get(key));
    }
}
