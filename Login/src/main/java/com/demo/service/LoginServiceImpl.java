package com.demo.service;


import com.demo.Entity.Login;
import com.demo.Entity.User;
import com.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String authenticateUser(Login login) {
        User user = userRepository.findByUsernameAndPassword(login.getUsername(), login.getPassword());

        if (user != null) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}