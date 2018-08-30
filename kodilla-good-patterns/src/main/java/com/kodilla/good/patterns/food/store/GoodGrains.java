package com.kodilla.good.patterns.food.store;

import java.util.HashMap;
import java.util.Map;

public class GoodGrains implements FoodProducer {

    private static final String AVAILABLE = "Company: \"%s\", ordered product: \"%s\" (%d pieces per %.2f zl).";
    private static final String NOTAVAILABLE = "Order cannot be executed.\nOrdered: %d piece(s) of \"%s\". " +
            "Left in stock: %d piece(s).";

    private String name = "Good Grains Co.";
    private Map<Product, Integer> products = new HashMap<>();

    public GoodGrains() {
        products.put(new Product("Whole wheat bread", 5.60), 150);
        products.put(new Product("Graham bread", 6.20 ), 80);
        products.put(new Product("Tatarczuch bread", 11.50), 20);
    }

    @Override
    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (checkSupplies(orderRequest)) {
            System.out.println(String.format(AVAILABLE, name, orderRequest.getProduct().getName(), orderRequest.getQuantity(),
                    orderRequest.getProduct().getPrice()));
            return true;
        }
        System.out.println(String.format(NOTAVAILABLE, orderRequest.getQuantity(), orderRequest.getProduct().getName(),
                products.get(orderRequest.getProduct())));
        return false;
    }

    @Override
    public void updateSupplies(OrderRequest orderRequest) {
        products.put(orderRequest.getProduct(), products.get(orderRequest.getProduct()) - orderRequest.getQuantity());
    }

    @Override
    public boolean checkSupplies(OrderRequest orderRequest) {
        if (products.get(orderRequest.getProduct()) >= orderRequest.getQuantity()) {
            return true;
        }
        return false;
    }
}