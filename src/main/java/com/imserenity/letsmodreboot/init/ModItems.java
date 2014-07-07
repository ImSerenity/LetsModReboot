package com.imserenity.letsmodreboot.init;

import com.imserenity.letsmodreboot.item.ItemLMRB;
import com.imserenity.letsmodreboot.item.ItemWaterWand;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Thomas on 07/07/2014.
 */
public class ModItems
{
    public static final ItemLMRB waterWand = new ItemWaterWand();

    public static void init()
    {
        GameRegistry.registerItem(waterWand, "waterWand");
    }
}
