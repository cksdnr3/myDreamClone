package com.example.demo.uss.service;

import com.example.demo.uss.domain.User;

public interface UserService {
    public String login(User entity);
    public String signup(User entity);
    public String updatePrivacy(User entity, String username);
    public User myPage(String username);
}