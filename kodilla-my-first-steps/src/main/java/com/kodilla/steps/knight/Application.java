package com.kodilla.steps.knight;

public class Application {

    public static void main(String args[]) {

        new Knight(new EliteKnightQuest()).process();
        new Knight(new DeadIslandQuest()).process();
    }
}
