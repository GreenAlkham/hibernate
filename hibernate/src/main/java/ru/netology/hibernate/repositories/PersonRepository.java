package ru.netology.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entities.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByCityOfLiving(String city);
    List<Person> findByAgeLessThanOrderByAgeAsc(Integer age);
    Optional<Person> findByNameAndSurname(String name, String surname);
}
