package com.cursotech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
    @GetMapping("/ola")
    public String saudar() {
        return "Primeiro 'Olá mundo em SpringBoot localmente.";
    }
}
