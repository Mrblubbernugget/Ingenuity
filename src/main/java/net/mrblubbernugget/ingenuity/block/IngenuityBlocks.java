package net.mrblubbernugget.ingenuity.block;


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
import net.mrblubbernugget.ingenuity.Ingenuity;
import net.mrblubbernugget.ingenuity.block.custom.PebbleBlock;
import net.mrblubbernugget.ingenuity.item.IngenuityCreativeModeTab;
import net.mrblubbernugget.ingenuity.item.IngenuityItems;

import java.util.function.Supplier;


public class IngenuityBlocks {
    //Setting up the deferred registery.
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Ingenuity.MOD_ID);
    //Normal blocks registery

    //Custom blocks registery
    public static final RegistryObject<Block> PEBBLE_BLOCK = registerBlock("pebble_block",
            () -> new PebbleBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .noOcclusion()), IngenuityCreativeModeTab.INGENUITY_TAB);

    //Registery for all the blocks
    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    //Registery for all the block items
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return IngenuityItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
