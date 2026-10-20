package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DeleteServerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 1) {
            sender.sendMessage("Usage: /deleteserver <name>");
            return false;
        }
        String serverName = args[0];
        // Logic to delete a server
        sender.sendMessage("Server " + serverName + " deleted!");
        return true;
    }
}