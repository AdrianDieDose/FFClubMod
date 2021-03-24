package com.ffclub.mod.entities.projectiles;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import net.minecraft.world.World;

public class RoseArrowEntity extends ArrowEntity{
    public RoseArrowEntity(World worldIn, LivingEntity shooter) {
        super(worldIn, shooter);
    }


    // do something when it hits an entity
    @Override
    protected void arrowHit(LivingEntity living) {
        super.arrowHit(living);
        
        
        living.setFire(15);
        living.addPotionEffect(new EffectInstance(Effects.GLOWING, 300, 0));
    }
}