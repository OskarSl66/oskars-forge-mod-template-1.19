package oskar.forge.forgemod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import oskar.forge.forgemod.ForgeMod;
import oskar.forge.forgemod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static Tier FORGE;

    static {
        FORGE = TierSortingRegistry.registerTier(
                new ForgeTier(2, 810, 7, 3f, 12,
                        ModTags.Blocks.NEEDS_FORGE_TOOL, () -> Ingredient.of(ModItems.FORGE.get())),
                new ResourceLocation(ForgeMod.MOD_ID, "forge"), List.of(Tiers.NETHERITE), List.of());
    }
}
