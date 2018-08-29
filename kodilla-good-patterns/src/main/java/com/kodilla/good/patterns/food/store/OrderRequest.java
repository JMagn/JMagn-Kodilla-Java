package com.kodilla.good.patterns.food.store;

public class OrderRequest {

    private FoodProducer foodProducer;
    private Product product;
    private int quantity;

    public OrderRequest(FoodProducer foodProducer, Product product, int quantity) {
        this.foodProducer = foodProducer;
        this.product = product;
        this.quantity = quantity;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
