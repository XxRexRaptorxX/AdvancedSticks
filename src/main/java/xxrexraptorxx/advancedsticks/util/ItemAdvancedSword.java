package xxrexraptorxx.advancedsticks.util;

import com.google.common.collect.*;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemSword;

	public class ItemAdvancedSword extends ItemSword {

		private final float attackDamage;
		private final float attackSpeed;

		public ItemAdvancedSword(ToolMaterial material, float attackSpeed) {
			super(material);
			this.attackSpeed = attackSpeed;
			this.attackDamage = 3.0F + material.getDamageVsEntity();
		}


	@Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
        }                                                                                                                                   // attackspeed

        return multimap;
    }
}