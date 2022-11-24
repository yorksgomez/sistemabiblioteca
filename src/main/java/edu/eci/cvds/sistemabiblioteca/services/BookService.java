package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
}
