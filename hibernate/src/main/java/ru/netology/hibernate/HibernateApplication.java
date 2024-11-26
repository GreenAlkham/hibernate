package ru.netology.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hibernate.entity.Person;

import java.util.ArrayList;
import java.util.List;

@Builder
@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void run(String... args) throws Exception {
        List<Person> persons = new ArrayList<>();
        persons.add(Person.builder()
                .name("Leo")
                .surname("Tolstoy")
                .age(67)
                .phone_number("none")
                .city_of_living("Yasnaya Polyana")
                .build());
        persons.add(Person.builder()
                .name("Fyodor")
                .surname("Dostoevsky")
                .age(51)
                .phone_number("8-891-444-55-66")
                .city_of_living("Saint Petersburg")
                .build());
        persons.add(Person.builder()
                .name("Michael")
                .surname("Bulgakov")
                .age(35)
                .phone_number("8-495-777-88-99")
                .city_of_living("Moscow")
                .build());
        persons.add(Person.builder()
                .name("Anton")
                .surname("Chekhov")
                .age(26)
                .phone_number("8-495-999-11-22")
                .city_of_living("Moscow")
                .build());
        persons.forEach(entityManager::persist);
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }


}
