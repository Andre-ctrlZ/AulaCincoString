package com.example.aulaCincoJava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
    @RequestMapping("/")
    public String welcome(){
        return "Bem-vindo ao teste, teste ( •̀ ω •́ )y";
    }
}
