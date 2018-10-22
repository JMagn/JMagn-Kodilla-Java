package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<Book>();
        books.add(new Book("Jean Fontaine", "A", 1800, "1"));
        books.add(new Book("Antoine Exuperry", "B", 2002, "2"));
        books.add(new Book("John Rotten", "C", 2004, "3"));
        books.add(new Book("John Rotten", "D", 2004, "4"));
        books.add(new Book("Henry Jones", "E", 2004, "5"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        assertEquals(5, books.size());
        assertEquals(2004, median);
    }
}
