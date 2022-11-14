package edu.eci.cvds.SistemaBiblioteca.repository;


import edu.eci.cvds.SistemaBiblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
