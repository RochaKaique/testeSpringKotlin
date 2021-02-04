package br.teste.mskotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/")
class HelloController {

    @GetMapping()
    fun sayHello(): String {
        return "Olá sou um serviço em Kotlin";
    }
}