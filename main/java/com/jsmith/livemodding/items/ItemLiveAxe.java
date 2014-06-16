package com.jsmith.livemodding.items;

import com.jsmith.livemodding.livemodding;
import net.minecraft.item.ItemAxe;
import com.jsmith.livemodding.help.Refrence;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class ItemLiveAxe extends ItemAxe {
    public ItemLiveAxe(ToolMaterial material){
        super(material);
        setUnlocalizedName("liveAxe");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveModTwo);

    }
}
