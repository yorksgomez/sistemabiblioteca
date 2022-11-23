package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.repository.ResourceRepository;
import edu.eci.cvds.sistemabiblioteca.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    ResourceRepository resourceRepository;

    @Override
    public List<LibraryResource> findResource(HashMap<String, Object> libraryResourceSearched) {
        return resourceRepository.getData(libraryResourceSearched);
    }
}
