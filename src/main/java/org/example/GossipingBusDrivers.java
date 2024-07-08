package org.example;

import java.util.List;

public class GossipingBusDrivers {

    private final List<Route> routes;

    public GossipingBusDrivers(List<Route> routes) {
        this.routes = routes;
    }

    public String numberOfGossipingStop() {
        return "never";
    }
}
