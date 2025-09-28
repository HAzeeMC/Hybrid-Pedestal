package me.hybric.hybridpedestal.pedestal;

import me.hybric.hybridpedestal.HybridPedestal;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PedestalClickListener implements Listener {

    private final HybridPedestal plugin;

    public PedestalClickListener(HybridPedestal plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        // TODO: Check if clicked pedestal hologram
        // If recipe valid -> craft success effects
        // Else -> fail effects (/rtp)
    }
}
