package net.lunaastryx.chaotic_comfort.datagen;

import net.lunaastryx.chaotic_comfort.block.ModBlocks;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        stairBuilder(ModBlocks.CALCITE_STAIRS.get(), Ingredient.of(Blocks.CALCITE)).group("calcite")
                .unlockedBy("has_calcite", has(Blocks.CALCITE)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB.get(), Blocks.CALCITE);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL.get(), Blocks.CALCITE);

        stairBuilder(ModBlocks.DRIPSTONE_STAIRS.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK)).group("dripstone")
                .unlockedBy("has_dripstone", has(Blocks.DRIPSTONE_BLOCK)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB.get(), Blocks.DRIPSTONE_BLOCK);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_WALL.get(), Blocks.DRIPSTONE_BLOCK);

        stairBuilder(ModBlocks.SMOOTH_BASALT_STAIRS.get(), Ingredient.of(Blocks.SMOOTH_BASALT)).group("smooth_basalt")
                .unlockedBy("has_smooth_basalt", has(Blocks.SMOOTH_BASALT)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB.get(), Blocks.SMOOTH_BASALT);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT);
    }
}
