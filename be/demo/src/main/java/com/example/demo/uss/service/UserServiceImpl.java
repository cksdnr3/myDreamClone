package com.example.demo.uss.service;

import java.util.List;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repo;

    @Override
    public String updatePrivacy(User entity, String username) {
        User selected = repo.findByUsername(username).orElseThrow();

        User updated = selected.builder()
            .birthday(entity.getBirthday())
            .email(entity.getEmail())
            .gender(entity.getGender())
            .password(entity.getPassword())
            .phoneNumber(entity.getPhoneNumber())
            .realName(entity.getRealName())
            .build();

        log.info("updated: " + updated.getRealName());
        
        repo.save(updated);

        return updated.getUsername();
    }

    @Override
    public String signup(User entity) {
        boolean isExist = repo.existsByUsername(entity.getUsername());

        if(isExist) {
            return "Already exist id, re-enter id";
        }

        repo.save(entity);

        return "signup success";
    }

    @Override
    public String login(User entity) {

        User selected = repo.login(entity.getUsername());

        log.info("size: " + selected);

        if(selected.getPassword().equals(entity.getPassword())) {
            
            return selected.getUsername();
        }
        
        return null;
    }

    @Override
    public User myPage(String username) {

        User user = repo.findByUsername(username).orElseThrow();

        return user;
    }
}
