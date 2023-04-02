package com.katatukimod.katatukimod.items.tools;

import com.katatukimod.katatukimod.Main;
import com.katatukimod.katatukimod.init.ModItems;
import com.katatukimod.katatukimod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0F, -3.2F);
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
