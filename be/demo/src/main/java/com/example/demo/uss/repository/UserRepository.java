package com.example.demo.uss.repository;

import java.util.Optional;

import com.example.demo.uss.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Query("select u.username, u.password from User u where u.username= :username")
    public User login(@Param("username") String username);
}