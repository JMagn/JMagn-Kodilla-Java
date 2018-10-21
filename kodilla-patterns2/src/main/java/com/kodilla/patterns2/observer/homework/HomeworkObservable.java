package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver observer);
    void notifyObservers(Task task);
    void removeObserver(HomeworkObserver observer);
}