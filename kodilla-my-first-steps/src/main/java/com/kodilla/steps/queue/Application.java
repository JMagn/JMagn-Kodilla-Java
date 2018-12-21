package com.kodilla.steps.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application {

    private static Deque<Book> initLibrary() {

        Deque<Book> library = new ArrayDeque<Book>();

        library.push(new Book("Mistrz i Malgorzata", "Michail Bulhakov", 1966));
        library.push(new Book("Hobbit", "J.R.R Tolkien", 1937));
        library.push(new Book("Polska Piastow", "Pawel Jasienica", 1960));
        library.push(new Book("Walkowanie Ameryki", "Marek Walkuski", 2012));
        library.push(new Book("Potop", "Henryk Sienkiewicz", 1886));

        return library;
    }

    public static void main (String[] args) {

        Library library = new Library(initLibrary());

        library.checkSize();
        library.printContent();
        library.deleteQueue();
        library.checkSize();
    }
}
