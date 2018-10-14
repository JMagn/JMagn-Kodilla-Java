package com.kodilla.good.patterns.order.service;

public interface ProductRepository {

    void updateSupplies(OrderRequest orderRequest);

    boolean checkSupplies(OrderRequest orderRequest);
}
