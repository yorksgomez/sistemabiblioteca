package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;

import java.util.HashMap;
import java.util.List;

public interface ResourceService {
    List<LibraryResource> findResource( LibraryResource libraryResourceSearched);
    void createResource(Long id, String name, String location, String type, Integer capacity, String availability);
}
