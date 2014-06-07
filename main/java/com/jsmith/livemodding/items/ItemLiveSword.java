package com.jsmith.livemodding.items;

import com.jsmith.livemodding.help.Refrence;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class ItemLiveSword extends ItemSword {
    public ItemLiveSword(ToolMaterial material){
        super(material);
        setUnlocalizedName("liveSword");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabFood);
    }
}
