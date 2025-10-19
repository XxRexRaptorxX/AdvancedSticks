package xxrexraptorxx.advancedtools.items;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.advancedtools.main.References;
import xxrexraptorxx.advancedtools.utils.ToolUtils;
import xxrexraptorxx.magmacore.content.ItemHelper;

import java.util.Objects;

public class RodItem extends Item {

    public RodItem(Properties properties) {
        super(properties);
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return this == BuiltInRegistries.ITEM.getValue(ResourceLocation.fromNamespaceAndPath(References.MODID, "stick_enchanted"));
    }


    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, @Nullable EquipmentSlot slot) {
        String name = ItemHelper.getPath(this);
        int index = name.indexOf("_");
        String handle = name.substring(0, index);

        if (entity instanceof LivingEntity player && player.getMainHandItem().getItem().equals(this) && !level.isClientSide()) {

            if (ToolUtils.getHandleMaterialEffect(handle) != null) {
                player.addEffect(Objects.requireNonNull(ToolUtils.getHandleMaterialEffect(handle)));
            }
            if (ToolUtils.getHandleMaterialRandomEffect(handle) != null && level.random.nextInt(1000) == 1) {
                player.addEffect(Objects.requireNonNull(ToolUtils.getHandleMaterialRandomEffect(handle)));
            }
        }

        super.inventoryTick(stack, level, entity, slot);
    }

}
