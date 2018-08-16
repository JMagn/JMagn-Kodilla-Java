package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jkovalsky96", "Jan Kowalski", new Address(
                "Mariacka", "9", "Katowice", "40-014"));
        Product product = new Product("Ski jacket Dare2B", 720);

        return new OrderRequest(user, product);
    }
}
