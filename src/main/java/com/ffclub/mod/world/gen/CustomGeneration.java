package com.ffclub.mod.world.gen;

import com.ffclub.mod.lists.BlockList;
import com.ffclub.mod.lists.FeatureList;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomGeneration {

	private static void setupOreGeneration() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			biome.addFeature(Decoration.UNDERGROUND_ORES,
					Feature.ORE
							.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
									BlockList.EXILE_ORE.get().getDefaultState(), 6))
							.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(6, 5, 0, 15))));
		}
	}

	private static void generateBushes() {
		ForgeRegistries.BIOMES.forEach(biome -> {
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					Feature.RANDOM_PATCH.withConfiguration(FeatureList.BUSH_CONFIG)
							.withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(3))));
		});
	}

	public static void generate() {
		setupOreGeneration();
		generateBushes();
	}

}
