package net.timeprecursor.a_1_20_2.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.timeprecursor.a_1_20_2.A_1_20_2;
import net.timeprecursor.a_1_20_2.entity.client.ModModelLayers;
import net.timeprecursor.a_1_20_2.entity.client.nightstalkermodel;

@Mod.EventBusSubscriber(modid = A_1_20_2.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class modeventbusClientevents {
    @SubscribeEvent
    public static void registerlayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.DINO_LAYER, nightstalkermodel::createBodyLayer);
    }
}
