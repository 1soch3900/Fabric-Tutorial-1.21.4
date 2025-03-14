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
                .add(ModBlocks.MAGIC_AMOGUS_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RED_AMOGUS_BLOCK)
                .add(ModBlocks.BLUE_AMOGUS_BLOCK)
                .add(ModBlocks.RED_AMOGUS_ORE)
                .add(ModBlocks.BLUE_AMOGUS_ORE)
                .add(ModBlocks.MAGIC_AMOGUS_BLOCK);
    }
}
