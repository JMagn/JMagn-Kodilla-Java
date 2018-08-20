package com.kodilla.good.patterns.food.store;

public class OrderProcessor {

    public OrderDto processOrder(OrderRequest orderRequest) {
        boolean isOrdered = orderRequest.getFoodProducer().process(orderRequest.getProduct(),
                orderRequest.getQuantity());

        if (isOrdered) {
            return new OrderDto(orderRequest.getProduct(),true);
        } else {
            return new OrderDto(orderRequest.getProduct(),false);
        }
    }
}
