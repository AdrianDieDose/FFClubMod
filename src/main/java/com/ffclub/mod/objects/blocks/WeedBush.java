

package com.ffclub.mod.objects.blocks;

import com.ffclub.mod.lists.ItemList;

import net.minecraft.block.BlockState;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class WeedBush extends SweetBerryBushBlock{

	public WeedBush(Properties properties) {
		super(properties);
	}
	
	@Override
	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
		// TODO Auto-generated method stub
		return new ItemStack(ItemList.CALI_COOKIE_SEEDS.get());
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		int i = state.get(AGE);
		boolean flag = i == 3;
		if(!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
			return ActionResultType.PASS;
		} else if (i > 1) {
			int j = 1+ worldIn.rand.nextInt(2);
			int k = 1+ worldIn.rand.nextInt(5);
			spawnAsEntity(worldIn, pos, new ItemStack(ItemList.CALI_COOKIE_WEED.get(), j + (flag ? 1 : 0)));
			spawnAsEntity(worldIn, pos, new ItemStack(ItemList.CALI_COOKIE_SEEDS.get(), k + (flag ? 1 : 0)));
			worldIn.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.rand.nextFloat() * 0.4F);
			worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);
			return ActionResultType.SUCCESS;
		} else {
			return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
		}
	}
	
	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		// TODO Auto-generated method stub
		super.onEntityCollision(state, worldIn, pos, entityIn);
	}

}

