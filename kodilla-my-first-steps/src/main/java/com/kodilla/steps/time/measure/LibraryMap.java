package com.kodilla.steps.time.measure;

import java.util.Map;

class LibraryMap {

    private Map<Book, Integer> booksMap;

    public LibraryMap(Map<Book, Integer> booksMap) {
        this.booksMap = booksMap;
    }

    private void measureDeleteFromMap() {
        long begin = System.nanoTime();
        booksMap.remove(new Book("Author 0", "Title 0"));
        long end = System.nanoTime();
        System.out.println("Deleting element time: " + (end - begin) + " ns");
    }

    private void measureAddToMap() {
        long begin = System.nanoTime();
        booksMap.put(new Book("Sample1", "Sample1"), 100);
        long end = System.nanoTime();
        System.out.println("Adding element time: " + (end - begin) + " ns");
    }

    private void measureFindInMap() {
        long begin = System.nanoTime();
        booksMap.get(new Book ("Author 1", "Title 1"));
        long end = System.nanoTime();
        System.out.println("Searching for element time: " + (end - begin) + " ns");
    }

    public void testMapSpeed() {
        System.out.println("HashMap speed test:");
        measureDeleteFromMap();
        measureAddToMap();
        measureFindInMap();
        System.out.println();
    }
}
