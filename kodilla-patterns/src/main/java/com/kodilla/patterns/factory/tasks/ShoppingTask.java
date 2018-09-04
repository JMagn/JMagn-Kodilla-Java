package com.kodilla.patterns.factory.tasks;

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
}
