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
    private ResourceRepository repository;

    @Override
    public  List<LibraryResource> findResource(LibraryResource libraryResource) {
        return repository.findByName(libraryResource.getName());
    }

    @Override
    public  List<LibraryResource> findResource(LibraryResource libraryResource, String[] filters) {
        HashMap<String, Object> hashMapFilters = fillHashMap(libraryResource, filters);
        return repository.getData(hashMapFilters);
    }

    private HashMap<String, Object> fillHashMap(LibraryResource libraryResource, String[] filters) {
        HashMap<String, Object> mapFilter = new HashMap<>();
        for (String filter: filters) {
            switch (filter) {
                case "name":
                    mapFilter.put("name", libraryResource.getName());
                    break;
                case "location":
                    mapFilter.put("location", libraryResource.getLocation());
                    break;
                case "type":
                    mapFilter.put("type", libraryResource.getType());
                    break;
                case "capacity":
                    mapFilter.put("capacity", libraryResource.getCapacity());
                    break;
                default:
                    System.out.println("No filters");
                    break;
            }
        }
        return mapFilter;
    }
}
