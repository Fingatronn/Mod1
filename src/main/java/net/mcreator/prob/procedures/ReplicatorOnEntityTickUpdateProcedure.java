package net.mcreator.prob.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModEntities;
import net.mcreator.prob.entity.ReplicatorEntity;

public class ReplicatorOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.IRON_ORE) {
			world.destroyBlock(new BlockPos(x, y - 1, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ReplicatorEntity(ProbModEntities.REPLICATOR.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.IRON_ORE) {
			world.destroyBlock(new BlockPos(x, y + 1, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ReplicatorEntity(ProbModEntities.REPLICATOR.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.IRON_ORE) {
			world.destroyBlock(new BlockPos(x + 1, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ReplicatorEntity(ProbModEntities.REPLICATOR.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.IRON_ORE) {
			world.destroyBlock(new BlockPos(x, y, z + 1), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ReplicatorEntity(ProbModEntities.REPLICATOR.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.IRON_ORE) {
			world.destroyBlock(new BlockPos(x, y, z - 1), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ReplicatorEntity(ProbModEntities.REPLICATOR.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.IRON_ORE) {
			world.destroyBlock(new BlockPos(x - 1, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ReplicatorEntity(ProbModEntities.REPLICATOR.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT) {
			world.destroyBlock(new BlockPos(x, y - 1, z), false);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT) {
			world.destroyBlock(new BlockPos(x, y + 1, z), false);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT) {
			world.destroyBlock(new BlockPos(x + 1, y, z), false);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT) {
			world.destroyBlock(new BlockPos(x, y, z + 1), false);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
			world.destroyBlock(new BlockPos(x, y, z - 1), false);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT) {
			world.destroyBlock(new BlockPos(x - 1, y, z), false);
		}
	}
}
