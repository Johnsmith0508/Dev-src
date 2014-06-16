package com.jsmith.livemodding.items;

import com.jsmith.livemodding.help.Refrence;
import com.jsmith.livemodding.livemodding;
import net.minecraft.item.ItemArmor;

/**
 * Created by JohnSmith0508 on 13/6/14.
 */
public class ItemLiveArmor extends ItemArmor{
    public ItemLiveArmor (ArmorMaterial material, int armorType, String name){
        super(material, 0, armorType);
        setUnlocalizedName(name);
        setTextureName(Refrence.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(livemodding.tabLiveModTwo);
    }
}
