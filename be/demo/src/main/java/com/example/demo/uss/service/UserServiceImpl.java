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

        selected.setBirthday(entity.getBirthday());
        selected.setEmail(entity.getEmail());
        selected.setGender(entity.getGender());
        selected.setPassword(entity.getPassword());
        selected.setPhoneNumber(entity.getPhoneNumber());
        selected.setRealName(entity.getRealName());
        selected.setUsername(entity.getUsername());

        repo.save(selected);

        return selected.getUsername();
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

    @Override
    public void deleteAccount(String username) {
        repo.deleteByUsername(username);
    }
}
