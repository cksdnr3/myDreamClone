package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService {
    private final UserRepository repo;

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(long id) {
        
    }

    @Override
    public User getOne(long id) {
        return null;
    }

    @Override
    public void save(User entity) {
        repo.save(entity);
    }

    @Override
    public Optional<User> findById(long id) {
        return null;
    }
    
}
