package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class Board {

    private static final String MESSAGE = "Tasks to do: %s\nTasks in progress: %s\nTasks done: %s";

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void displayTasks() {
        System.out.println(String.format(MESSAGE, toDoList.toString(), inProgressList.toString(), doneList.toString()));
    }

    public void addTasks() {
        toDoList.getTasks().add("Do laundry");
        inProgressList.getTasks().add("Learn Java");
        doneList.getTasks().add("Wash dishes");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(toDoList, board.toDoList) &&
                Objects.equals(inProgressList, board.inProgressList) &&
                Objects.equals(doneList, board.doneList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toDoList, inProgressList, doneList);
    }

    @Override
    public String toString() {
        return "Board{" +
                "toDoList=" + toDoList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}
