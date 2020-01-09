package org.projpi.util.nms;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.projpi.util.MaterialUtil;

public class MaterialUtil15 implements MaterialUtil {

    @Override
    public ItemStack setCustomModelData(ItemStack stack, int data) {
        ItemMeta meta = stack.getItemMeta();
        meta.setCustomModelData(data);
        return stack;
    }

    @Override
    public Material matchMaterial(String name) {
        return Material.matchMaterial(name, false);
    }
}
