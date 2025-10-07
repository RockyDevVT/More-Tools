
package dev.rocky.more.tools.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import dev.rocky.more.tools.creativetab.TabMoreToolsEquipment;
import dev.rocky.more.tools.ElementsMoreTools;

@ElementsMoreTools.ModElement.Tag
public class ItemGoldingArmor extends ElementsMoreTools.ModElement {
	@GameRegistry.ObjectHolder("more_tools:goldingarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("more_tools:goldingarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("more_tools:goldingarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("more_tools:goldingarmorboots")
	public static final Item boots = null;
	public ItemGoldingArmor(ElementsMoreTools instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GOLDINGARMOR", "more_tools:golding", 15, new int[]{5, 6, 8, 6}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("goldingarmorhelmet")
				.setRegistryName("goldingarmorhelmet").setCreativeTab(TabMoreToolsEquipment.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("goldingarmorbody")
				.setRegistryName("goldingarmorbody").setCreativeTab(TabMoreToolsEquipment.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("goldingarmorlegs")
				.setRegistryName("goldingarmorlegs").setCreativeTab(TabMoreToolsEquipment.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("goldingarmorboots")
				.setRegistryName("goldingarmorboots").setCreativeTab(TabMoreToolsEquipment.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("more_tools:goldingarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("more_tools:goldingarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("more_tools:goldingarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("more_tools:goldingarmorboots", "inventory"));
	}
}
