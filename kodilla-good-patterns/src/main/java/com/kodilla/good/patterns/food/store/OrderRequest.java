package com.kodilla.good.patterns.food.store;

import java.util.Objects;

public class OrderRequest {

    private Product product;
    private int quantity;

    public OrderRequest(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return product != null ? product.getName() : null;
    }

    public double getProductPrice() {
        return product != null ? product.getPrice() : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRequest that = (OrderRequest) o;
        return quantity == that.quantity &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }
}