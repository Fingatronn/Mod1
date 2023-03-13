package net.mcreator.prob.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModFluids;
import net.mcreator.prob.init.ProbModBlocks;

import java.util.concurrent.atomic.AtomicInteger;

public class DistillationTankUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()
				&& (world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()
				&& (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()
				&& !((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock())
				&& (world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == ProbModBlocks.CONDUCTIVE_IRON_FENCE.get()) {
			world.setBlock(new BlockPos(x, y, z), ProbModBlocks.DISTILLER_CONTROL_PANEL.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ProbModBlocks.DISTILLER_CONTROL_PANEL.get()) {
			if (new Object() {
				public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
								.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
					return _retval.get();
				}
			}.getFluidTankLevel(world, new BlockPos(x, y - 1, z), 1) > 0) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = 1;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability
								.fill(new FluidStack(ProbModFluids.KEROZINE.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == ProbModBlocks.DISTILLER_CONTROL_PANEL.get()) {
			if (new Object() {
				public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null)
								.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
					return _retval.get();
				}
			}.getFluidTankLevel(world, new BlockPos(x, y - 2, z), 1) > 0) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = 1;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability
								.fill(new FluidStack(ProbModFluids.GASOLINE.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
				}
			}
		}
	}
}
