/* 
 * Author: KrystalGamer
 * Date: 24/12/2013
 * Description: Base file of the Block
 * Changes: Setting Base File
 *
 */

package KrystalMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCoiso extends Block
{
    protected BlockCoiso(int par1)
    {
        super(par1, Material.ground);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
