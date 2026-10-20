package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CreateServerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Usage: /createserver <name>");
            return false;
        }
        String serverName = args[0];
        // Logic to create a new server
        sender.sendMessage("Server " + serverName + " created!");
        return true;
    }
}