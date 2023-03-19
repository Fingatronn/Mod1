
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.prob.block.UraniumOreBlock;
import net.mcreator.prob.block.UraniumBlockBlock;
import net.mcreator.prob.block.TriniumOreBlock;
import net.mcreator.prob.block.TriniumBlockBlock;
import net.mcreator.prob.block.TitatiumOreBlock;
import net.mcreator.prob.block.TitatiumBlockBlock;
import net.mcreator.prob.block.TinOreBlock;
import net.mcreator.prob.block.TinBlockBlock;
import net.mcreator.prob.block.SurvivalgeneratorBlock;
import net.mcreator.prob.block.SteelBlockBlock;
import net.mcreator.prob.block.SteamBlock;
import net.mcreator.prob.block.SaltOreBlock;
import net.mcreator.prob.block.SaltBlockBlock;
import net.mcreator.prob.block.PumpBlock;
import net.mcreator.prob.block.PlatinaOreBlock;
import net.mcreator.prob.block.PlatinaBlockBlock;
import net.mcreator.prob.block.OxygenBlock;
import net.mcreator.prob.block.OsmiumOreBlock;
import net.mcreator.prob.block.OsmiumBlockBlock;
import net.mcreator.prob.block.OilRefineryBlock;
import net.mcreator.prob.block.OilBlock;
import net.mcreator.prob.block.NitrogenBlock;
import net.mcreator.prob.block.NitricAcidBlock;
import net.mcreator.prob.block.NickelOreBlock;
import net.mcreator.prob.block.NickelBlockBlock;
import net.mcreator.prob.block.NatriumBlockBlock;
import net.mcreator.prob.block.NaquadahOreBlock;
import net.mcreator.prob.block.NaquadahGeneratorBlock;
import net.mcreator.prob.block.NaquadahBlockBlock;
import net.mcreator.prob.block.MudBlock;
import net.mcreator.prob.block.MilitaryChestBlock;
import net.mcreator.prob.block.MethanBlock;
import net.mcreator.prob.block.Machinechasislvl1Block;
import net.mcreator.prob.block.LithiumOreBlock;
import net.mcreator.prob.block.LithiumBlockBlock;
import net.mcreator.prob.block.KerozineBlock;
import net.mcreator.prob.block.InfiniteWaterBlock;
import net.mcreator.prob.block.HydrogenBlock;
import net.mcreator.prob.block.GasolineBlock;
import net.mcreator.prob.block.EthanBlock;
import net.mcreator.prob.block.DustsmelterBlock;
import net.mcreator.prob.block.DistillerDownBlock;
import net.mcreator.prob.block.DistillerControlPanelBlock;
import net.mcreator.prob.block.DistillationTankBlock;
import net.mcreator.prob.block.Crusherlvl2Block;
import net.mcreator.prob.block.Crusherlvl1Block;
import net.mcreator.prob.block.CopperOreBlock;
import net.mcreator.prob.block.CopperBlockBlock;
import net.mcreator.prob.block.ConductiveIronStairsBlock;
import net.mcreator.prob.block.ConductiveIronFenceBlock;
import net.mcreator.prob.block.ConductiveIronBlockBlock;
import net.mcreator.prob.block.CobaltOreBlock;
import net.mcreator.prob.block.CobaltBlockBlock;
import net.mcreator.prob.block.ChloreBlock;
import net.mcreator.prob.block.ChemicalReactorBlock;
import net.mcreator.prob.block.C4Block;
import net.mcreator.prob.block.BronzeBlockBlock;
import net.mcreator.prob.block.BoilerBlock;
import net.mcreator.prob.block.AmmoniaBlock;
import net.mcreator.prob.block.AluminiumOreBlock;
import net.mcreator.prob.block.AluminiumBlockBlock;
import net.mcreator.prob.block.Alloysmelterlvl2Block;
import net.mcreator.prob.block.Alloysmelterlvl1Block;
import net.mcreator.prob.ProbMod;

