package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.User;


import edu.eci.cvds.sistemabiblioteca.repository.UserRepository;
import edu.eci.cvds.sistemabiblioteca.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
<<<<<<< HEAD
    public void register(User user) {
        repository.save(user);
=======
    public User register(User user) {
        return repository.save(user);
>>>>>>> Develop
    }

    @Override
    public User login(String mail, String password) {
        return repository.findByMailAndPassword(mail, password);
    }
}
