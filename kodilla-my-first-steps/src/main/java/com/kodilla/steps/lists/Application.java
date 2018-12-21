package com.kodilla.steps.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Application {

    private static List<Book> initLibrary() {

        Book book1 = new Book("Duchowe zycie zwierzat", 2017);
        Book book2 = new Book("Hobbit", 1937);
        Book book3 = new Book("Polska Piastow", 1960);
        Book book4 = new Book("Walkowanie Ameryki", 2012);

        List<Book> library = new LinkedList<Book>();

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);

        return library;
    }

    private static List<Integer> initItGrades() {
        List<Integer> itGrades = new ArrayList<Integer>();

        itGrades.add(5);
        itGrades.add(5);
        itGrades.add(3);
        itGrades.add(4);
        itGrades.add(5);

        return itGrades;
    }

    public static void main (String[] args) throws java.lang.Exception {
        Finder finder = new Finder(initLibrary());
        finder.print();

        Grades grades = new Grades(initItGrades());
        grades.print();
    }
}
