package com.kodilla.steps.clocks;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main (String[] args) throws java.lang.Exception {

        List<Clock> cloksList = new LinkedList<Clock>();

        cloksList.add(new Clock(10, 45));
        cloksList.add(new Clock(11, 27));
        cloksList.add(new Clock(12, 32));
        cloksList.add(new Clock(9, 0));
        cloksList.add(new Clock(14, 59));

        for (Clock thisClock : cloksList) {
            System.out.println("Before: " + thisClock);
            System.out.println("After: " + thisClock.addMinute());

            // 2 wersja:
            System.out.println("After (2nd version): " + thisClock.getTime().plusMinutes(1) + "\n");
        }
    }
}
