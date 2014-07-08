package com.imserenity.letsmodreboot.init;

import com.imserenity.letsmodreboot.block.BlockLMRB;
import com.imserenity.letsmodreboot.block.BlockWandEnchanter;
import com.imserenity.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Thomas on 08/07/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB wandEnchanter = new BlockWandEnchanter();

    public static void init()
    {
        GameRegistry.registerBlock(wandEnchanter, "wandEnchanter");
    }
}
