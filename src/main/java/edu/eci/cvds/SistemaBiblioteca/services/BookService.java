package edu.eci.cvds.SistemaBiblioteca.services;

import org.springframework.stereotype.Service;

import edu.eci.cvds.SistemaBiblioteca.model.Book;

public interface BookService {
    
    public Book find(Long id);

    public void addBook(Book book);

}
