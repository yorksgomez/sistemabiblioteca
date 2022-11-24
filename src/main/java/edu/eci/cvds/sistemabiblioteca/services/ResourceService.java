package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;

import java.util.HashMap;
import java.util.List;

public interface ResourceService {
    List<LibraryResource> findResource( HashMap<String, Object> libraryResourceSearched);

}
