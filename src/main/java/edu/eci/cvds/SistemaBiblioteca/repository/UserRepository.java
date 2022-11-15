package edu.eci.cvds.SistemaBiblioteca.repository;


import edu.eci.cvds.SistemaBiblioteca.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public User findByMailAndPassword(String mail, String password);
    public User findByMail(String mail);
}
