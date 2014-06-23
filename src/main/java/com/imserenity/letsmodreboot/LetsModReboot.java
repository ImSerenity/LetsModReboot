package com.imserenity.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Thomas on 23/06/2014.
 */

@Mod(modid="LetsModReboot", name="LetsModReboot", version="1.7.2-1.0")
public class LetsModReboot {
    //test
    //modid parameter - tamper check
    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
