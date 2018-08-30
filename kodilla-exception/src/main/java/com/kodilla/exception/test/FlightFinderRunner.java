package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinderRunner {

    private static Map<String, Boolean> initAirports() {
        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Warsaw", false);
        airports.put("New York", true);
        airports.put("Paris", true);
        airports.put("London", true);

        return airports;
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Paris", "Frankfurt");
        FlightFinder flightFinder = new FlightFinder(initAirports());

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}