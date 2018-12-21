package com.kodilla.steps.cannons;

import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main (String[] args) {

        List<Cannon> battery = new LinkedList<Cannon>();

        battery.add(new Cannon(false));
        battery.add(new Cannon(false));
        battery.add(new Cannon(false));
        battery.add(new Cannon(false));
        battery.add(new Cannon(false));

        int n = 1;
        for (Cannon thisCannon : battery) {
            System.out.println("CANNON " + n++ + ":");
            thisCannon.fire();
        }
    }
}
