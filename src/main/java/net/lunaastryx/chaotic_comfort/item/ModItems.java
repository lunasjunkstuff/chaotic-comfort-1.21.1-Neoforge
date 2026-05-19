package net.lunaastryx.chaotic_comfort.item;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
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
