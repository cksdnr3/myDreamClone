package com.example.demo.uss.controller;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        
        String msg = service.signup(entity);

        log.info("birthday: " + entity.getBirthday());
        

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User entity) {
        log.info("login");

        String token = service.login(entity);

        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> myPage(@PathVariable String username) {

        User user = service.myPage(username);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/{username}")
    public ResponseEntity<String> modify(@PathVariable String username,
                                    @RequestBody User entity) {

        String token = service.updatePrivacy(entity, username);

        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}