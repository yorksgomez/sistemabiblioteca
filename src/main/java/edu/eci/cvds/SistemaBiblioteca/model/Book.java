package edu.eci.cvds.sistemabiblioteca.model;
import edu.eci.cvds.sistemabiblioteca.model.interfaces.Models;

import javax.persistence.*;


@Entity
@Table(name = "book")
public class BookDTO implements Models {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    public BookDTO() {
    }

    public BookDTO(Integer id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
