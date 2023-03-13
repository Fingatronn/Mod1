package net.mcreator.prob.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModBlocks;

public class ConductiveIronFenceParticleSpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 3, z))).getBlock() == ProbModBlocks.DISTILLER_CONTROL_PANEL.get()) {
			return true;
		}
		return false;
	}
}
