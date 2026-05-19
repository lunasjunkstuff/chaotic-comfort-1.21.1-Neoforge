package net.lunaastryx.chaotic_comfort.item;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaoticComfort.MOD_ID);

    public static final Supplier<CreativeModeTab> CHAOTIC_COMFORT_TAB = CREATIVE_MODE_TAB.register("chaotic_comfort_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELECTRIC_GUITAR.get()))
                    .title(Component.translatable("creativetab.chaotic_comfort"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ELECTRIC_GUITAR);
                        output.accept(ModItems.BAGUETTE);
                        output.accept(ModItems.GOLDEN_NETHER_STAR);
                        output.accept(ModItems.POMMES_ROT_WEISS_MUSIC_DISC);
                        output.accept(ModItems.PUFFER_SMITHING_TEMPLATE);

                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
