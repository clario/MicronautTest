package com.example.controller;

import com.example.domain.Person;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public Person index() {
        return new Person("Ole");
    }
}
