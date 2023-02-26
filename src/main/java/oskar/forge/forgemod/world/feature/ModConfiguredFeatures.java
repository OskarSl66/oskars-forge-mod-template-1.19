package oskar.forge.forgemod.world.feature;

import oskar.forge.forgemod.ForgeMod;
import oskar.forge.forgemod.block.ModBlocks;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ForgeMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_FORGE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FORGE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_FORGE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_FORGE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_FORGE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_FORGE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_FORGE_ORE.get().defaultBlockState())));


    public static final RegistryObject<ConfiguredFeature<?, ?>> FORGE_ORE = CONFIGURED_FEATURES.register("forge_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FORGE_ORES.get(),8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_FORGE_ORE = CONFIGURED_FEATURES.register("end_forge_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_FORGE_ORES.get(), 6)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_FORGE_ORE = CONFIGURED_FEATURES.register("nether_forge_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_FORGE_ORES.get(), 9)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}