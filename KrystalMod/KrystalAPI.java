/* 
 * Author: KrystalGamer
 * Date: 24/12/2013
 * Description: Base file of the API
 * Changes: Setting Base File
 *
 */

package KrystalMod;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.client.FMLClientHandler;

public class KrystalAPI {
	
	private static int dur;
	public static boolean title = true;
	public static boolean coiso = true;
	private static Minecraft mc = FMLClientHandler.instance().getClient();
	
	/**
	 * 
	 *  Void used to register Blocks
	 * 
	 * @param block The Block
	 * @param unlocalized Unlocalized Name of the block
	 * @param name Name that will be shown up in-game
	 */
	public static void registerBlock(Block block, String unlocalized, String name){
		
		GameRegistry.registerBlock(block, unlocalized);
		LanguageRegistry.addName(block, name);
	}
	
	/**
	 * 
	 *  Void used to register Items
	 * 
	 * @param item The Item
	 * @param unlocalized The unlocalized name of the item
	 * @param name Name that will be shown up in-game
	 */
	public static void registerItem(Item item, String unlocalized, String name){
		
		GameRegistry.registerItem(item, unlocalized);
		LanguageRegistry.addName(item, name);
		
	}
	/**
	 * Returns The itemsDurability in the moment
	 * 
	 * @param item The Item
	 * @param stack The ItemStack :O
	 * @return The item durability
	 */
	public static int ItemDurability(Item item, ItemStack stack){
		
		dur = item.getMaxDamage() - item.getDisplayDamage(stack);
		
		return dur;
		
	}
	/**
	 * Enchants an Item
	 * 
	 * @param en Desired Enchantment
	 * @param item The ItemStack
	 * @param level The level of the enchantment
	 * @return The ItemStack with the Enchantment
	 * 
	 */
	public static ItemStack EnchantItem(Enchantment en,ItemStack item, int level)

	{
		//ItemStack cake = new ItemStack(item);
		if(item.isItemEnchanted())
		{
			return item;	
		}
		else	{
			
		item.addEnchantment(en, level);
		}
		return item;
		
		
	}
	
	//Not tested
	
	public static ItemStack EnchantItem(Enchantment en,Item item, int level, int stacksize)

	{
		ItemStack cake = new ItemStack(item, stacksize);
		if(cake.isItemEnchanted())
		{
			return cake;	
		}
		else	{
			
		cake.addEnchantment(en, level);
		}
		return cake;
		
		
	}
	
	/**
	 * Gets the player inventory
	 * 
	 * @return Player Inventory
	 */
	
	public static InventoryPlayer PlayerInventory()
	{
		return mc.thePlayer.inventory;
		
	}
	
	public static void Queijo(EntityFX fx)
	{
		EntityFX entity = null;
		entity = fx;
		
		mc.effectRenderer.addEffect((EntityFX)entity);
		
		//if(entity != null)
		//{
		//	//return (EntityFX)entity;
		//}
		//return (EntityFX)entity;
		
		
		//return (entity != null) ? (EntityFX)entity : null;
		
		
		
	}
	
	public EntityFX newParticle()
	{
		
		return null;
		
	}
	
	
	
	

}
