package oskar.forge.forgemod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import oskar.forge.forgemod.ForgeMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForgeMod.MOD_ID);

    public static final RegistryObject<Item> FORGE = ITEMS.register("forge",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RAW_FORGE = ITEMS.register("raw_forge",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FORGE_NUGGET = ITEMS.register("forge_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FORGE_SWORD = ITEMS.register("forge_sword",
            () -> new SwordItem(ModToolTiers.FORGE, 7, 8f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FORGE_PICKAXE = ITEMS.register("forge_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FORGE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FORGE_AXE = ITEMS.register("forge_axe",
            () -> new AxeItem(ModToolTiers.FORGE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FORGE_SHOVEL = ITEMS.register("forge_shovel",
            () -> new ShovelItem(ModToolTiers.FORGE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FORGE_HOE = ITEMS.register("forge_hoe",
            () -> new HoeItem(ModToolTiers.FORGE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> FORGE_HELMET = ITEMS.register("forge_helmet",
            () -> new ArmorItem(ModArmorMaterials.FORGE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FORGE_CHESTPLATE = ITEMS.register("forge_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FORGE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FORGE_LEGGINGS = ITEMS.register("forge_leggings",
            () -> new ArmorItem(ModArmorMaterials.FORGE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FORGE_BOOTS = ITEMS.register("forge_boots",
            () -> new ArmorItem(ModArmorMaterials.FORGE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
