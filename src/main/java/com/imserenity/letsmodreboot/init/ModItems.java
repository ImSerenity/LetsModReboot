package com.imserenity.letsmodreboot.init;

import com.imserenity.letsmodreboot.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Thomas on 07/07/2014.
 */
public class ModItems
{
    public static final ItemLMRB waterWand = new ItemWaterWand();
    public static final ItemLMRB earthWand = new ItemEarthWand();
    public static final ItemLMRB fireWand = new ItemFireWand();
    public static final ItemLMRB defaultWand = new ItemDefaultWand();
    public static final ItemLMRB gemmedWand = new ItemGemmedWand();

    public static void init()
    {
        GameRegistry.registerItem(waterWand, "waterWand");
        GameRegistry.registerItem(earthWand, "earthWand");
        GameRegistry.registerItem(fireWand, "fireWand");
        GameRegistry.registerItem(defaultWand, "defaultWand");
        GameRegistry.registerItem(gemmedWand, "gemmedWand");
    }
}
