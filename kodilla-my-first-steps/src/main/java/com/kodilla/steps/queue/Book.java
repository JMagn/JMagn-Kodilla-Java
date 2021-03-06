package com.kodilla.steps.queue;

class Book {

    private static final String BOOK = "\"%s\", author: %s, publication date: %d";

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return title.hashCode() * 17 + author.hashCode() * 19 + year * 23;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Book) {
            Book otherObj = (Book) obj;
            return (this.title == otherObj.title) && (this.author == otherObj.author) && (this.year == otherObj.year);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(BOOK, title, author, year);
    }
}
