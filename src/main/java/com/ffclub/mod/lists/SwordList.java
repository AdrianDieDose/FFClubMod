package com.ffclub.mod.lists;

import com.ffclub.mod.Main;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SwordList {
	
	
	
	public static final DeferredRegister<Item> SWORD = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MOD_ID);
	
	
	public static final RegistryObject<Item> ADRIANS_BROKEN_BLADE = SWORD.register("adrians_broken_blade", () -> new SwordItem(ToolMaterialList.SWORD_SHARD_MATERIAL, 0, 6.0f, new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> ADRIAN_RUNIC_BLADE = SWORD.register("adrians_runic_blade", () -> new AdriansRunicBlade(ToolMaterialList.SWORD_SHARD_MATERIAL, 5, 10.0f, new Item.Properties().group(Main.FF_CLUB_MOD)));

	
	


}

