package net.mrblubbernugget.ingenuity.world.gen;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrblubbernugget.ingenuity.Ingenuity;
import net.mrblubbernugget.ingenuity.block.IngenuityBlocks;

public class IngenuityConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> INGENUITY_CONFIGURED_FEATURES =
        DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Ingenuity.MOD_ID);


    public static final RegistryObject<ConfiguredFeature<?, ?>> PebbleBlockFeature = INGENUITY_CONFIGURED_FEATURES.register("pebble_block_feature",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32,15,2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(IngenuityBlocks.PEBBLE_BLOCK.get()))))));


    public static void register(IEventBus eventBus) {
        INGENUITY_CONFIGURED_FEATURES.register(eventBus);
    }
}
