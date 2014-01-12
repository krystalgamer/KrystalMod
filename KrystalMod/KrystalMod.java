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
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
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
	public static final Item cake = (new ItemMine(1010));
	public static final Item slol = (new ItemTeste(1027, EnumToolMaterial.EMERALD));
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent fpi)
	{
		krystal.registerBlock(coiso, "coiso", "Sexy");
		krystal.registerItem(cake, "cake", "Muy Sexy");
		krystal.registerItem(slol, "slol", "coisinha my");
		/*GameRegistry.registerBlock(coiso, "coiso");
		LanguageRegistry.addName(coiso, "sexy");*/
	}
	
	@EventHandler
	public void load(FMLInitializationEvent fie)
	{
		
	}
	
	
	
	

}
