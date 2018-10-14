package com.kodilla.good.patterns.order.service;

import java.util.Objects;

public class OrderDto {

    private User user;
    private Product product;
    private boolean isExecuted;

    public OrderDto(User user, Product product, boolean isExecuted) {
        this.user = user;
        this.product = product;
        this.isExecuted = isExecuted;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDto orderDto = (OrderDto) o;
        return isExecuted == orderDto.isExecuted &&
                Objects.equals(user, orderDto.user) &&
                Objects.equals(product, orderDto.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, product, isExecuted);
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", product=" + product +
                ", isExecuted=" + isExecuted +
                '}';
    }
}
