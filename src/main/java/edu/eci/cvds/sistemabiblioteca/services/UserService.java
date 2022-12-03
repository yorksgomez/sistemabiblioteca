package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.User;


public interface UserService{

    User register(User user);

    User login(String mail, String password);
}