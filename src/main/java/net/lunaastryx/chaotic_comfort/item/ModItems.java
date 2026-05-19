package net.lunaastryx.chaotic_comfort.item;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChaoticComfort.MOD_ID);

    public static final DeferredItem<Item> GOLDEN_NETHER_STAR = ITEMS.register("golden_nether_star",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POMMES_ROT_WEISS_MUSIC_DISC = ITEMS.register("pommes_rot_weiss_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.POMMES_ROT_WEISS_KEY).stacksTo(1)));

    public static final DeferredItem<Item> RULER_OF_MY_HEART_MUSIC_DISC = ITEMS.register("romh_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.RULER_OF_MY_HEART_KEY).stacksTo(1)));
    public static final DeferredItem<Item> CURE_MUSIC_DISC = ITEMS.register("cure_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CURE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> KARMA_MUSIC_DISC = ITEMS.register("karma_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.KARMA_KEY).stacksTo(1)));

    public static final DeferredItem<Item> SOLSTICE_MUSIC_DISC = ITEMS.register("solstice_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SOLSTICE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ELEVENTH_HOUR_MUSIC_DISC = ITEMS.register("eleventh_hour_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ELEVENTH_HOUR_KEY).stacksTo(1)));

    public static final DeferredItem<Item> PUFFER_SMITHING_TEMPLATE = ITEMS.register("puffer_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(ChaoticComfort.MOD_ID, "puffer")));

    public static final DeferredItem<AxeItem> ELECTRIC_GUITAR = ITEMS.register("electric_guitar",
            () -> new AxeItem(ModToolTiers.ELECTRIC_GUITAR, new Item.Properties().fireResistant().stacksTo(1)
                    .attributes(AxeItem.createAttributes(ModToolTiers.ELECTRIC_GUITAR, 0, -2.67f))));

    public static final DeferredItem<SwordItem> BAGUETTE = ITEMS.register("baguette",
            () -> new SwordItem(ModToolTiers.BAGUETTE, new Item.Properties().fireResistant().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.BAGUETTE, 0, -2.4f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
