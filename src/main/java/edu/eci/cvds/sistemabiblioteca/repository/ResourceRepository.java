package edu.eci.cvds.sistemabiblioteca.repository;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> Develop

import java.util.HashMap;
import java.util.List;

<<<<<<< HEAD
public interface ResourceRepository extends JpaRepository<LibraryResource, Long> {
    public List<LibraryResource> getData(HashMap<String, Object> resourceSearched);
=======
@Repository
public interface ResourceRepository extends JpaRepository<LibraryResource, Long> {
    public List<LibraryResource> getData(HashMap<String, Object> resourceSearched);
    public List<LibraryResource> getAllResources();
>>>>>>> Develop
}
