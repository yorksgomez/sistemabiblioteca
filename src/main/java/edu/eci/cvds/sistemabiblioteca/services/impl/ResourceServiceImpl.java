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
    public List<LibraryResource> findResource(LibraryResource libraryResourceSearched) {
        HashMap<String, Object> data = filtersMap(libraryResourceSearched);
        return resourceRepository.getData(data);
    }

    private HashMap<String, Object> filtersMap(LibraryResource libraryResource) {
        HashMap<String, Object> data = new HashMap<>();

        String resourceName = libraryResource.getName();
        String resourceLocation = libraryResource.getLocation();
        String resourceType = libraryResource.getType();
        int resourceCapacity = libraryResource.getCapacity();

        if (!resourceName.equals(""))
            data.put("name", resourceName);
        if (!resourceLocation.equals(""))
            data.put("location", resourceLocation);
        if (!resourceType.equals(""))
            data.put("type", resourceType);
        if (resourceCapacity != -1) {
            data.put("capacity", resourceCapacity);
        }
        return data;
    }
    @Override
    public void createResource(Long id, String name, String location, String type, Integer capacity, String availability){
        resourceRepository.save(new LibraryResource(id,name,location,type,capacity,availability));
    }
}
