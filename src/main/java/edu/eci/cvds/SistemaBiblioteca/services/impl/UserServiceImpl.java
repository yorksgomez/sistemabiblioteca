package edu.eci.cvds.SistemaBiblioteca.services.impl;

import edu.eci.cvds.SistemaBiblioteca.model.User;


import edu.eci.cvds.SistemaBiblioteca.repository.UserRepository;
import edu.eci.cvds.SistemaBiblioteca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public void register(User user) {
        repository.save(user);
    }

    @Override
    public User login(String mail, String password) {
        User user = repository.findByMailAndPassword(mail, password);
        return user;
    }
}
