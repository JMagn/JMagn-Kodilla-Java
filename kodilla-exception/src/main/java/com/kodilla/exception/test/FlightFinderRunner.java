package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Charles de Gaulle", "Frankfurt");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}