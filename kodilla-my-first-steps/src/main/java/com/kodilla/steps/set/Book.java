package com.kodilla.steps.set;

class Book {

    private static final String FULLINFO = "\"%s\", author: %s, publication date: %d";

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
            return (title.equals(otherObj.title)) && (author.equals(otherObj.author)) && (year == otherObj.year);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(FULLINFO, title, author, year);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
