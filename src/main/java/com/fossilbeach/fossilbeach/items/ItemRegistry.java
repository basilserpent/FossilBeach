package com.fossilbeach.fossilbeach.items;


import com.fossilbeach.fossilbeach.FossilBeach;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    //The BLOCKITEMS deferred register in which you can register block items.
    public static final DeferredRegister<Item> BLOCKITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FossilBeach.MOD_ID);

    //Register items with their registry name and its default properties here.
    public static final RegistryObject<Item> Greensand_Stone = BLOCKITEMS.register("greensand_stone", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> Greensand_Stone_Fossil = BLOCKITEMS.register("greensand_stone_fossil", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> Greensand_Sand = BLOCKITEMS.register("greensand_sand", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> Greensand_Dirt = BLOCKITEMS.register("greensand_dirt", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> Greensand_Clay = BLOCKITEMS.register("greensand_clay", () -> new Item(new BlockItem.Properties()));

    //The ITEMS version of the BLOCKITEMS deferred register
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FossilBeach.MOD_ID);

    //Register the item here
    public static final RegistryObject<Item> Pyrite_Ammonite = ITEMS.register("pyrite_ammonite", () -> new Item(new Item.Properties()));
}

