package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> allNumbers) {
        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i : allNumbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
