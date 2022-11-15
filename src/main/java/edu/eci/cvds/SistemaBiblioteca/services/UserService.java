package edu.eci.cvds.SistemaBiblioteca.services;

import edu.eci.cvds.SistemaBiblioteca.model.User;


public interface UserService{

    void register(User user);

    User login(String mail, String password);
}