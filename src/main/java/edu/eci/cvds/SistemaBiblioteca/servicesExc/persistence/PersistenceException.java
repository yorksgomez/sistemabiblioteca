package edu.eci.cvds.SistemaBiblioteca.servicesExc.persistence;


public class PersistenceException extends Exception{
    private static final long serialVersionUID = 1863424973022371334L;

    public PersistenceException(String mensaje, Exception e) {
        super(mensaje,e);
    }
    public PersistenceException(String mensaje){
        super(mensaje);
    }
}