package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "Driving";
    public static final String PAINTING = "Painting";
    public static final String SHOPPING = "Shopping";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "shop", "car");
            case PAINTING:
                return new PaintingTask("Painting", "blue", "ceiling");
            case SHOPPING:
                return new ShoppingTask("Shopping", "rolls", 2);
            default:
                return null;
        }
    }
}
