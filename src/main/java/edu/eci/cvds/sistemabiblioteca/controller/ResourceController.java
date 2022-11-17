package edu.eci.cvds.sistemabiblioteca.controller;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.services.impl.ResourceServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class ResourceController {

    @Resource (name = "resourceService")
    private ResourceServiceImpl resourceService;

    @GetMapping("/resource")
    public String viewResource(Model model){
        model.addAttribute("resource", new LibraryResource());
        return "resource";
    }
}
