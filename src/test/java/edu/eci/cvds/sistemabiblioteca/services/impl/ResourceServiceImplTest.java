package edu.eci.cvds.sistemabiblioteca.services.impl;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.repository.ResourceRepository;
import org.apache.tomcat.jni.Library;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ResourceServiceImplTest {
    @Mock
    ResourceRepository resourceRepository;
    AutoCloseable autoCloseable;

    @InjectMocks
    ResourceServiceImpl resourceService;

    LibraryResource libraryResourceTest;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);

        // Library Resource to Test
        libraryResourceTest = new LibraryResource("S.E 203", "biblioteca", "sala de estudio", 4, "available",
                LocalTime.of(7,0), LocalTime.of(17, 45));
    }

    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    /**
     * given a LibraryResource class with only the name as search parameter,
     * returns a list with LibraryResource objects having the same name.
     */
    @Test
    void given_findResource_When_LibraryResourceSearchedHasOnlyName_Then_ReturnListOfLibraryResource() {
        // HashMAp Filters
        HashMap<String, Object> hashMapFilters = new HashMap<>();
        hashMapFilters.put("name", "S.E 203");

        // Library Resource Search
        LibraryResource libraryResourceSearched = new LibraryResource();
        libraryResourceSearched.setName("S.E 203");

        // List Expected
        List<LibraryResource> libraryResourceListExpected = new ArrayList<>();
        libraryResourceListExpected.add(libraryResourceTest);

        when(resourceRepository.getData(hashMapFilters)).thenReturn(libraryResourceListExpected);

        List<LibraryResource> result = resourceService.findResource(libraryResourceSearched);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(libraryResourceTest.getName(), result.get(0).getName());
    }

    /**
     * given a LibraryResource to add, returns the LibraryResource
     */
    @Test
    void given_LibraryResourceToAdd_When_createResource_Then_ReturnLibraryResource() {
        when(resourceRepository.save(libraryResourceTest)).thenReturn(libraryResourceTest);
        LibraryResource result = resourceService.createResource(libraryResourceTest);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(libraryResourceTest.getLocation(), result.getLocation());
    }
}