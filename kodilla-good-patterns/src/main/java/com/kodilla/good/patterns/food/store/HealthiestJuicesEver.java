package com.kodilla.good.patterns.food.store;

import java.util.ArrayList;
import java.util.List;

public class HealthiestJuicesEver implements FoodProducer {

    private static final String MESSAGE = "Ordering \"%s\" from \"%s\".\nQuantity: %d bottle(s). Total price: %.2f zl";

    private String name = "Healthiest Juices Ever!";
    private List<Product> products = new ArrayList<>();

    public HealthiestJuicesEver() {
        products.add(new Product("Beatroot juice (0.5 l)", 4.25));
        products.add(new Product("Beatroot juice (1 l)", 8.00));
        products.add(new Product("Carrot juice (0.5 l)", 3.60));
        products.add(new Product("Aple juice (0.5 l)", 2.99));
    }

    @Override
    public boolean process(Product product, int quantity) {
        System.out.println(String.format(MESSAGE, product.getName(), name, quantity, product.getPrice() * quantity));
        return true;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}