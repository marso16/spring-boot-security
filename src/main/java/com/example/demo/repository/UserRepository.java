package com.example.demo.repository;

import com.example.demo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    //    Query method to find a user by username (JPA related)
    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}
