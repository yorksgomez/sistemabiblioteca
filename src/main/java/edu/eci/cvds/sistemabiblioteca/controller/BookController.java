package edu.eci.cvds.sistemabiblioteca.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.eci.cvds.sistemabiblioteca.services.impl.BookServiceImplementation;

@Controller
public class BookController {

    @Resource(name = "bookService")
    private BookServiceImplementation service;

    @GetMapping("/books")
    public String view(Model model) {
        return "books";
    }

}