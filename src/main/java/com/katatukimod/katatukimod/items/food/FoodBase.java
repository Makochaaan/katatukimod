package com.katatukimod.katatukimod.items.food;

import com.katatukimod.katatukimod.Main;
import com.katatukimod.katatukimod.init.ModItems;
import com.katatukimod.katatukimod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel 
{
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount, saturation, isAnimalFood);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
