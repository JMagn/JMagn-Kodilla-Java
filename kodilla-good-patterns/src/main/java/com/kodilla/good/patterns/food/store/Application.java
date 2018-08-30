package com.kodilla.good.patterns.food.store;

public class Application {
    public static void main(String[] args) {
        FoodProducer foodProducer = new HealthiestJuicesEver();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(foodProducer, orderRequest);
    }
}
