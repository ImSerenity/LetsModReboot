package com.imserenity.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Thomas on 07/07/2014.
 */
public class ConfigurationHandler
{

    public static void init(File configFile)
    {

        //Create config object from given config file
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;

        try
        {
            //Load config file
            configuration.load();

            //Read properties from config file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log the exception
        }
        finally
        {
            //Save config file
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);

    }
}
