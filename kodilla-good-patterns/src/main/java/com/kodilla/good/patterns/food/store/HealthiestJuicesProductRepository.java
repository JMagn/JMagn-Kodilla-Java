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

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void updateSupplies(OrderRequest orderRequest) {
        products.put(orderRequest.getProduct(), products.get(orderRequest.getProduct()) - orderRequest.getQuantity());
    }

    public boolean checkSupplies(OrderRequest orderRequest) {
        if (products.get(orderRequest.getProduct()) >= orderRequest.getQuantity()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthiestJuicesProductRepository that = (HealthiestJuicesProductRepository) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "HealthiestJuicesProductRepository{" +
                "products=" + products +
                '}';
    }
}
