package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.model.User;
import edu.eci.cvds.sistemabiblioteca.repository.UserRepository;
import edu.eci.cvds.sistemabiblioteca.services.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceImplTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;
    AutoCloseable autoCloseable;
    private User userTest;

    @BeforeEach
    void setUp() {
        // User Test
        userTest = new User("mail@someone.com", "someone", "123456789", "COMMUNITY");
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void given_NewUSer_When_register_Then_NewUSer() {
        when(userRepository.save(userTest)).thenReturn(userTest);
        User result = userService.register(userTest);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(userTest.getMail(), result.getMail());
        Assertions.assertEquals(userTest.getName(), result.getName());
    }

    @Test
    void given_MailAndPassword_When_login_Then_User() {
        when(userRepository.findByMailAndPassword("mail@someone.com", "123456789")).thenReturn(userTest);
        User result = userService.login("mail@someone.com", "123456789");

        Assertions.assertNotNull(result);
        Assertions.assertEquals(userTest.getName(), result.getName());
    }
}