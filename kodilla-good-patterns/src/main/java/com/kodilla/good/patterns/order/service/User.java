package com.kodilla.good.patterns.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String username;
    private String realName;
    private Address address;
    private List<OrderRequest> userOrdersHistory = new ArrayList<>();

    public User(String username, String realName, Address address) {
        this.username = username;
        this.realName = realName;
        this.address = address;
    }

    public String getRealName() {
        return realName;
    }

    public void addOrderToUserHistory(OrderRequest orderRequest) {
        userOrdersHistory.add(orderRequest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(realName, user.realName) &&
                Objects.equals(address, user.address) &&
                Objects.equals(userOrdersHistory, user.userOrdersHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, realName, address, userOrdersHistory);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", address=" + address +
                ", ordersHistory=" + userOrdersHistory +
                '}';
    }
}
