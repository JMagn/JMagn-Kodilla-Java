package com.kodilla.patterns.factory.tasks;

import java.util.Objects;

public final class PaintingTask implements Task {

    private static final String EXECUTING = "%s %s %s.";

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskExecuted = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECUTING, taskName, whatToPaint, color));
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
        PaintingTask that = (PaintingTask) o;
        return taskExecuted == that.taskExecuted &&
                Objects.equals(taskName, that.taskName) &&
                Objects.equals(color, that.color) &&
                Objects.equals(whatToPaint, that.whatToPaint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, color, whatToPaint, taskExecuted);
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}