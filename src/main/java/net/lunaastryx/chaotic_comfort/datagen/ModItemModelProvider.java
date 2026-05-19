package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
