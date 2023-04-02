package com.katatukimod.katatukimod.items;

import com.katatukimod.katatukimod.init.ModItems;
import com.katatukimod.katatukimod.util.IHasModel;
import com.katatukimod.katatukimod.Main;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.TUTORIAL_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
