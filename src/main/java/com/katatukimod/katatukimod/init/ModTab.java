package com.katatukimod.katatukimod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {

	public ModTab(String label) {
		super(label);
	}

	@SideOnly(Side.CLIENT)
	public ItemStack createIcon() {
		return new ItemStack(ModItems.EXCALIBUR);
	}
}
