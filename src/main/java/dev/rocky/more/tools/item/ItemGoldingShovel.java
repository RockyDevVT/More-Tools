
package dev.rocky.more.tools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import dev.rocky.more.tools.creativetab.TabMoreToolsEquipment;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class ItemGoldingShovel extends ElementsMoreTools.ModElement {
	@GameRegistry.ObjectHolder("more_tools:goldingshovel")
	public static final Item block = null;
	public ItemGoldingShovel(ElementsMoreTools instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("GOLDINGSHOVEL", 2, 250, 6f, -2f, 14)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("goldingshovel").setRegistryName("goldingshovel").setCreativeTab(TabMoreToolsEquipment.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("more_tools:goldingshovel", "inventory"));
	}
}
