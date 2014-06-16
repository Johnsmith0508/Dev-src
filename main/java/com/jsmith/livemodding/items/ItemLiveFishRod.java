package com.jsmith.livemodding.items;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.item.ItemFishingRod;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class ItemLiveFishRod extends ItemFishingRod {
    public ItemLiveFishRod(){
        super();
        setUnlocalizedName("LiveFishingRod");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveModTwo);

    }
}
