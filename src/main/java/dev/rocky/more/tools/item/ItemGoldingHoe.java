
package dev.rocky.more.tools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import dev.rocky.more.tools.creativetab.TabMoreToolsEquipment;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class ItemGoldingHoe extends ElementsMoreTools.ModElement {
	@GameRegistry.ObjectHolder("more_tools:goldinghoe")
	public static final Item block = null;
	public ItemGoldingHoe(ElementsMoreTools instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("GOLDINGHOE", 2, 250, 6f, 0f, 14)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("goldinghoe").setRegistryName("goldinghoe").setCreativeTab(TabMoreToolsEquipment.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("more_tools:goldinghoe", "inventory"));
	}
}
