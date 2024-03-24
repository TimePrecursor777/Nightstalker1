package net.timeprecursor.a_1_20_2.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.timeprecursor.a_1_20_2.A_1_20_2;
import net.timeprecursor.a_1_20_2.entity.custom.NightstalkerEntity;
import net.timeprecursor.a_1_20_2.entity.modentities;

@Mod.EventBusSubscriber(modid = A_1_20_2.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class modeventbusevents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(modentities.DINO.get(), NightstalkerEntity.createAttributes().build());
    }
}
