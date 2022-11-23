package edu.eci.cvds.sistemabiblioteca.repository;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface ResourceRepository extends JpaRepository<LibraryResource, Long> {
    public List<LibraryResource> getData(HashMap<String, Object> resourceSearched);
}
