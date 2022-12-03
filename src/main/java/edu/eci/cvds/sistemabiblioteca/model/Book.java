package edu.eci.cvds.sistemabiblioteca.model;
import edu.eci.cvds.sistemabiblioteca.model.interfaces.Models;

import javax.persistence.*;


@Entity
@Table(name = "book")
public class Book implements Models {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book() {
        this("", "");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
