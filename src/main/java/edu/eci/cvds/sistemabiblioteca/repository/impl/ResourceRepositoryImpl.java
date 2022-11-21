package edu.eci.cvds.sistemabiblioteca.repository.impl;

import edu.eci.cvds.sistemabiblioteca.model.LibraryResource;

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

    List<LibraryResource> getData(HashMap<String, Object> filters) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<LibraryResource> query = criteriaBuilder.createQuery(LibraryResource.class);
        Root<LibraryResource> root = query.from(LibraryResource.class);

        List<Predicate> predicates = new ArrayList<>();
        filters.forEach((field, value) ->
        {
            switch (field) {
                case "capacity":
                    predicates.add(criteriaBuilder.equal(root.get(field), value));
                    break;
                case "name":
                case "location":
                case "type":
                    assert value instanceof String;
                    predicates.add(criteriaBuilder.like(root.get(field), "%"+(String)value+"%"));
                    break;
                default:
                    System.out.println("No Filter");
            }
        });
        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
        return entityManager.createQuery(query).getResultList();
    }
}
