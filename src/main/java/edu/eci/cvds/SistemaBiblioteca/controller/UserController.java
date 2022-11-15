package edu.eci.cvds.SistemaBiblioteca.controller;

import edu.eci.cvds.SistemaBiblioteca.model.User;
import edu.eci.cvds.SistemaBiblioteca.services.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserServiceImpl userService;

    @GetMapping("/login")
    public String view(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
}
