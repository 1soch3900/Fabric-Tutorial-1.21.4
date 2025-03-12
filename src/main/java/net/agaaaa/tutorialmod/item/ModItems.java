package net.agaaaa.tutorialmod.item;

import net.agaaaa.tutorialmod.TutorialMod;
import net.agaaaa.tutorialmod.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RED_AMOGUS = registerItem("red_amogus", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TutorialMod.MOD_ID, "red_amogus")))));
    public static final Item BLUE_AMOGUS = registerItem("blue_amogus", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TutorialMod.MOD_ID, "blue_amogus")))));
    public static final Item AMOGUS_CHISEL = registerItem("amogus_chisel", new ChiselItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TutorialMod.MOD_ID, "amogus_chisel"))).maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RED_AMOGUS);
            fabricItemGroupEntries.add(BLUE_AMOGUS);
        });
    }
}
