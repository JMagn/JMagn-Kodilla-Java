package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private int field;

    public Square(int field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return field == square.field;
    }

    @Override
    public int hashCode() {

        return Objects.hash(field);
    }

    @Override
    public String toString() {
        return "Square " + "(" + field + ")";
    }
}
