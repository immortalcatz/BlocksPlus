package dylangore.mods.blocksplus.blocks.item;

import dylangore.mods.blocksplus.lib.BlockInfo;
import dylangore.mods.blocksplus.registry.BPBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockColorStoneBrick extends ItemBlock{

	public static String unlocName = BPBlocks.colorStoneBricks.getUnlocalizedName();

	public ItemBlockColorStoneBrick(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack stack)
    {
          return unlocName + "_" + BlockInfo.colorBlockNames[stack.getItemDamage()];
    }
   
    public int getMetadata(int meta)
    {
          return meta;
    }
}
