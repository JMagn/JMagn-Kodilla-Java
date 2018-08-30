package com.kodilla.good.patterns.food.store;

import java.util.Map;

public interface FoodProducer {

    Map<Product, Integer> getProducts();

    boolean process(OrderRequest orderRequest);

    void updateSupplies(OrderRequest orderRequest);

    boolean checkSupplies(OrderRequest orderRequest);
}
