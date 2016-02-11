package fr.ezorix.noob.common;


import fr.ezorix.noob.block.BlockMod;
import fr.ezorix.noob.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = "noob", name = "noob", version = "0.0.1")
public class Main {
	
	
	@SidedProxy(clientSide = "fr.ezorix.noob.proxy.ClientProxy", serverSide = "fr.ezorix.noob.proxy.CommonProxy")
	public static CommonProxy proxy;
	@Instance("noob")
	public static Main instance;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		

	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		BlockMod.initBlock();
		BlockMod.registerBlock();
		proxy.registerRender();

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		

	}


}