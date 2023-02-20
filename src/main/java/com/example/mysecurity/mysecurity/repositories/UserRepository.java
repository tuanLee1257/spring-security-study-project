package com.example.mysecurity.mysecurity.repositories;

import com.example.mysecurity.mysecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
     Optional<User> findByUsername(String username);
}
