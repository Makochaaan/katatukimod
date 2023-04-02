package com.katatukimod.katatukimod.items.relics;

import com.katatukimod.katatukimod.items.ItemBase;
import net.minecraft.item.ItemStack;

public class RelicsBase extends ItemBase {
	
	protected String name;

	public RelicsBase(String name) {
		super(name);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		    return true;
		    }
}
