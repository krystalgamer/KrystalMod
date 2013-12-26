package KrystalMod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMine extends Item
{
	public KrystalAPI krystal;
    public ItemMine(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(64);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1, EntityPlayer par2, World par3, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	if(!par3.isRemote)
    	{
    	par1.damageItem(1, par2);
    	int j;
    	j = krystal.ItemDurability(this, par1);
    	par2.addChatMessage("" + j);
    	//par2.addChatMessage("" + j);
    	return true;
    	}
    	
    	return true;
        
    }
}

  

