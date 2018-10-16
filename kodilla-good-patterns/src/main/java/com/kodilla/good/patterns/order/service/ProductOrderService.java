package com.kodilla.good.patterns.order.service;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private ProductRepositoryImpl productRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService,
                               OrderRepository orderRepository, ProductRepositoryImpl productRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.createOrder(orderRequest, productRepository);

        if (isBought) {
            orderRequest.getUser().addOrderToUserHistory(orderRequest);
            informationService.orderAccepted(orderRequest);
            orderRepository.addOrderToRepository(orderRequest);
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            informationService.orderDenied(orderRequest);
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
