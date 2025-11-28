package com.sistema.gestao.operacional.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/testar")
    public String testar() {
        return "Spring Boot + MySQL funcionando!";
    }
}
