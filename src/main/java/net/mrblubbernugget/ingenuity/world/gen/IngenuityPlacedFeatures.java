package net.mrblubbernugget.ingenuity.world.gen;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrblubbernugget.ingenuity.Ingenuity;

import java.util.List;

public class IngenuityPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Ingenuity.MOD_ID);

    public static final RegistryObject<PlacedFeature> PEBBLE_BLOCK_PLACED = PLACED_FEATURES.register("pebble_block_placed",
            () -> new PlacedFeature(IngenuityConfiguredFeatures.PebbleBlockFeature.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
