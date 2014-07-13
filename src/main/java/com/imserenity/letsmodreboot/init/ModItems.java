package com.imserenity.letsmodreboot.init;

import com.imserenity.letsmodreboot.item.*;
import com.imserenity.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Thomas on 07/07/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB defaultWand = new ItemDefaultWand();
    public static final ItemLMRB gemmedWand = new ItemGemmedWand();
    public static final ItemLMRB waterWand = new ItemWaterWand();
    public static final ItemLMRB earthWand = new ItemEarthWand();
    public static final ItemLMRB fireWand = new ItemFireWand();

    public static void init()
    {
        GameRegistry.registerItem(defaultWand, "defaultWand");
        GameRegistry.registerItem(gemmedWand, "gemmedWand");
        GameRegistry.registerItem(waterWand, "waterWand");
        GameRegistry.registerItem(earthWand, "earthWand");
        GameRegistry.registerItem(fireWand, "fireWand");
    }
}
