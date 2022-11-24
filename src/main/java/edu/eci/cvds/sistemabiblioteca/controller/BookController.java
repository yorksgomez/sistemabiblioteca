package edu.eci.cvds.sistemabiblioteca.controller;
import edu.eci.cvds.sistemabiblioteca.services.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller

public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/v1/resource")
    public String bookView(Model model){
        model.addAttribute("books", bookService.getAllBooks());
        return "resource";
    }


}
