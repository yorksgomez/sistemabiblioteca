package edu.eci.cvds.SistemaBiblioteca.services;

public class ExcepcionHistorialBiblioteca extends  Exception{
    private static final long serialVersionUID = 5758585917279118959L;

    public ExcepcionHistorialBiblioteca (String message, Exception e) {
        super(message,e);
    }

    public ExcepcionHistorialBiblioteca (String message){
        super(message);
    }
}
