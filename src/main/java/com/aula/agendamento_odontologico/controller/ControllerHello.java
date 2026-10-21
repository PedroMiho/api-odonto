package com.aula.agendamento_odontologico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class ControllerHello {
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
