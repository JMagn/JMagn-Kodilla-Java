package com.kodilla.good.patterns.order.service;

public interface InformationService {

    void orderAccepted(OrderRequest orderRequest);

    void orderDenied(OrderRequest orderRequest);
}
