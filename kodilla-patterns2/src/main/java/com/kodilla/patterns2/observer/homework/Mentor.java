package com.kodilla.patterns2.observer.homework;

import java.util.Objects;

public class Mentor implements HomeworkObserver {

    private static final String MESSAGE = "%s - %s has sent you a new task (%s - %s) for a review." +
            " Currently you have %d tasks sent from this user";

    private final String name;
    private final String lastname;
    private int updateCount;

    public Mentor(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public void update(StudentsHomework homework, Task task) {
        System.out.println(String.format(MESSAGE, name, homework.getStudent(), task.getNumber(), task.getDescription(),
                homework.getTasks().size()));
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentor mentor = (Mentor) o;
        return updateCount == mentor.updateCount &&
                Objects.equals(name, mentor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, updateCount);
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", updateCount=" + updateCount +
                '}';
    }
}