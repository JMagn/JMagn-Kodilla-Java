package com.kodilla.steps.time.measure;

import java.util.List;

class Library {

    private List<Book> booksList;

    public Library(List<Book> booksList) {
        this.booksList = booksList;
    }

    private void measureDeletingFirst() {
        long begin = System.nanoTime();
        booksList.remove(0);
        long end = System.nanoTime();
        System.out.println("Deleting first element time: " + (end - begin) + " ns");
    }

    private void measureDeletingLast() {
        long begin = System.nanoTime();
        booksList.remove(booksList.size()-1);
        long end = System.nanoTime();
        System.out.println("Deleting last element time: " + (end - begin) + " ns");
    }

    private void measureAddingFirst() {
        long begin = System.nanoTime();
        booksList.add(0, new Book("Sample1", "Sample1"));
        long end = System.nanoTime();
        System.out.println("Adding first element time: " + (end - begin) + " ns");
    }

    private void measureAddingLast() {
        long begin = System.nanoTime();
        booksList.add(booksList.size(), new Book("Sample2", "Sample2"));
        long end = System.nanoTime();
        System.out.println("Adding last element time: " + (end - begin) + " ns");
    }

    public void testListSpeed() {
        System.out.println("LinkedList speed test:");
        measureDeletingFirst();
        measureDeletingLast();
        measureAddingFirst();
        measureAddingLast();
        System.out.println();
    }
}
