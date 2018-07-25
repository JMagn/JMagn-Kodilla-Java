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
        return shapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape result = null;
        if (n < shapesList.size()) {
            result = shapesList.get(n);
        }
        return result;
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
        for (int i = 0; i < (shapesList.size() - 1); i++) {
            ret = ret + shapesList.get(i) + " ";
        }
        return ret + (shapesList.get(shapesList.size() - 1));
    }
}
