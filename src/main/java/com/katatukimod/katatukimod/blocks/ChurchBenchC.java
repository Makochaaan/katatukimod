package com.katatukimod.katatukimod.blocks;

import com.katatukimod.katatukimod.util.SittableUtil;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChurchBenchC extends BlockBase {

    public ChurchBenchC(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.WOOD);
        setHardness(3.0F);
        setResistance(15.0F);
        setHarvestLevel("axe", 1);

    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 6 * 0.0625))
        {
            worldIn.updateComparatorOutputLevel(pos, this);
            return true;
        }
        return false;
    }
}
