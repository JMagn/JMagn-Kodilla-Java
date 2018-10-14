package com.kodilla.good.patterns.order.service;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private List<OrderRequest> ordersHistory = new ArrayList<>();

    @Override
    public void addOrderToRepository(OrderRequest orderRequest) {
        ordersHistory.add(orderRequest);
    }
}
