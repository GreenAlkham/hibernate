package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.hibernate.entity.Person;

import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
//        List<Person> result = entityManager.createNativeQuery(("SELECT * FROM person WHERE person.city_of_living = :city"))
        List<Person> result = entityManager.createQuery(("FROM Person WHERE cityOfLiving = :city"))
                .setParameter("city", city)
                .getResultList();
        return result;
    }
}