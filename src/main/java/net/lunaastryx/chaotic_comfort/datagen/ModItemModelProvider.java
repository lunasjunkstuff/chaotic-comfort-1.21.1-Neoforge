package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.block.ModBlocks;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChaoticComfort.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.GOLDEN_NETHER_STAR.get());
        basicItem(ModItems.PUFFER_SMITHING_TEMPLATE.get());
        basicItem(ModItems.POMMES_ROT_WEISS_MUSIC_DISC.get());
        basicItem(ModItems.CURE_MUSIC_DISC.get());
        basicItem(ModItems.KARMA_MUSIC_DISC.get());
        basicItem(ModItems.RULER_OF_MY_HEART_MUSIC_DISC.get());
        basicItem(ModItems.ELEVENTH_HOUR_MUSIC_DISC.get());
        basicItem(ModItems.SOLSTICE_MUSIC_DISC.get());

        wallItem(ModBlocks.CALCITE_WALL, ModBlocks.DEV_CALCITE);
        wallItem(ModBlocks.DRIPSTONE_WALL, ModBlocks.DEV_DRIPSTONE_BLOCK);
        wallItem(ModBlocks.SMOOTH_BASALT_WALL, ModBlocks.DEV_SMOOTH_BASALT);
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(ChaoticComfort.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
