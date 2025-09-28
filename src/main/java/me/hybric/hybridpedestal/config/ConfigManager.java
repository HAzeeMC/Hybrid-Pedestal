package me.hybric.hybridpedestal.config;

import me.hybric.hybridpedestal.HybridPedestal;

public class ConfigManager {
    private final HybridPedestal plugin;

    public ConfigManager(HybridPedestal plugin) {
        this.plugin = plugin;
    }

    public void reload() {
        plugin.reloadConfig();
    }
}
