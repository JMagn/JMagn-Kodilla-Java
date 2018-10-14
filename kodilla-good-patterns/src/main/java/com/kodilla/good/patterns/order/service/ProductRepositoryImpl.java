package com.kodilla.good.patterns.order.service;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {

    public Map<Product, Integer> products = new HashMap<Product, Integer>();

    public ProductRepositoryImpl() {
        products.put(new Product("Warcraft", 49.99), 1);
        products.put(new Product("Baldur's Gate", 29.95 ), 4);
        products.put(new Product("Diablo", 35), 6);
    }

    @Override
    public void updateSupplies(OrderRequest orderRequest) {
        products.put(orderRequest.getProduct(), products.get(orderRequest.getProduct()) - orderRequest.getQuantity());
    }

    @Override
    public boolean checkSupplies(OrderRequest orderRequest) {
        return products.get(orderRequest.getProduct()) >= orderRequest.getQuantity();
    }
}
