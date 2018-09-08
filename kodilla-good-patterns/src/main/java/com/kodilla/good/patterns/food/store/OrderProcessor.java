package com.kodilla.good.patterns.food.store;

public class OrderProcessor {

    private final FoodProducer foodProducer;

    public OrderProcessor(FoodProducer foodProducer) {
        this.foodProducer = foodProducer;
    }

    public OrderDto processOrder(OrderRequest orderRequest) {
        boolean isAvailable = foodProducer.process(orderRequest);
        if(isAvailable) {
            return new OrderDto(orderRequest.getProduct(), true);
        }
        return new OrderDto(orderRequest.getProduct(), false);
    }
}