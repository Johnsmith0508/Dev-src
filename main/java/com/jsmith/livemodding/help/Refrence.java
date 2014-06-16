package com.jsmith.livemodding.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import com.jsmith.livemodding.livemodding;

/**
 * Created by JohnSmith0508 on 4/6/14.
 */
public class Refrence {
    public static final String MODID = "jsmith_livemodding";
    public static final String VERSION = "1.0";

    public static void Recipies(){
        GameRegistry.addRecipe(new ItemStack(livemodding.livePickake), new Object[]
                {
                        "XXX",
                        " Y ",
                        " Y ",
                        'X', livemodding.liveIngot, 'Y', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(livemodding.liveBlock), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'X', livemodding.liveIngot
        });
        GameRegistry.addRecipe(new ItemStack(livemodding.fancyLarge), new Object[]{
                "XX",
                "XX",
                'X', livemodding.liveIngot
        });
        GameRegistry.addRecipe(new ItemStack(livemodding.liveAxe), new Object[]{
                "XX ",
                "XY ",
                " Y ",
                'X', livemodding.liveIngot, 'Y', Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(livemodding.liveShovel), new Object[]{
                "X",
                "Y",
                "Y",
                'X', livemodding.liveIngot,'Y',Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(livemodding.liveSword), new Object[]{
                "X",
                "X",
                "Y",
                'X',livemodding.liveIngot,'Y',Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(livemodding.liveHelmet), new Object[]{
                "XXX",
                "X X",
                'X', livemodding.liveIngot
        });

        GameRegistry.addShapelessRecipe(new ItemStack(livemodding.liveIngot,9), new Object[]{livemodding.liveBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(livemodding.fancySmall), new Object[]{livemodding.fancyLarge});
        GameRegistry.addShapelessRecipe(new ItemStack(livemodding.fancyChisel), new Object[]{livemodding.fancySmall});
        GameRegistry.addShapelessRecipe(new ItemStack(livemodding.fancyLarge), new Object[]{livemodding.fancyChisel});

    }

}
