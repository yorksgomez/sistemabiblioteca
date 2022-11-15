package edu.eci.cvds.SistemaBiblioteca.controller;

import javax.annotation.Resource;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.eci.cvds.SistemaBiblioteca.model.User;
import edu.eci.cvds.SistemaBiblioteca.services.impl.UserServiceImpl;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserServiceImpl service;

    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/proccess_register")
    public String processRegister(User user) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setRole("COMUNITY");

        service.register(user);
        
        return "login";
    }

}
