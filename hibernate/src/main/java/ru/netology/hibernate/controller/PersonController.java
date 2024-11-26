package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonByCity(@RequestParam("city") String city) {
        return service.getPersons(city);
    }
}
