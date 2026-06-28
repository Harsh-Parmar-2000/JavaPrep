package com.singaji.bharosa.repository;

import com.singaji.bharosa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}