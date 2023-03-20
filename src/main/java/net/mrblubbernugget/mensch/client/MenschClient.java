package net.mrblubbernugget.mensch.client;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.mrblubbernugget.mensch.Mensch;
import net.mrblubbernugget.mensch.entity.MenschEntities;

@Mod.EventBusSubscriber(modid = Mensch.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MenschClient {

    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(MenschEntities.PEBBLE_ENTITY.get(), ThrownItemRenderer::new);
    }
}
