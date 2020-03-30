package com.fossilbeach.fossilbeach;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    //The BLOCKS deferred register in which you can register blocks.
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FossilBeach.MOD_ID);

    //Register blocks with their registry name and its default properties here.
    public static final RegistryObject<Block> GREENSAND_STONE = BLOCKS.register("greensand_stone", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> GREENSAND_STONE_FOSSIL = BLOCKS.register("greensand_stone_Fossil", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> GREENSAND_SAND = BLOCKS.register("greensand_sand", () -> new Block(Block.Properties.create(Material.SAND)));
    public static final RegistryObject<Block> GREENSAND_DIRT = BLOCKS.register("greensand_dirt", () -> new Block(Block.Properties.create(Material.EARTH)));
    public static final RegistryObject<Block> GREENSAND_CLAY = BLOCKS.register("greensand_clay", () -> new Block(Block.Properties.create(Material.CLAY)));
}
