package com.sp.promdemo;


import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.test.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Timed
class PersonController {
    Map<Integer, Person> people = new Map<Integer, Person>();

    public PersonController(MeterRegistry registry) {
        // constructs a gauge to monitor the size of the population
        registry.mapSize("population", people);
    }

    @GetMapping("/api/people")
    public List<Person> listPeople() {
        return people;
    }

    @GetMapping("/api/person/")
    public Person findPerson(@PathVariable Integer id) {
        return people.get(id);
    }
}