package com.kodilla.steps.modulo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class StringDivision {

    private List<String> evenList;
    private List<String> oddList;

    public StringDivision() {
        this.evenList = new ArrayList<String>();
        this.oddList = new ArrayList<String>();
    }

    public void divideStrings(Deque<String> queue) {
        while (queue.size() > 0) {
            String currentString = queue.poll();
            if (currentString.length() % 2 == 0) {
                evenList.add(currentString);
            } else {
                oddList.add(currentString);
            }
        }
    }

    public void print() {
        System.out.println(evenList + "\n\n" + oddList);
    }
}
