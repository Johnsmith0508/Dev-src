package com.jsmith.livemodding.items;


import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;
import com.jsmith.livemodding.help.Refrence;

/**
 * Created by JohnSmith0508 on 5/6/14.
 */
public class ItemLivePickaxe extends ItemPickaxe {
    public ItemLivePickaxe(ToolMaterial material){
        super(material);
        setUnlocalizedName("livePickaxe");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabFood);



    }
}
