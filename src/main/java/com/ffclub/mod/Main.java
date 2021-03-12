package com.ffclub.mod;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ffclub.mod.lists.BlockList;
import com.ffclub.mod.lists.ItemList;
import com.ffclub.mod.lists.SwordList;
import com.ffclub.mod.world.gen.CustomGeneration;
import com.ffclub.mod.world.gen.SoundList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings("deprecation")
@Mod(Main.MOD_ID)
@EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.MOD)
public class Main {
	public static Main instance;
	public static final String MOD_ID = "ffclubmod";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup FF_CLUB_MOD = new Main.FuFuClubMod("ffclubmod");
	
	public Main() {
		instance = this;
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientSetup);
		
		SoundList.SOUNDS.register(modEventBus);
		BlockList.BLOCKS.register(modEventBus);
		BlockList.NO_ITEM_BLOCK.register(modEventBus);
		ItemList.ITEMS.register(modEventBus);
		SwordList.SWORD.register(modEventBus);

	}
	
	@SubscribeEvent
	public static void createBlockItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(FF_CLUB_MOD);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
	}
	
	
	private void setup(final FMLCommonSetupEvent event) {
		DeferredWorkQueue.runLater(CustomGeneration::generate);
		
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockList.WEED_BUSH.get(), RenderType.getCutout());
		
	}
	
	
	
	
	
	
	
	
	
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	
	
	
	
	public static class FuFuClubMod extends ItemGroup{

		public FuFuClubMod(String label) {
			super(label);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public ItemStack createIcon() {
			// TODO Auto-generated method stub
			return new ItemStack(ItemList.EXILE_INGOT.get());
		}
		
	}
}
