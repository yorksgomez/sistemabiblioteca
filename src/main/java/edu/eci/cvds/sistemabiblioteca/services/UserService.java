package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.User;


public interface UserService{

    void register(User user);

    User login(String mail, String password);
}