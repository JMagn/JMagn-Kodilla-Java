package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5, 10);
        int resultSub = calculator.substract(5, 10);

        if (resultAdd == 15) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        if (resultSub == -5) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
