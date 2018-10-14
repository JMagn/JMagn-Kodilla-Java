package com.kodilla.good.patterns.order.service;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean createOrder(final OrderRequest orderRequest, ProductRepository repository) {
        if (repository.checkSupplies(orderRequest)) {
            repository.updateSupplies(orderRequest);
            return true;
        }
        return false;
    }
}
