package com.jsmith.livemodding;

import com.jsmith.livemodding.blocks.*;
import com.jsmith.livemodding.help.RegisterHelper;
import cpw.mods.fml.common.Mod;
import com.jsmith.livemodding.help.Refrence;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import com.jsmith.livemodding.items.*;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by JohnSmith0508 on 4/6/14.
 */
@Mod(modid = Refrence.MODID, version = Refrence.VERSION)
public class livemodding {

    public static BlockLiveOre liveOre;
    public static ItemLiveIngot liveIngot;
    public static Block liveBlock;
    public static Block fancyLarge;
    public static Block fancySmall;
    public static Block fancyChisel;
    public static Block betterTNT;

    //Tools
    public static Item livePickake;
    public static Item liveShovel;
    public static Item debugTool;
    public static Item liveAxe;
    public static Item liveSword;
    public static Item liveFishingRod;
    public static Item liveHelmet;
    public static Item liveShortSword;

    //materials
    static Item.ToolMaterial liveToolMaterial = EnumHelper.addToolMaterial("liveToolMaterial", 3, 750, 7.0F, 2.0F, 15);
    static ItemArmor.ArmorMaterial liveArmorMaterial = EnumHelper.addArmorMaterial("liveArmorMaterial", 50, new int[]{2, 6, 5, 2}, 20);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)        {
            liveOre = new BlockLiveOre();
            RegisterHelper.registerBlock(liveOre);

            liveIngot = new ItemLiveIngot();
            RegisterHelper.registerItem(liveIngot);

            liveBlock = new BlockLiveBlock();
            RegisterHelper.registerBlock(liveBlock);

            fancyLarge = new BlockFancyLarge();
            RegisterHelper.registerBlock(fancyLarge);

            fancySmall = new BlockFancySmall();
            RegisterHelper.registerBlock(fancySmall);

            fancyChisel = new BlockFancyChisel();
            RegisterHelper.registerBlock(fancyChisel);

            betterTNT = new BlockBetterTNT();
            RegisterHelper.registerBlock(betterTNT);



            //Tools

            livePickake = new ItemLivePickaxe(liveToolMaterial);
            RegisterHelper.registerItem(livePickake);

            debugTool = new ItemDebugTool();
            RegisterHelper.registerItem(debugTool);

            liveShovel = new ItemLiveShovel(liveToolMaterial);
            RegisterHelper.registerItem(liveShovel);

            liveAxe = new ItemLiveAxe(liveToolMaterial);
            RegisterHelper.registerItem(liveAxe);

            liveSword = new ItemLiveSword(liveToolMaterial);
            RegisterHelper.registerItem(liveSword);

            liveFishingRod = new ItemLiveFishRod();
            RegisterHelper.registerItem(liveFishingRod);

            liveShortSword = new ItemLiveShortSword(liveToolMaterial);
            RegisterHelper.registerItem(liveShortSword);

            //armor
            liveHelmet = new ItemLiveArmor(liveArmorMaterial, 0,"liveHelmet");
            RegisterHelper.registerItem(liveHelmet);

            Refrence.Recipies();

        }
    // tabLiveMod is Blocks
    // tabLiveModTwo is Items
    public static CreativeTabs tabLiveMod = new CreativeTabs(12, "liveMod"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(fancySmall);
        }
    };

   public static CreativeTabs tabLiveModTwo = new CreativeTabs(13, "liveModTwo"){
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {return liveIngot;}
    };

}