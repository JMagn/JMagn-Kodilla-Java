package com.kodilla.good.patterns.challenges;

public class EShoppingService implements OrderService {

    private static final String MESSAGE = "User %s has ordered \"%s\". Price: %.2f zl.";

    @Override
    public void order(final User user, final Product product) {
        System.out.println(String.format(MESSAGE, user.getUsername(), product.getName(), product.getPrice()));
    }
}