package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private OrderService orderService;
    private PaymentService paymentService;
    private ShipmentService shipmentService;

    public OrderProcessor(OrderService orderService, PaymentService paymentService, ShipmentService shipmentService) {
        this.orderService = orderService;
        this.paymentService = paymentService;
        this.shipmentService = shipmentService;
    }

    public void process(final OrderRequest orderRequest) {
        orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        boolean isPaid = paymentService.collect(orderRequest.getUser(), orderRequest.getProduct());
        if(isPaid) {
            shipmentService.send(orderRequest.getUser(), orderRequest.getProduct());
        } else {
            System.out.println("Payment has not been received. Transaction cancelled");
        }
    }
}
