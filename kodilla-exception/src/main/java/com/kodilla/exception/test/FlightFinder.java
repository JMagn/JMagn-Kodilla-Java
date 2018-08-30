package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private static final String ERROR = "ERROR: %s does not exist in the database.";

    private Map <String, Boolean> airports;

    public FlightFinder(Map<String, Boolean> airports) {
        this.airports = airports;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (!airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(String.format(ERROR, flight.getArrivalAirport()));
        } if (airports.get(flight.getArrivalAirport())) {
            return true;
        } else {
            return false;
        }
    }
}