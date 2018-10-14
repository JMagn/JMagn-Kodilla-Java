package com.kodilla.good.patterns.order.service;

public interface OrderService {

    boolean createOrder(OrderRequest orderRequest, ProductRepository repository);
}
