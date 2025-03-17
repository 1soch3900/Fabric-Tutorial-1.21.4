package net.agaaaa.tutorialmod.datagen;

import net.agaaaa.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RED_AMOGUS_BLOCK)
                .add(ModBlocks.BLUE_AMOGUS_BLOCK)
                .add(ModBlocks.RED_AMOGUS_ORE)
                .add(ModBlocks.BLUE_AMOGUS_ORE)
                .add(ModBlocks.MAGIC_AMOGUS_BLOCK)
                .add(ModBlocks.RED_AMOGUS_STAIRS).add(ModBlocks.RED_AMOGUS_SLAB).add(ModBlocks.RED_AMOGUS_BUTTON).add(ModBlocks.RED_AMOGUS_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_AMOGUS_STAIRS).add(ModBlocks.BLUE_AMOGUS_SLAB).add(ModBlocks.BLUE_AMOGUS_BUTTON).add(ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RED_AMOGUS_BLOCK)
                .add(ModBlocks.BLUE_AMOGUS_BLOCK)
                .add(ModBlocks.RED_AMOGUS_ORE)
                .add(ModBlocks.BLUE_AMOGUS_ORE)
                .add(ModBlocks.MAGIC_AMOGUS_BLOCK)
                .add(ModBlocks.RED_AMOGUS_STAIRS).add(ModBlocks.RED_AMOGUS_SLAB).add(ModBlocks.RED_AMOGUS_BUTTON).add(ModBlocks.RED_AMOGUS_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_AMOGUS_STAIRS).add(ModBlocks.BLUE_AMOGUS_SLAB).add(ModBlocks.BLUE_AMOGUS_BUTTON).add(ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE);;

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.RED_AMOGUS_FENCE)
                .add(ModBlocks.BLUE_AMOGUS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.RED_AMOGUS_FENCE_GATE)
                .add(ModBlocks.BLUE_AMOGUS_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.RED_AMOGUS_WALL)
                .add(ModBlocks.BLUE_AMOGUS_WALL);

    }
}
