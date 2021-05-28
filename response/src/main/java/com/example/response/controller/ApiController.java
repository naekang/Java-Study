package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {


    // text를 내려주기
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON 내려주기
    // req -> object mapper -> objecct -> method -> object -> object mapper -> json ->response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user; // 200 OK
    }

//    {
//        "name": "steve",
//        "age": 10,
//        "phoneNumber": "010-3230-2498",
//        "address": "서울시립대"
//    }

    // ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
