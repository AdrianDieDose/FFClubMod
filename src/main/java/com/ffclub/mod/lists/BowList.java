package com.ffclub.mod.lists;

import com.ffclub.mod.Main;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BowList {
	
	
	
	public static final DeferredRegister<Item> BOW = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MOD_ID);
	
	
	public static final RegistryObject<Item> JULIA_BOW = BOW.register("julia_bow", () -> new JuliaBow(new Item.Properties().group(Main.FF_CLUB_MOD).maxStackSize(1)));
	


}

