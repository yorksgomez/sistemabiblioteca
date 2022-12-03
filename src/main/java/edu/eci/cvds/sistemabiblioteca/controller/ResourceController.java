package edu.eci.cvds.sistemabiblioteca.controller;

import edu.eci.cvds.sistemabiblioteca.factories.ModelFactory;
import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.model.enums.ModelEnum;
import edu.eci.cvds.sistemabiblioteca.services.impl.BookServiceImpl;
import edu.eci.cvds.sistemabiblioteca.services.impl.ResourceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ResourceController {

    @Autowired
    private BookServiceImpl bookService;

    @Resource (name = "resourceService")
    private ResourceServiceImpl resourceService;

    @GetMapping("/resource")
    public String viewResource(Model model){
        model.addAttribute("resource", resourceService.getAllResources());
        return "resource";
    }
    @PostMapping("/getResource")
    public List<LibraryResource> getResource(LibraryResource libraryResource){
        return resourceService.findResource(libraryResource);
    }

    @GetMapping("/viewAddResource")
    public String viewAddResource(Model model){
        model.addAttribute("newResource", ModelFactory.getModel(ModelEnum.LIBRARY_RESOURCE));
        return "registerResource";
    }
    @PostMapping("/addResource")
    public String addResource(LibraryResource newResource) {
        resourceService.createResource(newResource);
        return "redirect:/resource";
    }
    @GetMapping("/viewResource")
    public String resourceView(Model model){
        model.addAttribute("resourceList", resourceService.getAllResources());
        return "resource";
    }

}
