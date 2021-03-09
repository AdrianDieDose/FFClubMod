package com.ffclub.mod.world.gen;

import com.ffclub.mod.Main;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundList {
	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS,
			Main.MOD_ID);

	public static final RegistryObject<SoundEvent> RIVEN_ULT_SOUND = SOUNDS.register(
			"riven_runic_blade_sound", () -> new SoundEvent(new ResourceLocation(Main.MOD_ID, "riven_runic_blade_sound")));

}
