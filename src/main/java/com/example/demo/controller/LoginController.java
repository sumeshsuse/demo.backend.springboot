package com.example.demo.controller;

import com.example.demo.model.Login;
import com.example.demo.serviceImpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;


    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody Login login) {
        loginService.registerUser(login);
        return new ResponseEntity<>("user is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/loginValidation/{username}/{password}", method = RequestMethod.GET)
    public ResponseEntity<Object> loginValidation(@PathVariable("username") String username,@PathVariable("password") String password){

        System.out.println(username + " " +password);
        if(loginService.fetchUsernamePassword(username, password).isEmpty()){
            return new ResponseEntity<>("User not found !", HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>("Login is successfull!", HttpStatus.OK);
        }
    }


}
