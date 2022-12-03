package edu.eci.cvds.sistemabiblioteca.repository.impl;

import com.mysql.cj.exceptions.WrongArgumentException;
import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;
import edu.eci.cvds.sistemabiblioteca.repository.ResourceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResourceRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;


    ResourceRepository resourceRepository;

    public List<LibraryResource> getAllResources() {return resourceRepository.findAll();}

    public List<LibraryResource> getData(HashMap<String, Object> conditions)
    {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<LibraryResource> query = cb.createQuery(LibraryResource.class);
        Root<LibraryResource> root = query.from(LibraryResource.class);

        List<Predicate> predicates = new ArrayList<>();
        conditions.forEach((field,value) ->
        {
            switch (field)
            {
                case "name":
                case "type":
                case "location":
                    predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
                    break;
                case "capacity":
                    predicates.add(cb.equal(root.get(field), value));
                    break;
                default:
                    throw new WrongArgumentException("Filter not found");
            }

        });

        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));

        return entityManager.createQuery(query).getResultList();
    }
}
