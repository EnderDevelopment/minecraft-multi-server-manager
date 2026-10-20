package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Modern Networking plugin enabled!");
        getCommand("createserver").setExecutor(new CreateServerCommand());
        getCommand("deleteserver").setExecutor(new DeleteServerCommand());
        getCommand("listservers").setExecutor(new ListServersCommand());
        getCommand("createspawn").setExecutor(new CreateSpawnCommand());
        getCommand("createhub").setExecutor(new CreateHubCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Modern Networking plugin disabled!");
    }
}