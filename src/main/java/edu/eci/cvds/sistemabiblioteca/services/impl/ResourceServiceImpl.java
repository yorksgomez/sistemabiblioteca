package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.repository.ResourceRepository;
import edu.eci.cvds.sistemabiblioteca.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceRepository repository;

    @Override
    public void findResource(LibraryResource libraryResource) {
        // to be implemented
    }

    @Override
    public void findResource(LibraryResource libraryResource, String[] filters) {
        // to be implemented
    }
}
