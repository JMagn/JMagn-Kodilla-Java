package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public final class ShoppingTask implements Task {

    private static final String EXECUTING = "%s %s %s.";

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECUTING, taskName, quantity, whatToBuy));
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingTask that = (ShoppingTask) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                taskExecuted == that.taskExecuted &&
                Objects.equals(taskName, that.taskName) &&
                Objects.equals(whatToBuy, that.whatToBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, whatToBuy, quantity, taskExecuted);
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}
