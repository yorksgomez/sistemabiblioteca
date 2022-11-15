package edu.eci.cvds.SistemaBiblioteca.controller;

import javax.sql.DataSource;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.eci.cvds.SistemaBiblioteca.model.Book;
import edu.eci.cvds.SistemaBiblioteca.services.impl.BookServiceImplementation;

@Controller
public class BookController {

    @Resource(name = "bookService")
    private BookServiceImplementation service;

    @GetMapping("/login")
    public String view(Model model) {

        /*
         * Create a test book, as an example, it creates it the first time you run the page,
         * and the next times it will show an error by console because it already exists.
         */
        try{
            service.addBook(new Book(1l, "TITULO LIBRO DE PRUEBO", "AUTOR DE PRUEBA"));
        }catch(Exception ex) {System.out.println("Mensaje: " + ex.getMessage());}
        
        Book book = service.find(1l);
        model.addAttribute("book", book);
        return "login";
    }

}