package me.termalquake.enchanteddelete.books;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.entity.Item;


public class fishing implements Listener {
    @EventHandler
    public void onPlayerFish(PlayerFishEvent e) {
        if (e.getCaught() instanceof Item) {
            ItemStack fished = ((Item) e.getCaught()).getItemStack();
            if (fished.getType() == Material.ENCHANTED_BOOK || fished.getType() == Material.BOW || fished.getType() == Material.FISHING_ROD)   {
                e.getCaught().remove();
            }
        }
    }
}


