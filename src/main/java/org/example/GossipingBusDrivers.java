package org.example;

import java.util.List;

public class GossipingBusDrivers {

    private final List<Integer> routes;

    public GossipingBusDrivers(List<Integer> routes) {

        this.routes = routes;
    }

    public String numberOfGossipingStop() {
        return "never";
    }
}
