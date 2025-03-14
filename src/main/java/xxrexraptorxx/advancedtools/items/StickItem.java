package xxrexraptorxx.advancedtools.items;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Objects;

public class StickItem extends Item {

    public StickItem(Properties properties) {
        super(properties);
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return this == BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_enchanted"));
    }


    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        String name = BuiltInRegistries.ITEM.getKey(this).getPath().replace("stick_", "");

        if (isSelected && entity instanceof LivingEntity player && !level.isClientSide) {

            if (ToolUtils.getHandleMaterialEffect(name) != null) {
                player.addEffect(Objects.requireNonNull(ToolUtils.getHandleMaterialEffect(name)));
            }
            if (ToolUtils.getHandleMaterialRandomEffect(name) != null && level.random.nextInt(1000) == 1) {
                player.addEffect(Objects.requireNonNull(ToolUtils.getHandleMaterialRandomEffect(name)));
            }
        }

        super.inventoryTick(stack, level, entity, slotId, isSelected);
    }

}
