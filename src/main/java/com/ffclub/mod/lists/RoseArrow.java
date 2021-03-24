package com.ffclub.mod.lists;

import com.ffclub.mod.entities.projectiles.RoseArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RoseArrow extends ArrowItem{

	public RoseArrow(Properties builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper
				.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
		return enchant <= 0 ? false : this instanceof RoseArrow;
	}

	@Override
	public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		RoseArrowEntity arrowentity = new RoseArrowEntity(worldIn, shooter);
		return arrowentity;
	}

}
