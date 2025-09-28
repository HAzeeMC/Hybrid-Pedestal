package me.hybric.hybridpedestal.effects;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class ParticleEffect implements EffectExecutor {
    @Override
    public void execute(Player player, String input) {
        try {
            String[] parts = input.split(":");
            Particle particle = Particle.valueOf(parts[0].toUpperCase());
            int count = Integer.parseInt(parts[1]);
            double offset = Double.parseDouble(parts[2]);

            player.getWorld().spawnParticle(particle, player.getLocation(), count,
                    offset, offset, offset, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
