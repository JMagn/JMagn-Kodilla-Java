package com.kodilla.good.patterns.food.store;

import java.util.ArrayList;
import java.util.List;

public class GoodGrains implements FoodProducer {

    private static final String MESSAGE = "Company: \"%s\", ordered product: \"%s\" (%d pieces), price: %.2f zl";

    private String name = "Good Grains Co.";
    private List<Product> products = new ArrayList<>();

    public GoodGrains() {
        products.add(new Product("Whole wheat bread", 5.60));
        products.add(new Product("Graham bread", 6.20 ));
        products.add(new Product("Tatarczuch bread", 11.50));
    }

    @Override
    public boolean process(Product product, int quantity) {
        System.out.println(String.format(MESSAGE, name, product.getName(), quantity, product.getPrice() * quantity));
        return true;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}