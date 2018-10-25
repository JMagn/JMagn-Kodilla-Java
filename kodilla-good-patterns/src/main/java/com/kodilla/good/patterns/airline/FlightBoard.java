package com.kodilla.good.patterns.airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightBoard {
    private List<Flight> flights = new ArrayList<>();

    public FlightBoard() {
        flights.add(new Flight("KRA", "WAR",
                LocalTime.of(8, 0), LocalTime.of(9, 0)));
        flights.add(new Flight("KRA", "WRO",
                LocalTime.of(10, 30), LocalTime.of(11, 15)));
        flights.add(new Flight("KRA", "POZ",
                LocalTime.of(13, 30), LocalTime.of(14, 30)));
        flights.add(new Flight("WAR", "GDA",
                LocalTime.of(15, 30), LocalTime.of(16, 15)));
        flights.add(new Flight("POZ", "GDA",
                LocalTime.of(18, 0), LocalTime.of(19, 0)));
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
