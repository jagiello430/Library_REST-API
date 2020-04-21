package com.kodilla.kodillalibrary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExampleOfBookNotFindID extends Exception {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(ExampleOfBookNotFindID ex) {
        return ex.getMessage();
    }
}
