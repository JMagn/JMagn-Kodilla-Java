package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private int field;

    public Circle(int field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return field == circle.field;
    }

    @Override
    public int hashCode() {

        return Objects.hash(field);
    }

    @Override
    public String toString() {
        return "Circle " + "(" + field + ")";
    }
}
