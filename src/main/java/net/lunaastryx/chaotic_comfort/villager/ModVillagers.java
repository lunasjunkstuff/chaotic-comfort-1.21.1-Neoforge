package net.lunaastryx.chaotic_comfort.villager;

import com.google.common.collect.ImmutableSet;
import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, ChaoticComfort.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSION =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, ChaoticComfort.MOD_ID);

    public static final Holder<PoiType> GUY_POI = POI_TYPES.register("guy_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.TERRACOTTA.getStateDefinition().getPossibleStates()),1 ,1 ));

    public static final Holder<VillagerProfession> GUY = VILLAGER_PROFESSION.register("guy",
            () -> new VillagerProfession("guy", holder -> holder.value() == GUY_POI.value(),
                    poiTypeHolder -> poiTypeHolder.value() == GUY_POI.value(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_MASON));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSION.register(eventBus);
    }
}
