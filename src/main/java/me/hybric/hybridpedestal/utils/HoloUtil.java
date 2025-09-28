package me.hybric.hybridpedestal.utils;

import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import org.bukkit.Location;

import java.util.List;

public class HoloUtil {
    public static Hologram createHologram(String name, Location location, List<String> lines) {
        return DHAPI.createHologram(name, location, lines);
    }
}
