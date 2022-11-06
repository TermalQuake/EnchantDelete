package me.termalquake.enchanteddelete.items;

import org.bukkit.event.Listener;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.ChatColor;

public class table implements Listener {

    @EventHandler
    public void oninteract (PlayerInteractEvent event){
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK){
            if (event.getClickedBlock().getType().equals(Material.ENCHANTING_TABLE)) {
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.RED + "" + ChatColor.ITALIC +"—Я не знаю как этим пользоваться.");
            }
        }
    }
}