package net.lunaastryx.chaotic_comfort.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.lunaastryx.chaotic_comfort.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = ChaoticComfort.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.GUY.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.TERRACOTTA, 24),
                        5, 3, 0.075f
            ));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.RED_TERRACOTTA, 24),
                    5, 3, 0.075f
            ));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.GREEN_TERRACOTTA, 24),
                    5, 3, 0.075f
            ));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.BLUE_TERRACOTTA, 24),
                    5, 3, 0.075f
            ));
            trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.LIGHT_BLUE_TERRACOTTA, 24),
                    5, 3, 0.075f
            ));

            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.BRICKS, 24),
                    6, 8, 0.075f
            ));
            trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Blocks.TUFF, 24),
                    4, 8, 0.075f
            ));

            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 2),
                    new ItemStack(Blocks.STONE, 24),
                    7, 15, 0.075f
            ));
            trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 4),
                    new ItemStack(Blocks.COBBLED_DEEPSLATE, 24),
                    5, 15, 0.075f
            ));

            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.NETHERITE_INGOT, 2),
                    new ItemStack(ModItems.ELECTRIC_GUITAR.get(), 1),
                    1, 67, 0.075f
            ));
            trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.NETHERITE_SWORD, 1),
                    new ItemStack(ModItems.BAGUETTE.get(), 1),
                    1, 67, 0.075f
            ));

            trades.get(5).add((entity, randomSource) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 67),
                    new ItemStack(ModItems.POMMES_ROT_WEISS_MUSIC_DISC.get(), 1),
                    1, 67, 0.075f
            ));
        }
    }

    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        rareTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(ModItems.RULER_OF_MY_HEART_MUSIC_DISC.get(), 1), 1, 3, 3
        ));
        rareTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(ModItems.CURE_MUSIC_DISC.get(), 1), 1, 3, 3
        ));
        rareTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 16),
                new ItemStack(ModItems.KARMA_MUSIC_DISC.get(), 1), 1, 3, 3
        ));
        rareTrades.add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 13),
                new ItemStack(ModItems.PUFFER_SMITHING_TEMPLATE.get(),1), 4, 67, 2.3f
        ));
    }
}
