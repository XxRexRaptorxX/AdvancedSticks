package xxrexraptorxx.advancedtools.items;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import xxrexraptorxx.advancedtools.registry.ModItems;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Objects;

public class CustomBowItem extends BowItem {

    public CustomBowItem(Properties properties) {
        super(properties);
    }


    @Override
    public int getDefaultProjectileRange() {
        if (this == ModItems.IRON_BOW.get()) return 20;
        if (this == ModItems.GOLD_BOW.get()) return 25;
        if (this == ModItems.DIAMOND_BOW.get()) return 30;
        if (this == ModItems.NETHERITE_BOW.get()) return 35;
        return super.getDefaultProjectileRange();
    }


    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        String name = BuiltInRegistries.ITEM.getKey(this).getPath();
        int index = name.indexOf("_");
        String handle = name.substring(0, index);

        if (isSelected && entity instanceof LivingEntity player && !level.isClientSide) {

            if (ToolUtils.getHandleMaterialEffect(handle) != null) {
                player.addEffect(Objects.requireNonNull(ToolUtils.getHandleMaterialEffect(handle)));
            }
            if (ToolUtils.getHandleMaterialRandomEffect(handle) != null && level.random.nextInt(1000) == 1) {
                player.addEffect(Objects.requireNonNull(ToolUtils.getHandleMaterialRandomEffect(handle)));
            }
        }

        super.inventoryTick(stack, level, entity, slotId, isSelected);
    }

}
