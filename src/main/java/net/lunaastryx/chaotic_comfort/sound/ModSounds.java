package net.lunaastryx.chaotic_comfort.sound;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, ChaoticComfort.MOD_ID);

    public static final Supplier<SoundEvent> POMMES_ROT_WEISS = registerSoundEvent("pommes_rot_weiss");
    public static final ResourceKey<JukeboxSong> POMMES_ROT_WEISS_KEY = createSong("pommes_rot_weiss");

    public static final Supplier<SoundEvent> RULER_OF_MY_HEART = registerSoundEvent("romh");
    public static final ResourceKey<JukeboxSong> RULER_OF_MY_HEART_KEY = createSong("romh");
    public static final Supplier<SoundEvent> CURE = registerSoundEvent("cure");
    public static final ResourceKey<JukeboxSong> CURE_KEY = createSong("cure");
    public static final Supplier<SoundEvent> KARMA = registerSoundEvent("karma");
    public static final ResourceKey<JukeboxSong> KARMA_KEY = createSong("karma");

    public static final Supplier<SoundEvent> SOLSTICE = registerSoundEvent("solstice");
    public static final ResourceKey<JukeboxSong> SOLSTICE_KEY = createSong("solstice");
    public static final Supplier<SoundEvent> ELEVENTH_HOUR = registerSoundEvent("eleventh_hour");
    public static final ResourceKey<JukeboxSong> ELEVENTH_HOUR_KEY = createSong("eleventh_hour");

    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(ChaoticComfort.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(ChaoticComfort.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
