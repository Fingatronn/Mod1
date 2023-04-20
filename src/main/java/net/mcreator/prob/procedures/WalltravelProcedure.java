package net.mcreator.prob.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WalltravelProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ProbModItems.POLYETHYLEN_TETRAFLUORIDE.get()) {
			if ((entity.getDirection()) == Direction.EAST) {
				world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - 4, y, z), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - 4, y - 1, z), Blocks.STONE.defaultBlockState(), 3);
			}
			if ((entity.getDirection()) == Direction.WEST) {
				world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 4, y, z), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + 4, y - 1, z), Blocks.STONE.defaultBlockState(), 3);
			}
			if ((entity.getDirection()) == Direction.NORTH) {
				world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z + 4), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y - 1, z + 4), Blocks.STONE.defaultBlockState(), 3);
			}
			if ((entity.getDirection()) == Direction.SOUTH) {
				world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z - 4), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y - 1, z - 4), Blocks.STONE.defaultBlockState(), 3);
			}
		}
	}
}
