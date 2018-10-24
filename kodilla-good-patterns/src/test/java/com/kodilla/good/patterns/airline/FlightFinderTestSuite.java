package com.kodilla.good.patterns.airline;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //Given
        FlightFinder flightFinder = new FlightFinder(new FlightBoard());
        //When
        List<Flight> flightsFrom = flightFinder.findFlightsFrom("Cracow");
        //Then
        Assert.assertEquals(3, flightsFrom.size());
    }

    @Test
    public void testFindFlightsTo() {
        //Given
        FlightFinder flightFinder = new FlightFinder(new FlightBoard());
        //When
        List<Flight> flightsTo = flightFinder.findFlightsTo("Warsaw");
        //Then
        Assert.assertEquals(1, flightsTo.size());
    }

    @Test
    public void testFindIndirectFight() {
        //Given
        FlightFinder flightFinder = new FlightFinder(new FlightBoard());
        //When
        List<Flight> flights = flightFinder.findIndirectFlight("Cracow","Warsaw", "Gdansk");
        //Then
        Assert.assertEquals(2, flights.size());
        for(Flight f: flights) {
            System.out.println(f);
        }
    }
}
