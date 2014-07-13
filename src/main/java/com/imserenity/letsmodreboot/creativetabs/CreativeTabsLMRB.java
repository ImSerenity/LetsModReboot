package com.imserenity.letsmodreboot.creativetabs;

import com.imserenity.letsmodreboot.init.ModBlocks;
import com.imserenity.letsmodreboot.init.ModItems;
import com.imserenity.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Thomas on 13/07/2014.
 */
public class CreativeTabsLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.wandEnchanter);
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot";
        }
    };

    public static final CreativeTabs LMRB_WAND = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.gemmedWand;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Let's Mod Reboot Wands";
        }
    };
}
