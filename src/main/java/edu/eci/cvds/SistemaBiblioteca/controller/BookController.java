package edu.eci.cvds.SistemaBiblioteca.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.eci.cvds.SistemaBiblioteca.model.Book;
import edu.eci.cvds.SistemaBiblioteca.services.impl.BookServiceImplementation;

@Controller
public class BookController {

    @Resource(name = "bookService")
    private BookServiceImplementation service;

    @GetMapping("/books")
    public String view(Model model) {

        /*
         * Crea un libro de prueba, es como ejemplo, lo crea la primera vez que ejecuta la página, y las próximas veces mostrará un error por consola porque ya existe
         */
        try{
            service.addBook(new Book(1l, "TITULO LIBRO DE PRUEBO", "AUTOR DE PRUEBA"));
        }catch(Exception ex) {System.out.println("Mensaje: " + ex.getMessage());}
        
    
        
        Book book = service.find(1l);
        model.addAttribute("book", book);
        return "books";
    }

}