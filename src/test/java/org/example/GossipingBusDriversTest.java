package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GossipingBusDriversTest {

    @Test
    void no_gossip(){
        List<Route> routes = Arrays.asList(new Route(2, 1, 2), new Route(5, 2, 8));
        GossipingBusDrivers gossipingBusDrivers = new GossipingBusDrivers(routes);

        String numberOfGossipingStop = gossipingBusDrivers.numberOfGossipingStop();

        assertEquals("never",numberOfGossipingStop);
    }


}