/*
package com.ffclub.mod.objects.entities;

import com.ffclub.mod.lists.EntityList;
import com.ffclub.mod.lists.ItemList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;



public class RivenAuraEntity extends ProjectileItemEntity{

	public RivenAuraEntity(EntityType<RivenAuraEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}

	public RivenAuraEntity(LivingEntity entity, World worldIn) {
		super(EntityList.RIVEN_AURA_PROJECTILE.get(), entity, worldIn);
	}
	
	public RivenAuraEntity(double x, double y, double z, World worldIn) {
		super(EntityList.RIVEN_AURA_PROJECTILE.get(), x, y, z, worldIn);
	}

	
	@Override
	protected Item getDefaultItem() {
		return ItemList.RIVEN_AURA.get().asItem();
	}
	
	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
	
	@Override
	protected void onImpact(RayTraceResult result) {
		if(result.getType() == RayTraceResult.Type.ENTITY) {
			Entity entity = ((EntityRayTraceResult)result).getEntity();
			int damage = 5;
			entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)damage);
		}
		
		if(!world.isRemote) {
			this.remove();
		}
		
	}
}
*/
