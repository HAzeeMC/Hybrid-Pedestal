package me.hybric.hybridpedestal.config;

import me.hybric.hybridpedestal.HybridPedestal;
import org.bukkit.ChatColor;

public class Messages {
    private final HybridPedestal plugin;

    public Messages(HybridPedestal plugin) {
        this.plugin = plugin;
    }

    public String get(String key) {
        return ChatColor.translateAlternateColorCodes('&',
                plugin.getConfig().getString("messages." + key, "&cThông báo lỗi: " + key));
    }
}
