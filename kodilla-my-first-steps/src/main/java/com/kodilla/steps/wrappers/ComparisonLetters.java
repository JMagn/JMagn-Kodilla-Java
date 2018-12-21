package com.kodilla.steps.wrappers;

class ComparisonLetters {

    char letter1;
    Character letter2;

    public ComparisonLetters(char letter1, Character letter2) {
        this.letter1 = letter1;
        this.letter2 = letter2;
    }

    public boolean compare() {
        return letter2.equals(letter1);
    }
}
