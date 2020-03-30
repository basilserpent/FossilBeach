package com.fossilbeach.fossilbeach.blocks;


import com.fossilbeach.fossilbeach.FossilBeach;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Ignore this bit, it's just there for reference whilst I try something new.
 */
public class Blocks {
    //The BLOCKS deferred register in which you can register blocks.
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FossilBeach.MOD_ID);

    //Register blocks with their registry name and its default properties here.
    public static final RegistryObject<Block> greensand_stone = BLOCKS.register("greensand_stone", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> greensand_stone_Fossil = BLOCKS.register("greensand_stone_fossil", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> greensand_sand = BLOCKS.register("greensand_sand", () -> new Block(Block.Properties.create(Material.SAND)));
    public static final RegistryObject<Block> greensand_dirt = BLOCKS.register("greensand_dirt", () -> new Block(Block.Properties.create(Material.EARTH)));
    public static final RegistryObject<Block> greensand_clay = BLOCKS.register("greensand_clay", () -> new Block(Block.Properties.create(Material.CLAY)));
}
