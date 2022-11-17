package edu.eci.cvds.sistemabiblioteca.repository;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<LibraryResource, Long> {
}
