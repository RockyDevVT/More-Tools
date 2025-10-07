
package dev.rocky.more.tools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import dev.rocky.more.tools.item.ItemMystericSoap;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class TabMoreToolsFood extends ElementsMoreTools.ModElement {
	public TabMoreToolsFood(ElementsMoreTools instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmoretoolsfood") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemMystericSoap.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
