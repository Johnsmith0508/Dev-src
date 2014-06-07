package com.jsmith.livemodding;

import com.jsmith.livemodding.blocks.*;
import com.jsmith.livemodding.help.RegisterHelper;
import cpw.mods.fml.common.Mod;
import com.jsmith.livemodding.help.Refrence;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import com.jsmith.livemodding.items.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.Block;

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

    //Tools
    public static Item livePickake;
    public static Item liveShovel;
    public static Item debugTool;
    public static Item liveAxe;
    public static Item liveSword;
    public static Item liveFishingRod;

    //materials
    static Item.ToolMaterial liveMaterial = EnumHelper.addToolMaterial("liveMaterial", 3, 750, 7.0F, 2.0F, 15);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
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



        //Tools

        livePickake = new ItemLivePickaxe(liveMaterial);
        RegisterHelper.registerItem(livePickake);

        debugTool = new ItemDebugTool();
        RegisterHelper.registerItem(debugTool);

        liveShovel = new ItemLiveShovel(liveMaterial);
        RegisterHelper.registerItem(liveShovel);

        liveAxe = new ItemLiveAxe(liveMaterial);
        RegisterHelper.registerItem(liveAxe);

        liveSword = new ItemLiveSword(liveMaterial);
        RegisterHelper.registerItem(liveSword);

        liveFishingRod = new ItemLiveFishRod();
        RegisterHelper.registerItem(liveFishingRod);

        Refrence.Recipies();



    }
}