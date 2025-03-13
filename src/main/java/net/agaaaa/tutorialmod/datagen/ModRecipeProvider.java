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
        }
    }
}



/*public class ModRecipeProvider extends RecipeGenerator {

    public ModRecipeProvider(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
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
                .input('#', ModItems.RED_AMOGUS).input('@', Items.STICK).offerTo(exporter);
    }
}*/

