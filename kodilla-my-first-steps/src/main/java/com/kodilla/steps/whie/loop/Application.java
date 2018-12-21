package com.kodilla.steps.whie.loop;

import java.util.Random;

public class Application {

    static void testWhileLoop() {

        int loopCount = 0;
        int sumaA = 1000;
        int sumaB = 0;
        Random randomNumber = new Random();

        while (sumaA > sumaB) {
            loopCount++;
            sumaA = sumaA + randomNumber.nextInt(10);
            sumaB = sumaB + randomNumber.nextInt(50);
            System.out.println("Loop " + loopCount);
            System.out.println("Sum A = " + sumaA);
            System.out.println("Sum B = " + sumaB);
            System.out.println();
        }
        System.out.println("Sum B exceeds sum A. Loop finished.");
    }

    public static void main(String[] args) {

        testWhileLoop();
    }
}
