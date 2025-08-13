package com.demo.service;


import com.demo.Entity.Login;

public interface LoginService {
    String authenticateUser(Login login);
}