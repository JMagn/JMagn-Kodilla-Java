package com.kodilla.steps.map.grades;

import java.util.List;

class Grades {

    private List<Integer> itGrades;

    public Grades (List<Integer> itGrades) {
        this.itGrades = itGrades;
    }

    public double avg() {
        int sum = 0;

        if (itGrades.size() > 0) {
            for (int i : itGrades) {
                sum += i;
            }
            return ((double)sum) / itGrades.size();
        } else {
            return 0;
        }
    }

    public String toString() {
        String ret = "";
        for (Integer x : itGrades) {
            ret = ret + " " + x;
        }
        return ret;
    }
}
