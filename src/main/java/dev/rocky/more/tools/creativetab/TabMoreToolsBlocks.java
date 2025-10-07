
package dev.rocky.more.tools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import dev.rocky.more.tools.block.BlockTraciaLog;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class TabMoreToolsBlocks extends ElementsMoreTools.ModElement {
	public TabMoreToolsBlocks(ElementsMoreTools instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmoretoolsblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockTraciaLog.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
