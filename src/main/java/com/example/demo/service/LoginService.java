package com.example.demo.service;

import com.example.demo.model.Login;

import java.util.List;

public interface LoginService {
    public abstract void registerUser(Login login);
    public abstract List<Login> fetchUsernamePassword(String username, String password);

}
