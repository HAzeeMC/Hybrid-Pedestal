package me.hybric.hybridpedestal.pedestal;

import me.hybric.hybridpedestal.HybridPedestal;
import java.util.HashSet;
import java.util.Set;

public class PedestalManager {
    private final HybridPedestal plugin;
    private final Set<Pedestal> pedestals = new HashSet<>();

    public PedestalManager(HybridPedestal plugin) {
        this.plugin = plugin;
    }

    public void addPedestal(Pedestal pedestal) {
        pedestals.add(pedestal);
    }

    public Set<Pedestal> getPedestals() {
        return pedestals;
    }
}
