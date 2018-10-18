package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaOrderDecorator {

    public AdditionalCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription() + " + additional cheese";
    }
}
