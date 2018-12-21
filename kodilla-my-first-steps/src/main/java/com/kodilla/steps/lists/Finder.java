package com.kodilla.steps.lists;

import java.util.List;

class Finder {

    private static final String NEW = "Books printed since 2000 are:";

    private List<Book> books;

    public Finder(List<Book> books) {
        this.books = books;
    }

    public void print() {

        System.out.println(String.format(NEW));

        for(Book book : books) {
            if (book.getYear() >= 2000) {
                System.out.println(book.getTitle());
            }
        }
    }
}
