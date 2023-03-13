package net.mcreator.prob.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModBlocks;

public class ConductiveIronFenceUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 3, z))).getBlock() == ProbModBlocks.DISTILLER_CONTROL_PANEL.get()) {
			for (int index0 = 0; index0 < (int) (100000); index0++) {
				world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 0, 1, 0);
			}
		}
	}
}
