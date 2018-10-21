package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class StudentsHomework implements HomeworkObservable {

    private final List<HomeworkObserver> observers;
    private final Deque<Task> tasks;
    private final String student;

    public StudentsHomework(String sudent) {
        this.observers = new ArrayList();
        this.tasks = new ArrayDeque<>();
        this.student = sudent;
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers(task);
    }

    public String getStudent() {
        return student;
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Task task) {
        for (HomeworkObserver observer: observers) {
            observer.update(this, task);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }
}