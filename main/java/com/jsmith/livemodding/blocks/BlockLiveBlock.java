package com.jsmith.livemodding.blocks;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by JohnSmith0508 on 5/6/14.
 */
public class BlockLiveBlock extends Block {
    public BlockLiveBlock(){
        super(Material.rock);
        setBlockName("liveBlock");
        setCreativeTab(livemodding.tabLiveMod);
        setHardness(3.0F);
        setHarvestLevel("pickaxe", 2);
        setStepSound(soundTypeStone);
        setBlockTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));

    }
}
