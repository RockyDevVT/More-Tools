
package dev.rocky.more.tools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import dev.rocky.more.tools.item.ItemJunnerIngot;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class TabMoreToolsItems extends ElementsMoreTools.ModElement {
	public TabMoreToolsItems(ElementsMoreTools instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmoretoolsitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemJunnerIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
