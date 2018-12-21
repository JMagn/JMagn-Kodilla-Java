package com.kodilla.steps.wrappers;

class ComparisonDoubles {

    double double1;
    Double double2;

    public ComparisonDoubles(double double1, Double double2) {
        this.double1 = double1;
        this.double2 = double2;
    }

    public boolean compare() {
        return double2.equals(double1);
    }
}
