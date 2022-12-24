package com.loremaster.tutorialmod.blocks;

import java.util.List;

import com.loremaster.tutorialmod.entity.EntitySittableBlock;
import com.loremaster.tutorialmod.util.CollisionHelper;
import com.loremaster.tutorialmod.util.SittableUtil;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static net.minecraft.block.BlockStairs.FACING;

public class ChurchBenchL extends BlockBase {

	public ChurchBenchL(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 1);

	}
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
}
	
//	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.875, 1.0);
//
//	private static final AxisAlignedBB CHAIR_BASE = new AxisAlignedBB(0.1, 0.0, 0.1, 0.9, 0.5625, 0.9);
//	private static final AxisAlignedBB CHAIR_BACKREST_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.125, 0.5625, 0.125, 0.1875, 2.0, 0.875);
//	private static final AxisAlignedBB CHAIR_BACKREST_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.125, 0.5625, 0.125, 0.1875, 2.0, 0.875);
//	private static final AxisAlignedBB CHAIR_BACKREST_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.125, 0.5625, 0.125, 0.1875, 2.0, 0.875);
//	private static final AxisAlignedBB CHAIR_BACKREST_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.124, 0.5625, 0.125, 0.1875, 2.0, 0.875);
//
//
//	public ChurchBenchL() {
//		super("church_bench_letft", Material.WOOD);
//
//		setHardness(3f);
//		setResistance(5f);
//		this.setSoundType(SoundType.WOOD);
//		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
//	}
//
//	@Override
//	@Deprecated
//	public boolean isOpaqueCube(IBlockState state) {
//		return false;
//	}
//
//	@Override
//	@Deprecated
//	public boolean isFullCube(IBlockState state) {
//		return false;
//	}
//
//	@Override
//	public ChurchBenchL setCreativeTab(CreativeTabs tab) {
//		super.setCreativeTab(tab);
//		return this;
//
//	}
//
//	@Override
//	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
//
//		if(SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 6 * 0.0625))
//		{
//			worldIn.updateComparatorOutputLevel(pos, this);
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
//		return BOUNDING_BOX;
//	}
//
//	@Override
//	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
//
//		if (!(entityIn instanceof EntitySittableBlock))
//		{
//			EnumFacing facing = state.getValue(FACING);
//			switch(facing)
//			{
//			case NORTH:
//				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_NORTH);
//				break;
//			case SOUTH:
//				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_SOUTH);
//				break;
//			case WEST:
//				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_WEST);
//				break;
//			default:
//				super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BACKREST_EAST);
//				break;
//			}
//			super.addCollisionBoxToList(pos, entityBox, collidingBoxes, CHAIR_BASE);
//		}
//	}
//
//	@Override
//	public boolean hasComparatorInputOverride(IBlockState state) {
//		return true;
//	}
//
//	@Override
//	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
//		return SittableUtil.isSomeoneSitting(worldIn, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
//	}
//
//}
