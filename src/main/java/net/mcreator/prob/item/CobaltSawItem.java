
package net.mcreator.prob.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CobaltSawItem extends AxeItem {
	public CobaltSawItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.69999999999999996f, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		IronSawBlockDestroyedWithToolProcedure.execute();
		return retval;
	}
}
