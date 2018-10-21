package com.kodilla.patterns2.observer.homework;

import java.util.Objects;

public class Task {

    private final String number;
    private final String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(number, task.number) &&
                Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}