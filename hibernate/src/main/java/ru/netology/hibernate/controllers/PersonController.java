package ru.netology.hibernate.controllers;

import org.springframework.web.bind.annotation.*;
import ru.netology.hibernate.entities.Person;
import ru.netology.hibernate.services.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonService service;

    private PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    private List<Person> getAllPersons() {
        return service.findAll();
    }

    @PostMapping
    private Person createPerson(@RequestBody Person person) {
        return service.create(person);
    }

    @DeleteMapping
    private void deletePerson (@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/persons/by-city")
    private List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersonByCity(city);
    }

    @GetMapping("/persons/by-age")
    private List<Person> getPersonsByAge(@RequestParam("age") Integer age) {
        return service.getPersonByAge(age);
    }

    @GetMapping("/persons/by-name")
    private Optional<Person> getPersonsByNameAndSurname(@RequestParam("name") String name,
                                                        @RequestParam("surname") String surname) {
        return service.getPersonByNameAndSurname(name,surname);
    }
}
