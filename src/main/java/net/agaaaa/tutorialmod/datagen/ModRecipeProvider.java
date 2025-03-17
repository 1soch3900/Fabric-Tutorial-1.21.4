package net.agaaaa.tutorialmod.datagen;

import net.agaaaa.tutorialmod.block.ModBlocks;
import net.agaaaa.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new ModRecipeGenerator(wrapperLookup, recipeExporter);
    }

    @Override
    public String getName() {
        return "Mod Recipes";
    }

    public static class ModRecipeGenerator extends RecipeGenerator {

        protected ModRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
            super(wrapperLookup, recipeExporter);
        }

        @Override
        public void generate() {
            List<ItemConvertible> RED_AMOGUS_SMELT = List.of(ModBlocks.RED_AMOGUS_ORE);
            offerSmelting(RED_AMOGUS_SMELT, RecipeCategory.MISC, ModItems.RED_AMOGUS,
                    0.25f, 200, "red_amogus");
            offerBlasting(RED_AMOGUS_SMELT, RecipeCategory.MISC, ModItems.RED_AMOGUS,
                    0.25f, 100, "red_amogus");

            List<ItemConvertible> BLUE_AMOGUS_SMELT = List.of(ModBlocks.BLUE_AMOGUS_ORE);
            offerSmelting(BLUE_AMOGUS_SMELT, RecipeCategory.MISC, ModItems.BLUE_AMOGUS,
                    0.25f, 200, "blue_amogus");
            offerBlasting(BLUE_AMOGUS_SMELT, RecipeCategory.MISC, ModItems.BLUE_AMOGUS,
                    0.25f, 100, "blue_amogus");

            offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RED_AMOGUS,
                    RecipeCategory.DECORATIONS, ModBlocks.RED_AMOGUS_BLOCK);
            offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_AMOGUS,
                    RecipeCategory.DECORATIONS, ModBlocks.BLUE_AMOGUS_BLOCK);

            createShaped(RecipeCategory.MISC, ModItems.AMOGUS_CHISEL)
                    .pattern("  #")
                    .pattern(" @ ")
                    .pattern("@  ")
                    .input('#', ModItems.RED_AMOGUS)
                    .criterion(hasItem(ModItems.RED_AMOGUS), conditionsFromItem(ModItems.RED_AMOGUS))
                    .input('@', Items.STICK).offerTo(exporter);

            createStairsRecipe(ModBlocks.RED_AMOGUS_STAIRS, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_AMOGUS_SLAB, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createButtonRecipe(ModBlocks.RED_AMOGUS_BUTTON, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.RED_AMOGUS_PRESSURE_PLATE,
                    Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createFenceRecipe(ModBlocks.RED_AMOGUS_FENCE, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createFenceGateRecipe(ModBlocks.RED_AMOGUS_FENCE_GATE, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.RED_AMOGUS_WALL, ModBlocks.RED_AMOGUS_BLOCK);
            createDoorRecipe(ModBlocks.RED_AMOGUS_DOOR, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createTrapdoorRecipe(ModBlocks.RED_AMOGUS_TRAPDOOR, Ingredient.ofItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.RED_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.RED_AMOGUS_BLOCK))
                    .offerTo(exporter);

            createStairsRecipe(ModBlocks.BLUE_AMOGUS_STAIRS, Ingredient.ofItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.BLUE_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_AMOGUS_SLAB, Ingredient.ofItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.BLUE_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createButtonRecipe(ModBlocks.BLUE_AMOGUS_BUTTON, Ingredient.ofItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.BLUE_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE,
                    Ingredient.ofItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.BLUE_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createFenceRecipe(ModBlocks.BLUE_AMOGUS_FENCE, Ingredient.ofItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.BLUE_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .offerTo(exporter);
            createFenceGateRecipe(ModBlocks.BLUE_AMOGUS_FENCE_GATE, Ingredient.ofItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .criterion(hasItem(ModBlocks.BLUE_AMOGUS_BLOCK), conditionsFromItem(ModBlocks.BLUE_AMOGUS_BLOCK))
                    .offerTo(exporter);
            offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.BLUE_AMOGUS_WALL, ModBlocks.BLUE_AMOGUS_BLOCK);
        }
    }
}




