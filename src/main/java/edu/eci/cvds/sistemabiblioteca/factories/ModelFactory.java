package edu.eci.cvds.sistemabiblioteca.factories;

import com.mysql.cj.exceptions.WrongArgumentException;
import edu.eci.cvds.sistemabiblioteca.model.Book;
import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.model.User;
import edu.eci.cvds.sistemabiblioteca.model.enums.ModelEnum;
import edu.eci.cvds.sistemabiblioteca.model.interfaces.Models;
import org.springframework.stereotype.Component;

@Component
public class ModelFactory {

    private ModelFactory() {}

    public static Models getModel(ModelEnum requestModel) {
        switch (requestModel) {
            case USER:
                return new User();
            case BOOK:
                return new Book();
            case LIBRARY_RESOURCE:
                return new LibraryResource();
            default:
                throw new WrongArgumentException("Model request not found");
        }
    }
}
