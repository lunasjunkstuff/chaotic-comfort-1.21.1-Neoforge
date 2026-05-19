package net.lunaastryx.chaotic_comfort.block;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ChaoticComfort.MOD_ID);

    public static final DeferredBlock<Block> DEV_CALCITE = registerBlock("dev_calcite",
            () -> new  Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<StairBlock> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<WallBlock> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> DEV_DRIPSTONE_BLOCK = registerBlock("dev_dripstone_block",
            () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<StairBlock> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<WallBlock> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> DEV_SMOOTH_BASALT = registerBlock("dev_smooth_basalt",
            () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toreturn = BLOCKS.register(name, block);
        registerBlockItem(name, toreturn);
        return toreturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
