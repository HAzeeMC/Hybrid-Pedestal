package me.hybric.hybridpedestal.effects;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundEffect implements EffectExecutor {
    @Override
    public void execute(Player player, String input) {
        try {
            String[] parts = input.split(":");
            Sound sound = Sound.valueOf(parts[0].toUpperCase());
            float volume = Float.parseFloat(parts[1]);
            float pitch = Float.parseFloat(parts[2]);
            player.playSound(player.getLocation(), sound, volume, pitch);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
