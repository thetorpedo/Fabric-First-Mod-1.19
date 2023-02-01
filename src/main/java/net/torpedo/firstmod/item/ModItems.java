package net.torpedo.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.torpedo.firstmod.FirstMod;

public class ModItems {

    public static final Item BALL_OF_YARN = registerItem("ball_of_yarn",
            new Item(new FabricItemSettings()));
    public static final Item LASER_POINTER = registerItem("laser_pointer",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.FUNCTIONAL, BALL_OF_YARN);
        addToItemGroup(ItemGroups.FUNCTIONAL, LASER_POINTER);

        addToItemGroup(ModItemGroup.MOD_ITEMS, BALL_OF_YARN);
        addToItemGroup(ModItemGroup.MOD_ITEMS, LASER_POINTER);


    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems(){
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);
    }

}
