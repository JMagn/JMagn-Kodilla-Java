package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public final class DrivingTask implements Task {

    private static final String EXECUTING = "%s %s by %s.";

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrivingTask that = (DrivingTask) o;
        return taskExecuted == that.taskExecuted &&
                Objects.equals(taskName, that.taskName) &&
                Objects.equals(where, that.where) &&
                Objects.equals(using, that.using);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, where, using, taskExecuted);
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}