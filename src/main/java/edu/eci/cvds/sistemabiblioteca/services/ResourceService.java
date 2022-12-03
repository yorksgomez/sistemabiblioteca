package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;

import java.time.LocalTime;
import java.util.List;

public interface ResourceService {
    List<LibraryResource> findResource(LibraryResource libraryResourceSearched);
    LibraryResource createResource(LibraryResource newLibraryResource);
    List<LibraryResource> getAllResources();
}
