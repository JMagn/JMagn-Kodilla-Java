package com.kodilla.steps.lists;

import java.util.List;

class Grades {

    private static final String AVERAGE = "Average grade is %.2f";

    private List<Integer> gradesList;

    public Grades(List<Integer> gradesList) {
        this.gradesList = gradesList;
    }

    private int getMax() {
        int max = gradesList.get(0);

        for (int i : gradesList) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
    }

    private int getMin() {
        int min = gradesList.get(0);

        for (int i : gradesList) {
            if (i <= min) {
                min = i;
            }
        }
        return min;
    }

    private double avg() {
        int sum = 0;

        for (int i : gradesList) {
            sum += i;
        }
        return ((double)sum - getMax() - getMin()) / (gradesList.size() - 2);
    }

    public void print() {
        if (gradesList.size() > 2) {
            System.out.println(String.format(AVERAGE, avg()));
        } else {
            System.out.println("Error - list must contain at least 3 positions");
        }
    }
}
