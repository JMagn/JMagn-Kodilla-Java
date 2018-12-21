package com.kodilla.steps.hash.code;

class Application {
    public static void main (String[] args) {

        Car car1 = new Car("Vitara", "silver");
        Car car2 = new Car("VItara", "black");
        Car car3 = new Car("Vitara", "silver");

        System.out.println("Car1 equals Car2: " + car1.equals(car2));
        System.out.println("Car1 equals Car3: " + car1.equals(car3));
        System.out.println("Car2 equals Car3: " + car2.equals(car3));
        System.out.println("Car1 equals null: " + car1.equals(null));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
