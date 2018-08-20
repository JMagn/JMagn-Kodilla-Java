package com.kodilla.good.patterns.food.store;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        HealthiestJuicesEver healthiestJuicesEver = new HealthiestJuicesEver();
        Product orderedProduct = healthiestJuicesEver.getProducts().get(0);

        return new OrderRequest(healthiestJuicesEver, orderedProduct, 60);
    }
}
