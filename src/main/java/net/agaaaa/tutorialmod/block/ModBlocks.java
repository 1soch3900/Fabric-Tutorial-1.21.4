package net.agaaaa.tutorialmod.block;

import net.agaaaa.tutorialmod.TutorialMod;
import net.agaaaa.tutorialmod.block.custom.MagicAmogusBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {


    public static final Block RED_AMOGUS_BLOCK = registerBlock("red_amogus_block", AbstractBlock
            .Settings.create().strength(4f).requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK).burnable());
    public static final Block BLUE_AMOGUS_BLOCK = registerBlock("blue_amogus_block", AbstractBlock
            .Settings.create().strength(4f).requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(state -> 15));

    public static final Block RED_AMOGUS_ORE = registerBlock("red_amogus_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), settings),
            AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE));
    public static final Block BLUE_AMOGUS_ORE = registerBlock("blue_amogus_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), settings),
            AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE));

    public static final Block MAGIC_AMOGUS_BLOCK = registerBlock("magic_amogus_block",
            MagicAmogusBlock::new,
            AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.GLASS));



    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TutorialMod.MOD_ID, name));
        Block block = (Block) factory.apply(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }
    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        return registerBlock(name, Block::new, blockSettings);
    }


    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.RED_AMOGUS_BLOCK);
            entries.add(ModBlocks.BLUE_AMOGUS_BLOCK);
            entries.add(ModBlocks.RED_AMOGUS_ORE);
            entries.add(ModBlocks.BLUE_AMOGUS_ORE);
        });
    }
}
