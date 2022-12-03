package edu.eci.cvds.sistemabiblioteca.repository;

import edu.eci.cvds.sistemabiblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
<<<<<<< HEAD
public interface BookRepository extends JpaRepository<Book, Integer> {}
=======
public interface BookRepository extends JpaRepository<Book, Long> {}
>>>>>>> Develop
