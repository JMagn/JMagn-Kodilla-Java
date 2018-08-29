package com.kodilla.good.patterns.challenges;

public class OnlinePaymentReceiver implements PaymentService {

    private static final String MESSAGE = "User %s has paid %.2f zl for \"%s\".";

    @Override
    public boolean collect(final User user, final Product product) {
        System.out.println(String.format(MESSAGE, user.getUsername(), product.getPrice(), product.getName()));
        return true;
    }
}
