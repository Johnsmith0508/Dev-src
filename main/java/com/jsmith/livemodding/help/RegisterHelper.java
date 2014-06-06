package com.jsmith.livemodding.help;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by JohnSmith0508 on 4/6/14.
 */
public class RegisterHelper {
    public static void registerBlock(Block block){
        GameRegistry.registerBlock(block , Refrence.MODID + "_" + block.getUnlocalizedName().substring(5));
    }
    public static void registerItem(Item item){
        GameRegistry.registerItem(item , Refrence.MODID + "_" + item.getUnlocalizedName().substring(5));
    }
}
