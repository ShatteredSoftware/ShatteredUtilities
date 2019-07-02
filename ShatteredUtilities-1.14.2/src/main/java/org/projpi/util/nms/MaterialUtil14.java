package org.projpi.util.nms;

import org.bukkit.Material;
import org.projpi.util.MaterialUtil;

public class MaterialUtil14 implements MaterialUtil
{
    @Override
    public Material matchMaterial(String name)
    {
        return Material.matchMaterial(name, false);
    }
}
