package com.jsmith.livemodding.blocks;
//384
import com.jsmith.livemodding.help.Refrence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class BlockFancyChisel extends Block {
    public BlockFancyChisel(){
        super(Material.rock);
        setBlockName("chiselFancy");
        setBlockTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabFood);
        setStepSound(soundTypeStone);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);

    }
}
