package com.example.demo.serviceImpl;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@EnableAutoConfiguration
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public void registerUser(Login login) {
        System.out.println("login --- > " + login);
        loginRepository.save(login);
    }

    public List<Login> fetchUsernamePassword(String username, String password) {
        System.out.println("username --- > " + username);
        System.out.println("password --- > " + password);
       return loginRepository.findUsernamePassword(username,password);
    }

}
