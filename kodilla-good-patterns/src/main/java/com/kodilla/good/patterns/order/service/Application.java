package com.kodilla.good.patterns.order.service;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new InformationServiceImpl(),
                new OrderServiceImpl(),
                new OrderRepositoryImpl(),
                new ProductRepositoryImpl());
        productOrderService.process(orderRequest);
    }
}
