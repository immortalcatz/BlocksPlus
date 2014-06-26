package info.dylangore.blocksplus.blocks.item;

import info.dylangore.blocksplus.reference.BlockReference;
import info.dylangore.blocksplus.handler.BPBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockColorStoneBrickCracked extends ItemBlock{

	public static String unlocName = BPBlocks.colorStoneBricksCracked.getUnlocalizedName();

	public ItemBlockColorStoneBrickCracked(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack stack)
    {
          return unlocName + "_" + BlockReference.colorBlockNames[stack.getItemDamage()];
    }
   
    public int getMetadata(int meta)
    {
          return meta;
    }
}
