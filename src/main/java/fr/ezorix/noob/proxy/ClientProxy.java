package fr.ezorix.noob.proxy;

import fr.ezorix.noob.block.BlockMod;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRender()
	{
		System.out.println("Lancement du Mod pour le client");
		BlockMod.registerRenders();
	}

}
