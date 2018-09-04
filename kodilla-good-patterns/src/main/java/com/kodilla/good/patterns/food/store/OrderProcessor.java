package com.kodilla.good.patterns.food.store;

public class OrderProcessor {

    public OrderDto processOrder(FoodProducer foodProducer, OrderRequest orderRequest) {
        boolean isAvailable = foodProducer.process(orderRequest);
        if(isAvailable) {
            return new OrderDto(orderRequest.getProduct(), true);
        }
        return new OrderDto(orderRequest.getProduct(), false);
    }
}