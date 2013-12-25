/* 
 * Author: KrystalGamer
 * Date: 24/12/2013
 * Description: Base file of the API
 * Changes: Setting Base File
 *
 */

package KrystalMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class  KrystalAPI {
	
	public static void registerBlock(Block block, String unlocalized, String name){
		
		GameRegistry.registerBlock(block, unlocalized);
		LanguageRegistry.addName(block, name);
	}
	
	public void registerItem(Item item, String unlocalized, String name){
		
		GameRegistry.registerItem(item, unlocalized);
		LanguageRegistry.addName(item, name);
		
	}

}
