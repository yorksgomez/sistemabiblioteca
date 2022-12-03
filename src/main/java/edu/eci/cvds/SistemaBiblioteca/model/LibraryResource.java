package edu.eci.cvds.sistemabiblioteca.model;

import edu.eci.cvds.sistemabiblioteca.model.interfaces.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
public class LibraryResource implements Models {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private String location;

    @Column
    private String type;

    @Column
    private Integer capacity;

    @Column
    private String availability;

    @Column
    private LocalTime startTime;

    @Column
    private LocalTime endTime;

    public LibraryResource() {
        this.name = "";
        this.location = "";
        this.type = "";
        this.capacity = -1;
        this.availability = "";
        this.startTime = LocalTime.of(0,0);
        this.endTime = LocalTime.of(0,0);
    }

    public LibraryResource(Long id, String name, String location, String type, Integer capacity, String availability, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
        this.availability = availability;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public LocalTime getStartTime(){
        return startTime;
    }

    public void setStartTime(LocalTime startTime){
        this.startTime = startTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
