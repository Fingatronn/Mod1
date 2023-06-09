
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.prob.world.features.ores.UraniumOreFeature;
import net.mcreator.prob.world.features.ores.TriniumOreFeature;
import net.mcreator.prob.world.features.ores.TitatiumOreFeature;
import net.mcreator.prob.world.features.ores.TinOreFeature;
import net.mcreator.prob.world.features.ores.SaltOreFeature;
import net.mcreator.prob.world.features.ores.PlatinaOreFeature;
import net.mcreator.prob.world.features.ores.OsmiumOreFeature;
import net.mcreator.prob.world.features.ores.NickelOreFeature;
import net.mcreator.prob.world.features.ores.NaquadahOreFeature;
import net.mcreator.prob.world.features.ores.MudFeature;
import net.mcreator.prob.world.features.ores.LithiumOreFeature;
import net.mcreator.prob.world.features.ores.CopperOreFeature;
import net.mcreator.prob.world.features.ores.CobaltOreFeature;
import net.mcreator.prob.world.features.ores.AluminiumOreFeature;
import net.mcreator.prob.world.features.OilFeatureFeature;
import net.mcreator.prob.world.features.NitricAcidFeatureFeature;
import net.mcreator.prob.world.features.HydrogenFeatureFeature;
import net.mcreator.prob.world.features.EnchantedTreeFeature;
import net.mcreator.prob.world.features.ChloreFeatureFeature;
import net.mcreator.prob.ProbMod;

@Mod.EventBusSubscriber
public class ProbModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ProbMod.MODID);
	public static final RegistryObject<Feature<?>> PLATINA_ORE = REGISTRY.register("platina_ore", PlatinaOreFeature::feature);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::feature);
	public static final RegistryObject<Feature<?>> NAQUADAH_ORE = REGISTRY.register("naquadah_ore", NaquadahOreFeature::feature);
	public static final RegistryObject<Feature<?>> NICKEL_ORE = REGISTRY.register("nickel_ore", NickelOreFeature::feature);
	public static final RegistryObject<Feature<?>> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", AluminiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> COPPER_ORE = REGISTRY.register("copper_ore", CopperOreFeature::feature);
	public static final RegistryObject<Feature<?>> OSMIUM_ORE = REGISTRY.register("osmium_ore", OsmiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> URANIUM_ORE = REGISTRY.register("uranium_ore", UraniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> LITHIUM_ORE = REGISTRY.register("lithium_ore", LithiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> TITATIUM_ORE = REGISTRY.register("titatium_ore", TitatiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> SALT_ORE = REGISTRY.register("salt_ore", SaltOreFeature::feature);
	public static final RegistryObject<Feature<?>> COBALT_ORE = REGISTRY.register("cobalt_ore", CobaltOreFeature::feature);
	public static final RegistryObject<Feature<?>> TRINIUM_ORE = REGISTRY.register("trinium_ore", TriniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> MUD = REGISTRY.register("mud", MudFeature::feature);
	public static final RegistryObject<Feature<?>> OIL_FEATURE = REGISTRY.register("oil_feature", OilFeatureFeature::new);
	public static final RegistryObject<Feature<?>> CHLORE_FEATURE = REGISTRY.register("chlore_feature", ChloreFeatureFeature::new);
	public static final RegistryObject<Feature<?>> HYDROGEN_FEATURE = REGISTRY.register("hydrogen_feature", HydrogenFeatureFeature::new);
	public static final RegistryObject<Feature<?>> NITRIC_ACID_FEATURE = REGISTRY.register("nitric_acid_feature", NitricAcidFeatureFeature::new);
	public static final RegistryObject<Feature<?>> ENCHANTED_TREE = REGISTRY.register("enchanted_tree", EnchantedTreeFeature::feature);
}
