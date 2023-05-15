package net.mrblubbernugget.ingenuity;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mrblubbernugget.ingenuity.block.IngenuityBlocks;
import net.mrblubbernugget.ingenuity.entity.IngenuityEntities;
import net.mrblubbernugget.ingenuity.item.IngenuityItems;
import net.mrblubbernugget.ingenuity.world.gen.IngenuityConfiguredFeatures;
import net.mrblubbernugget.ingenuity.world.gen.IngenuityPlacedFeatures;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Ingenuity.MOD_ID)
public class Ingenuity {
    public static final String MOD_ID = "ingenuity";
    private static final Logger LOGGER = LogUtils.getLogger();



    public Ingenuity() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        IngenuityItems.register(modEventBus);
        IngenuityBlocks.register(modEventBus);
        IngenuityEntities.INGENUITY_ENTITY_TYPES.register(modEventBus);
        IngenuityConfiguredFeatures.INGENUITY_CONFIGURED_FEATURES.register(modEventBus);
        IngenuityPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
