package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private int field;

    public Triangle(int field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return field == triangle.field;
    }

    @Override
    public int hashCode() {

        return Objects.hash(field);
    }

    @Override
    public String toString() {
        return "Triangle " + "(" + field + ")";
    }
}
