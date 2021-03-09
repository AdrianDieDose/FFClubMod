package com.ffclub.mod.lists;

import com.ffclub.mod.objects.blocks.WeedBush;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public class FeatureList {

	public static final BlockState BUSH = BlockList.WEED_BUSH.get().getDefaultState().with(WeedBush.AGE, 3);

	public static final BlockClusterFeatureConfig BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(BUSH), new SimpleBlockPlacer()).tries(64)
					.whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getBlock()))).func_227317_b_().build();

}
