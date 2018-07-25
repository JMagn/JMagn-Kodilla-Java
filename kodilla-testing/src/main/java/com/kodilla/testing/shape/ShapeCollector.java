package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes;

    public ShapeCollector() {
        this.shapes = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape result = null;
        if (n < shapes.size()) {
            result = shapes.get(n);
        }
        return result;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void showFigures() {
        StringBuilder builder = new StringBuilder();
        for (Shape s : shapes) {
            builder.append(s).append(", ");
        }
        System.out.println(builder.toString());
    }
}
