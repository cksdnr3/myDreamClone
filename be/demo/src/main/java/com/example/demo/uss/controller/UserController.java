package com.example.demo.uss.controller;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Log
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
    private final UserServiceImpl service;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User entity) {
        
        service.save(entity);

        return new ResponseEntity<>("signup success", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User entity) {
        log.info("login");

        return new ResponseEntity<>(service.login(entity), HttpStatus.OK);
    }
}