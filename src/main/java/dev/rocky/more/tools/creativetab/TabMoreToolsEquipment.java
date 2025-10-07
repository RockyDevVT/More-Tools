
package dev.rocky.more.tools.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import dev.rocky.more.tools.item.ItemJunnerSword;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class TabMoreToolsEquipment extends ElementsMoreTools.ModElement {
	public TabMoreToolsEquipment(ElementsMoreTools instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmoretoolsequipment") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemJunnerSword.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
