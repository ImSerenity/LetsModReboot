package com.imserenity.letsmodreboot.block;

/**
 * Created by Thomas on 08/07/2014.
 */
public class BlockWandEnchanter extends BlockLMRB
{
    public BlockWandEnchanter()
    {
        super();
        this.setBlockName("wandEnchanter");
        this.setBlockTextureName("wandEnchanter");
        //Light value = float value * 15F // - value wanted/15 = value to enter
        this.setLightLevel(1.0F);
    }
}
