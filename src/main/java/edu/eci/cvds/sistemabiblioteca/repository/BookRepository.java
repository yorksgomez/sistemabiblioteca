package edu.eci.cvds.sistemabiblioteca.repository;

import org.springframework.stereotype.Repository;

import edu.eci.cvds.sistemabiblioteca.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
