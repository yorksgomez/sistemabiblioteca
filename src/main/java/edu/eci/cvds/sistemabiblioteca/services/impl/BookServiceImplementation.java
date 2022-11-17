package edu.eci.cvds.sistemabiblioteca.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.cvds.sistemabiblioteca.model.Book;
import edu.eci.cvds.sistemabiblioteca.repository.BookRepository;
import edu.eci.cvds.sistemabiblioteca.services.BookService;

import java.util.Optional;

@Service("bookService")
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book find(Long id) {
        Optional<Book> optionalBook  = repository.findById(id);
        return optionalBook.orElseGet(Book::new);
    }
    
    @Override
    public void addBook(Book book) {
        repository.save(book);
    }

}
