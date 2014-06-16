package com.jsmith.livemodding.items;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.item.ItemSpade;

/**
 * Created by JohnSmith0508 on 6/6/14.
 */
public class ItemLiveShovel extends ItemSpade {
    public ItemLiveShovel(ToolMaterial material) {
        super(material);
        setUnlocalizedName("liveShovel");
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveModTwo);
    }
}
