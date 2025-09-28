package me.hybric.hybridpedestal.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class RecipeEditorGUI {
    public static void open(Player player) {
        Inventory inv = Bukkit.createInventory(null, 54, "Recipe Editor");
        player.openInventory(inv);
    }
}
