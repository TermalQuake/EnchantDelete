package me.termalquake.enchantdelete.items;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import java.util.Iterator;
import java.util.List;

public class mobs implements Listener {
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        List<ItemStack> list = e.getDrops();
        Iterator<ItemStack> i = list.iterator();
        while (i.hasNext()) {
            ItemStack item = i.next();
            if (item.getType() == Material.ENCHANTED_BOOK || item.getEnchantments().size() > 0)
                i.remove();
        }
    }
}
