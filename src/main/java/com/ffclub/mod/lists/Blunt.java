package com.ffclub.mod.lists;

import com.ffclub.mod.world.gen.SoundList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Blunt extends BowItem {

	public Blunt(Properties builder) {
		super(builder);
	}
	

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
		PlayerEntity playerentity = (PlayerEntity)entityLiving;
		Vec3d aimStraight = entityLiving.getLookVec();
		worldIn.playSound((PlayerEntity)null, playerentity.getPosX(), playerentity.getPosY(), playerentity.getPosZ(), SoundList.RIVEN_ULT_SOUND.get(), SoundCategory.PLAYERS, 1.0F, 1.0F);
		for(int i = 0;i <= 10; i++) {
			worldIn.addParticle(ParticleTypes.LARGE_SMOKE, playerentity.getPosX() + aimStraight.x * 0.5D, playerentity.getPosY() + 1 + aimStraight.y * 0.5D, playerentity.getPosZ() + aimStraight.z * 0.5D, 0.0D, 0.0D, 0.0D);
			System.out.println(i);
		}
		
	}
}
