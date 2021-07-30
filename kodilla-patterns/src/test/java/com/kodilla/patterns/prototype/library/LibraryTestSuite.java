package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    private Library library;

    public void prepareSut() {
        library = new Library("Book Library #1");
        for (int i = 1; i < 11; i++) {
            Book book = new Book("Title #" + i, "Author #" + i, LocalDate.of(2000 + i, 1, 1));
            library.getBooks().add(book);
        }
    }

    @Test
    public void testGetBooks() {
        //Given
        prepareSut();
        Library shallowCopyLibrary = new Library("temp");
        Library deepCopyLibrary = new Library("temp");

        //When
        try {
            shallowCopyLibrary = library.shallowCopy();
            deepCopyLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(new Book("Title #3", "Author #3", LocalDate.of(2003, 1, 1)));

        //Then
        assertEquals(9, library.getBooks().size());
        assertEquals(9, shallowCopyLibrary.getBooks().size());
        assertEquals(10, deepCopyLibrary.getBooks().size());
        assertEquals(library.getBooks(), shallowCopyLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepCopyLibrary.getBooks());
    }
}
