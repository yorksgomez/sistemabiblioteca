package edu.eci.cvds.SistemaBiblioteca.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.cvds.SistemaBiblioteca.model.Book;
import edu.eci.cvds.SistemaBiblioteca.repository.BookRepository;
import edu.eci.cvds.SistemaBiblioteca.services.BookService;
    
@Service("bookService")
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book find(Long id) {
        return repository.findById(id).get();
    }
    
    @Override
    public void addBook(Book book) {
        repository.save(book);
    }

}
