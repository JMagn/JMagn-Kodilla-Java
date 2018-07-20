package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> evenNumbers;

    public OddNumbersExterminator() {
        this.evenNumbers = new ArrayList<Integer>();
    }

    public void exterminate(List<Integer> allNumbers) {
        for (int i : allNumbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
    }

    @Override
    public int hashCode() {
        return evenNumbers.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof OddNumbersExterminator) {
            OddNumbersExterminator otherObj = (OddNumbersExterminator) obj;
            return (evenNumbers.equals(otherObj.evenNumbers));
        }
        return false;
    }

    public List<Integer> getList() {
        return evenNumbers;
    }
}
