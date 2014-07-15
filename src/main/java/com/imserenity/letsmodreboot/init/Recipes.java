package com.imserenity.letsmodreboot.init;

import com.imserenity.letsmodreboot.block.BlockLMRB;
import com.imserenity.letsmodreboot.block.BlockWandEnchanter;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Thomas on 11/07/2014.
 */
public class Recipes 
{

    public static void init()
    {
        initModRecipes();
    }

    private static void initModRecipes()
    {
        //Block recipes - Output, Input
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.wandEnchanter, 9), Blocks.dirt);

        //Item recipes - Output, top line, middle line, bottom line, declare letterN, declare itemN
        GameRegistry.addRecipe(new ItemStack(ModItems.defaultWand), "  a", "aa ", "aa ", 'a', Items.stick);

        //Smelting recipes - Input, Output, XP
        GameRegistry.addSmelting(Blocks.dirt, new ItemStack(ModBlocks.wandEnchanter), 100F);
    }
}
