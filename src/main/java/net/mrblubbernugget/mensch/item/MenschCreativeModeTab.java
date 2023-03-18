package net.mrblubbernugget.mensch.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MenschCreativeModeTab {
    public static final CreativeModeTab MENSCH_TAB = new CreativeModeTab("mensch_creative_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Mensch_Items.BRANCH.get());
        }
    };
}
