
package dev.rocky.more.tools.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import dev.rocky.more.tools.block.BlockTraciaPlanks;
import dev.rocky.more.tools.block.BlockTraciaLog;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class OreDictTraciaBlocks extends ElementsMoreTools.ModElement {
	public OreDictTraciaBlocks(ElementsMoreTools instance) {
		super(instance, 55);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("traciablocks", new ItemStack(BlockTraciaLog.block, (int) (1)));
		OreDictionary.registerOre("traciablocks", new ItemStack(BlockTraciaPlanks.block, (int) (1)));
	}
}
