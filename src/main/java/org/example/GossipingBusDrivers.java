package org.example;

import java.util.List;

public class GossipingBusDrivers {

    private final List<Route> routes;

    public GossipingBusDrivers(List<Route> routes) {
        this.routes = routes;
    }

    public String numberOfGossipingStop() {
        int numberOfGossip = 0;

        return "never";
    }
}
