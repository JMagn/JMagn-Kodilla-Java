package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    private static final String MESSAGE = "%s available? - %b";

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();

        flights.put("Okecie", false);
        flights.put("JFK", true);
        flights.put("Charles de Gaulle", true);
        flights.put("Heathrow", true);

        if (flights.containsKey(flight.getArrivalAirport())) {

            flights.entrySet().stream()
                    .filter(entry -> entry.getKey().equals(flight.getArrivalAirport()))
                    .forEach(entry -> System.out.println(String.format(MESSAGE, entry.getKey(), entry.getValue())));

        } else {
            throw new RouteNotFoundException("ERROR: Destinations database does not contain " + flight.getArrivalAirport());
        }
    }
}