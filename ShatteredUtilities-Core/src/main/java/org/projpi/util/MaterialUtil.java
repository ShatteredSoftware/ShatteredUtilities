package org.projpi.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public interface MaterialUtil {

    Material matchMaterial(String name);

    ItemStack setCustomModelData(ItemStack stack, int data);
}
