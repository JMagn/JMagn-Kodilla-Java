package com.kodilla.steps.atm;

public interface ATM {

    void withdraw();

    void pay();

    default void connetctWithBank () {
        System.out.println("Connected with the bank");
    }

    static String completeAction() {
        return "Action completed";
    }
}
