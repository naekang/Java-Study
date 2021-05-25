package com.example.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 Class는 REST API를 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello -> get 방식으로 열어주기
    public String hello() {
        return "hello Spring Boot!";
    }
}