public class ProbModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ProbMod.MODID);
	public static final RegistryObject<Block> PLATINA_ORE = REGISTRY.register("platina_ore", () -> new PlatinaOreBlock());
	public static final RegistryObject<Block> PLATINA_BLOCK = REGISTRY.register("platina_block", () -> new PlatinaBlockBlock());
	public static final RegistryObject<Block> COPPER_BLOCK = REGISTRY.register("copper_block", () -> new CopperBlockBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> NAQUADAH_ORE = REGISTRY.register("naquadah_ore", () -> new NaquadahOreBlock());
	public static final RegistryObject<Block> NAQUADAH_BLOCK = REGISTRY.register("naquadah_block", () -> new NaquadahBlockBlock());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOreBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> C_4 = REGISTRY.register("c_4", () -> new C4Block());
	public static final RegistryObject<Block> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreBlock());
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> MILITARY_CHEST = REGISTRY.register("military_chest", () -> new MilitaryChestBlock());
	public static final RegistryObject<Block> ALLOYSMELTERLVL_1 = REGISTRY.register("alloysmelterlvl_1", () -> new Alloysmelterlvl1Block());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> CONDUCTIVE_IRON_BLOCK = REGISTRY.register("conductive_iron_block",
			() -> new ConductiveIronBlockBlock());
	public static final RegistryObject<Block> CRUSHERLVL_1 = REGISTRY.register("crusherlvl_1", () -> new Crusherlvl1Block());
	public static final RegistryObject<Block> STEAM = REGISTRY.register("steam", () -> new SteamBlock());
	public static final RegistryObject<Block> BOILER = REGISTRY.register("boiler", () -> new BoilerBlock());
	public static final RegistryObject<Block> INFINITE_WATER = REGISTRY.register("infinite_water", () -> new InfiniteWaterBlock());
	public static final RegistryObject<Block> SURVIVALGENERATOR = REGISTRY.register("survivalgenerator", () -> new SurvivalgeneratorBlock());
	public static final RegistryObject<Block> ALLOYSMELTERLVL_2 = REGISTRY.register("alloysmelterlvl_2", () -> new Alloysmelterlvl2Block());
	public static final RegistryObject<Block> COPPER_ORE = REGISTRY.register("copper_ore", () -> new CopperOreBlock());
	public static final RegistryObject<Block> NAQUADAH_GENERATOR = REGISTRY.register("naquadah_generator", () -> new NaquadahGeneratorBlock());
	public static final RegistryObject<Block> OSMIUM_ORE = REGISTRY.register("osmium_ore", () -> new OsmiumOreBlock());
	public static final RegistryObject<Block> OSMIUM_BLOCK = REGISTRY.register("osmium_block", () -> new OsmiumBlockBlock());
	public static final RegistryObject<Block> DUSTSMELTER = REGISTRY.register("dustsmelter", () -> new DustsmelterBlock());
	public static final RegistryObject<Block> CRUSHERLVL_2 = REGISTRY.register("crusherlvl_2", () -> new Crusherlvl2Block());
	public static final RegistryObject<Block> OIL_REFINERY = REGISTRY.register("oil_refinery", () -> new OilRefineryBlock());
	public static final RegistryObject<Block> METHAN = REGISTRY.register("methan", () -> new MethanBlock());
	public static final RegistryObject<Block> ETHAN = REGISTRY.register("ethan", () -> new EthanBlock());
	public static final RegistryObject<Block> GASOLINE = REGISTRY.register("gasoline", () -> new GasolineBlock());
	public static final RegistryObject<Block> KEROZINE = REGISTRY.register("kerozine", () -> new KerozineBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> LITHIUM_ORE = REGISTRY.register("lithium_ore", () -> new LithiumOreBlock());
	public static final RegistryObject<Block> LITHIUM_BLOCK = REGISTRY.register("lithium_block", () -> new LithiumBlockBlock());
	public static final RegistryObject<Block> TITATIUM_ORE = REGISTRY.register("titatium_ore", () -> new TitatiumOreBlock());
	public static final RegistryObject<Block> TITATIUM_BLOCK = REGISTRY.register("titatium_block", () -> new TitatiumBlockBlock());
	public static final RegistryObject<Block> SALT_ORE = REGISTRY.register("salt_ore", () -> new SaltOreBlock());
	public static final RegistryObject<Block> SALT_BLOCK = REGISTRY.register("salt_block", () -> new SaltBlockBlock());
	public static final RegistryObject<Block> CHEMICAL_REACTOR = REGISTRY.register("chemical_reactor", () -> new ChemicalReactorBlock());
	public static final RegistryObject<Block> COBALT_ORE = REGISTRY.register("cobalt_ore", () -> new CobaltOreBlock());
	public static final RegistryObject<Block> COBALT_BLOCK = REGISTRY.register("cobalt_block", () -> new CobaltBlockBlock());
	public static final RegistryObject<Block> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenBlock());
	public static final RegistryObject<Block> CHLORE = REGISTRY.register("chlore", () -> new ChloreBlock());
	public static final RegistryObject<Block> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenBlock());
	public static final RegistryObject<Block> NATRIUM_BLOCK = REGISTRY.register("natrium_block", () -> new NatriumBlockBlock());
	public static final RegistryObject<Block> NITROGEN = REGISTRY.register("nitrogen", () -> new NitrogenBlock());
	public static final RegistryObject<Block> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaBlock());
	public static final RegistryObject<Block> NITRIC_ACID = REGISTRY.register("nitric_acid", () -> new NitricAcidBlock());
	public static final RegistryObject<Block> TRINIUM_ORE = REGISTRY.register("trinium_ore", () -> new TriniumOreBlock());
	public static final RegistryObject<Block> TRINIUM_BLOCK = REGISTRY.register("trinium_block", () -> new TriniumBlockBlock());
	public static final RegistryObject<Block> MACHINECHASISLVL_1 = REGISTRY.register("machinechasislvl_1", () -> new Machinechasislvl1Block());
	public static final RegistryObject<Block> PUMP = REGISTRY.register("pump", () -> new PumpBlock());
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());
	public static final RegistryObject<Block> DISTILLATION_TANK = REGISTRY.register("distillation_tank", () -> new DistillationTankBlock());
	public static final RegistryObject<Block> CONDUCTIVE_IRON_STAIRS = REGISTRY.register("conductive_iron_stairs",
			() -> new ConductiveIronStairsBlock());
	public static final RegistryObject<Block> DISTILLER_CONTROL_PANEL = REGISTRY.register("distiller_control_panel",
			() -> new DistillerControlPanelBlock());
	public static final RegistryObject<Block> CONDUCTIVE_IRON_FENCE = REGISTRY.register("conductive_iron_fence",
			() -> new ConductiveIronFenceBlock());
	public static final RegistryObject<Block> DISTILLER_DOWN = REGISTRY.register("distiller_down", () -> new DistillerDownBlock());
}
