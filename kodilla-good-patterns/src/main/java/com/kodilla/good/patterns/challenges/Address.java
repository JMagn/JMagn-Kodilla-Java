package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Address {

    private String street;
    private String houseNo;
    private String city;
    private String postalCode;

    public Address(String street, String houseNo, String city, String postalCode) {
        this.street = street;
        this.houseNo = houseNo;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(houseNo, address.houseNo) &&
                Objects.equals(city, address.city) &&
                Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, houseNo, city, postalCode);
    }

    @Override
    public String toString() {
        return "ul. " + street +
                " " + houseNo +
                ", " + postalCode +
                " "+ city;
    }
}
