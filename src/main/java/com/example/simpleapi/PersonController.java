package com.example.simpleapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/simple-api/")
public class PersonController {

    private List<Person> people = Arrays.asList(
            new Person("Ahmed Saka", 29, "male", "Lagos Nigeria"),
            new Person("Azeezah Afolami", 21, "female", "Lagos Nigeria")
    );


    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<Person> getPeople(){
        return people;
    }
}
