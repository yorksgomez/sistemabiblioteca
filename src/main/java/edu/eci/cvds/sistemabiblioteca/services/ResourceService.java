package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;

import java.util.List;

public interface ResourceService {
    List<LibraryResource> findResource(LibraryResource libraryResource);

    List<LibraryResource> findResource(LibraryResource libraryResource, String[] filters);
}
