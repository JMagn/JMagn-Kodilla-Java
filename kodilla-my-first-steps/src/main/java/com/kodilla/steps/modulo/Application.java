package com.kodilla.steps.modulo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class Application {

    private static final Random random = new Random();

    private static Deque<String> initAString() {

        Deque<String> aString = new ArrayDeque<String>();

        for (int n = 0; n < 50; n++) {
            String a = "";
            for (int i = 0; i <= random.nextInt(50); i++) {
                a = a + "a";
            }
            aString.offer(a);
        }
        return aString;
    }

    public static void main (String[] args) {

        StringDivision division = new StringDivision();

        division.divideStrings(initAString());
        division.print();
    }
}
