
package net.mcreator.prob.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.prob.init.ProbModTabs;
import net.mcreator.prob.init.ProbModItems;

public abstract class SteelArmorItem extends ArmorItem {
	public SteelArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 20;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 7, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 16;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ProbModItems.STEEL_INGOT.get()));
			}

			@Override
			public String getName() {
				return "steel_armor";
			}

			@Override
			public float getToughness() {
				return 1.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.30000000000000004f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SteelArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prob:textures/models/armor/steel_layer_1.png";
		}
	}

	public static class Chestplate extends SteelArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prob:textures/models/armor/steel_layer_1.png";
		}
	}

	public static class Leggings extends SteelArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prob:textures/models/armor/steel_layer_2.png";
		}
	}

	public static class Boots extends SteelArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "prob:textures/models/armor/steel_layer_1.png";
		}
	}
}
