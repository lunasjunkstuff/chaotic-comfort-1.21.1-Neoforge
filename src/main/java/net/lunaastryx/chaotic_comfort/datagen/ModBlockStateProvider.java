package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChaoticComfort.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.DEV_CALCITE);
        stairsBlock(ModBlocks.CALCITE_STAIRS.get(), blockTexture(Blocks.CALCITE));
        blockItem(ModBlocks.CALCITE_STAIRS);
        slabBlock(ModBlocks.CALCITE_SLAB.get(), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        blockItem(ModBlocks.CALCITE_SLAB);
        wallBlock(ModBlocks.CALCITE_WALL.get(), blockTexture(Blocks.CALCITE));
        blockItem(ModBlocks.CALCITE_WALL);

        blockWithItem(ModBlocks.DEV_DRIPSTONE_BLOCK);
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        blockItem(ModBlocks.DRIPSTONE_STAIRS);
        slabBlock(ModBlocks.DRIPSTONE_SLAB.get(), blockTexture(Blocks.DRIPSTONE_BLOCK), blockTexture(Blocks.DRIPSTONE_BLOCK));
        blockItem(ModBlocks.DRIPSTONE_SLAB);
        wallBlock(ModBlocks.DRIPSTONE_WALL.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        blockItem(ModBlocks.DRIPSTONE_WALL);

        blockWithItem(ModBlocks.DEV_SMOOTH_BASALT);
        stairsBlock(ModBlocks.SMOOTH_BASALT_STAIRS.get(), blockTexture(Blocks.DRIPSTONE_BLOCK));
        blockItem(ModBlocks.SMOOTH_BASALT_STAIRS);
        slabBlock(ModBlocks.SMOOTH_BASALT_SLAB.get(), blockTexture(Blocks.SMOOTH_BASALT), blockTexture(Blocks.SMOOTH_BASALT));
        blockItem(ModBlocks.SMOOTH_BASALT_SLAB);
        wallBlock(ModBlocks.SMOOTH_BASALT_WALL.get(), blockTexture(Blocks.SMOOTH_BASALT));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("chaotic_comfort:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("chaotic_comfort:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
