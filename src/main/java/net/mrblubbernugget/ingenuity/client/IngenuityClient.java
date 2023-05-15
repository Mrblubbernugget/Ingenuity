package net.mrblubbernugget.ingenuity.client;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.mrblubbernugget.ingenuity.Ingenuity;
import net.mrblubbernugget.ingenuity.entity.IngenuityEntities;

@Mod.EventBusSubscriber(modid = Ingenuity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IngenuityClient {

    //setting up all the renders for the client.
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(IngenuityEntities.PEBBLE_ENTITY.get(), ThrownItemRenderer::new);
    }
}
