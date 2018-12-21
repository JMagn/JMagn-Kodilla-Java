package com.kodilla.steps.time.measure;

class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int hashCode() {
        return author.hashCode() * 19 + title.hashCode() * 23;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Book) {
            Book otherObj = (Book) obj;
            return (this.author == otherObj.author) && (this.title == otherObj.title);
        }
        return false;
    }
}
