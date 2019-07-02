package org.projpi.util.cooldowns;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CooldownManager
{
    public static final int DEFAULT_COOLDOWN = 1000; // 1000 millis = 1 second
    private final Map<UUID, Long> lastUse;

    public CooldownManager(Integer cooldown)
    {
        lastUse = new HashMap<>();
        if(cooldown == null)
        {
            cooldown = DEFAULT_COOLDOWN;
        }
    }

    public boolean canUse(UUID uuid)
    {
        if(!lastUse.containsKey(uuid))
        {
            return true;
        }
        return System.currentTimeMillis() > (lastUse.get(uuid) + 1000);
    }

    public void use(UUID uuid)
    {
        lastUse.put(uuid, System.currentTimeMillis());
    }
}
