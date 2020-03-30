package com.fossilbeach.fossilbeach.blocks;


import com.fossilbeach.fossilbeach.FossilBeach;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Ignore this bit, it's just there for reference whilst I try something new.
 */
//public class BlockRegistry {
    //The BLOCKS deferred register in which you can register blocks.
    //public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FossilBeach.MOD_ID);

    //Register blocks with their registry name and its default properties here.
    //public static final RegistryObject<Block> greensand_stone = BLOCKS.register("greensand_stone", () -> new Block(Block.Properties.create(Material.ROCK)));
   // public static final RegistryObject<Block> greensand_stone_Fossil = BLOCKS.register("greensand_stone_fossil", () -> new Block(Block.Properties.create(Material.ROCK)));
   // public static final RegistryObject<Block> greensand_sand = BLOCKS.register("greensand_sand", () -> new Block(Block.Properties.create(Material.SAND)));
   // public static final RegistryObject<Block> greensand_dirt = BLOCKS.register("greensand_dirt", () -> new Block(Block.Properties.create(Material.EARTH)));
   // public static final RegistryObject<Block> greensand_clay = BLOCKS.register("greensand_clay", () -> new Block(Block.Properties.create(Material.CLAY)));

public class BlockRegistry
{

    public static Block greensand_stone;
    public static Block greensand_stone_fossil;
    public static Block greensand_sand;
    public static Block greensand_dirt;
    public static Block greensand_clay;
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FossilBeach.MOD_ID);

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
        {

            greensand_stone = registerBlock(new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(0.6f).sound(SoundType.STONE))), "greensand_stone");
            greensand_stone_fossil = registerBlock(new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(0.6f).sound(SoundType.STONE))), "greensand_stone_fossil");
            greensand_sand = registerBlock(new Block((Block.Properties.create(Material.SAND).hardnessAndResistance(0.6f).sound(SoundType.SAND))), "greensand_sand");
            greensand_dirt = registerBlock(new Block((Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6f).sound(SoundType.GROUND))), "greensand_dirt");
            greensand_clay = registerBlock(new Block((Block.Properties.create(Material.CLAY).hardnessAndResistance(0.6f).sound(SoundType.GROUND))), "greensand_clay");

        }

    private static Block registerBlock(Block block, String name) {
        return null;
    }
}