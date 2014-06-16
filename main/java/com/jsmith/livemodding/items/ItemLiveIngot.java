package com.jsmith.livemodding.items;

import com.jsmith.livemodding.livemodding;
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
        setCreativeTab(livemodding.tabLiveModTwo);
    }
}
