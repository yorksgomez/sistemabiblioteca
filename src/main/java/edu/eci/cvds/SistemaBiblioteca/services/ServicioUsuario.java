package edu.eci.cvds.SistemaBiblioteca.services;

import edu.eci.cvds.SistemaBiblioteca.model.Book;
import edu.eci.cvds.SistemaBiblioteca.model.Usuario;

public interface ServicioUsuario {
    void registrarUsuario(Usuario u);

    Usuario consultarUsuarioporId(Long usuarioID);
}