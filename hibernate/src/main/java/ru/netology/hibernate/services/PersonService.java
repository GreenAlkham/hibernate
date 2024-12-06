package ru.netology.hibernate.services;

import org.springframework.stereotype.Service;
import ru.netology.hibernate.entities.Person;
import ru.netology.hibernate.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository repository;

    private PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Person> getPersonByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getPersonByAge(Integer age) {
        return repository.findByAgeLessThanOrderByAgeAsc(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

}
