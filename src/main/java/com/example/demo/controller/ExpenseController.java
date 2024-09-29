package com.example.demo.controller;

import com.example.demo.model.ExpenditureUser;
import com.example.demo.serviceImpl.ExpenditureUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ExpenseController {

    @Autowired
    ExpenditureUserImpl expenditureUserImpl;

    @RequestMapping(value = "/addExpenditureUserWithMonth", method = RequestMethod.POST)
    public ResponseEntity<Object> addExpenditure(@RequestBody ExpenditureUser expenditureUser) {
        expenditureUserImpl.EnterUserDetails(expenditureUser);
        return new ResponseEntity<>("expenditure is added successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/fetchUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> fetchUser(@PathVariable("id") int id) {
        Optional<ExpenditureUser> expenditureUser = expenditureUserImpl.fetchUserExpenditureDetails(id);
        return new ResponseEntity<>(expenditureUser, HttpStatus.FOUND);
    }

    public ResponseEntity<Object> addExpense(@PathVariable("id") int id,@PathVariable("category") String category,@PathVariable("expense") int expense,@PathVariable("month") String month,@PathVariable("day") int day) {
      return null;
    }

}
