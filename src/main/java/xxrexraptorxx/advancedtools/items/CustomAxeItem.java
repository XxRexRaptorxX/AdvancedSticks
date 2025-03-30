package xxrexraptorxx.advancedtools.items;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.advancedtools.utils.ToolUtils;

import java.util.Objects;

public class CustomAxeItem extends AxeItem {

    public CustomAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }


    @Override
    public Component getName(ItemStack stack) {
        return ToolUtils.getVanillaToolTranslationKey(this);
    }


    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, @Nullable EquipmentSlot slot) {
        String name = BuiltInRegistries.ITEM.getKey(this).getPath();
        int index = name.indexOf("_");
        String handle = name.substring(0, index);

        if (entity instanceof LivingEntity player && player.getMainHandItem().getItem().equals(this) && !level.isClientSide) {

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
