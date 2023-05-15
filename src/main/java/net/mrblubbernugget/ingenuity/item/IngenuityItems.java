package net.mrblubbernugget.ingenuity.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrblubbernugget.ingenuity.Ingenuity;
import net.mrblubbernugget.ingenuity.item.custom.PebbleItem;

public class IngenuityItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ingenuity.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    //Items

    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble",
            () -> new PebbleItem(new Item.Properties()
                    .stacksTo(16)
                    .tab(IngenuityCreativeModeTab.INGENUITY_TAB)));

    public static final RegistryObject<Item> BRANCH = ITEMS.register("branch",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .tab(IngenuityCreativeModeTab.INGENUITY_TAB)));


}
