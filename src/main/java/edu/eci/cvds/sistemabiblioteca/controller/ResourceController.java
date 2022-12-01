package edu.eci.cvds.sistemabiblioteca.controller;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
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
        model.addAttribute("resource", new LibraryResource());
        model.addAttribute("booksList", bookService.getAllBooks());
        return "resource";
    }
    @PostMapping("/getResource")
    public List<LibraryResource> getResource(LibraryResource libraryResource){
        return resourceService.findResource(libraryResource);
    }

    // @GetMapping()
    // public String viewAddResource(Model model){
    //    model.addAttribute("newResource", new LibraryResource());
    //    return "";
    //}

}
