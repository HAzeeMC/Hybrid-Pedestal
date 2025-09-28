package me.hybric.hybridpedestal.pedestal;

import org.bukkit.Location;

public class Pedestal {
    private final Location location;

    public Pedestal(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
