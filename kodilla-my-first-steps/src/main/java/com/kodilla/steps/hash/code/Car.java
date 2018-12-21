package com.kodilla.steps.hash.code;

class Car {

    private String model;
    private String colour;

    public Car (String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public int hashCode() {
        return 10 * model.hashCode() + 15 * colour.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Car) {
            Car otherCar = (Car) obj;
            return model.equals(otherCar.model) &&
                    colour.equals(otherCar.colour);
        }
        return false;
    }
}
