package com.kodilla.steps.set.orders;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static List<Order> initOrdersList() {

        List<Order> ordersList = new ArrayList<Order>();

        ordersList.add(new Order(1));
        ordersList.add(new Order(1));
        ordersList.add(new Order(1));
        ordersList.add(new Order(2));
        ordersList.add(new Order(2));
        ordersList.add(new Order(2));
        ordersList.add(new Order(3));
        ordersList.add(new Order(3));
        ordersList.add(new Order(3));

        return ordersList;
    }

    public static void main (String[] args) {

        OrdersSet ordersSet = new OrdersSet();

        ordersSet.addToSet(initOrdersList());
        ordersSet.printOrdersSet();
    }
}
