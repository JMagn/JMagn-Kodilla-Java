package com.kodilla.good.patterns.airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightBoard {
    private List<Flight> fligts = new ArrayList<>();

    public FlightBoard() {
        fligts.add(new Flight("Cracow", "Warsaw",
                LocalTime.of(8, 0), LocalTime.of(9, 0)));
        fligts.add(new Flight("Cracow", "Wroclaw",
                LocalTime.of(10, 30), LocalTime.of(11, 15)));
        fligts.add(new Flight("Cracow", "Poznan",
                LocalTime.of(13, 30), LocalTime.of(14, 30)));
        fligts.add(new Flight("Warsaw", "Gdansk",
                LocalTime.of(15, 30), LocalTime.of(16, 15)));
        fligts.add(new Flight("Poznan", "Gdansk",
                LocalTime.of(18, 0), LocalTime.of(19, 0)));
    }

    public List<Flight> getFlights() {
        return fligts;
    }
}
