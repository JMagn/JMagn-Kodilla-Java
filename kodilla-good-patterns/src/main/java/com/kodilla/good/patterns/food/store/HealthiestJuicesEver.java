package com.kodilla.good.patterns.food.store;

public class HealthiestJuicesEver implements FoodProducer {

    private static final String AVAILABLE = "Ordering \"%s\". Quantity: %d bottle(s). Total price: %.2f zl";
    private static final String NOTAVAILABLE = "Order cannot be executed.\nOrdered: %d bottles(s) of \"%s\". " +
            "Left in stock: %d bottle(s).";

    private String name = "Healthiest Juices Ever!";
    private HealthiestJuicesProductRepository repository = new HealthiestJuicesProductRepository();

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (repository.checkSupplies(orderRequest)) {
            repository.updateSupplies(orderRequest);
            System.out.println(String.format(AVAILABLE, orderRequest.getProductName(), orderRequest.getQuantity(),
                    orderRequest.getProductPrice() * orderRequest.getQuantity()));
            return true;
        }
        System.out.println(String.format(NOTAVAILABLE, orderRequest.getQuantity(), orderRequest.getProductName(),
                repository.getProductQuantity(orderRequest)));
        return false;
    }






}