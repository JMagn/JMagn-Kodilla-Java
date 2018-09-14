package com.kodilla.good.patterns.food.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GoodGrainsProductRepository {

    public Map<Product, Integer> products = new HashMap<Product, Integer>();

    public GoodGrainsProductRepository() {
        products.put(new Product("Whole wheat bread", 5.60), 150);
        products.put(new Product("Graham bread", 6.20 ), 80);
        products.put(new Product("Tatarczuch bread", 11.50), 20);
    }

    public int getProductQuantity(OrderRequest orderRequest) {
        return products.get(orderRequest.getProduct());
    }

    public void updateSupplies(OrderRequest orderRequest) {
        products.put(orderRequest.getProduct(), products.get(orderRequest.getProduct()) - orderRequest.getQuantity());
    }

    public boolean checkSupplies(OrderRequest orderRequest) {
        return products.get(orderRequest.getProduct()) >= orderRequest.getQuantity();
    }
}
