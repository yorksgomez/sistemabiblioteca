package edu.eci.cvds.SistemaBiblioteca.services;

import edu.eci.cvds.SistemaBiblioteca.model.User;


public interface UserService{
    void userRegistry(User u);

    User consultUserByMail(String mail);
}