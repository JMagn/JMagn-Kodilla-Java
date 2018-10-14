package com.kodilla.good.patterns.order.service;

public class InformationServiceImpl implements InformationService {

    private static final String ACCEPTED = "Dear %s, you placed new order. Game: %s, quantity: %d, price: %.2f zl.";
    private static final String DENIED = "Dear %s, we could not execute your order. Not enough \"%s\" pieces left in stock.";

    @Override
    public void orderAccepted(OrderRequest orderRequest) {
        System.out.println(String.format(ACCEPTED, orderRequest.getUserRealName(), orderRequest.getProductName(),
                orderRequest.getQuantity(), orderRequest.getProductPrice()));
    }

    @Override
    public void orderDenied(OrderRequest orderRequest) {
        System.out.println(String.format(DENIED, orderRequest.getUserRealName(), orderRequest.getProductName()));
    }
}
