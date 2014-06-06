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

    //Tools
    public static Item livePickake;
    public static Item debugTool;

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



        //Tools

        livePickake = new ItemLivePickaxe(liveMaterial);
        RegisterHelper.registerItem(livePickake);

        debugTool = new ItemDebugTool();
        RegisterHelper.registerItem(debugTool);
        GameRegistry.addRecipe(new ItemStack(livePickake), new Object[]
                {
                        "XXX",
                        " Y ",
                        " Y ",
                        'X', liveIngot, 'Y', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(liveBlock), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'X', liveIngot
        });
        GameRegistry.addShapelessRecipe(new ItemStack(liveIngot,9), new Object[]{
                liveBlock
        });


    }
}