package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return String.format("%s (area: %.2f", getShapeName(), getArea());
    }
}
