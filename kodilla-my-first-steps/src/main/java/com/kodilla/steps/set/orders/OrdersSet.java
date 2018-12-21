package com.kodilla.steps.set.orders;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class OrdersSet {

    private Set<Order> orders;

    public OrdersSet() {
        this.orders = new HashSet<Order>();
    }

    public void addToSet(List<Order> ordersList) {
        for (Order currentOrder : ordersList) {
            orders.add(currentOrder);
        }
    }

    public void printOrdersSet() {
        System.out.print("Orders: ");
        StringBuilder sb = new StringBuilder();
        for (Order order : orders) {
            sb.append(order.toString()).append(" ");
        }
        System.out.println(sb.toString());
    }
}
