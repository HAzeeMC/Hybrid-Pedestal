package me.hybric.hybridpedestal.utils;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.entity.Player;

public class PlaceholderUtil {
    public static String parse(Player player, String text) {
        return PlaceholderAPI.setPlaceholders(player, text);
    }
}
