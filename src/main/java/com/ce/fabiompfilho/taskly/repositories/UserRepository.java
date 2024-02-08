package com.ce.fabiompfilho.taskly.repositories;

import com.ce.fabiompfilho.taskly.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String username);
}
