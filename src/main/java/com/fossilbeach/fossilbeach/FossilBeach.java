/**
 * This is your main file, everything stems from here
 * Comment on different functions, chances are you'll forget what they do
 */
package com.fossilbeach.fossilbeach;
import com.fossilbeach.fossilbeach.blocks.Blocks;
import com.fossilbeach.fossilbeach.items.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FossilBeach.MOD_ID)
public class FossilBeach {
    public FossilBeach(){
        Items.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Blocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

public static final String MOD_ID = "fossilbeach";

}


