package com.fossilbeach.fossilbeach.items;


import com.fossilbeach.fossilbeach.FossilBeach;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class Items
{

    //The ITEMS deferred register in which you can register items.
   public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FossilBeach.MOD_ID);

   //Register items with their registry name and its default properties here.
   public static final RegistryObject<Item> Greensand_Stone = ITEMS.register("greensand_stone", () -> new Item(new BlockItem.Properties()));
   public static final RegistryObject<Item> Greensand_Stone_Fossil = ITEMS.register("greensand_stone_fossil", () -> new Item(new BlockItem.Properties()));
   public static final RegistryObject<Item> Greensand_Sand = ITEMS.register("greensand_sand", () -> new Item(new BlockItem.Properties()));
   public static final RegistryObject<Item> Greensand_Dirt = ITEMS.register("greensand_dirt", () -> new Item(new BlockItem.Properties()));
   public static final RegistryObject<Item> Greensand_Clay = ITEMS.register("greensand_clay", () -> new Item(new BlockItem.Properties()));

    //Register the item here
   public static final RegistryObject<Item> Pyrite_Ammonite = ITEMS.register("pyrite_ammonite", () -> new Item(new Item.Properties()));



  //  public static Item greensand_stone;
    //public static Item greensand_stone_fossil;
    //public static Item greensand_sand;
   // public static Item greensand_dirt;
   // public static Item greensand_clay;
   // public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FossilBeach.MOD_ID);

   // @SubscribeEvent
    //public static void registerItem(final RegistryEvent.Register<Item>){}
}


