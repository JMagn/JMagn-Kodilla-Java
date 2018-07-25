package shape;

import com.kodilla.testing.shape.*;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(1);
        Assert.assertEquals(0, shapeCollector.getShapesList().size());
        // When
        shapeCollector.addFigure(circle);
        Shape currentShape = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals(circle, currentShape);
        Assert.assertEquals(1, shapeCollector.getShapesList().size());
    }

    @Test
    public void testRemoveFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1);
        shapeCollector.addFigure(triangle);
        Assert.assertEquals(1, shapeCollector.getShapesList().size());
        // When
        boolean result = shapeCollector.removeFigure(triangle);
        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesList().size());
    }

    @Test
    public void testRemoveFigureEmptyList() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1);
        // When
        boolean result = shapeCollector.removeFigure(triangle);
        // Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(1);
        shapeCollector.addFigure(square);
        // When
        Shape currentShape = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals(square, currentShape);
    }
    @Test
    public void testShowFigures() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(1));
        shapeCollector.addFigure(new Triangle(1));
        shapeCollector.addFigure(new Circle(1));
        // When
        shapeCollector.showFigures();
        // Then
    }
}
