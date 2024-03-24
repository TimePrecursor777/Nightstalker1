package net.timeprecursor.a_1_20_2.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.timeprecursor.a_1_20_2.A_1_20_2;
import net.timeprecursor.a_1_20_2.entity.custom.NightstalkerEntity;

public class modentities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, A_1_20_2.MODID);

    public static final RegistryObject<EntityType<NightstalkerEntity>> DINO =
            ENTITY_TYPES.register("Dino", () -> EntityType.Builder.of(NightstalkerEntity::new, MobCategory.CREATURE)
                    .sized(2.5f,2.5f).build("Dino"))
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
