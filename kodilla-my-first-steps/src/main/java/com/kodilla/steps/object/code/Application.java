package com.kodilla.steps.object.code;

public class Application {

    public static void main (String[] args) {

        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserValidator validator = new UserValidator ();

        if (validator.validateName(name)) {
            if (validator.validateAge(age) && validator.validateHeight(height)) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower then 160cm");
            }
        }
    }
}
