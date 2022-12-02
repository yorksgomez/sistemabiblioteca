import edu.eci.cvds.sistemabiblioteca.model.User;
import edu.eci.cvds.sistemabiblioteca.repository.UserRepository;
import edu.eci.cvds.sistemabiblioteca.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestMockito {
    @Mock
    UserRepository repository;
    public TestMockito() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void metodoprueba() {
        User newUser = new User("jorge@mail.com", "Jorge", "12345", "COMMUNITY");
        Mockito.when(repository.save(newUser)).thenReturn(newUser);
        UserServiceImpl userService = new UserServiceImpl(repository);
        userService.register(newUser);
    }
}
