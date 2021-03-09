
package com.ffclub.mod.lists;

import com.ffclub.mod.world.gen.SoundList;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AdriansRunicBlade  extends SwordItem{

	public AdriansRunicBlade(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack item = playerIn.getHeldItem(handIn);
		
		//Riven Ult sound
		worldIn.playSound(playerIn, new BlockPos(playerIn), SoundList.RIVEN_ULT_SOUND.get(), SoundCategory.PLAYERS, 1.0f, 1.0f);
		
		
		// Riven Ult Entitiys
		Vec3d aimStraight = playerIn.getLookVec();
		Vec3d aimRight = aimStraight.rotateYaw(-45F);
		Vec3d aimSlightRight = aimStraight.rotateYaw(-30F);
		Vec3d aimLeft = aimStraight.rotateYaw(45F);
		Vec3d aimSlightLeft= aimStraight.rotateYaw(30F);

		
		ArrowEntity arrow1 = new ArrowEntity(worldIn, 1, 1, 1);
		ArrowEntity arrow2 = new ArrowEntity(worldIn, 1, 1, 1);
		ArrowEntity arrow3 = new ArrowEntity(worldIn, 1, 1, 1);
		ArrowEntity arrow4 = new ArrowEntity(worldIn, 1, 1, 1);
		ArrowEntity arrow5 = new ArrowEntity(worldIn, 1, 1, 1);

		
		arrow1.setPosition(playerIn.lastTickPosX + aimStraight.x *1.5D, playerIn.lastTickPosY + 1 + aimStraight.y * 1.5D, playerIn.lastTickPosZ + aimStraight.z * 1.5D);
		arrow1.addVelocity(aimRight.getX(), aimRight.getY(), aimRight.getZ());
		worldIn.addEntity(arrow1);
		
		arrow2.setPosition(playerIn.lastTickPosX + aimStraight.x *1.5D, playerIn.lastTickPosY + 1 + aimStraight.y * 1.5D, playerIn.lastTickPosZ + aimStraight.z * 1.5D);
		arrow2.addVelocity(aimLeft.getX(), aimLeft.getY(), aimLeft.getZ());
		worldIn.addEntity(arrow2);
		
		arrow3.setPosition(playerIn.lastTickPosX + aimStraight.x *1.5D, playerIn.lastTickPosY + 1 + aimStraight.y * 1.5D, playerIn.lastTickPosZ + aimStraight.z * 1.5D);
		arrow3.addVelocity(aimSlightRight.getX(), aimSlightRight.getY(), aimSlightRight.getZ());
		worldIn.addEntity(arrow3);
		
		arrow4.setPosition(playerIn.lastTickPosX + aimStraight.x *1.5D, playerIn.lastTickPosY + 1 + aimStraight.y * 1.5D, playerIn.lastTickPosZ + aimStraight.z * 1.5D);
		arrow4.addVelocity(aimSlightLeft.getX(), aimSlightLeft.getY(), aimSlightLeft.getZ());
		worldIn.addEntity(arrow4);
		
		arrow5.setPosition(playerIn.lastTickPosX + aimStraight.x *1.5D, playerIn.lastTickPosY + 1 + aimStraight.y * 1.5D, playerIn.lastTickPosZ + aimStraight.z * 1.5D);
		arrow5.addVelocity(aimStraight.getX(), aimStraight.getY(), aimStraight.getZ());
		worldIn.addEntity(arrow5);


		
		item.damageItem(8, playerIn, null);
		return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
	}
	
}
