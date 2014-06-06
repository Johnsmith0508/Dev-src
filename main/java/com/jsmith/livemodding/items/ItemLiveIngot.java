package com.jsmith.livemodding.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.jsmith.livemodding.help.Refrence;

/**
 * Created by JohnSmith0508 on 4/6/14.
 */
public class ItemLiveIngot extends Item{

    public ItemLiveIngot(){
        super();
        setUnlocalizedName("LiveIngot");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabFood);
    }
}
