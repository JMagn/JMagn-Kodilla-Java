package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Mistrz i Małgorzata", "Michaił Bułhakow",
                LocalDate.of(1967,11,1));
        Book book2 = new Book("Mały Książę", "Antoine de Saint-Exupery",
                LocalDate.of(1943,4,6));
        Book book3 = new Book("W 80 dni dookoła świata", "Juliusz Verne",
                LocalDate.of(1873,1,30));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }
}
