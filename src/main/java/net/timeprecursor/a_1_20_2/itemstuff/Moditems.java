package net.timeprecursor.a_1_20_2.itemstuff;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.timeprecursor.a_1_20_2.A_1_20_2;
import net.timeprecursor.a_1_20_2.entity.modentities;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, A_1_20_2.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

//    public static final RegistryObject<Item> RHINO_SPAWN_EGG = ITEMS.register("Nightstalker_spawn_egg",
//            ()-> new ForgeSpawnEggItem(modentities.DINO, 0x7e9680, 0xc5d1c5,
//            new Item.Properties()));
    }
