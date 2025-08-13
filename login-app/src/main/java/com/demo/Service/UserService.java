package com.demo.Service;

import com.demo.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    Optional<User> findByUsername(String username);
}
