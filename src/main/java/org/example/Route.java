package org.example;

public class Route {
    private final int[] stops;

    public Route(int... stops) {
        this.stops = stops;
    }

    public Integer stop(int stopNumber){
        return stops[stopNumber];
    }
}
