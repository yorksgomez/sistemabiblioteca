package edu.eci.cvds.sistemabiblioteca.model;
<<<<<<< HEAD
=======
import edu.eci.cvds.sistemabiblioteca.model.interfaces.Models;

>>>>>>> Develop
import javax.persistence.*;


@Entity
@Table(name = "book")
<<<<<<< HEAD
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
=======
public class Book implements Models {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
>>>>>>> Develop

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

<<<<<<< HEAD
    public Book() {
    }

    public Book(Integer id, String author, String title) {
        this.id = id;
=======
    public Book(String author, String title) {
>>>>>>> Develop
        this.author = author;
        this.title = title;
    }

<<<<<<< HEAD
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
=======
    public Book() {
        this("", "");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
>>>>>>> Develop
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
