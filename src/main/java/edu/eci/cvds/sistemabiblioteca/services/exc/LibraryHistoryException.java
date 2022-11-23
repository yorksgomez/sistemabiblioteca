package edu.eci.cvds.sistemabiblioteca.services.exc;

public class LibraryHistoryException extends  Exception{
    private static final long serialVersionUID = 5758585917279118959L;

    public LibraryHistoryException(String message, Exception e) {
        super(message,e);
    }

    public LibraryHistoryException(String message){
        super(message);
    }
}
