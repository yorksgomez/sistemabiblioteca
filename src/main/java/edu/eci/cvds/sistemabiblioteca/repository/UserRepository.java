package edu.eci.cvds.sistemabiblioteca.repository;


import edu.eci.cvds.sistemabiblioteca.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public User findByMailAndPassword(String mail, String password);
    public User findByMail(String mail);
}
