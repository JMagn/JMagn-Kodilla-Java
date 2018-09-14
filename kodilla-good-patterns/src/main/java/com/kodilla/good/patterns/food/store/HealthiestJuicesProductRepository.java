package com.kodilla.good.patterns.food.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HealthiestJuicesProductRepository {

    public Map<Product, Integer> products = new HashMap<Product, Integer>();

    public HealthiestJuicesProductRepository() {
        products.put(new Product("Beatroot juice (0.5 l)", 4.25), 100);
        products.put(new Product("Beatroot juice (1 l)", 8.00), 120);
        products.put(new Product("Carrot juice (0.5 l)", 3.60), 75);
        products.put(new Product("Apple juice (0.5 l)", 2.99), 200);
    }

    public int getProductQuantity(OrderRequest orderRequest) {
        return products.get(orderRequest.getProduct());
    }

    public void updateSupplies(OrderRequest orderRequest) {
        products.put(orderRequest.getProduct(), products.get(orderRequest.getProduct()) - orderRequest.getQuantity());
    }

    public boolean checkSupplies(OrderRequest orderRequest) {
        return (products.get(orderRequest.getProduct()) >= orderRequest.getQuantity()) ? true : false;
    }
}
