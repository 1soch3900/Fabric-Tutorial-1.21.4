package net.agaaaa.tutorialmod.item.custom;

import net.agaaaa.tutorialmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class ChiselItem extends Item {

    private static final Map<Block, Block> CHISEL_MAP1 =
            Map.of(
                    ModBlocks.RED_AMOGUS_BLOCK, ModBlocks.BLUE_AMOGUS_BLOCK,
                    ModBlocks.BLUE_AMOGUS_BLOCK, ModBlocks.RED_AMOGUS_BLOCK,
                    ModBlocks.RED_AMOGUS_STAIRS, ModBlocks.BLUE_AMOGUS_STAIRS,
                    ModBlocks.BLUE_AMOGUS_STAIRS, ModBlocks.RED_AMOGUS_STAIRS,
                    ModBlocks.RED_AMOGUS_SLAB, ModBlocks.BLUE_AMOGUS_SLAB,
                    ModBlocks.BLUE_AMOGUS_SLAB, ModBlocks.RED_AMOGUS_SLAB,
                    ModBlocks.RED_AMOGUS_BUTTON, ModBlocks.BLUE_AMOGUS_BUTTON,
                    ModBlocks.BLUE_AMOGUS_BUTTON, ModBlocks.RED_AMOGUS_BUTTON,
                    ModBlocks.RED_AMOGUS_PRESSURE_PLATE, ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE,
                    ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE, ModBlocks.RED_AMOGUS_PRESSURE_PLATE
            );
    private static final Map<Block, Block> CHISEL_MAP2 =
            Map.of(
                    ModBlocks.RED_AMOGUS_FENCE, ModBlocks.BLUE_AMOGUS_FENCE,
                    ModBlocks.BLUE_AMOGUS_FENCE, ModBlocks.RED_AMOGUS_FENCE,
                    ModBlocks.RED_AMOGUS_FENCE_GATE, ModBlocks.BLUE_AMOGUS_FENCE_GATE,
                    ModBlocks.BLUE_AMOGUS_FENCE_GATE, ModBlocks.RED_AMOGUS_FENCE_GATE,
                    ModBlocks.RED_AMOGUS_WALL, ModBlocks.BLUE_AMOGUS_WALL,
                    ModBlocks.BLUE_AMOGUS_WALL, ModBlocks.RED_AMOGUS_WALL
            );

    public ChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(CHISEL_MAP1.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), CHISEL_MAP1.get(clickedBlock).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world),
                        ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_ANVIL_PLACE,
                        SoundCategory.BLOCKS);
            }
        }
        if(CHISEL_MAP2.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), CHISEL_MAP2.get(clickedBlock).getDefaultState());
                context.getStack().damage(1, ((ServerWorld) world),
                        ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_ANVIL_PLACE,
                        SoundCategory.BLOCKS);
            }
        }

        return ActionResult.SUCCESS;
    }
}
