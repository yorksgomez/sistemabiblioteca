package edu.eci.cvds.sistemabiblioteca.services.exc;


public class PersistenceException extends Exception{
    private static final long serialVersionUID = 1863424973022371334L;

    public PersistenceException(String message, Exception e) {
        super(message,e);
    }
    public PersistenceException(String message){
        super(message);
    }
}