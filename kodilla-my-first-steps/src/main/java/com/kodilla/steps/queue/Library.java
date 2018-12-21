package com.kodilla.steps.queue;

import java.util.Deque;

class Library {

    private Deque<Book> books;

    public Library(Deque<Book> books) {
        this.books = books;
    }

    public void checkSize() {
        System.out.println("Queue size is " + books.size());
        System.out.println();
    }

    public void deleteQueue() {

        Book last = books.peek();

        for (Book book : books) {
            books.pop();
            last = book;
        }
        System.out.println("Queue deleted. Last book removed: " + last);
        System.out.println();
    }

    public void printContent() {
        System.out.println("Queue contains: ");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}
