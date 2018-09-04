package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private static final String EXECUTING = "%s to %s by %s.";

    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECUTING, taskName, where, using));
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