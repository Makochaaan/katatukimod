package com.katatukimod.katatukimod.items.tools;

import com.katatukimod.katatukimod.Main;
import com.katatukimod.katatukimod.init.ModItems;
import com.katatukimod.katatukimod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
