package net.agaaaa.tutorialmod.item;

import net.agaaaa.tutorialmod.TutorialMod;
import net.agaaaa.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup AMOGUS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "amogus_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_AMOGUS))
                    .displayName(Text.translatable("itemgroups.tutorialmod.amogus_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_AMOGUS);
                        entries.add(ModItems.BLUE_AMOGUS);
                    }).build());
    public static final ItemGroup AMOGUS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "amogus_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RED_AMOGUS_BLOCK))
                    .displayName(Text.translatable("itemgroups.tutorialmod.amogus_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLUE_AMOGUS_BLOCK);
                        entries.add(ModBlocks.RED_AMOGUS_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
