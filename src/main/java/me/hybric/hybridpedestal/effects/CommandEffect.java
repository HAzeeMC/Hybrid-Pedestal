package me.hybric.hybridpedestal.effects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CommandEffect implements EffectExecutor {
    @Override
    public void execute(Player player, String input) {
        String cmd = input.replace("%player%", player.getName());
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
    }
}
