package ie.dylangore.blocksplus.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Project: BlocksPlus
 * File: CommonProxy
 * Author: Dylan Gore (hello@dylangore.ie)
 * Date Created: 08 January 2017
 */
public class CommonProxy {
    public void init(FMLInitializationEvent event){
        //CLIENT ONLY
    }

    public void registerItemRenderer(Item item, int meta, String id) {
        //CLIENT ONLY
    }

    public void registerColorItemRenderer(Item item, int meta, String id) {
        //CLIENT ONLY
    }
}
