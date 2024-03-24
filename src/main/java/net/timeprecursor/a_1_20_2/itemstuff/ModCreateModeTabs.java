package net.timeprecursor.a_1_20_2.itemstuff;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.timeprecursor.a_1_20_2.A_1_20_2;

public class ModCreateModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, A_1_20_2.MODID);
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
                .title(Component.translatable("creativetab.tutorial_tab"))
                .displayItems((pParameters, pOutput) -> {
                pOutput.accept(Moditems.SAPPHIRE.get());
                pOutput.accept(Moditems.RAW_SAPPHIRE.get());
//                pOutput.accept(Moditems.RHINO_SPAWN_EGG.get());
                })
                .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
