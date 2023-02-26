package oskar.forge.forgemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("forgetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FORGE.get());
        }
    };
}
