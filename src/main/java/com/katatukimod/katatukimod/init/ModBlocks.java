package com.katatukimod.katatukimod.init;

import java.util.ArrayList;
import java.util.List;

import com.katatukimod.katatukimod.blocks.*;
import com.loremaster.tutorialmod.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);

	public static final Block CHURCH_BENCH_L = new ChurchBenchL("church_bench_left", Material.WOOD);

	public static final Block CHURCH_BENCH_R = new ChurchBenchR("church_bench_right", Material.WOOD);

	public static final Block CHURCH_BENCH_C = new ChurchBenchC("church_bench_center", Material.WOOD);





	
}
