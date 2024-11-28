package ru.netology.hibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersons(String city) {
        return repository.getPersonsByCity(city);
    }
}