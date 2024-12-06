package ru.netology.hibernate;

import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.hibernate.entities.Person;
import ru.netology.hibernate.repositories.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Builder
@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

    final PersonRepository repository;

    public HibernateApplication(PersonRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void run(String... args) throws Exception {
//       List<Person> persons = new ArrayList<>();
//        persons.add(Person.builder()
//                .name("Leo")
//                .surname("Tolstoy")
//                .age(67)
//                .phoneNumber("none")
//                .cityOfLiving("Yasnaya Polyana")
//                .build());
//        persons.add(Person.builder()
//                .name("Fyodor")
//                .surname("Dostoevsky")
//                .age(51)
//                .phoneNumber("8-891-444-55-66")
//                .cityOfLiving("Saint Petersburg")
//                .build());
//        persons.add(Person.builder()
//                .name("Michael")
//                .surname("Bulgakov")
//                .age(35)
//                .phoneNumber("8-495-777-88-99")
//                .cityOfLiving("Moscow")
//                .build());
//        persons.add(Person.builder()
//                .name("Anton")
//                .surname("Chekhov")
//                .age(26)
//                .phoneNumber("8-495-999-11-22")
//                .cityOfLiving("Moscow")
//                .build());
//        repository.saveAll(persons);
//        persons.forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }
}
