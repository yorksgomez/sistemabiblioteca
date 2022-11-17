package edu.eci.cvds.sistemabiblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LibraryResource {
    // To be implemented
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String ubicacion;

    @Column
    private String tipo;

    @Column
    private Integer capacidad;

    @Column
    private String disponibilidad;

}
