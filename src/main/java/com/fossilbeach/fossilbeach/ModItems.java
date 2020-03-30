package com.fossilbeach.fossilbeach;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems{
    //The BLOCKITEMS deferred register in which you can register items.
    public static final DeferredRegister<Item> BLOCKITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FossilBeach.MOD_ID);

    //Register items with their registry name and its default properties here.
    public static final RegistryObject<Item> GREENSAND_STONE = BLOCKITEMS.register("greensand_stone", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> GREENSAND_STONE_FOSSIL = BLOCKITEMS.register("greensand_stone_fossil", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> GREENSAND_SAND = BLOCKITEMS.register("greensand_sand", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> GREENSAND_DIRT = BLOCKITEMS.register("greensand_dirt", () -> new Item(new BlockItem.Properties()));
    public static final RegistryObject<Item> GREENSAND_CLAY = BLOCKITEMS.register("greensand_clay", () -> new Item(new BlockItem.Properties()));
}

