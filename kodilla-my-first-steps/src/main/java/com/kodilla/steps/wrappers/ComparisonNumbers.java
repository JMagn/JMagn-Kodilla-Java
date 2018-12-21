package com.kodilla.steps.wrappers;

class ComparisonNumbers {

    int number1;
    Integer number2;

    public ComparisonNumbers(int number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public boolean compare() {
        return number2.equals(number1);
    }
}
