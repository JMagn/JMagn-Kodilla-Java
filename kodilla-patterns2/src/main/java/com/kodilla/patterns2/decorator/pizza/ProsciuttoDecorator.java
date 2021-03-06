package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ProsciuttoDecorator extends AbstractPizzaOrderDecorator {

    public ProsciuttoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription() + " with prosciutto";
    }
}
