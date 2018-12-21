package com.kodilla.steps.wrappers;

public class Application {

    public static void main (String[] args) {

        boolean result1 = new ComparisonNumbers (12, 12).compare();
        boolean result2 = new ComparisonDoubles (1.2, 1.3).compare();
        boolean result3 = new ComparisonLetters ('A', 'A').compare();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
