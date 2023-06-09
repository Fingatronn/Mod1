
package net.mcreator.prob.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.prob.init.ProbModTabs;

import java.util.List;

public class HotIronItem extends Item {
	public HotIronItem() {
		super(new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("1200K Fe"));
	}
}
