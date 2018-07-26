package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getArea() {

        return Math.pow(side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {

        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return String.format("%s (area: %.2f", getShapeName(), getArea());
    }
}
