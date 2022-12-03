package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.Book;
import edu.eci.cvds.sistemabiblioteca.repository.BookRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BookServiceImplTest {
    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookServiceImpl bookService;
    AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    @Test
    void when_getAllBooks_Then_ReturnBookListExpected() {
        // List Books Expected
        List<Book> bookListExpected = new ArrayList<>();
        bookListExpected.add(new Book("yorks gomez", "eres cachon"));
        bookListExpected.add(new Book("luisa de la hoz", "charlas en el C"));

        when(bookRepository.findAll()).thenReturn(bookListExpected);

        List<Book> result = bookService.getAllBooks();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(bookListExpected.get(0).getTitle(), result.get(0).getTitle());
        Assertions.assertEquals(bookListExpected.get(1).getAuthor(), result.get(1).getAuthor());
    }
}