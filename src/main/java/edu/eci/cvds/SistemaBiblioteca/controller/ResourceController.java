package edu.eci.cvds.SistemaBiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class ResourceController {

    @Resource (name = "resourceService")
    private ResourceServiceImplementation resourceService;

    @GetMapping("/resource")
    public String viewResource(Model model){
        model.addAttribute("resource", new Resource());
        return "resource";
    }
}
