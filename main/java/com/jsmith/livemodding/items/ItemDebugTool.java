package com.jsmith.livemodding.items;

import com.jsmith.livemodding.livemodding;
import net.minecraft.item.Item;
/**
 * Created by JohnSmith0508 on 5/6/14.
 */
public class ItemDebugTool extends Item {
    public ItemDebugTool(){
        super();
        setUnlocalizedName("DebugTool");
        //setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveModTwo);
    }
}
