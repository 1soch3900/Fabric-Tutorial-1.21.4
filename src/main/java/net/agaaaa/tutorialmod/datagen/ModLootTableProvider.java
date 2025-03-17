package net.agaaaa.tutorialmod.datagen;

import net.agaaaa.tutorialmod.block.ModBlocks;
import net.agaaaa.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RED_AMOGUS_BLOCK);
        addDrop(ModBlocks.BLUE_AMOGUS_BLOCK);
        addDrop(ModBlocks.MAGIC_AMOGUS_BLOCK);

        addDrop(ModBlocks.RED_AMOGUS_ORE, multipleOreDrops(ModBlocks.RED_AMOGUS_ORE,
                ModItems.RED_AMOGUS, 2.0F, 4.0F));
        addDrop(ModBlocks.BLUE_AMOGUS_ORE, multipleOreDrops(ModBlocks.BLUE_AMOGUS_ORE,
                ModItems.BLUE_AMOGUS, 2.0F, 4.0F));

        addDrop(ModBlocks.RED_AMOGUS_STAIRS);
        addDrop(ModBlocks.RED_AMOGUS_SLAB, slabDrops(ModBlocks.RED_AMOGUS_SLAB));
        addDrop(ModBlocks.RED_AMOGUS_BUTTON);
        addDrop(ModBlocks.RED_AMOGUS_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_AMOGUS_FENCE);
        addDrop(ModBlocks.RED_AMOGUS_FENCE_GATE);
        addDrop(ModBlocks.RED_AMOGUS_WALL);
        addDrop(ModBlocks.RED_AMOGUS_DOOR, doorDrops(ModBlocks.RED_AMOGUS_DOOR));
        addDrop(ModBlocks.RED_AMOGUS_TRAPDOOR);

        addDrop(ModBlocks.BLUE_AMOGUS_STAIRS);
        addDrop(ModBlocks.BLUE_AMOGUS_SLAB, slabDrops(ModBlocks.BLUE_AMOGUS_SLAB));
        addDrop(ModBlocks.BLUE_AMOGUS_BUTTON);
        addDrop(ModBlocks.BLUE_AMOGUS_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_AMOGUS_FENCE);
        addDrop(ModBlocks.BLUE_AMOGUS_FENCE_GATE);
        addDrop(ModBlocks.BLUE_AMOGUS_WALL);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float mindrops, float maxdrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(mindrops, maxdrops)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }
}
