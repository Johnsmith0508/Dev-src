package com.jsmith.livemodding.items;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.item.ItemSword;

/**
 * Created by JohnSmith0508 on 14/6/14.
 */
public class ItemLiveShortSword extends ItemSword {
    public ItemLiveShortSword(ToolMaterial material) {
        super(material);
        setUnlocalizedName("liveShortSword");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveModTwo);
    }
}
