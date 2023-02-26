package oskar.forge.forgemod.world.feature;

import oskar.forge.forgemod.ForgeMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ForgeMod.MOD_ID);


    public static final RegistryObject<PlacedFeature> FORGE_ORE_PLACED = PLACED_FEATURES.register("forge_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.FORGE_ORE.getHolder().get(),
                    commonOrePlacement(8, // VeinsPerChunk
                            HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(60)))));

    public static final RegistryObject<PlacedFeature> END_FORGE_ORE_PLACED = PLACED_FEATURES.register("end_forge_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.END_FORGE_ORE.getHolder().get(), commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(2), VerticalAnchor.absolute(69)))));

    public static final RegistryObject<PlacedFeature> NETHER_FORGE_ORE_PLACED = PLACED_FEATURES.register("nether_forge_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHER_FORGE_ORE.getHolder().get(), commonOrePlacement(10, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(69)))));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}