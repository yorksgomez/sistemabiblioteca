package edu.eci.cvds.sistemabiblioteca.controller;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.services.impl.ResourceServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
public class ResourceController {

    @Resource (name = "resourceService")
    private ResourceServiceImpl resourceService;

    @GetMapping("/resource")
    public String viewResource(Model model){
        model.addAttribute("resource", new LibraryResource());
        return "resource";
    }
    
    @PostMapping("/getResource")
    public List<LibraryResource> getResource(LibraryResource libraryResource){
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

        return resourceService.findResource(data);
    }

}
