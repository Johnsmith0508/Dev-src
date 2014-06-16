package com.jsmith.livemodding.blocks;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
//import net.minecraft.client.renderer.texture.IIconRegister;
//import net.minecraft.init.Blocks;
//import net.minecraft.util.IIcon;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class BlockFancyChisel extends Block {
    public BlockFancyChisel(){
        super(Material.rock);
        setBlockName("chiselFancy");
        setBlockTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveMod);
        setStepSound(soundTypeStone);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);


    }
    /*@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_149991_b = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_149993_M = p_149651_1_.registerIcon(this.getTextureName() + "_side_snowed");
        this.field_149994_N = p_149651_1_.registerIcon(this.getTextureName() + "_side_overlay");
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149991_b : (p_149691_1_ == 0 ? Blocks.dirt.getBlockTextureFromSide(p_149691_1_) : this.blockIcon);
    }*/
}
