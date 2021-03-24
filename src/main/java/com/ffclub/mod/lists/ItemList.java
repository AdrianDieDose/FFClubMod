package com.ffclub.mod.lists;

import com.ffclub.mod.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	
	
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MOD_ID);
	
	
	public static final RegistryObject<Item> SWORD_SHARD = ITEMS.register("sword_shard", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> EXILE_INGOT = ITEMS.register("exile_ingot", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> HARDENED_STEEL_INGOT = ITEMS.register("hardened_steel_ingot", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	
	public static final RegistryObject<Item> OCBS = ITEMS.register("ocbs", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> PAPES = ITEMS.register("papes", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> TIP = ITEMS.register("tip", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> CALI_COOKIE_WEED = ITEMS.register("cali_cookie_weed", () -> new Item(new Item.Properties().group(Main.FF_CLUB_MOD)));
	public static final RegistryObject<Item> CALI_COOKIE_SEEDS = ITEMS.register("weed_bush", () -> new BlockItem(BlockList.WEED_BUSH.get(), new Item.Properties().group(Main.FF_CLUB_MOD)));
	
	public static final RegistryObject<Item> JOINT = ITEMS.register("blunt", () -> new Blunt(new Item.Properties().group(Main.FF_CLUB_MOD).maxStackSize(1)));
	
	
	public static final RegistryObject<Item> ROSE_ARROW = ITEMS.register("rose_arrow", () -> new RoseArrow(new Item.Properties().group(Main.FF_CLUB_MOD)));
	
	
	
	
	
	


}

