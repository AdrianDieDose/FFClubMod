
package com.ffclub.mod.lists;

import com.ffclub.mod.Main;

import com.ffclub.mod.objects.blocks.WeedBush;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
	
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
	
	public static final RegistryObject<Block> EXILE_ORE = BLOCKS.register("exile_ore", () -> new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(6.0f).harvestLevel(2).sound(SoundType.STONE)));
	

	
	
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);
	public static final RegistryObject<Block> WEED_BUSH = NO_ITEM_BLOCK.register("weed_bush", () -> new WeedBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));
	
	
	
	

}

