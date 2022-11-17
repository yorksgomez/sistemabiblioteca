package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.Book;

public interface BookService {
    
    public Book find(Long id);

    public void addBook(Book book);

}
