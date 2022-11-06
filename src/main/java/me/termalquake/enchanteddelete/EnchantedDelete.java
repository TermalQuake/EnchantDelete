package me.termalquake.enchanteddelete;

import me.termalquake.enchanteddelete.books.fishing;
import me.termalquake.enchanteddelete.books.table;
import me.termalquake.enchanteddelete.books.villager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantedDelete extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new villager(), this);
        this.getServer().getPluginManager().registerEvents(new fishing(), this);
        this.getServer().getPluginManager().registerEvents(new table(), this);
        this.getServer().getPluginManager().registerEvents(new mobs(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
