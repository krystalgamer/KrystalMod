/* 
 * Author: KrystalGamer
 * Date: 24/12/2013
 * Description: Base file of the Mod
 * Changes: Setting Base File
 *
 */

package KrystalMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
//import cpw.mods.fml.client.modloader;
import cpw.mods.fml.common.registry.LanguageRegistry;



@Mod(modid = "Krystal Mod", name = "Krystal Mod", version = "0.8")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class KrystalMod {
	
	public KrystalAPI krystal;
	
	public static final Block coiso = (new BlockCoiso(1009)).setHardness(0.5F);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent fpi)
	{
		krystal.registerBlock(coiso, "coiso", "Sexy");
		/*GameRegistry.registerBlock(coiso, "coiso");
		LanguageRegistry.addName(coiso, "sexy");*/
	}
	
	@EventHandler
	public void load(FMLInitializationEvent fie)
	{
		
	}
	
	
	
	

}
