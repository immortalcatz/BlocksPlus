package info.dylangore.blocksplus.handler;

import info.dylangore.blocksplus.blocks.BlockColored;
import info.dylangore.blocksplus.blocks.item.*;
import info.dylangore.blocksplus.reference.BlockReference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class BPBlocks {

    public static final String[] colors = {"White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

	/* Block Declaration */
	public static Block colorCobble = new BlockColored("cobblestone", "colorCobble");
	public static Block colorStone = new BlockColored("stone", "colorStone");
	public static Block colorStoneBricks = new BlockColored("stonebrick", "colorStoneBrick");
	public static Block colorStoneBricksMoss = new BlockColored("stonebrick_moss", "colorStoneBrickMoss");
	public static Block colorStoneBricksCracked = new BlockColored("stonebrick_cracked", "colorStoneBrickCracked");
	public static Block colorStoneBricksChiseled = new BlockColored("stonebrick_carved", "colorStoneBrickChiseled");
	
	//public static Block secureBlock;
	//public static Block phantomBlock;

    public static void init(){
        regBlocks();
        regTileEntities();
    }

	public static void regBlocks(){
		GameRegistry.registerBlock(colorCobble, ItemBlockColorCobble.class, "colorCobblestone");
		GameRegistry.registerBlock(colorStone, ItemBlockColorStone.class, "colorStone");
		GameRegistry.registerBlock(colorStoneBricks, ItemBlockColorStoneBrick.class ,"colorStoneBrick");
		GameRegistry.registerBlock(colorStoneBricksMoss, ItemBlockColorStoneBrickMoss.class, "colorStoneBrickMoss");
		GameRegistry.registerBlock(colorStoneBricksCracked, ItemBlockColorStoneBrickCracked.class, "colorStoneBrickCracked");
		GameRegistry.registerBlock(colorStoneBricksChiseled, ItemBlockColorStoneBrickChiseled.class ,"colorStoneBrickChiseled");

		/* Ore Dict */
		for(int meta = 0; meta < BlockReference.colorBlockNames.length; meta ++){
			OreDictionary.registerOre("stone", new ItemStack(colorStone, 1, meta));
			OreDictionary.registerOre("cobblestone", new ItemStack(colorCobble, 1, meta));
            OreDictionary.registerOre("brickStone", new ItemStack(colorStoneBricks, 1, meta));
            OreDictionary.registerOre("brickStoneMossy", new ItemStack(colorStoneBricksMoss, 1, meta));
            OreDictionary.registerOre("brickStoneCracked", new ItemStack(colorStoneBricksCracked, 1, meta));
            OreDictionary.registerOre("brickStoneChiseled", new ItemStack(colorStoneBricksChiseled, 1, meta));
		}
	}
	
	public static void regTileEntities(){
	}
	
}