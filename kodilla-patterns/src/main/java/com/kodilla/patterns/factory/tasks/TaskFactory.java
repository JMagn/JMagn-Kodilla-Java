package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    private TaskType taskType;

    public TaskFactory(TaskType taskType) {
        this.taskType = taskType;
    }

    public final Task createTask() {
        switch (taskType) {
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
