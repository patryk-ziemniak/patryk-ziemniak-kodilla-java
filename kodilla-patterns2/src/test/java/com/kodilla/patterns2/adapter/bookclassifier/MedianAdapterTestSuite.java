package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Author 1", "Title 1", 1980, "ABCD1");
        Book book2 = new Book("Author 2", "Title 2", 1990, "ABCD2");
        Book book3 = new Book("Author 3", "Title 3", 2010, "ABCD3");
        Book book4 = new Book("Author 4", "Title 4", 2000, "ABCD4");
        Book book5 = new Book("Author 5", "Title 5", 1970, "ABCD5");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter adapter = new MedianAdapter();

        //When
        int result = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1990, result);
    }
}
