package com.demo.service;


import com.demo.Entity.User;

import java.util.List;

public interface UserService {
    void registerUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User findByUsername(String username);
}
