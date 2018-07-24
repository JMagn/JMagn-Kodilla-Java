package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {

    private List<Shape> shapesList;

    public ShapeCollector() {
        this.shapesList = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (!shapesList.isEmpty()) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapesList.get(n);
    }

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public void showFigures() {
        System.out.println(shapesList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return Objects.equals(shapesList, that.shapesList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapesList);
    }

    @Override
    public String toString() {
        String ret = "";
        for (Shape x : shapesList) {
            ret = ret + x + " ";
        }
        return ret;
    }
}
