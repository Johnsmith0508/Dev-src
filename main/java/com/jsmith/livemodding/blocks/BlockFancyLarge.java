package com.jsmith.livemodding.blocks;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 5/6/14.
 */
public class BlockFancyLarge extends Block {
    public BlockFancyLarge(){
        super(Material.rock);
        setBlockName("largeFancy");
        setBlockTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveMod);
        setStepSound(soundTypeStone);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
