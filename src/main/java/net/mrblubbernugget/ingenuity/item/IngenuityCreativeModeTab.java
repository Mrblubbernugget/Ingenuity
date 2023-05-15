package net.mrblubbernugget.ingenuity.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngenuityCreativeModeTab {
    public static final CreativeModeTab INGENUITY_TAB = new CreativeModeTab("mensch_creative_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(IngenuityItems.BRANCH.get());
        }
    };
}
