package com.kodilla.good.patterns.food.store;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        return new OrderRequest(new Product("Beatroot juice (1 l)", 8), 200);
    }
}