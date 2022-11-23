package edu.eci.cvds.sistemabiblioteca.controller;

import edu.eci.cvds.sistemabiblioteca.model.User;
import edu.eci.cvds.sistemabiblioteca.services.impl.UserServiceImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserServiceImpl service;

    @GetMapping("/login")
    public String loginView(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        user.setRole("COMMUNITY");

        service.register(user);
        
        return "login";
    }

}
