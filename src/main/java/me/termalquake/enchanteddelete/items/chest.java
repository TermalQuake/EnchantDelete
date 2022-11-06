package me.termalquake.enchanteddelete.items;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.inventory.ItemStack;
import java.util.Iterator;
import java.util.List;

public class chest implements Listener {
    @EventHandler
    public void onWorld (LootGenerateEvent e) {
        List<ItemStack> list = e.getLoot();
        Iterator<ItemStack> i = list.iterator();
        while (i.hasNext()) {
            ItemStack item = i.next();
            if (item.getType() == Material.ENCHANTED_BOOK)
                i.remove();
            if (item.getEnchantments().size() > 0)
                i.remove();
        }
    }
}

