package com.jsmith.livemodding.blocks;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import java.util.Random;

/**
 * Created by JohnSmith0508 on 4/6/14.
 */


public class BlockLiveOre extends Block{

    /*public static final Block.SoundType soundTypeCustom = new Block.SoundType("custom", 1.0F, 1.0F)
    {
        private static final String __OBFID = "CL_00100000";

        public String func_150496_b()
        {
            return "mob.pig.death";
        }
    };*/

    public BlockLiveOre(){
        super(Material.rock);
        setBlockName("liveOre");
        //System.out.println("[DEBUG]" + getUnlocalizedName().substring(5));
        setBlockTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveMod);
        setStepSound(soundTypeStone);
        setHardness(3.0F);
        setResistance(5.0F);
        setLightLevel(0.1F);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
         public Item getItemDropped(int metadata, Random random, int fortune){
        return livemodding.liveIngot;

    }



}