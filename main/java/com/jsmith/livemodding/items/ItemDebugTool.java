package com.jsmith.livemodding.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import com.jsmith.livemodding.help.Refrence;
/**
 * Created by JohnSmith0508 on 5/6/14.
 */
public class ItemDebugTool extends Item {
    public ItemDebugTool(){
        super();
        setUnlocalizedName("DebugTool");
        //setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabFood);
    }
}
