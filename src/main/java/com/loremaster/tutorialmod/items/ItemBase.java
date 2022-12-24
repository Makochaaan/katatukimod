package com.loremaster.tutorialmod.items;

import java.util.Random;

import com.loremaster.tutorialmod.Main;
import com.loremaster.tutorialmod.init.ModItems;
import com.loremaster.tutorialmod.util.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
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
