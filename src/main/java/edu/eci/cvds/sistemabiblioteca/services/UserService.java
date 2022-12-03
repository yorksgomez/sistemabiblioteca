package edu.eci.cvds.sistemabiblioteca.services;

import edu.eci.cvds.sistemabiblioteca.model.User;


public interface UserService{

<<<<<<< HEAD
    void register(User user);
=======
    User register(User user);
>>>>>>> Develop

    User login(String mail, String password);
}