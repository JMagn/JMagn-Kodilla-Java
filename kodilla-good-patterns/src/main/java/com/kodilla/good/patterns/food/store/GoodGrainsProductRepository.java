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
        GoodGrainsProductRepository that = (GoodGrainsProductRepository) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "GoodGrainsProductRepository{" +
                "products=" + products +
                '}';
    }
}
