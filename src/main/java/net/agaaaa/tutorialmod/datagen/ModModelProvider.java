package net.agaaaa.tutorialmod.datagen;

import net.agaaaa.tutorialmod.TutorialMod;
import net.agaaaa.tutorialmod.block.ModBlocks;
import net.agaaaa.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_AMOGUS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_AMOGUS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_AMOGUS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_AMOGUS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_AMOGUS_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RED_AMOGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_AMOGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMOGUS_CHISEL, Models.GENERATED);
    }
}
