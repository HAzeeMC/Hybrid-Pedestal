package me.hybric.hybridpedestal;

import me.hybric.hybridpedestal.commands.PedestalAdminCommand;
import me.hybric.hybridpedestal.config.ConfigManager;
import me.hybric.hybridpedestal.config.Messages;
import me.hybric.hybridpedestal.pedestal.PedestalClickListener;
import me.hybric.hybridpedestal.pedestal.PedestalManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HybridPedestal extends JavaPlugin {

    private static HybridPedestal instance;
    private ConfigManager configManager;
    private Messages messages;
    private PedestalManager pedestalManager;

    @Override
    public void onEnable() {
        instance = this;

        // Load configs
        saveDefaultConfig();
        this.configManager = new ConfigManager(this);
        this.messages = new Messages(this);

        // Register pedestal system
        this.pedestalManager = new PedestalManager(this);
        Bukkit.getPluginManager().registerEvents(new PedestalClickListener(this), this);

        // Register commands
        getCommand("pedestaladmin").setExecutor(new PedestalAdminCommand(this));

        getLogger().info("HybridPedestal đã được bật!");
    }

    @Override
    public void onDisable() {
        getLogger().info("HybridPedestal đã tắt.");
    }

    public static HybridPedestal getInstance() {
        return instance;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    public Messages getMessages() {
        return messages;
    }

    public PedestalManager getPedestalManager() {
        return pedestalManager;
    }
}
