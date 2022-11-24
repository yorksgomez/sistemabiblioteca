package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.Book;
import edu.eci.cvds.sistemabiblioteca.repository.BookRepository;
import edu.eci.cvds.sistemabiblioteca.repository.UserRepository;
import edu.eci.cvds.sistemabiblioteca.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}
