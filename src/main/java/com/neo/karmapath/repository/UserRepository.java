package com.neo.karmapath.repository;

import com.neo.karmapath.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}