package org.infotoast.nooverworldendermen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoOverworldEndermen extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("§5§l[NoOverworldEndermen]§r Enabling...");
        getServer().getPluginManager().registerEvents(new EventsListener(), this);
        getServer().getConsoleSender().sendMessage("§5§l[NoOverworldEndermen]§r Enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§5§l[NoOverworldEndermen]§r Shutting down...");
    }
}
