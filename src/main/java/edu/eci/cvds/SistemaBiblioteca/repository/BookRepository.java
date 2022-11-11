package edu.eci.cvds.SistemaBiblioteca.repository;

import org.springframework.stereotype.Repository;

import edu.eci.cvds.SistemaBiblioteca.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
