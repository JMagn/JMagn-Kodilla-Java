package com.kodilla.good.patterns.food.store;

import java.util.List;

public interface FoodProducer {

    boolean process(Product product, int quantity);

    List<Product> getProducts();

}
