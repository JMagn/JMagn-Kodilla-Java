package com.kodilla.good.patterns.airline;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private static final String FLIGHTSFROM = "Flights from %s:";
    private static final String FLIGHTSTO = "Flights to %s:";

    private FlightBoard flights;

    public FlightFinder(FlightBoard flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departureAirport) {
        return flights.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String arrivalAirport) {
        return flights.getFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findIndirectFlight(String departureAirport, String interAirport, String arrivalAirport) {
         return flights.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(interAirport) || f.getArrivalAirport().equals(interAirport))
                .filter(f -> f.getDepartureAirport().equals(departureAirport) || f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }
}
