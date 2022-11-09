package me.termalquake.enchantdelete;

import me.termalquake.enchantdelete.items.chest;
import me.termalquake.enchantdelete.items.fishing;
import me.termalquake.enchantdelete.items.table;
import me.termalquake.enchantdelete.items.villager;
import me.termalquake.enchantdelete.items.mobs;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantDelete extends JavaPlugin {

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
    }
}
