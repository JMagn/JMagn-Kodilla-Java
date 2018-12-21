package com.kodilla.steps.set.orders;

class Order {

    private int nr;

    public Order(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return this.nr;
    }
    @Override
    public int hashCode() {
        return nr * 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Order) {
            Order otherObj = (Order) obj;
            return this.nr == otherObj.nr;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + nr + "]";
    }
}
