package org.projpi.util.nms;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.projpi.util.MaterialUtil;

public class MaterialUtil12 implements MaterialUtil
{
    @Override
    public ItemStack setCustomModelData(ItemStack stack, int data)
    {
        return stack;
    }

    @Override
    public Material matchMaterial(String name)
    {
        return Material.matchMaterial(name);
    }
}
