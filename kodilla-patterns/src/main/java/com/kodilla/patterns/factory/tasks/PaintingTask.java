package com.kodilla.patterns.factory.tasks;

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
}