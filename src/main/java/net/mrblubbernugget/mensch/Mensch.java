package net.mrblubbernugget.mensch;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mrblubbernugget.mensch.block.Mensch_Blocks;
import net.mrblubbernugget.mensch.entity.MenschEntities;
import net.mrblubbernugget.mensch.item.MenschItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mensch.MOD_ID)
public class Mensch {
    public static final String MOD_ID = "mensch";
    private static final Logger LOGGER = LogUtils.getLogger();



    public Mensch() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MenschItems.register(modEventBus);
        Mensch_Blocks.register(modEventBus);
        MenschEntities.MENSCH_ENTITY_TYPES.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
}
