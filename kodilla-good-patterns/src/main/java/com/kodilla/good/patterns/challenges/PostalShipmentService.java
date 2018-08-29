package com.kodilla.good.patterns.challenges;

public class PostalShipmentService implements ShipmentService{

    private static final String MESSAGE = "Sending \"%s\" to %s, %s.";

    @Override
    public void send(final User user, final Product product) {
        System.out.println(String.format(MESSAGE, product.getName(), user.getRealName(), user.getAddress()));
    }
}