package com.kodilla.good.patterns.order.service;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jkovalsky96", "Jan Kowalski", new Address(
                "Mariacka", "9", "Katowice", "40-014"));
        Product product = new Product("Warcraft", 49.99);

        return new OrderRequest(user, product, 1);
    }
}
