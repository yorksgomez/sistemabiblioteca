package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;

public interface ResourceService {
    void findResource(LibraryResource libraryResource);

    void findResource(LibraryResource libraryResource, String[] filters);
}
