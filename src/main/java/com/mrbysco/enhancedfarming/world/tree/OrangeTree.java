package com.mrbysco.enhancedfarming.world.tree;

import com.mrbysco.enhancedfarming.world.feature.FarmingFeatureConfigs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class OrangeTree extends AbstractTreeGrower {
	@Nullable
	protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean withBees) {
		if (random.nextInt(10) == 0) {
			return withBees ? FarmingFeatureConfigs.FANCY_ORANGE_BEES_005 : FarmingFeatureConfigs.FANCY_ORANGE;
		} else {
			return withBees ? FarmingFeatureConfigs.ORANGE_BEES_005 : FarmingFeatureConfigs.ORANGE;
		}
	}
}