package me.hybric.hybridpedestal.commands;

import me.hybric.hybridpedestal.HybridPedestal;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PedestalAdminCommand implements CommandExecutor {

    private final HybridPedestal plugin;

    public PedestalAdminCommand(HybridPedestal plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("hybridpedestal.admin")) {
            sender.sendMessage(plugin.getMessages().get("no-permission"));
            return true;
        }

        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            plugin.reloadConfig();
            sender.sendMessage(plugin.getMessages().get("reload-success"));
            return true;
        }

        sender.sendMessage(plugin.getMessages().get("invalid-command"));
        return true;
    }
}
