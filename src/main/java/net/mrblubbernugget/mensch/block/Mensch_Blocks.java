package net.mrblubbernugget.mensch.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrblubbernugget.mensch.Mensch;
import net.mrblubbernugget.mensch.block.custom.PebbleBlock;
import net.mrblubbernugget.mensch.item.MenschCreativeModeTab;
import net.mrblubbernugget.mensch.item.Mensch_Items;

import java.util.function.Supplier;


public class Mensch_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mensch.MOD_ID);



    //blocks

    public static final RegistryObject<Block> PEBBLE_BLOCK = registerBlock("pebble_block",
            () -> new PebbleBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .noOcclusion()), MenschCreativeModeTab.MENSCH_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {

        return Mensch_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
