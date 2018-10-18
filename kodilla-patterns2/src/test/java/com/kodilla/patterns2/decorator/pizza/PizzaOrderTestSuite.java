package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza", description);
    }

    @Test
    public void testThickCrustGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testThickCrustGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza on a thick crust", description);
    }

    @Test
    public void testAdditionalCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testAdditionalCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza + additional cheese", description);
    }

    @Test
    public void testAllOptionsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustDecorator(pizzaOrder);
        pizzaOrder = new ProsciuttoDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32), cost);
    }

    @Test
    public void testAllOptionsGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustDecorator(pizzaOrder);
        pizzaOrder = new ProsciuttoDecorator(pizzaOrder);
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Order pizza on a thick crust with prosciutto + additional cheese", description);
    }
}
