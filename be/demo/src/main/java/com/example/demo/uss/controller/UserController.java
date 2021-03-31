package com.example.demo.uss.controller;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("")
    public ResponseEntity<String> Signup(@RequestBody User entity) {

        log.info("name: " + entity.getRealName());
        
        service.save(entity);

        return new ResponseEntity<>("signup success", HttpStatus.OK);
    }
    
}
