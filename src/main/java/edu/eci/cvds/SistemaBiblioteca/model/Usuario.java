package edu.eci.cvds.SistemaBiblioteca.model;
import java.io.Serializable;

public class  Usuario implements Serializable {
    private static final long serialVersionUID = -4765153708985909165L;
    private String documento;
    private String correo;
    private String nombre;
    private String contraseña;
    private String rol;

    public Usuario() {

    }

    public Usuario(String documento, String correo, String nombre, String contraseña, String rol) {
        this.documento = documento;
        this.correo = correo;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
