package ru.netology.hibernate.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.hibernate.entity.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    // private List<Person> persons = new ArrayList<>();

    //этот метод будет просто заполнением данныъх для таблицы
    //а для сохранения сделать отдельный маленький save для какого-нибудь одного параметра, наверное
    //а обновление сделать сочетанием имеющегося save и нового метода find
    
    @Transactional
    public List<Person> saveAll() {
        List<Person> persons = new ArrayList<>();
        persons.add(Person.builder()
                .name("Leo")
                .surname("Tolstoy")
                .age(67)
                .phoneNumber("none")
                .cityOfLiving("Yasnaya Polyana")
                .build());
        persons.add(Person.builder()
                .name("Fyodor")
                .surname("Dostoevsky")
                .age(51)
                .phoneNumber("8-891-444-55-66")
                .cityOfLiving("Saint Petersburg")
                .build());
        persons.add(Person.builder()
                .name("Michael")
                .surname("Bulgakov")
                .age(35)
                .phoneNumber("8-495-777-88-99")
                .cityOfLiving("Moscow")
                .build());
        persons.add(Person.builder()
                .name("Anton")
                .surname("Chekhov")
                .age(26)
                .phoneNumber("8-495-999-11-22")
                .cityOfLiving("Moscow")
                .build());
        saveAll();
        persons.forEach(System.out::println);
        return persons;
    }

//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Person> getPersonsByCity(String city) {
//        List<Person> result = entityManager.createNativeQuery(("SELECT * FROM person WHERE person.city_of_living = :city"))
//                .setParameter("city", city)
//                .getResultList();
//        return result;
//    }
}