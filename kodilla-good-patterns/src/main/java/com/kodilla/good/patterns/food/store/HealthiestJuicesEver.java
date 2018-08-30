package com.kodilla.good.patterns.food.store;

import java.util.HashMap;
import java.util.Map;

public class HealthiestJuicesEver implements FoodProducer {

    private static final String AVAILABLE = "Ordering \"%s\". Quantity: %d bottle(s). Total price: %.2f zl";
    private static final String NOTAVAILABLE = "Order cannot be executed.\nOrdered: %d bottles(s) of \"%s\". " +
            "Left in stock: %d bottle(s).";

    private String name = "Healthiest Juices Ever!";
    private Map<Product, Integer> products = new HashMap<>();

    public HealthiestJuicesEver() {
        products.put(new Product("Beatroot juice (0.5 l)", 4.25), 100);
        products.put(new Product("Beatroot juice (1 l)", 8.00), 120);
        products.put(new Product("Carrot juice (0.5 l)", 3.60), 75);
        products.put(new Product("Apple juice (0.5 l)", 2.99), 200);
    }

    @Override
    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (checkSupplies(orderRequest)) {
            System.out.println(String.format(AVAILABLE, orderRequest.getProduct().getName(), orderRequest.getQuantity(),
                    orderRequest.getProduct().getPrice() * orderRequest.getQuantity()));
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