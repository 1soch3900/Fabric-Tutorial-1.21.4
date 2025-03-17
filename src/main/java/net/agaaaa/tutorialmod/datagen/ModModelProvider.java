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
        BlockStateModelGenerator.BlockTexturePool redAmogusPool
                = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_AMOGUS_BLOCK);
        redAmogusPool.stairs(ModBlocks.RED_AMOGUS_STAIRS);
        redAmogusPool.slab(ModBlocks.RED_AMOGUS_SLAB);
        redAmogusPool.button(ModBlocks.RED_AMOGUS_BUTTON);
        redAmogusPool.pressurePlate(ModBlocks.RED_AMOGUS_PRESSURE_PLATE);
        redAmogusPool.fence(ModBlocks.RED_AMOGUS_FENCE);
        redAmogusPool.fenceGate(ModBlocks.RED_AMOGUS_FENCE_GATE);
        redAmogusPool.wall(ModBlocks.RED_AMOGUS_WALL);

        BlockStateModelGenerator.BlockTexturePool blueAmogusPool
                = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_AMOGUS_BLOCK);
        blueAmogusPool.stairs(ModBlocks.BLUE_AMOGUS_STAIRS);
        blueAmogusPool.slab(ModBlocks.BLUE_AMOGUS_SLAB);
        blueAmogusPool.button(ModBlocks.BLUE_AMOGUS_BUTTON);
        blueAmogusPool.pressurePlate(ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE);
        blueAmogusPool.fence(ModBlocks.BLUE_AMOGUS_FENCE);
        blueAmogusPool.fenceGate(ModBlocks.BLUE_AMOGUS_FENCE_GATE);
        blueAmogusPool.wall(ModBlocks.BLUE_AMOGUS_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.RED_AMOGUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RED_AMOGUS_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_AMOGUS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_AMOGUS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_AMOGUS_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RED_AMOGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_AMOGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMOGUS_CHISEL, Models.GENERATED);
    }
}
