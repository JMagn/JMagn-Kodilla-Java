package com.kodilla.steps.euclidean.algorithm;

public class Application {

    static int euclideanAlgorithm(int a, int b) {

        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }

    static int euclideanAlgorithm2(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(euclideanAlgorithm(35, 77));
        System.out.println(euclideanAlgorithm2(35, 70));
    }
}
