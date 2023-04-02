package com.katatukimod.katatukimod.blocks;


import com.katatukimod.katatukimod.init.ModBlocks;
import com.katatukimod.katatukimod.init.ModItems;
import com.katatukimod.katatukimod.util.IHasModel;
import com.katatukimod.katatukimod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
