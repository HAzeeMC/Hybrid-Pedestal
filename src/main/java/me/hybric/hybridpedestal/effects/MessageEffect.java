package me.hybric.hybridpedestal.effects;

import org.bukkit.entity.Player;

public class MessageEffect implements EffectExecutor {
    @Override
    public void execute(Player player, String input) {
        player.sendMessage(input.replace("%player%", player.getName()));
    }
}
