package com.kodilla.good.patterns.food.store;

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
        return product.getName();
    }

    public double getProductPrice() {
        return product.getPrice();
    }
}