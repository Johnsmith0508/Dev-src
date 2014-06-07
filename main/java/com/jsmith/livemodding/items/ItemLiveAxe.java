package com.jsmith.livemodding.items;

import net.minecraft.item.ItemAxe;
import net.minecraft.creativetab.CreativeTabs;
import com.jsmith.livemodding.help.Refrence;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class ItemLiveAxe extends ItemAxe {
    public ItemLiveAxe(ToolMaterial material){
        super(material);
        setUnlocalizedName("liveAxe");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabFood);

    }
}
