package org.infotoast.nooverworldendermen;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EventsListener implements Listener {
    @EventHandler(priority=EventPriority.HIGHEST)
    public void onEntitySpawn(EntitySpawnEvent evt) {
        if (evt.getEntityType().equals(EntityType.ENDERMAN)) {
            if (evt.getLocation().getWorld().isNatural()) {
                evt.setCancelled(true);
            }
        }
    }
}
