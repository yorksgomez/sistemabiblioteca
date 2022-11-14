package edu.eci.cvds.SistemaBiblioteca.services.impl;

import edu.eci.cvds.SistemaBiblioteca.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.cvds.SistemaBiblioteca.repository.UsuarioRepository;
import edu.eci.cvds.SistemaBiblioteca.services.ServicioUsuario;

@Service("usuarioService")
public class ServicioUsuarioImpl implements ServicioUsuario {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void registrarUsuario(Usuario u){repository.save(u);}

    @Override
    public Usuario consultarUsuarioporId(Long usuarioID) {return repository.findById(usuarioID).get();}


}
