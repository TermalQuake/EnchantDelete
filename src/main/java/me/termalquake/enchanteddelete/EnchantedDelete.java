package me.termalquake.enchanteddelete;

import me.termalquake.enchanteddelete.items.chest;
import me.termalquake.enchanteddelete.items.fishing;
import me.termalquake.enchanteddelete.items.table;
import me.termalquake.enchanteddelete.items.villager;
import me.termalquake.enchanteddelete.items.mobs;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantedDelete extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new villager(), this);
        this.getServer().getPluginManager().registerEvents(new fishing(), this);
        this.getServer().getPluginManager().registerEvents(new table(), this);
        this.getServer().getPluginManager().registerEvents(new chest(), this);
        this.getServer().getPluginManager().registerEvents(new mobs(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
