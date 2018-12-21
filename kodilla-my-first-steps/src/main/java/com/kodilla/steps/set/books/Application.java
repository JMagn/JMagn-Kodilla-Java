package com.kodilla.steps.set.books;

import java.util.HashSet;
import java.util.Set;

public class Application {

    private static Set<Book> initLibrary() {

        Set<Book> library = new HashSet<Book>();

        library.add(new Book("Mistrz i Malgorzata", "Michail Bulhakov", 1966));
        library.add(new Book("Hobbit", "J.R.R Tolkien", 1937));
        library.add(new Book("Polska Piastow", "Pawel Jasienica", 1960));
        library.add(new Book("Walkowanie Ameryki", "Marek Walkuski", 2012));

        return library;
    }

    private static void print() {
        System.out.println("Books printed before 2010:");
        for (Book book: initLibrary()) {
            if (book.getYear() < 2010) {
                System.out.println(book);
            }
        }
    }

    public static void main (String[] args) {

        print();
    }
}
