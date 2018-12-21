package com.kodilla.steps.time.measure;

import java.util.*;

class Application {

    private static List<Book> initLibrary() {

        List<Book> library = new LinkedList<Book>();

        for (int i = 0; i < 200000; i++) {
            library.add(new Book("Author " + i, "Title " + i));
        }

        return library;
    }

    private static Map<Book, Integer> initBooksMap() {

        Map<Book, Integer> booksMap = new HashMap<Book, Integer>();

        Random random = new Random();

        for (int i = 0; i < 200000; i++) {
            booksMap.put(new Book("Author " + i, "Title " + i), random.nextInt(100));
        }

        return booksMap;
    }

    public static void main (String[] args) throws java.lang.Exception {

        Library library = new Library(initLibrary());
        library.testListSpeed();

        LibraryMap libraryM = new LibraryMap(initBooksMap());
        libraryM.testMapSpeed();
    }
}
