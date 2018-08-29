package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User {

    private String username;
    private String realName;
    private Address address;

    public User(String username, String realName, Address address) {
        this.username = username;
        this.realName = realName;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(realName, user.realName) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, realName, address);
    }
}
