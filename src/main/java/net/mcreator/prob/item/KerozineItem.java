
package net.mcreator.prob.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.prob.init.ProbModTabs;
import net.mcreator.prob.init.ProbModFluids;

public class KerozineItem extends BucketItem {
	public KerozineItem() {
		super(ProbModFluids.KEROZINE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(ProbModTabs.TAB_PROBAMOD));
	}
}
