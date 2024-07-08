package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GossipingBusDriversTest {

    @Test
    void no_gossip(){
        List<Integer> routes = new ArrayList({2,1,2}, {5,2,8});
        GossipingBusDrivers gossipingBusDrivers = new GossipingBusDrivers(routes);

        String numberOfGossipingStop = gossipingBusDrivers.numberOfGossipingStop();

        assertEquals("never",numberOfGossipingStop);
    }


}