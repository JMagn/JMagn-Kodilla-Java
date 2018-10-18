package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickCrustDecorator extends AbstractPizzaOrderDecorator {

    public ThickCrustDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription() + " on a thick crust";
    }
}
