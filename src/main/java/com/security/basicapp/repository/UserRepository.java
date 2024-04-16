package com.security.basicapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.basicapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String userName);
}
